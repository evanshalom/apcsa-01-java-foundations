/**
 * Exercise 7 — AboutMe
 *
 * TODO: Declare and initialize at least one variable of EACH type:
 *     int, double, boolean, char, String
 *
 * Then print each one with a descriptive label.
 *
 * Requirements:
 *   - Use camelCase names
 *   - Names must be descriptive (favoriteNumber, not x)
 *   - Include at least one `final` constant in ALL_CAPS
 */
public class AboutMe {
    public static void main(String[] args) {

        final String FAVORITE_SUBJECT = "Computer Science";
        int favoriteNumber = 13;
        double favoriteDecimal = 2.13;
        boolean enjoysCoding = true;
        char favoriteInitial = 'E';
        String favoriteColor = "Brown";

        System.out.println("Favorite subject: " + FAVORITE_SUBJECT);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Favorite decimal: " + favoriteDecimal);
        System.out.println("Enjoys coding: " + enjoysCoding);
        System.out.println("Favorite initial: " + favoriteInitial);
        System.out.println("Favorite color: " + favoriteColor);

    }
}
