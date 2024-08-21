public class Animal {
    void eat(){
        System.out.println("Animal eat the food");
    }
}

class Bird extends Animal {
    void eat(){
        super.eat();
        System.out.println("Bird eat the food");
    }
    static void food(){
        System.out.println("Fooood");
    }
}

class Dog extends Bird {
    void eat(){
        System.out.println("Dog eat the food");
        super.eat();
    }
}

class Cow extends Animal {
    // private String cow = "Cow eat Food by Default";
    private String cow;

    public void setCow(String c){
        System.out.println(c);
    }

    public String getCow(){
        return this.cow;
    }
}

class Driver {
    public static void main(String[] args) {
        Dog b = new Dog();
        b.eat();
        Bird.food();
        Cow cow = new Cow();
        cow.setCow("Cow eat Food");
        cow.getCow();
    }
}