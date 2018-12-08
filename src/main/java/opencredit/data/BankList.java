package opencredit.data;

import java.util.List;

public class BankList {

    private List<Bank> banks;
    
    public BankList() { }

	public BankList (List<Bank> banks) {
        this.banks = banks;
    }
	public List<Bank> getBanks() { return  banks; }

    public String toString() {
        return "[" + banks + "]";
    }
}