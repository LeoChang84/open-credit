package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "deposite")
public class Deposite {
	@Id
    private String id;
    private String identification;
    private String bank;
    private Integer depostiePrice;

	public Deposite (String identification, String bank, Integer depostiePrice) {
		this.identification = identification;
		this.bank = bank;
    	this.depostiePrice = depostiePrice;
	}

    public Deposite() { }
	
    public String getIdentification() {
        return identification;
    }

    public String getBank() {
    	return bank;
    }

    public Integer getDepostiePrice() {
    	return depostiePrice;
    }

    public String toString() {
        return "[" + identification + " " + bank + " " + " " + depostiePrice + "]";
    }
}