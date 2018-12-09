package opencredit.data;

import opencredit.model.Deposite;
import java.util.List;

public class DepositeData {

    private List<Deposite> deposites;
    
    public DepositeData() { }

	public DepositeData (List<Deposite> deposites) {
        this.deposites = deposites;
    }
	public List<Deposite> getCreditcards() { return  deposites; }

    public String toString() {
        return "[" + deposites + "]";
    }
}