public class SalesLineItem {
    private String productID;
    private Integer item_quantity;

    public SalesLineItem(String productID, Integer item_quantity) {
        this.productID = productID;
        this.item_quantity = item_quantity;
    }


    public String getProductID() {
        return productID;
    }

    public Integer getItem_quantity() {
        return item_quantity;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setItem_quantity(Integer item_quantity) {
        this.item_quantity = item_quantity;
    }

    public void increaseByOne(Integer increment) {
        this.item_quantity += increment;
    }

}
