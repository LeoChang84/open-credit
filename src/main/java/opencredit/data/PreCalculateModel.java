package opencredit.data;

public class PreCalculateModel {
    
    private Integer stage;
    private Integer loanBalance;
    private Integer principal;
    private Integer interest;
    private Integer payment;

    public PreCalculateModel() { }

    public PreCalculateModel (Integer stage, Integer loanBalance, Integer principal, Integer interest,
                            Integer payment) {
        this.stage = stage;
        this.loanBalance = loanBalance;
        this.principal = principal;
        this.interest = interest;
        this.payment = payment;
    }

	public Integer getStage() {
        return  stage;
    }

    public Integer getLoanBalance() {
        return  loanBalance;
    }
    
    public Integer getPrincipal() {
        return  principal;
    }

    public Integer getInterest() {
        return  interest;
    }
    
    public Integer getPayment() {
        return  payment;
    }

    public String toString() {
        return "[" + " " + payment + "]";
    }
}