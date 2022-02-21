class Shape{
    public void area(){}
    public void perimeter(){}
    public void volume(){}
    public void display(){
        area();
        perimeter();
        volume();
    }
}

class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r=r;
    }
    public void perimeter(){
        System.out.println("Circumference of circle = "+2*Math.PI*r);
    }
    public void area(){
        System.out.println("Area of circle = "+Math.PI*r*r);
    }
}

class Square extends Shape{
    double s;
    public Square(double s){
        this.s=s;
    }
    public void perimeter(){
        System.out.println("Perimeter of square = "+4*s);
    }
    public void area(){
        System.out.println("Area of square = "+s*s);
    }
}

class Rectangle extends Shape{
    double l,b;
    public Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle = "+2*(l+b));
    }
    public void area(){
        System.out.println("Area of rectangle = "+l*b);
    }
}

class Triangle extends Shape{
    double s1,s2,s3;
    double s = (s1+s2+s3)/2;
    public Triangle(double s1, double s2, double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public void perimeter(){
        System.out.println("Perimeter of triangle = "+s1+s2+s3);
    }
    public void area(){
        System.out.println("Area of triangle = "+Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
    }
}

class ques_2{
    public static void main(String[] args) {
        
    }
}