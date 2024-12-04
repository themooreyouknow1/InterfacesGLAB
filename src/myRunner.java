public class myRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        Triangle t1 = new Triangle(3,5, 5, 6);
        Rectangle r1 = new Rectangle(1, 2, 2, 3);

        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Circle coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, circle coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, circle coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, circle coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, circle coordinates are " + c1.getCoordinate());

        System.out.println();
        System.out.println("Triangle coordinates are " + t1.getCoordinate());
        t1.moveDown();
        System.out.println("After move Down, Coordinates are " + t1.getCoordinate());
        t1.moveRight();
        System.out.println("After move right, triangle coordinates are " + t1.getCoordinate());

        System.out.println();
        System.out.println("Rectangle coordinates are " + r1.getCoordinate());
        r1.moveDown();
        System.out.println("After move Down, rectangle coordinates are " + r1.getCoordinate());
        r1.moveRight();
        System.out.println("After move right, rectangle coordinates are " + r1.getCoordinate());



        System.out.println("---Test Polymorphism---");
        Movable c2 = new Circle(5, 10, 200);//upcasting

        c2.moveUp();
        System.out.println("After move Up, Coordinates are " + c2.getCoordinate());
        c2.moveLeft();
        System.out.println("After move left, Coordinates are " + c2.getCoordinate());

    }
}
