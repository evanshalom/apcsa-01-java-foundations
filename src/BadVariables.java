/**
 * Exercise 9 — Fix the Declarations
 *
 * SIX of the lines below are broken. Find them, fix them,
 * and add a comment on each fixed line saying what was wrong.
 *
 * One of them compiles fine but is still a bad idea. Find that one too.
 */
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5; // Variable names cannot start with a digit or use parentheses.

        double price = 9.99; // A double must be assigned a numeric literal, not a String.

        boolean isReady = true; // A boolean literal does not use quotation marks.

        char grade = 'A'; // A char uses single quotes, not double quotes.

        int classNumber = 11; // class is a reserved Java keyword.

        String name = "Sarah"; // Variable names should use lowerCamelCase.

        int studentScore = 95; // Variable names cannot contain spaces.

        System.out.println("If this runs, you fixed them all.");
    }
}
