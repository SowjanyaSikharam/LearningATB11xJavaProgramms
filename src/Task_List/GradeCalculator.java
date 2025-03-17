package Task_List;
import java.util.*;
public class GradeCalculator {
public static void main(String[] args) {
        /*Write a program that calculates and displays the letter grade for a given numerical score
        (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/
        Scanner a = new Scanner(System.in);
        System.out.println("enter the score");
        byte Score = (byte)a.nextInt();
        System.out.println("Score :" + Score);
        String Grade = (Score >= 90) ? "Your grade is A": (Score >= 80) ? "Your grade is B":
                (Score >= 70) ? "Your grade is C": (Score >= 60) ? "Your grade is D" : "E" ;
        System.out.println(Grade);
    }

}
