public class Customer {
    private String customerID;
    private String customerName;
    private String postCode;
    private int loyaltyPoint;

    public Customer(String customerID, String customerName, String postCode, int loyaltyPoint) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.postCode = postCode;
        this.loyaltyPoint = loyaltyPoint;
    }



    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setLoyaltyPoint(int loyaltyPoint) {
        this.loyaltyPoint = loyaltyPoint;
    }




}
