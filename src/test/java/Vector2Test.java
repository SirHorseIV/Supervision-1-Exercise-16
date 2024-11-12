import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Vector2Test {
    @Test
    public void addIsCorrect() {
        Vector2 a = new Vector2(1, 2);
        Vector2 b = new Vector2(3, 4);

        Vector2 c = a.add(b);

        assertEquals(4, c.x, 1E-7);
        assertEquals(6, c.y, 1E-7);
    }

    @Test
    public void dotIsCorrect() {
        Vector2 a = new Vector2(1, 2);
        Vector2 b = new Vector2(3, 4);

        double c = a.dot(b);

        assertEquals(11, c, 1E-7);
    }

    @Test
    public void scaleIsCorrect() {
        Vector2 a = new Vector2(1, 2);

        Vector2 b = a.scale(2);

        assertEquals(2, b.x, 1E-7);
        assertEquals(4, b.y, 1E-7);
    }

    @Test
    public void magnitudeIsCorrect() {
        Vector2 a = new Vector2(3, 4);

        double b = a.magnitude();

        assertEquals(5, b, 1E-7);
    }

    @Test
    public void normalisedIsCorrect() {
        Vector2 a = new Vector2(3, 4);

        Vector2 b = a.normalised();

        assertEquals(3D / 5D, b.x, 1E-7);
        assertEquals(4D / 5D, b.y, 1E-7);
    }
}
