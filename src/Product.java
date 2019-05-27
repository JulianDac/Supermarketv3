public class Product {
    private String productID;
    private String productName;
    private double price;
    private long stockLevel;
    private String supplierID;
    private double revenue =0;
    private int discItems;
    private double discount;

    public Product(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public Product() {
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String ID) {
        this.productID =ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String Name) {
        this.productName =Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price =Price;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.supplierID =SupplierID;
    }

    public long getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(long StockLevel) {
        this.stockLevel =StockLevel;
    }

    public void reduceStockLevel(long StockPurchased) {
        if (this.stockLevel -StockPurchased<0) {
            System.out.println("There isn't enough Stock");
        } else {
            this.stockLevel = this.stockLevel - StockPurchased;
        }
    }

    public void increaseStockLevel(long StockPurchased){
        this.stockLevel =this.stockLevel +StockPurchased;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double Revenue) {
        this.revenue =Revenue;
    }

    public int getDiscItems(){
        return discItems;
    }

    public void setDiscItems(int DiscItems) {
        this.discItems =DiscItems;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double Discount) {
        this.discount =Discount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            return productID.equalsIgnoreCase(((Product) obj).productID);
        }
        return false;
    }

}
