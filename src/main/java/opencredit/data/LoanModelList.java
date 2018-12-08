package opencredit.data;

import opencredit.model.LoanModel;
import java.util.List;

public class LoanModelList {

    private List<LoanModel> loanModels;
    
    public LoanModelList() { }

	public LoanModelList (List<LoanModel> loanModels) {
        this.loanModels = loanModels;
    }
	public List<LoanModel> getLoanModels() { return  loanModels; }

    public String toString() {
        return "[" + loanModels + "]";
    }
}