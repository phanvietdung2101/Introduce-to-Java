import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if(a != 0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n" ,answer);
        } else {
            if(b == 0){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
