package Lab1;
/*
Comp3111Lex\Lab1\mainApp1.java
Main application for Lab1 exercise */
public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;

        System.out.println("Program ..Starting...");
        System.out.println("1 + 1 = "+2);
        System.out.println("2 + 3 = "+5);
        System.out.println(b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = " + myLibrary.factorial(n));
        System.out.println("University name: The Hong Kong University of Science and Technology");
        System.out.println("Course name(s): COMP3111/COMP3111H");
        System.out.println("Lab location: Room 4621");
        System.out.println("Program ..Ended …");
    }
}
