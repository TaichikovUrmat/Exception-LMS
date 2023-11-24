public class Cylinder {


    private double radius;
    private  double height;

    public Cylinder() {}

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double ayint(){
        return   2*Math.PI * radius*( height + radius);
//
    }
    public double kolom(){
        return  (Math.PI*radius*radius*height);

    }

}

