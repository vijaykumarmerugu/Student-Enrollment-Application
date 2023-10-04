import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of students to enroll:");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i=0;i<numOfStudents;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for(int i=0;i<numOfStudents;i++){
            System.out.println(students[i].toString());
        }
    }
}