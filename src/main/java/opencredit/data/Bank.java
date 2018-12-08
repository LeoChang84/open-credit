package opencredit.data;

public class Bank {

    private String bankName;
    
    public Bank() { }

	public Bank (String bankName) {
        this.bankName = bankName;
    }
	public String getBankName() { return  bankName; }

    public String toString() {
        return "[" + bankName + "]";
    }
}