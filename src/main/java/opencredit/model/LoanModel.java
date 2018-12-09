package opencredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Document(collection = "loan-model")
public class LoanModel {

	@Id
	private String id;
    private String product;
    private String bank;
    private String image;
    private Float apr;
    private Integer fee;
    private Integer returnPrice;
    private Float rate;
    private String type;

    public LoanModel(String product, String bank, String image, Float apr, Integer fee, Integer returnPrice,
           Float rate, String type) {
        this.product = product;
        this.bank = bank;
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

    public String getBank() {
        return bank;
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

    public void setProduct(String product) {
        this.product = product;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setApr(Float apr) {
    	this.apr = apr;
    }

    public void setFee(Integer fee) {
    	this.fee = fee;
    }

    public void setReturnPrice(Integer returnPrice) {
    	this.returnPrice = returnPrice;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setType(String type) {
    	this.type = type;
    }

    public String toString() {
        return "[" + product + " "  + type +  "]";
    }
}