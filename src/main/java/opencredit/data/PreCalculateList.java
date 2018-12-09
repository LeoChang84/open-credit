package opencredit.data;

import java.util.List;

public class PreCalculateList {

    private String product;

    private List<PreCalculateModel> preCalculateModels;
    
    public PreCalculateList() { }

	public PreCalculateList (String product, List<PreCalculateModel> preCalculateModels) {
        this.product = product;
        this.preCalculateModels = preCalculateModels;
    }

    public String getProduct() {
        return product;
    }

	public List<PreCalculateModel> getPreCalculateList() {
        return  preCalculateModels;
    }

    public String toString() {
        return "[" + product + preCalculateModels + "]";
    }
}