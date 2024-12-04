public class Triangle extends Shape implements Movable {

    private int x, y;

    public Triangle(int x, int y, int width, int height) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + ", " + y + ")";
    }
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public double getArea() {
        return 0;
    }
}