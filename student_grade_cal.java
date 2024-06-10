import java.util.Scanner;

public class student_grade_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("student grade calculator---");
        System.out.print("enter no of subjects : ");
        int sub = sc.nextInt();
        int tsum = 0;
        for (int i = 0; i < sub; i++) {
            System.out.print("enter marks obtained in " + i + ": ");
            int marks = sc.nextInt();
            tsum += marks;
        }
        double averP = (double) tsum / sub;
        char grade;
        if (averP >= 90) {
            grade = 'O';
        } else if (averP >= 80) {
            grade = 'A';
        } else if (averP >= 70) {
            grade = 'B';
        } else if (averP >= 60) {
            grade = 'C';
        } else if (averP >= 50) {
            grade = 'D';
        } else if (averP >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("total marks Scored is " + tsum);
        System.out.println("average percentage gained is " + averP + "%");
        System.out.println("grade :" + grade);
    }
}
