public class ParameterAndDefaultConstructor {

    public static void main(String[] args) {
        Car3 c1 = new Car3();
        c1.name= "Tesla";
        System.out.println( c1.name);
        System.out.println( c1.price);
        Car3 c2 = new Car3();
        System.out.println( c2.name);
        System.out.println( c2.price);
        c2.eat();
        Car3 c3 = new Car3("TATA", 3000000);
        System.out.println( c3.name);
        System.out.println( c3.price);
        c3.eat();
        Car3 c4 = new Car3("ODI", 67777777);
        System.out.println( c4.name);
        System.out.println( c4.price);
        c4.eat();
    }
}
class Car3{
    String name;
    long price;
    Car3(){
        name = "unknown";
        price = 2000000;
    }

    Car3(String  name_car , long price_car){
        this.name = name_car;
        this.price = price_car;
    }
    void eat(){
        System.out.println(this.name+ " is eating");
    }
}
