public class Mobile {

    // Create A Mobile Class with 4 Non Static varibles which represents the features of mobile like Bran, Price, Ram, Sreen_Size. 
    // Create 5 object of mobile & Initiallials each & every object features by using object refence once after initiallzing display the values

    String brand;
    double price;
    int ram;
    double screen_size;

     public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 150000.00;
        m1.ram = 12;
        m1.screen_size = 6.5;

        Mobile m2 = new Mobile();
        m2.brand = "Xiaomi";
        m2.price = 35000.00;
        m2.ram = 6;
        m2.screen_size = 6.0;

        Mobile m3 = new Mobile();
        m3.brand = "Poco";
        m3.price = 35000.00;
        m3.ram = 6;
        m3.screen_size = 5.9;

        Mobile m4 = new Mobile();
        m4.brand = "Razor";
        m4.price = 85000.00;
        m4.ram = 8;
        m4.screen_size = 6.1;

        Mobile m5 = new Mobile();
        m5.brand = "Mi";
        m5.price = 55000.00;
        m5.ram = 6;
        m5.screen_size = 6.0;

        // Display the values of each object features
        System.out.println("Brand: " + m1.brand + " Price: " + m1.price + " Ram: " + m1.ram + " Screen Size: " + m1.screen_size);
        System.out.println("Brand: " + m2.brand + " Price: " + m2.price + " Ram: " + m2.ram + " Screen Size: " + m2.screen_size);
        System.out.println("Brand: " + m3.brand + " Price: " + m3.price + " Ram: " + m3.ram + " Screen Size: " + m3.screen_size);
        System.out.println("Brand: " + m4.brand + " Price: " + m4.price + " Ram: " + m4.ram + " Screen Size: " + m4.screen_size);
        System.out.println("Brand: " + m5.brand + " Price: " + m5.price + " Ram: " + m5.ram + " Screen Size: " + m5.screen_size);
    }



}
