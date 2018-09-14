import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Item {

    private String productname;
    private int quantity;
    private int unitprice;

    Item(String name, int quant, int uprice) {
        this.productname = name;
        this.quantity = quant;
        this.unitprice = uprice;
    }

    Item(String name, int quant) {
        this.productname = name;
        this.quantity = quant;
    }

    String getProductname() {
        return this.productname;
    }

    int getQuantity() {
        return this.quantity;
    }

    void setQuantity(int quantinp) {
        this.quantity = quantinp;
    }

    int getUnitprice() {
        return this.unitprice;
    }

    void setUnitprice(int upricee) {
        this.unitprice = upricee;
    }

    public String toString() {
        return this.productname + " " + this.quantity + " " + (double) this.unitprice;
    }

    String represent() {
        return this.productname + " " + this.quantity;
    }

    

}

class ShoppingCart {

    private ArrayList<Item> catalog = new ArrayList<Item>();
    private ArrayList<Item> cart = new ArrayList<Item>();
    private boolean flag = true;
    private double discount = 0;

    void addToCatalog(Item item) {
        catalog.add(item);
    }

    void addToCart(Item item) {
        for(Item i : catalog) {
            if(i.getProductname().equals(item.getProductname())) {
                item.setUnitprice(i.getUnitprice());
                Item tmp = null;
                for (Item j : cart) {
                    if(j.getProductname().equals(item.getProductname())) {
                        j.setQuantity(j.getQuantity() + item.getQuantity());
                        tmp = j;
                        break;
                    }
                }
                if (tmp == null) {
                    cart.add(item);    
                }
                break;
            }
        }
        
    }

    void removeFromCart(Item item) {
        for (Item i : cart) {
            if (i.getProductname().equals(item.getProductname())) {
                i.setQuantity(i.getQuantity() - item.getQuantity());
                if (i.getQuantity() == 0) {
                    cart.remove(i);
                }
                break;
            }
        }
    }

    void showCart() {
        for (Item item : cart) {
            System.out.println(item.represent());
        }
    }

    void showCatalog() {
        for (Item item : catalog) {
            System.out.println(item);
        }
    }

    double getTotalAmount() {
         
        double amnt = 0;

        for (Item item : cart) {
            amnt += (item.getQuantity() * item.getUnitprice());
        }

        return amnt;
    }

    void applyCoupon(int discountt) { 
        //System.out.println("discounttt " +discountt);
        if (discountt != 10 && discountt != 20 && discountt != 30 && discountt != 50) {
            System.out.println("Invalid coupon");
            return;
        }
        if (this.flag) {
            double amount = this.getTotalAmount();
            this.discount = (amount * discountt) / 100;
            //System.out.println(this.discount); 
            this.flag = false;
        }
 
    }

    double getPayableAmount() {
        //tax.
        return (getTotalAmount() - this.discount) * 1.15;
    }

    void printInvoice() {
        System.out.println("Name   quantity   Price");

        for (Item item : cart) {
            System.out.println(item);
        }

        double tmp = this.getTotalAmount();

        
        System.out.println("Total:" + tmp);

        System.out.println("Disc%:" + this.discount);

        double tmp2 = tmp - this.discount;

        System.out.println("Tax:" + (tmp2 * 0.15));

        System.out.printf("Payable amount: %.1f\n",this.getPayableAmount());

    }

}






/**
 * Solution class.
 */
public final class Solution {
    
    /**
     * Constructs the object.
     */
    private Solution() {

    }

    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        //copy from prev works
        //chng the function calls
                
        ShoppingCart scart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().replace(" ",",").split(",");
            //System.out.println(Arrays.toString(tokens));
            switch (tokens[0]) {
            case "Item":
                scart.addToCatalog(new Item(tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3])));
                break;
            case "catalog":
                scart.showCatalog();
                break;
            case "show":
                scart.showCart();
                break;
            case "add":
                scart.addToCart(new Item(tokens[1],Integer.parseInt(tokens[2])));
                break;
            case "remove":
                scart.removeFromCart(new Item(tokens[1],Integer.parseInt(tokens[2])));
                break;
            case "totalAmount":
                System.out.println("totalAmount: " + scart.getTotalAmount());
                break;
            case "payableAmount":
                //String movienaam, String timings, String mobilenum
                //System.out.println(Arrays.toString(tokens));
                System.out.printf("Payable amount: %.1f\n",scart.getPayableAmount());
                break;
            case "print":
                scart.printInvoice();
                break;
            case "coupon":
                scart.applyCoupon(Integer.parseInt(tokens[1].replace("IND","")));
                //scart.applyCoupon()
            default:
                break;            
            
            }
        }
    }
}


