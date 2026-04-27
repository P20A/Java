public class Circle {
    private Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return radius * Math.PI * 2;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public void addCircle(Circle c ){
        radius += c.radius;
    }
    public void printer(){
        System.out.println("Radius: "+ radius);
        System.out.println("Color: "+ color);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: "+ getArea());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                ", radius=" + radius +
                '}';
    }
}
enum Color {
    black,
    white,
    blue,
    red,
    yellow,
    green
}