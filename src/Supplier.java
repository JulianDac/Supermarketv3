import java.util.ArrayList;

public class Supplier {
    String supplierID;
    String supplierName;
    ArrayList<String> productsCarriedBySupplier = new ArrayList<String>();

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

    public ArrayList<String> getProductsCarriedBySupplier() {
        return productsCarriedBySupplier;
    }

    public void addProducts(String Product) {
        this.productsCarriedBySupplier.add(Product);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Supplier) {
            return supplierID.equalsIgnoreCase(((Supplier) obj).supplierID);
        }
        return false;
    }
}
