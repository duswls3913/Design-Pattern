package MP06.singletonPattern;
import java.awt.Point;

public interface ShapeFactory {
    Shape create(String type, Point[] points);
}
