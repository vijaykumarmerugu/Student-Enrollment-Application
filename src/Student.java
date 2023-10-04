import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Name:");
        this.firstName = sc.nextLine();
        System.out.print("Enter your Last Name:");
        this.lastName = sc.nextLine();
        System.out.print("1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\nEnter your Grade Level:");
        this.gradeYear = sc.nextInt();
        setStudentID();
        //System.out.println("Please Check your details:\n"+firstName+" "+lastName+" "+gradeYear+" "+studentID);
    }
     public void setStudentID(){
        id++;
        this.studentID = gradeYear+""+id;
     }

     public void enroll(){
        do {
            System.out.print("Enter Courses to Enroll (Enter Q to Quit):");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n      " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }while(1!=0);
         //System.out.println("Enrolled In:"+ courses);
     }

     public void viewBalance(){
         System.out.println("Your Tuition Balance is: $"+tuitionBalance);
     }

     public void payTuition(){
        viewBalance();
         System.out.print("Enter Amount you want to pay: $");
         Scanner sc = new Scanner(System.in);
         int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
         System.out.println("Thanks for your payment: $"+payment);
         viewBalance();
     }

     public String toString(){
        return "Name: "+firstName+" "+lastName+
                "\nGrade Level: "+gradeYear+
                "\nStudent ID: "+studentID+
                "\nCourses Enrolled: "+courses+
                "\nTuition Balance: "+tuitionBalance;
     }

}
