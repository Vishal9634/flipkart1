import java.util.Scanner;
import java.lang.*;
public class flipKart {
      public static int customerId=1001;

      int ProductId[]=new int[5];
       String Pname[]=new String[5];
       int noOfItem[]=new int[5];
    Product []p=new Product[5];
    flipKart() {
        //initialisation of product
        p[0] = new Product(101, "Laptop", 7, 2023);
        p[1] = new Product(102, "facewash", 5, 2019);
        p[2] = new Product(103, "milk", 3, 2022);
        p[3] = new Product(104, "Rice", 7, 2022);
        p[4] = new Product(105, "bike", 5, 2046);
    }
    public void oderPlaced(){
        //............................
        int n=1; int flag=0;
        while (true) {
            if (n==1) {
                System.out.println("Total product avilable :");
                for (int i = 0; i < p.length; i++) {
                    System.out.println("Product Name:" + p[i].getProductName());
                }//for end
                n++;
            }//if end
            else {
                System.out.println("Enter 1 for Laptop:");
                System.out.println("Enter 2 for facewash:");
                System.out.println("Enter 3 for milk:");
                System.out.println("Enter 4 for Rice:");
                System.out.println("Enter 5 for Bike");
                System.out.println("Enter 6 for back to main menue:");
                Scanner s=new Scanner(System.in);
                int number =s.nextInt();
              //  int temp=1;
                switch(number)
                {
                    case 1: addProduct(0);
                        System.out.println("Laptop added sucsessfully: ");
                        break;
                    case 2: addProduct(1);
                         System.out.println("facewash added successfully");
                        break;
                    case 3: addProduct(2);
                           System.out.println("milk add successfully");
                        break;
                    case 4: addProduct(3);
                           System.out.println("Rice add successfully");
                        break;
                    case 5: addProduct(4);
                             System.out.println("Bike add");
                        break;
                    case 6: flag=number;
                        break;
                    default:
                        System.out.println("Enter correct number :");
                }//switch close
                if(flag==6)
                {break;}

            }//else close
        } //while close
    //.................................
    }//end order placed
    //....................................................
    public void showAddedProduct(){
        System.out.println(customerId+"\n");
        System.out.println("Product Id  Product Name  Total quantity");
        for(int i=0;i<p.length;i++){
            if(ProductId[i]==0)
            {
                continue;
            }
            else{
                System.out.println("  "+ProductId[i]+"      "+Pname[i]+"       "+noOfItem[i]);
            }
        }
    }
        //...........................................
    //total product avilable
    public void TotalproductAvilable()
    {
        System.out.println("Total product avilable :");
        for (int i = 0; i < p.length; i++) {
            System.out.println("Product Name:" + p[i].getProductName());
        }//for end
    } //close TotalproductAvilable
    //.........................................................................
    public void addProduct(int index)
    {  int temp=1;
        if(p[index].getTotalStock()>=1&&p[index].getDate()>=2022) {
            if(temp==1) {
                ProductId[index] = p[index].getId();
                Pname[index] = p[index].getProductName();
                noOfItem[index] = noOfItem[index] + 1;
                temp++;
            }
            else {
                noOfItem[index]=noOfItem[index]+1;
            }//inner else close
        }//outer if close
    }//addProduct close
    //..........................................................................







//main class
    public static void main(String[] args) {
       flipKart f=new flipKart();

      // p[0].productDetaild();
        while (true){

                System.out.println("Enter 1 for placed order :");
                System.out.println("Enter 2 for see the details of your order:");
                System.out.println("Enter 3 for Exit the program :");
                Scanner s=new Scanner(System.in);
                  int no=s.nextInt();
                  if(no==1) {
                      f.oderPlaced();
                  }//if close

                  else if (no==2) {
                     f.showAddedProduct();
                  }
                  else if(no==3)
                  {
                      System.exit(0);
                  }



            }
        }

    }

