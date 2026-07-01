public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null){
            shape1.draw();
        }

        Shape shape2 = shapeFactory.getShape("SQUARE");
        if (shape2 != null){
            shape2.draw();
        }

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        if (shape3 != null){
            shape3.draw();
        }
    }
}
