package opencredit.data;

import opencredit.model.LoanHistory;
import java.util.List;

public class LoanData {

    private List<LoanHistory> loanHistorys;
    
    public LoanData() { }

	public LoanData (List<LoanHistory> loanHistorys) {
        this.loanHistorys = loanHistorys;
    }

	public List<LoanHistory> getLoanHistorys() { return  loanHistorys; }

    public String toString() {
        return "[" + loanHistorys + "]";
    }
}