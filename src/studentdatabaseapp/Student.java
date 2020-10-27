package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourses = 600;
    private static int id = 100;

    //Constructors prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter a student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter a student firts name: ");
        this.gradeYear = in.nextInt();

        setStudentId();


    }

    //Generate an ID
    private void setStudentId() {
        //Grade level + Id
        id++;
        //epeidi to studentId einai string kai to id einai int to grafoume me auti th morfi
        //Xrisimopoioume to static gia to id gia na pairnei me auto ton tropo to prwto noymero apo to bathmo toy mathiti
        this.studentId = gradeYear + " " + id;

    }

    //Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0

        do {
            System.out.print("Enter course to enroll(Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourses;
            } else {
                break;
            }
        } while (1 != 0);

    }


    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
    }


    //Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level:" + gradeYear +
                "\nStudents Id:" + studentId +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}

