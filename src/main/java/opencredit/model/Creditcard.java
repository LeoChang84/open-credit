package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.Boolean;

@Document(collection = "creditcard")
public class Creditcard {
	@Id
	private String id;
    private String identification;
    private String bank;
    private String card;
    private Integer price;
    private String date;

	public Creditcard (String identification, String bank, String card, Integer price, String date) {
		this.identification = identification;
		this.bank = bank;
		this.card = card;
    	this.price = price;
    	this.date = date;
	}

    public Creditcard() { }
	
    public String getIdentification() {
        return identification;
    }

    public String getBank() {
    	return bank;
    }

    public String getCard() {
    	return card;
    }

    public Integer getPrice() {
    	return price;
    }

    public String getDate() {
    	return date;
    }

    public String toString() {
        return "[" + identification + " " + bank + " " + card + " " + price + " " + date + "]";
    }
}