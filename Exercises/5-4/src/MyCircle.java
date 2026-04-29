public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(int x, int y, int radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getCircumference(){
        return Math.PI * radius * 2;
    }
    public double distance(MyCircle circle){
        return center.distance(circle.center);
    }
}
