package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import opencredit.data.Bank;

import java.util.List;

@Document(collection = "general-information")
public class BasicInfo {

    @Id
    private String id;
    private String identification;
    private String name;
    private String address;
    private String company;
    private List<Bank> bankList;
    private String creditScore;

    public BasicInfo (String identification, String name, String address, String company, List<Bank> bankList, String creditScore) {
        this.identification = identification;
        this.name = name;
        this.address = address;
        this.company = company;
        this.bankList = bankList;
        this.creditScore = creditScore;
    }

    public BasicInfo() { }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Bank> getBankList() {
        return bankList;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public String toString() {
        return "[" + identification + " " + name + " " + address + " " + company + "]";
    }
}