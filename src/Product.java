public class Product {
    private String ProductID;
    private String ProductName;
    private double Price;
    private long StockLevel;
    private String SupplierID;
    private double Revenue=0;
    private int DiscItems;
    private double Discount;

    public Product(String productID, String productName, double price) {
        ProductID = productID;
        ProductName = productName;
        Price = price;
    }

    public Product() {
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ID) {
        this.ProductID=ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String Name) {
        this.ProductName=Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price=Price;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID=SupplierID;
    }

    public long getStockLevel() {
        return StockLevel;
    }

    public void setStockLevel(long StockLevel) {
        this.StockLevel=StockLevel;
    }

    public void reduceStockLevel(long StockPurchased) {
        if (this.StockLevel-StockPurchased<0) {
            System.out.println("There isn't enough Stock");
        } else {
            this.StockLevel = this.StockLevel - StockPurchased;
        }
    }

    public void increaseStockLevel(long StockPurchased){
        this.StockLevel=this.StockLevel+StockPurchased;
    }

    public double getRevenue() {
        return Revenue;
    }

    public void setRevenue(double Revenue) {
        this.Revenue=Revenue;
    }

    public int getDiscItems(){
        return DiscItems;
    }

    public void setDiscItems(int DiscItems) {
        this.DiscItems=DiscItems;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount=Discount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            return ProductID.equalsIgnoreCase(((Product) obj).ProductID);
        }
        return false;
    }

}
