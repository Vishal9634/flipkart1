public class Product {
    int id;
    String productName;
    int totalStock;
    int date;
    Product(int id,String productName,int totalStock,int date)
    {
        this.id=id;
        this.productName=productName;
        this.totalStock=totalStock;
        this.date=date;
    }
     public void productDetaild()
     {
         System.out.println("Product Id: "+id);
         System.out.println("Product Name: "+productName);
         System.out.println("TotalStock Avilable: "+totalStock);
         System.out.println("Expire date: "+date);
     }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public int getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }
}

