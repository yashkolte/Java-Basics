
public class PrivateVar {
    private int price;
    
    public void setPrice(int price) {
     if (price > 0) {
         this.price = price;
     }
     else {
        System.out.println("Invalid price");
     }
    }

    public int getPrice() {
        return price;
    }
}