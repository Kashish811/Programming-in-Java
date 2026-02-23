public class Vector {

    private double[] components;

    // Constructor
    public Vector(double[] components) {
        this.components = components;
    }

    public int getDimension() {
        return components.length;
    }

    public Vector add(Vector v) throws DimensionMismatchException {
        if (this.getDimension() != v.getDimension()) {
            throw new DimensionMismatchException("Dimensions do not match for addition.");
        }

        double[] result = new double[getDimension()];
        for (int i = 0; i < getDimension(); i++) {
            result[i] = this.components[i] + v.components[i];
        }

        return new Vector(result);
    }

    public Vector subtract(Vector v) throws DimensionMismatchException {
        if (this.getDimension() != v.getDimension()) {
            throw new DimensionMismatchException("Dimensions do not match for subtraction.");
        }

        double[] result = new double[getDimension()];
        for (int i = 0; i < getDimension(); i++) {
            result[i] = this.components[i] - v.components[i];
        }

        return new Vector(result);
    }

    public double dotProduct(Vector v) throws DimensionMismatchException {
        if (this.getDimension() != v.getDimension()) {
            throw new DimensionMismatchException("Dimensions do not match for dot product.");
        }

        double sum = 0;
        for (int i = 0; i < getDimension(); i++) {
            sum += this.components[i] * v.components[i];
        }

        return sum;
    }

    public void display() {
        System.out.print("(");
        for (int i = 0; i < components.length; i++) {
            System.out.print(components[i]);
            if (i < components.length - 1)
                System.out.print(", ");
        }
        System.out.println(")");
    }
}
