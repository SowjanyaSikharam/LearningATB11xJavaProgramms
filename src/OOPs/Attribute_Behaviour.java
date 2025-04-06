package OOPs;

public class Attribute_Behaviour {
    public static void main(String[] args) {
       // String cat;
     cat c1 = new cat();
     c1.name = "dolly";
        System.out.println(c1.name);
    }

}

class cat{
    String name;
    String color;
    void Running(){
        System.out.println("Running");
    }
}
