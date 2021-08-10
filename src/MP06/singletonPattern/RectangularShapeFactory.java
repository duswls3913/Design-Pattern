package MP06.singletonPattern;
import java.awt.*;

public class RectangularShapeFactory implements ShapeFactory {
    private volatile static RectangularShapeFactory inst;

    private RectangularShapeFactory() {}

    public static RectangularShapeFactory getShapeFactory() {
        if (inst == null) {
            synchronized (RectangularShapeFactory.class) {
                if (inst == null) {
                    inst = new RectangularShapeFactory();
                }
            }
        }
        return inst;
    }

    @Override
    public Shape create(String type, Point[] points) {
        if (type.equals("Rectangle")) {
            return new Rectangle(type, points);
        }
        else if (type.equals("Trapezoid")) {
            return new Trapezoid(type, points);
        }
        else if (type.equals("Parallelogram")) {
            return new Parallelogram(type, points);
        }
        return null;
    }

}
