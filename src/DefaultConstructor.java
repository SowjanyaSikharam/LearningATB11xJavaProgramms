public class DefaultConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name= "Tesla";
        System.out.println( c1.name);
        System.out.println( c1.price);
        Car c2 = new Car();
        System.out.println( c2.name);
        System.out.println( c2.price);
    }
}
class Car{
    String name;
    long price;
    Car(){
        name = "unknown";
         price = 2000000;
    }
}