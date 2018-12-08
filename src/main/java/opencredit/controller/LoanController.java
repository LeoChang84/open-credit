package opencredit.controller;

import opencredit.data.*;
import opencredit.model.*;
import opencredit.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/loan")
public class LoanController {

	static private Logger logger = LoggerFactory.getLogger(LoanController.class.getName());

    @Autowired
    BasicInfoRepository basicInfoRepository;

    @Autowired
    LoanModelRepository loanModelRepository;

    @Autowired
    LoanHistoryRepository loanHistoryRepository;

    @Autowired
    CreditcardRepository creditcardRepository;

    @Autowired
    DepositeRepository depositeRepository;

    @GetMapping(value = "/{identfication}/basicInfo", produces = "application/json")
    public ResponseEntity<BasicInfo> getLoanModel(@PathVariable("identfication") String identfication) {
        logger.info("===== 連接政府API取得" + identfication + "基本資料中... =====");
        BasicInfo basicInfo = basicInfoRepository.findByIdentification(identfication);
        if (basicInfo == null) {
        	logger.info("===== 找不到" + identfication + "的基本資料 =====");
        	return new ResponseEntity<>(basicInfo, HttpStatus.OK);
        }
        for (Bank bank: basicInfo.getBankList()) {
            logger.info("===== 連接銀行API取得" + bank.getBankName() + "資料料中... =====");
        }
        return new ResponseEntity<>(basicInfo, HttpStatus.OK);
    }

    @GetMapping(value = "/{identfication}/loanHistory", produces = "application/json")
    public ResponseEntity<LoanData> getLoanHistory(@PathVariable("identfication") String identfication) {
        List<LoanHistory> loanHistorys = loanHistoryRepository.findByIdentification(identfication);
        if (loanHistorys.isEmpty()) {
        	logger.info("===== 找不到" + identfication + "貸款資料 =====");
        	return new ResponseEntity<>(new LoanData(), HttpStatus.OK);
        }
        for (LoanHistory loanHistory: loanHistorys) {
            logger.info("===== 貸款資料:" + loanHistory.getBank() + loanHistory.getProduct() + " =====");
        }
        LoanData loanData = new LoanData(loanHistorys);
        return new ResponseEntity<>(loanData, HttpStatus.OK);
    }

    @GetMapping(value = "/{identfication}/calculateLoan", produces = "application/json")
    public ResponseEntity<Integer> getLoanHistory(@PathVariable("identfication") String identfication, String date) {
        List<LoanHistory> loanHistorys = loanHistoryRepository.findByIdentification(identfication);
        if (loanHistorys.isEmpty()) {
        	logger.info("===== 找不到" + identfication + "貸款資料 =====");
        	return new ResponseEntity<>(new Integer(0), HttpStatus.OK);
        }
        logger.info("=====  計算到期日" + date + "前貸款資料 =====");
        Integer loan = new Integer(0);
        for (LoanHistory loanHistory: loanHistorys) {
            if (Integer.valueOf(loanHistory.getRepaymentDateOfMonth()) <= Integer.valueOf(date) % 1000000) {
                loan += Integer.valueOf(loanHistory.getReturnPrice());
            }
            logger.info("===== 貸款資料:" + loanHistory.getBank() + loanHistory.getProduct() + " =====");
        }
        return new ResponseEntity<>(loan, HttpStatus.OK);
    }
    
    @GetMapping(value = "/{identfication}/banklist", produces = "application/json")
    public ResponseEntity<BankList> getBankList(@PathVariable("identfication") String identfication) {
        logger.info("===== 搜尋" + identfication + " 之歷史資料銀行列表中... =====");
        BasicInfo basicInfo = basicInfoRepository.findByIdentification(identfication);
        if (basicInfo == null) {
        	logger.info("===== 找不到" + identfication + "的銀行列表 =====");
        	return new ResponseEntity<>(new BankList(), HttpStatus.OK);
        }
        List<Bank> banks = new ArrayList<>();
        for (Bank bank: basicInfo.getBankList()) {
            banks.add(new Bank(bank.getBankName()));
        }
        return new ResponseEntity<>(new BankList(banks), HttpStatus.OK);
    }

    @GetMapping(value = "/{identfication}/bankCreditcard", produces = "application/json")
    public ResponseEntity<CreditcardData> getCreditDataByBank(@PathVariable("identfication") String identfication, String bank) {
        List<Creditcard> creditcards = creditcardRepository.findByIdentificationAndBank(identfication, bank);
        if (creditcards.isEmpty()) {
        	logger.info("===== 找不到" + identfication + "的信用卡資料 =====");
        	return new ResponseEntity<>(new CreditcardData(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new CreditcardData(creditcards), HttpStatus.OK);
    }


    @GetMapping(value = "/{identfication}/creditcard", produces = "application/json")
    public ResponseEntity<CreditcardData> getCreditData(@PathVariable("identfication") String identfication) {
        List<Creditcard> creditcards = creditcardRepository.findByIdentification(identfication);
        if (creditcards.isEmpty()) {
        	logger.info("===== 找不到" + identfication + "的信用卡資料 =====");
        	return new ResponseEntity<>(new CreditcardData(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new CreditcardData(creditcards), HttpStatus.OK);
    }

    @GetMapping(value = "/{identfication}/deposite", produces = "application/json")
    public ResponseEntity<Integer> getDepositeData(@PathVariable("identfication") String identfication) {
        List<Deposite> deposites = depositeRepository.findByIdentification(identfication);
        if (deposites.isEmpty()) {
        	logger.info("===== 找不到" + identfication + "的存款帳戶資料 =====");
        	return new ResponseEntity<>(new Integer(0), HttpStatus.OK);
        }
        logger.info("===== 搜尋" + identfication + "的存款帳戶資料 =====")
        Integer depositeSum = new Integer(0);
        for (Deposite deposite: deposites) {
            depositeSum += deposite.getDepostiePrice();
        }
        return new ResponseEntity<>(depositeSum, HttpStatus.OK);
    }

    @GetMapping(value = "/{identfication}/bankDeposite", produces = "application/json")
    public ResponseEntity<Integer> getDepositeBankData(@PathVariable("identfication") String identfication, String bank) {
        List<Deposite> deposites = depositeRepository.findByIdentificationAndBank(identfication, bank);
        if (deposites.isEmpty()) {
        	logger.info("===== 找不到" + identfication + "的存款帳戶資料 =====");
        	return new ResponseEntity<>(new Integer(0), HttpStatus.OK);
        }
        logger.info("===== 搜尋" + identfication + "的" + bank + "存款資料 =====")
        Integer depositeSum = new Integer(0);
        for (Deposite deposite: deposites) {
            depositeSum += deposite.getDepostiePrice();
        }
        return new ResponseEntity<>(depositeSum, HttpStatus.OK);
    }

    @GetMapping(value = "/{userId}/loanModel", produces = "application/json")
    public ResponseEntity<LoanModelList> getLoanModel() {
        logger.info("===== 資料庫提取借貸方案中... =====");
        List<LoanModel> loanModels = loanModelRepository.findByType("vip");
        if (loanModels.isEmpty()) {
        	logger.info("===== 搜尋不到適合的借貸方案 =====");
        	return new ResponseEntity<>(new LoanModelList(), HttpStatus.OK);
        }
        for (LoanModel loanModel: loanModels) {
            logger.info("===== " + loanModel.getProduct() + " =====");
        }
        logger.info("===== 回傳以上適合的借貸方案 =====");
        LoanModelList loanModelList = new LoanModelList(loanModels);
        return new ResponseEntity<>(loanModelList, HttpStatus.OK);
    }
}