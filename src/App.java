import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.printf("A = %.6f,", a);
        System.out.printf(" B = %.6f\n", b);
        System.out.printf("C = %.6f,", c);
        System.out.printf(" D = %.6f\n", d);

        System.out.printf("A = %.1f,", a);
        System.out.printf(" B = %.1f\n", b);
        System.out.printf("C = %.1f,", c);
        System.out.printf(" D = %.1f\n", d);

        System.out.printf("A = %.2f,", a);
        System.out.printf(" B = %.2f\n", b);
        System.out.printf("C = %.2f,", c);
        System.out.printf(" D = %.2f\n", d);

        System.out.printf("A = %.3f,", a);
        System.out.printf(" B = %.3f\n", b);
        System.out.printf("C = %.3f,", c);
        System.out.printf(" D = %.3f\n", d);

        System.out.printf("A = %5.3E,", a);
        System.out.printf(" B = %5.3E\n", b);
        System.out.printf("C = %5.3E,", c);
        System.out.printf(" D = %5.3E\n", d);

        System.out.printf("A = %.0f,", a);
        System.out.printf(" B = %.0f\n", b);
        System.out.printf("C = %.0f,", c);
        System.out.printf(" D = %.0f\n", d);

        sc.close();


    }

}
