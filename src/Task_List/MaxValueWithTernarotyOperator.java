package Task_List;

public class MaxValueWithTernarotyOperator {
    public static void main(String[] args) {
        int  val1 = Integer.parseInt(args[0]);
        int  val2 = Integer.parseInt(args[1]);
        String result= val1>val2 ?"val1 is max: " + val1:"va12 is max:" +val2;
        System.out.println(result);
    }
}
