// Question 1
class Circle{
    double radius;
    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double calArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
}

class Cylinder extends Circle{
    double height;
    void setHeight(double height){
        this.height = height;
    }
    double getHeight(){
        return height;
    }
    double calVol(){
        double volume = (calArea())*height;
        return volume;
    }
}

// Question 2
class Rectangle{
    int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    int width;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    int calArea(){
        int area = length*width;
        return area;
    }
}

class Cuboid extends Rectangle{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int calSA(){
        int surfaceArea = 2*(length*width+width*height*height*length);
        return surfaceArea;
    }
    int calVol(){
        int volume = (calArea())*height;
        return volume;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        /*Cylinder cyl = new Cylinder();
        cyl.setRadius(15.6);
        cyl.setHeight(30);
        double volume = cyl.calVol();
        System.out.println(volume);*/

        Cuboid c = new Cuboid();
        c.setLength(20);
        c.setWidth(15);
        c.setHeight(5);
        int surfaceArea = c.calSA();
        System.out.println(surfaceArea);
    }
}
