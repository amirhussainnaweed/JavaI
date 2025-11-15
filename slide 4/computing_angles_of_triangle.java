import java.util.Scanner;

public class Computing_angles_of_triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user for the three points
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute the three sides of the triangle
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); // side opposite A
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // side opposite B
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // side opposite C

        // Compute angles using the law of cosines
        double A = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c*c - b*b - a*a) / (-2 * a * b)));

        // Display angles
        System.out.printf("The angles are A = %.2f°, B = %.2f°, C = %.2f°\n", A, B, C);
    }
}
