package opencredit.data;

import opencredit.model.Creditcard;
import java.util.List;

public class CreditcardData {

    private List<Creditcard> creditcards;
    
    public CreditcardData() { }

	public CreditcardData (List<Creditcard> creditcards) {
        this.creditcards = creditcards;
    }
	public List<Creditcard> getCreditcards() { return  creditcards; }

    public String toString() {
        return "[" + creditcards + "]";
    }
}