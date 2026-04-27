public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width*height;
    };
    double getprimeter(){
        return (width*2)+(height*2);
    };

}
