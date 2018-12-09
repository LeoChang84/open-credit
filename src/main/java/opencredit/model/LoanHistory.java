package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
        this.startDate = startDate;
        this.endDate = endDate;
        this.repaymentDateOfMonth = repaymentDateOfMonth;
        this.repayRate = repayRate;
        this.commentFromBank = commentFromBank;
        this.due = this.due;
        this.status = status;
	}

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

    public String toString() {
        return "[" + loanModel.getProduct() + " " + loanModel.getApr() + " " + totalPrice + " " + status + "]";
    }
}