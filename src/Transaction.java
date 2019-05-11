import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Transaction {
    private String transID;
    private DateTime date_purchase;
    private Customer customer;
    Date date= new Date();
    List<String> products_in_receipt = new ArrayList<>();
    SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yyyy_hh:mm:ss");


    public Transaction( Customer customer, ArrayList<String> products_in_receipt, Date date) {
        this.transID = customer.getCustomerID() + "_" + dateformat.format(date);
        this.customer = customer;
        this.products_in_receipt = products_in_receipt;
        this.date=date;
    }

    public String getTransID() {
        return transID;
    }

    public String getDate_purchase() {

        return dateformat.format(date);

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public void setDate_purchase(Date date_purchase) {

        this.date = date_purchase;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
