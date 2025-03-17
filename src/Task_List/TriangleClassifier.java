package Task_List;

public class TriangleClassifier {
    public static void main(String[] args) {
        /*Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides,
        determine if the triangle is equilateral (all sides are equal),
        isosceles (exactly two sides are equal), or scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
         */
        String TriangleSide1 = String.valueOf(Integer.parseInt(args[0]));
        String TriangleSide2 = String.valueOf(Integer.parseInt(args[1]));
        String TriangleSide3 = String.valueOf(Integer.parseInt(args[2]));
        if (TriangleSide1.equals(TriangleSide2) && TriangleSide2.equals(TriangleSide3)) {
            System.out.println("the triangle is equilateral");
        }
        else if (TriangleSide1.equals(TriangleSide2) || TriangleSide2.equals(TriangleSide3) || TriangleSide1.equals(TriangleSide3)) {
            System.out.println("the triangle is isosceles");
        }
        else
        {
            System.out.println("the triangle is scalene");
        }
    }

    }

