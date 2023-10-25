class Cylinder{
    private double radius;
    private double height;

    void setRadius(double r){
        radius = r;
    }
    void setHeight(double h){
        height = h;
    }

    double getRadius(){
        return radius;
    }
    double getHeight(){
        return height;
    }
    
    double calSA(){
        double surfaceArea = 2*((Math.PI*radius*radius)+(Math.PI*radius*height));
        return surfaceArea;
    }
    double calVol(){
        double volume = (Math.PI*radius*radius*height);
        return volume;
    }

    Cylinder(double r, double h){
        radius = r;
        height = h;
    }
}

class Rectangle{
    private int length;
    private int width;

    Rectangle(){
        length = 1;
        width = 1;
    }

    Rectangle(int l){
        length = l;
        width = 1;
    }
    Rectangle(int l, int w){
        length = l;
        width = w;
    }

    int calPerimeter(){
        int perimeter = 2*(length+width);
        return perimeter;
    }
}

class Sphere{
    private double radius;

    Sphere(double r){
        radius = r;
    }

    double calSA(){
        double surfaceArea = 4*(Math.PI*radius*radius);
        return surfaceArea;
    }

    double calVol(){
        double volume = 4*(Math.PI*radius*radius*radius)/3;
        return volume;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        /*Cylinder cyl1 = new Cylinder();

        cyl.setRadius(10);
        cyl.setHeight(3.4);

        double cyl1_r = cyl1.getRadius();
        double cyl1_h = cyl1.getHeight();

        System.out.printf("Radius of the cylinder is %f & its height is %f\n",cyl1_r,cyl1_h);*/

        // Question 2
        /*double cyl1_sa = cyl1.calSA();
        double cyl1_vol = cyl1.calVol();

        System.out.println("Surface area = "+cyl1_sa);
        System.out.println("Volume = "+cyl1_vol);*/

        // Question 3
        /*Cylinder cyl2 = new Cylinder(10,15);

        double cyl2_r = cyl2.getRadius();
        double cyl2_h = cyl2.getHeight();

        System.out.printf("Radius of the cylinder is %f & its height is %f\n",cyl2_r,cyl2_h);*/

        // Question 4
        /*Rectangle rec1 = new Rectangle();
        int rec1_peri = rec1.calPerimeter();
        System.out.println(rec1_peri);

        Rectangle rec2 = new Rectangle(12);
        int rec2_peri = rec2.calPerimeter();
        System.out.println(rec2_peri);

        Rectangle rec3 = new Rectangle(5,7);
        int rec3_peri = rec3.calPerimeter();
        System.out.println(rec3_peri);*/

        // Question 5
        Sphere sph = new Sphere(4);
        
        double sph_sa = sph.calSA();
        double sph_vol = sph.calVol();

        System.out.println("Surface area = "+sph_sa);
        System.out.println("Volume = "+sph_vol);
    }
}
