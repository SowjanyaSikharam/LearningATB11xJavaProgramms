package ex_07_Increment_Decrement;

public class SwitchWithMultipleValues {
    public static void main(String[] args) {
        long test = 40;
        switch((int)test){
            case 40,50 :
                System.out.println("test");
                break;
            case 60 :
                System.out.println("test2");
                break;
            default:
                System.out.println("default");


        }
    }
}
