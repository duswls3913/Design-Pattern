package MP06.singletonPattern;
import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory {
    private volatile static TriangularShapeFactory inst;

    private TriangularShapeFactory() {}

    public static TriangularShapeFactory getShapeFactory() {
        if (inst == null) {
            synchronized (TriangularShapeFactory.class) {
                if (inst == null) {
                    inst = new TriangularShapeFactory();
                }
            }
        }
        return inst;
    }

    @Override
    public Shape create(String type, Point[] points) {
        if (type.equals("Triangle")) {
            return new Triangle(type, points);
        }
        else if (type.equals("RightTriangle")) {
            return new RightTriangle(type, points);
        }
        return null;
    }
}
