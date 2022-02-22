import java.util.Scanner;
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
        System.out.println("Circumference of circle = "+(double)2*Math.PI*r);
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
        System.out.println("Perimeter of rectangle = "+(double)2*(l+b));
    }
    public void area(){
        System.out.println("Area of rectangle = "+l*b);
    }
}

class Triangle extends Shape{
    double s1,s2,s3;
    double s;
    public Triangle(double s1, double s2, double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        s = (s1+s2+s3)/2;
    }
    public void perimeter(){
        System.out.println("Perimeter of triangle = "+(s1+s2+s3));
    }
    public void area(){
        System.out.println("Area of triangle = "+Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
    }
}

class Sphere extends Shape{
    double r;
    public Sphere(double r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of sphere = "+(double)4*Math.PI*r*r);
    }
    public void volume(){
        System.out.println("Volume of sphere = "+(double)(4/3)*Math.PI*Math.pow(r, 3));
    }
}

class Cylinder extends Shape{
    double r,h;
    public Cylinder(double r, double h){
        this.r=r;
        this.h=h;
    }
    public void area(){
        System.out.println("Area of cylinder = "+(double)4*Math.PI*r*r);
    }
    public void volume(){
        System.out.println("Volume of cylinder = "+(double)(4/3)*Math.PI*Math.pow(r, 3));
    }
}
class ques_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        int flag=0;
        while (true) {
            System.out.println("Enter numbers from 1 to 7\n1 -> Circle\n2 ->Rectangle\n3 ->Triangle\n4 -> Square\n5 -> Sphere\n6 -> Cylinder\n7 -> Exit");
            f=sc.nextInt();
            switch (f) {
                case 1:
                    System.out.println("Enter the radius of circle:");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.display();
                    break;
                case 2:
                    System.out.println("Enter the length and breadth of rectangle respectively:");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    Rectangle re = new Rectangle(l,b);
                    re.display();
                    break;
                case 3:
                    System.out.println("Enter the length of three sides of triangle:");
                    double s1 = sc.nextDouble();
                    double s2 = sc.nextDouble();
                    double s3 = sc.nextDouble();
                    Triangle t = new Triangle(s1,s2,s3);
                    t.display();
                    break;
                case 4:
                    System.out.println("Enter the side of square:");
                    double s = sc.nextDouble();
                    Square sq = new Square(s);
                    sq.display();
                    break;
                case 5:
                    System.out.println("Enter the radius of sphere:");
                    double sp = sc.nextDouble();
                    Sphere sph = new Sphere(sp);
                    sph.display();
                    break;
                case 6:
                    System.out.println("Enter the radius and height of cylinder respectively:");
                    double ra = sc.nextDouble();
                    double hi = sc.nextDouble();
                    Cylinder cyl = new Cylinder(ra,hi);
                    cyl.display();
                    break;
                case 7:
                    System.out.println("Code finished!!");
                    flag=1;
                default:
                    break;
            }
            if(flag==1)
            break;
            // sc.close();
        }
        
    }
}