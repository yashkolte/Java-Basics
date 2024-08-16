public class EncapsulateMobile_Private {
    public String brand;
    public String model;
    private int price;
    private String config;

    public String setMobileBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public String setMobileModel(String model){
        this.model = model;
        return model;
    }

    public int setMobilePrice(int price){
        this.price = price;
        return price;
    }

    public String setMobileConfig(String config){
        this.config = config;
        return config;
    }

    public String getMobileBrand(){
        return brand;
    }
    public String getMobileModel(){
        return model;
    }
    public int getMobilePrice(){
        return price;
    }
    public String getMobileConfig(){
        return config;
    }
    
}
