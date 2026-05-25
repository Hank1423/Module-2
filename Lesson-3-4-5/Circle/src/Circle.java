package src;

public class Circle {
    private String color;
    private double radius;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
}
