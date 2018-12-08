package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loan-history")
public class LoanHistory {

	@Id
	private String id;
    private String identification;
    private String bank;
    private String product;
    private Float apr;
    private Integer fee;
    private Integer returnPrice;
    private Integer totalPrice;
    private Integer repayStaging;
    private Integer staging;
    private String startDate;
    private String endDate;
    private String repaymentDateOfMonth;
    private Float repayRate;
    private String commentFromBank;
    private Boolean due;


    public LoanHistory (String identification, String bank, String product, Float apr,
        Integer fee, Integer returnPrice, Integer totalPrice, Integer repayStaging, Integer staging,
        String startDate, String endDate, String repaymentDateOfMonth, Float repayRate,
        String commentFromBank, Boolean due) {
        this.identification = identification;
        this.bank = bank;
        this.product = product;
        this.apr = apr;
        this.fee = fee;
        this.returnPrice = returnPrice;
        this.totalPrice = totalPrice;
        this.repayStaging = repayStaging;
        this.staging = staging;
        this.startDate = startDate;
        this.endDate = endDate;
        this.repaymentDateOfMonth = repaymentDateOfMonth;
        this.repayRate = repayRate;
        this.commentFromBank = commentFromBank;
        this.due = this.due;
	}

    public String getIdentification() {
        return identification;
    }

    public String getBank() {
        return bank;
    }

    public String getProduct() {
        return product;
    }

    public Float getApr() {
        return apr;
    }

    public Integer getFee() {
        return fee;
    }

    public Integer getReturnPrice() {
        return returnPrice;
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

    public String toString() {
        return "[" + product + " " + apr + " " + totalPrice +"]";
    }
}