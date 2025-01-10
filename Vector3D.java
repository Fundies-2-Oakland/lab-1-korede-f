import static java.lang.Math.sqrt;

public class Vector3D {
    private double x;
    private double y;
    private double z;


    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" +
                String.format("%.2f", x) + ',' +
                String.format("%.2f", y) + ',' +
                String.format("%.2f", z) +
                ')';
    }

    double getMagnitude() {
        return sqrt((getX() * getX()) + (getY() * getY()));
    }

}

