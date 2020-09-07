package design.pattern;

import design.pattern.factory.Shape;
import design.pattern.factory.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
