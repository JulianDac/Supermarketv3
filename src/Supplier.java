import java.util.ArrayList;

public class Supplier {
    String supplierID;
    String supplierName;
    ArrayList<String> products_carried_by_supplier = new ArrayList<String>();

    public Supplier(String supplierID, String supplierName) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
    }

    public Supplier() {
    }

    public String getSupplierID(){
        return supplierID;
    }

    public void setSupplierID(String SupplyID)
    {
        this.supplierID = SupplyID;
    }

    public String getSupplierName() { return supplierName; }

    public void setSupplierName(String SupplierName) { this.supplierName =SupplierName; }

    public ArrayList<String> getProducts_carried_by_supplier() {
        return products_carried_by_supplier;
    }

    public void addProducts(String Product) {
        this.products_carried_by_supplier.add(Product);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Supplier) {
            return supplierID.equalsIgnoreCase(((Supplier) obj).supplierID);
        }
        return false;
    }
}
