package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loan-model")
public class LoanModel {

	@Id
	private String id;
    private String product;
    private String image;
    private Float apr;
    private Integer fee;
    private Integer returnPrice;
    private Float rate;
    private String type;

    public LoanModel(String product, String image, Float apr, Integer fee, Integer returnPrice,
           Float rate, String type) {
        this.product = product;
        this.image = image;
        this.apr = apr;
        this.fee = fee;
        this.returnPrice = returnPrice;
        this.rate = rate;
        this.type = type;
	}

    public LoanModel() { }
	
    public String getProduct() {
        return product;
    }

    public String getImage() {
        return image;
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

    public Float getRate() {
        return rate;
    }

    public String getType() {
    	return type;
    }

    public String toString() {
        return "[" + product + " "  + type +  "]";
    }
}