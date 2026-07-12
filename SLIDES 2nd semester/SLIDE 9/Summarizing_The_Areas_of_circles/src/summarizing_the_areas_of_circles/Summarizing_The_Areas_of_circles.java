
package summarizing_the_areas_of_circles;

public class Summarizing_The_Areas_of_circles {

    public static void main(String[] args) {

        
        
        Circle[] arraycircle = new Circle[10];
        
        for(int i = 0; i< arraycircle.length; i++){
            arraycircle[i] = new Circle();
            System.out.println(arraycircle[i].getArea());
        }
    
        

    }
}

class Circle{

    private double radius = 1;
    
    public Circle(){
        this.radius = Math.random() * 100;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    
}
