package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loan-model")
public class LoanModel {

	@Id
	private String id;
    private String product;
    private Float apr;
    private Integer fee;
    private Integer returnPrice;
    private String type;

	public LoanModel(String product, Float apr, Integer fee, Integer returnPrice, String type) {
        this.product = product;
        this.apr = apr;
        this.fee = fee;
        this.returnPrice = returnPrice;
        this.type = type;
	}

    public LoanModel() { }
	
    public String getProduct() {
        return product;
    }

    public Float getApr() {
    	return apr;
    }

    public Integer getFee() {
    	return fee;
    }

    public Integer getReturnPrice() {
    	return returnPrice;
    }

    public String getType() {
    	return type;
    }

    public String toString() {
        return "[" + product + " "  + type +  "]";
    }
}