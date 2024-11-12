public class Vector2 {
    public double x;
    public double y;

    Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Vector2 add(Vector2 other) {
        return new Vector2(x + other.x, y + other.y);
    }

    double dot(Vector2 other) {
        return x * other.x + y * other.y;
    }

    Vector2 scale(double scalar) {
        return new Vector2(x * scalar, y * scalar);
    }

    double magnitude() {
        return Math.sqrt(x * x + y * y);
    }
    
    Vector2 normalised() {
        double scalar = Math.sqrt(x * x + y * y);
        return this.scale(1 / scalar);
    }
}
