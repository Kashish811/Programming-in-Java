import java.util.Scanner;  // Import Scanner for user input

public class VectorOperations {

    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        try {

            //Ask dimension of first vector
            System.out.print("Enter dimension of Vector 1 (2 or 3): ");
            int d1 = sc.nextInt();

            //Validate dimension of first vector
            if (d1 != 2 && d1 != 3) {
                throw new IllegalArgumentException(
                        "Vector 1 must be 2D or 3D only.");
            }

            //Ask dimension of second vector
            System.out.print("Enter dimension of Vector 2 (2 or 3): ");
            int d2 = sc.nextInt();

            //Validate dimension of second vector
            if (d2 != 2 && d2 != 3) {
                throw new IllegalArgumentException(
                        "Vector 2 must be 2D or 3D only.");
            }

            //Check if both vectors have same dimension
            if (d1 != d2) {
                throw new DimensionMismatchException(
                        "Both vectors must have same dimension.");
            }

            //Create arrays to store components
            double[] comp1 = new double[d1];
            double[] comp2 = new double[d2];

            //Input components of Vector 1
            System.out.println("Enter components of Vector 1:");
            for (int i = 0; i < d1; i++) {
                comp1[i] = sc.nextDouble();
            }

            //Input components of Vector 2
            System.out.println("Enter components of Vector 2:");
            for (int i = 0; i < d2; i++) {
                comp2[i] = sc.nextDouble();
            }

            //Create Vector objects
            Vector v1 = new Vector(comp1);
            Vector v2 = new Vector(comp2);

            //Perform operations
            Vector sum = v1.add(v2);
            Vector diff = v1.subtract(v2);
            double dot = v1.dotProduct(v2);

            //Display results
            System.out.print("Addition: ");
            sum.display();

            System.out.print("Subtraction: ");
            diff.display();

            System.out.println("Dot Product: " + dot);

        } 
        //Handle dimension mismatch
        catch (DimensionMismatchException e) {
            System.out.println("Dimension Error: " + e.getMessage());
        } 
        //Handle invalid dimension input
        catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } 
        //Handle invalid numeric input
        catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }

        //Close scanner
        sc.close();
    }
}