public class SalesLineItem {
    private String productID;
    private Integer itemQuantity;

    public SalesLineItem(String productID, Integer itemQuantity) {
        this.productID = productID;
        this.itemQuantity = itemQuantity;
    }


    public String getProductID() {
        return productID;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void increaseQtyBy(Integer increment) {
        this.itemQuantity += increment;
    }

}
