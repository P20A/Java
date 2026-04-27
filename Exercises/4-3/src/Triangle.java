public class Triangle {
    private float length = 1f;
    private float width = 1f;

    public Triangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getPerimeter(){
        return (length + width)*2;
    }
    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
