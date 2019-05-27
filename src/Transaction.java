import java.util.ArrayList;

public class Transaction {
    private String transID;
    private DateTime datePurchase;
    private String customerID;
    DateTime date = new DateTime();
    ArrayList<String> productsInReceipt = new ArrayList<>();
//    SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yyyy_hh:mm:ss");


    public Transaction(String customerID, ArrayList<String> productsInReceipt) {
        this.customerID = customerID;
        this.productsInReceipt = productsInReceipt;
    }

    public String getTransID() {
        return customerID + "_" + date.getFormattedDate();
    }

    public String getDatePurchase() {
        return date.getFormattedDate();
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setTransID(String transID) {
        this.transID = customerID + "_" + date.getFormattedDate();
    }

    public void setDatePurchase(DateTime datePurchase) {
        this.date = datePurchase;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
