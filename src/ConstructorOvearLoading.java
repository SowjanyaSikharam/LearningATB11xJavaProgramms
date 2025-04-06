public class ConstructorOvearLoading {
    public static void main(String[] args) {
        Car4 c1 = new Car4();
        c1.name= "Tesla";
        System.out.println( c1.name);
        System.out.println( c1.price);
        Car4 c3 = new Car4("TATA", 3000000);
        System.out.println( c3.name);
        System.out.println( c3.price);
        c3.eat();
        Car4 c4 = new Car4("odi");
        System.out.println( c4.name);
        System.out.println( c4.price);
        c4.eat();
    }
}
class Car4{
    String name;
    long price;
    Car4(){

    }
//Constructor Ovearloading
    Car4(String  name_car , long price_car){
        this.name = name_car;
        this.price = price_car;
    }

    Car4(String  name_car){
        this.name = name_car;

    }
    void eat(){
        System.out.println(this.name+ " is eating");
    }
}
