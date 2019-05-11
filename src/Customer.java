public class Customer {
    private String CustomerID;
    private String CustomerName;
    private String PostCode;
    private int LoyaltyPoint;

    public Customer(String customerID, String customerName, String postCode, int loyaltyPoint) {
        CustomerID = customerID;
        CustomerName = customerName;
        PostCode = postCode;
        LoyaltyPoint = loyaltyPoint;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getPostCode() {
        return PostCode;
    }

    public int getLoyaltyPoint() {
        return LoyaltyPoint;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public void setLoyaltyPoint(int loyaltyPoint) {
        LoyaltyPoint = loyaltyPoint;
    }




}
