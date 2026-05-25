public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1(){
        double delta = getDiscriminant();
        if (delta < 0){
            return 0;
        } else {
            return (-this.b + Math.sqrt(delta))/(2*this.a);
        }
    }

    public double getRoot2(){
        double delta = getDiscriminant();
        if (delta < 0){
            return 0;
        } else {
            return (-this.b - Math.sqrt(delta))/(2*this.a);
        }
    }

    public String display() {
        return this.a + "x^2 + " + this.b + "x + " + this.c + " = 0";
    }
}
