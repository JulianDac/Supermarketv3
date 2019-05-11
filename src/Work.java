import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Work {
    List<Product> all_products = new ArrayList<>();
    List<Supplier> all_suppliers = new ArrayList<>();
    List<Customer> all_customers = new ArrayList<>();
    List<SalesLineItem> all_saleslineitem = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    Product product;
    Supplier supplier;
    Transaction transaction;
    private String aString;
    private double aDouble;
    private int anInt;
    private long aLong;

    public void work() {
        while (true) {
            System.out.println("Welcome to Doge Supermarket!\n" +
                    "1. Manager\n" +
                    "2. Customer\n" +
                    "3. Sales Person\n" +
                    "4. Exit");

            System.out.println("Enter your choice: ");
            int login = Integer.parseInt(scanner.nextLine());
            switch (login) {
                case 1:
                    managerMenu();
                    break;
                case 2:
                    customerMenu();
                    break;
                case 3:
                    salesPersonMenu();
                    break;
                case 4:

            }
            autoRestock();
        }
    }

    public void managerMenu() {
        while (true) {
            System.out.println("Select any of the following choices\n" +
                    "1. Add Item:            Manager\n" +
                    "2. View Items:          Manager or Customer\n" +
                    "3. View All Suppliers:  Manager\n" +
                    "4. Current Stock:       Manager\n" +
                    "5. Replenish:           Manager\n" +
                    "6. Exit Program:        Manager\n" +
                    "7. Go back to login:    Manager\n");

            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    viewSuppliers();
                    break;
                case 4:
                    System.out.println(StockLevel());
                    break;
                case 5:
                    replenish();
                    break;
                case 6:
                    System.out.println("Bye");
                    exit(0);
                    break;
                case 7:
                    work();
                    break;
                default:
                    System.out.println("This is not a valid menu option.\n\n");
                    break;
            }
        }
    }

    public void customerMenu() {
        while (true) {
            System.out.println("Select any of the following choices\n" +
                    "1. Get Price:           Customer\n" +
                    "2. View Items:          Manager or Customer\n" +
                    "3. Check Discount:      Customer\n" +
                    "4. Purchase:            Customer\n" +
                    "5. Exit Program:        ");

            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the Product's ID:");
                    aString = scanner.nextLine();
                    System.out.println(getPrice(aString));
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    System.out.println("Enter the Product ID: ");
                    aString = scanner.nextLine();
                    System.out.println("\n***Get " + getDiscount(aString) + "% discount if you purchase " + getDiscountNumber(aString) + " of these***\n");
                    break;
                case 4:
                    purchase();
                    break;
                case 5:
                    System.out.println("Bye");
                    exit(0);
                    break;
                default:
                    System.out.println("This is not a valid menu option.\n\n");
                    break;
            }
        }
    }

    public void salesPersonMenu() {
            System.out.println("Sales Person is a Work in progress");
    }

    public void autoRestock() {
        for (int i = 0; i < all_products.size(); i++) {
            if (all_products.get(i).getStockLevel() < 500) {
                all_products.get(i).increaseStockLevel(500);
            }
        }
    }

    public String getPrice(String ID) {
        product = findByProductID(ID);
        return (("The product " + ID + " costs $") + product.getPrice());
    }

    public int getDiscountNumber(String ID) {
        product = findByProductID(ID);
        return product.getDiscItems();
    }

    public double getDiscount(String ID) {
        product = findByProductID(ID);
        return product.getDiscount();
    }

    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Adding Item******");
        System.out.println("Enter the Product ID: ");
        String entered_product_ID = scanner.nextLine();
        Product queried_product = findByProductID(entered_product_ID);
        if (all_products.contains(queried_product)) {
            System.out.println("Product already exists.");
        } else {
//            System.out.println("Product not in database. Add now.");
//            Product product = new Product();
//            product.setProductID(entered_product_ID);
//            System.out.println("Enter the Product Name: ");
//            String entered_product_name = scanner.nextLine();
//            product.setProductName(entered_product_name);
//            System.out.println("Enter the Product Unit Price: ");
//            Double entered_price = scanner.nextDouble();
//            product.setPrice(entered_price);
//            System.out.println("Enter the Current Stock Level: ");
//            Long entered_stock_level = scanner.nextLong();
//            product.setStockLevel(entered_stock_level);
//            System.out.println("Enter the number of items to be purchased to get bulk discount: ");
//            Integer entered_min_items_discount = scanner.nextInt();
//            product.setDiscItems(entered_min_items_discount);
//            System.out.println("Enter the percentage of discount to be offered: ");
//            Double entered_percent_discount = scanner.nextDouble();
//            product.setDiscount(entered_percent_discount);
//            System.out.println("Enter the Supplier ID: ");
//            String entered_supplierID = scanner.nextLine();
//            scanner.nextLine();
//            Supplier queried_supplier = findBySupplierID(entered_supplierID);
//
//                if (all_suppliers.contains(queried_supplier)) {
//                    System.out.println("This supplier already exists. Will add this product into this supplier's offerings.");
//                    supplier = findBySupplierID(entered_supplierID);
//                    supplier.addProducts(entered_product_name);
//                } else {
//                    System.out.println("Enter the Supplier Name: ");
//                    String entered_supplierName = scanner.nextLine();
//                    Supplier supplier = new Supplier(entered_supplierID, entered_supplierName);
//                    all_suppliers.add(supplier);
//                    supplier.addProducts(entered_product_name);
//                }
//            product.setSupplierID(entered_supplierID);
//            all_products.add(product);
            Product banana = new Product("aaa", "banana", 10);
            Product pineapple = new Product("bbb", "pine apple", 15);
            Product dildo = new Product("ccc", "dildo", 20);
            all_products.add(banana);
            all_products.add(pineapple);
            all_products.add(dildo);
            System.out.println("New banana, pine apple and dildo added successfully." + "\n");
        }
    }



    public void viewProducts() {
        for(int i = 0; i < all_products.size(); i++){
            System.out.println("\n"+"Product no." + (i +1)+"\t"+"\t"
                    + all_products.get(i).getProductID()+"\t"
                    + all_products.get(i).getProductName()+"\t"
                    + all_products.get(i).getPrice()+"\t"
                    + all_products.get(i).getStockLevel()+"\t"
                    + all_products.get(i).getSupplierID()+"\t"
                    + all_products.get(i).getRevenue()+"\t"
                    + all_products.get(i).getDiscItems()+"\t"
                    + all_products.get(i).getDiscount()+"\n" );
        }
    }

    public void viewSuppliers() {
        for(int i = 0; i < all_suppliers.size(); i++){
            System.out.println("\n"+"Supplier no."+(i+1)+"\t"+"\t" + all_suppliers.get(i).getSupplierID());
            for(int k = 0; k < all_suppliers.get(i).getProducts_carried_by_supplier().size(); k++){
                System.out.println("\t\n"+"Product no."+(k+1)+"\t"+"\t" + all_suppliers.get(i).products_carried_by_supplier.get(k));
            }
        }
    }

    public ArrayList<String> searchProduct(String ID) {
        supplier = findBySupplierID(ID);
        return supplier.getProducts_carried_by_supplier();
    }

    public long StockLevel() {
        System.out.println("Enter the Product ID: ");
        aString = scanner.nextLine();
        product = findByProductID(aString);
        return product.getStockLevel();
    }

    public long StockLevel(String ID) {
        product = findByProductID(ID);
        return product.getStockLevel();
    }

    public void purchase() {
      /*  System.out.println("Enter the Product ID which is being purchased: ");
        aString = scanner.nextLine();
        product = findByProductID(aString);
        System.out.println("Enter quantity to be purchased: ");
        aLong = scanner.nextLong();
        scanner.nextLine();
        product.reduceStockLevel(aLong);*/

        boolean create = true;
        while (create) {
            System.out.println("Are you an existing customer (Y) or (N): ");
            switch (scanner.nextLine()) {
                case "Y":
                    System.out.println("Enter your customerID");
                    String CustomerID= scanner.nextLine();

                    if (all_customers.contains(findByCustomerID(CustomerID))) {
                        purchaseAsExistingMember(CustomerID);
                        create = false;
                    } else {
                        System.out.println("Invalid ID.");
                    }
                    break;
                case "N":
                    create = false;
                    createNewCustomer();
                    break;
            }
        }
    }

    public boolean createNewCustomer() {
        String CustomerID;
        String CustomerName;
        String PostCode;
        int LoyaltyPoint;
        System.out.println("Enter your ID: ");
        CustomerID = scanner.nextLine();
        if (all_customers.contains(findByCustomerID(CustomerID))) {
            System.out.println("Customer already exists");
            return false;
        }
        Customer Bob = new Customer("111", "Bob", "1111", 1);
        Customer Hussein = new Customer("222", "Hussein", "2222", 2);
        Customer Eva = new Customer("333", "Eva", "3333", 3);
//        System.out.println("Enter your name: ");
//        CustomerName = scanner.nextLine();
//        System.out.println("Enter your Post Code: ");
//        PostCode = scanner.nextLine();
//        LoyaltyPoint = 0;
//        Customer new_customer = new Customer(CustomerID, CustomerName, PostCode, LoyaltyPoint);
//        all_customers.add(new_customer);
        all_customers.add(Bob);
        all_customers.add(Hussein);
        all_customers.add(Eva);
        System.out.println("Thanks for joining the membership, Bob, Hussein and Eva.");
        purchaseAsExistingMember(CustomerID);
        return true;
    }

    public boolean quitShoppingCart(String input) {
        if (input.equals("Q")) {
            System.out.println("Bye");
            return false;
        } else {
            return true;
        }
    }

    public boolean purchaseAsExistingMember(String CustomerID) {
        System.out.println("Welcome to checkout!");
        String customerID;
        String add_item_to_receipt;
        int quantity_of_item;
        ArrayList<String> temp_array_list_items = new ArrayList<>();

            do {
                System.out.println("Enter the product ID you want to buy, or press Q to quit: ");
                add_item_to_receipt = scanner.nextLine();

                if(all_products.contains(findByProductID(add_item_to_receipt))) {
                    temp_array_list_items.add(add_item_to_receipt);
                    System.out.println("Enter the quantity you want to buy: ");
                    quantity_of_item = Integer.parseInt(scanner.nextLine());
                    SalesLineItem new_SLI = new SalesLineItem(add_item_to_receipt, quantity_of_item);
                    if (all_saleslineitem.contains(findSLIByProductID(add_item_to_receipt))) {
                        new_SLI.increaseByOne(quantity_of_item);
                        int new_quantity = new_SLI.getItem_quantity();
                        System.out.println("Buying " + add_item_to_receipt + " at " + new_quantity + " units.");
                    }
                    else
                    all_saleslineitem.add(new_SLI);
                } else {
                    System.out.println("Invalid ID");}
            } while (!add_item_to_receipt.equals("Q"));


        Date date = new Date();
        Transaction new_trans = new Transaction(findByCustomerID(aString), temp_array_list_items, date);


            System.out.println("Thank you. This is your receipt.");
            System.out.println("Transaction ID: " + new_trans.getTransID() + "\n"
                    + "Date of Purchase: " + new_trans.getDate_purchase()+ "\n"
                    + "Customer ID: " + new_trans.getCustomer().getCustomerID());
        return true;
    }

    public void replenish() {
        System.out.println("Enter the Product ID: ");
        aString = scanner.nextLine();
        product = findByProductID(aString);
        System.out.println("Enter quantity to be replenished: ");
        aLong = scanner.nextLong();
        scanner.hasNextLine();
        product.increaseStockLevel(aLong);
    }

    public String addSupplier() {
        System.out.println("Enter the Supplier ID: ");
        String input = scanner.nextLine();
        product.setSupplierID(input);
        supplier = new Supplier();
        supplier.setSupplierID(input);
        if (all_suppliers.contains(supplier)) {
            supplier = findBySupplierID(product.getSupplierID());
            String output = "This Supplier already exists.";
            return output;
        } else {
            all_suppliers.add(supplier);
            return "Supplier added!";
        }
    }

    public Product findByProductID(String ID) {
        for (Product v : all_products) {
            if (v.getProductID().equalsIgnoreCase(ID)) {
                return (Product) v;
            }
        }
        return null;
    }

    public Supplier findBySupplierID(String ID) {
        for (Supplier supplier : all_suppliers) {
            if (supplier.getSupplierID().equalsIgnoreCase(ID)) {
                return supplier;
            }
        }
        return null;
    }

    public Customer findByCustomerID(String id) {
        for (int i = 0; i< all_customers.size(); i++) {
            Customer customer = all_customers.get(i);
            if (customer.getCustomerID().equals(id)) {
                return customer;
            }
        }
        return null;
    }


    public SalesLineItem findSLIByProductID(String id) {
        for (int i = 0; i< all_saleslineitem.size(); i++) {
            SalesLineItem SLI = all_saleslineitem.get(i);
            if (SLI.getProductID().equals(id)) {
                return SLI;
            }
        }
        return null;
    }

}
