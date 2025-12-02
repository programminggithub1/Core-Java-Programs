package Polymorphism;

public class Shape {

	    String color;
	    double borderWidth;
	    String shapeName;
	    double area;
	    Shape()//default
	    {
	    	super();
	    	System.out.println("shape default constructor");
	    	color="default";
	    	borderWidth=4.5;
	    	shapeName="not entered";
	    	area=4.5;
	    }
	    Shape(String shapeName, String color, double borderWidth,double area) //parameterized 
	    {
	    	 System.out.println("shape parameterized constructor");
	        this.shapeName = shapeName;
	        this.color = color;
	        this.borderWidth = borderWidth;
	    }

	    void display() {
	        System.out.println("Shape: " + shapeName);
	        System.out.println("Color: " + color);
	        System.out.println("Border Width: " + borderWidth);
	    }
	   double calArea()
	    {
	    	return area;
	    }
	     String getColor() {
			return color;
		}

		 void setColor(String color) {
			this.color = color;
		}

		 double getBorderWidth() {
			return borderWidth;
		}

		 void setBorderWidth(double borderWidth) {
			this.borderWidth = borderWidth;
		}

		 String getShapeName() {
			return shapeName;
		}

		 void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}

		double area() {   // generic area method
	        return 0;
	    }
	}//shape class ends here

	class Rectangle extends Shape {
	    double length;
	    double breadth;
	    Rectangle()//default
	    {
	    	super();
	    	System.out.println("reclangle default constructor");
	    	length=5.6;
	    	breadth=4.5;
	    	
	    }
	    Rectangle(String color, double borderWidth, double length, double breadth,double area) {
	        super("Rectangle", color, borderWidth,area);
	        System.out.println("reclangle parameterized constructor");
	        this.length = length;
	        this.breadth = breadth;
	    }
	    double calArea()
	    {
	    	return length*breadth;
	    }
	    double area() {
	        return length * breadth;
	    }

	     double getLength() {
			return length;
		}
		 void setLength(double length) {
			this.length = length;
		}
		 double getBreadth() {
			return breadth;
		}
		 void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		void display() {
	        super.display();
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	        System.out.println("Area of Rectangle: " + area());
	    }
	}//reclangle class ends here
	class Circle extends Shape {
	    double radius;
	    Circle()//default
	    {
	    	super();
	    	System.out.println("circle default constructor");
	    	radius=4.5;
	    	
	    }
	    Circle(String color, double borderWidth, double radius,double area)//parameterized
	    {
	        super("Circle", color, borderWidth,area);
	        System.out.println("circle parameterized constructor");
	        this.radius = radius;
	    }
	    double calArea()
	    {
	    	return 3.1416 * radius * radius;
	    }
	     double getRadius() {
			return radius;
		}
		 void setRadius(double radius) {
			this.radius = radius;
		}

	    void display() {
	        super.display();
	        System.out.println("Radius: " + radius);
	        System.out.println("Area of Circle: " + area());
	    }
	}//circle class ends here
	class Triangle extends Shape {
	    double base;
	    double height;
	    Triangle()//default
	    {
	    	super();
	    	System.out.println("triangle default constructor");
	    	base=4.3;
	    	height=6.5;
	    }
	    Triangle(String color, double borderWidth, double base, double height,double area)//parameterized
	    {
	        super("Triangle", color, borderWidth,area);
	        System.out.println("triangle parameterized constructor");
	        this.base = base;
	        this.height = height;
	    }
	    double calArea()
	    {
	    	return  0.5 * base * height;
	    }
	     double getBase() {
			return base;
		}
		 void setBase(double base) {
			this.base = base;
		}
		 double getHeight() {
			return height;
		}
		 void setHeight(double height) {
			this.height = height;
		}


	    void display() {
	        super.display();
	        System.out.println("Base: " + base);
	        System.out.println("Height: " + height);
	        System.out.println("Area of Triangle: " + area());
	    }
	}//triangle class ends here

	class DemoShape {
	
	    public static void main(String[] args) {
	    	Shape s1;//generic reference
	        System.out.println("--- Rectangle ---");
	        s1 = new Rectangle("Blue", 2.5, 10, 5,3.2);//upcasting
	        s1.calArea();
	        s1.display();

	        System.out.println("\n--- Circle ---");
	        s1 = new Circle("Red", 1.5, 7,2.3);//upcasting
	        s1.calArea();
	        s1.display();

	        System.out.println("\n--- Triangle ---");
	        s1 = new Triangle("Green", 3.0, 8, 6,2.3);//upcasting
	        s1.calArea();
	        s1.display();
	    }//main ends here
	}//demo class ends here


