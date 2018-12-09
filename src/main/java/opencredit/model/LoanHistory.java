package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Document(collection = "loan-history")
public class LoanHistory {

	@Id
	private String id;
    private String identification;
    private LoanModel loanModel;
    private Integer totalPrice;
    private Integer repayStaging;
    private Integer staging;
    private String startDate;
    private String endDate;
    private String repaymentDateOfMonth;
    private Float repayRate;
    private String commentFromBank;
    private Boolean due;
    private String status;


    public LoanHistory (String identification, LoanModel loanModel, Integer totalPrice,
        Integer repayStaging, Integer staging,String startDate, String endDate, String repaymentDateOfMonth,
        Float repayRate,String commentFromBank, Boolean due, String status) {
        this.identification = identification;
        this.loanModel = loanModel;
        this.totalPrice = totalPrice;
        this.repayStaging = repayStaging;
        this.staging = staging;
        this.startDate = startDate;
        this.endDate = endDate;
        this.repaymentDateOfMonth = repaymentDateOfMonth;
        this.repayRate = repayRate;
        this.commentFromBank = commentFromBank;
        this.due = due;
        this.status = status;
	}

    public LoanHistory() {}

    public String getIdentification() {
        return identification;
    }

    public LoanModel getLoanModel() {
        return loanModel;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public Integer getRepayStaging() {
        return repayStaging;
    }
    
    public Integer getStaging() {
        return staging;
    }
    
    public String getStartDate() {
        return startDate;
    }
    
    public String getEndDate() {
        return endDate;
    }
    
    public String getRepaymentDateOfMonth() {
        return repaymentDateOfMonth;
    }
    
    public Float getRepayRate() {
        return repayRate;
    }
    
    public String getCommentFromBank() {
        return commentFromBank;
    }

    public Boolean getDue() {
        return due;
    }

    public String getStatus() {
        return status;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setLoanModel(LoanModel loanModel) {
        this.loanModel = loanModel;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRepayStaging(Integer repayStaging) {
        this.repayStaging = repayStaging;
    }
    
    public void setStaging(Integer staging) {
        this.staging = staging;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public void setRepaymentDateOfMonth(String repaymentDateOfMonth) {
        this.repaymentDateOfMonth = repaymentDateOfMonth;
    }
    
    public void setRepayRate(Float repayRate) {
        this.repayRate = repayRate;
    }
    
    public void setCommentFromBank(String commentFromBank) {
        this.commentFromBank = commentFromBank;
    }

    public void setDue(Boolean due) {
        this.due = due;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String toString() {
        return "[" + loanModel.getProduct() + " " + loanModel.getApr() + " " + totalPrice + " " + status + "]";
    }
}