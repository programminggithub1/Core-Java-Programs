package AbstractANDToString;

// ======================= Shape (Abstract Class) ========================
abstract public class Shape {

    private String color;
    private double borderWidth;
    private String shapeName;

    // Default Constructor
    Shape() {
        System.out.println("Shape default constructor");
        color = "default";
        borderWidth = 1.0;
        shapeName = "not entered";
    }

    // Parameterized Constructor
    Shape(String shapeName, String color, double borderWidth) {
        System.out.println("Shape parameterized constructor");
        this.shapeName = shapeName;
        this.color = color;
        this.borderWidth = borderWidth;
    }

    // Abstract Method
    abstract double calArea();

    // toSting Method
    public String toString() {
        return "\nShape::" + shapeName + " Color::" + color + " BorderWidth::" + borderWidth;
    }

    // -------- Getters / Setters ----------
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
}
// ======================= End Shape Class ===============================



// ======================= Rectangle Class ===============================
class Rectangle extends Shape {

    private double length;
    private double breadth;

    // Default Constructor
    Rectangle() {
        super();
        System.out.println("Rectangle default constructor");
        length = 5.0;
        breadth = 4.0;
    }

    // Parameterized Constructor
    Rectangle(String color, double borderWidth, double length, double breadth) {
        super("Rectangle", color, borderWidth);
        System.out.println("Rectangle parameterized constructor");
        this.length = length;
        this.breadth = breadth;
    }

    double calArea() {
        return length * breadth;
    }

    // Getters / Setters
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

    public String toString() {
        return super.toString() + " Length::" + length + " Breadth::" + breadth;
    }
}
// ======================= End Rectangle Class ===========================



// ======================= Circle Class =================================
class Circle extends Shape {

    private double radius;

    // Default Constructor
    Circle() {
        super();
        System.out.println("Circle default constructor");
        radius = 3.0;
    }

    // Parameterized Constructor
    Circle(String color, double borderWidth, double radius) {
        super("Circle", color, borderWidth);
        System.out.println("Circle parameterized constructor");
        this.radius = radius;
    }

    double calArea() {
        return 3.1416 * radius * radius;
    }

    // Getter / Setter
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + " Radius::" + radius;
    }
}
// ======================= End Circle Class ==============================



// ======================= Triangle Class ===============================
class Triangle extends Shape {

    private double base;
    private double height;

    // Default Constructor
    Triangle() {
        super();
        System.out.println("Triangle default constructor");
        base = 4.0;
        height = 6.0;
    }

    // Parameterized Constructor
    Triangle(String color, double borderWidth, double base, double height) {
        super("Triangle", color, borderWidth);
        System.out.println("Triangle parameterized constructor");
        this.base = base;
        this.height = height;
    }

    double calArea() {
        return 0.5 * base * height;
    }

    // Getters / Setters
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

    	public String toString() {
            return super.toString() + " Base::" + base + " Height::" + height;
        }
}
// ======================= End Triangle Class ============================



// ======================= Demo Class ===================================
class DemoShape {

    public static void main(String[] args) {

        Shape s1; // generic reference

        s1 = new Rectangle("Blue", 2.5, 10, 5);  // upcasting
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println("\n");

        s1 = new Circle("Red", 1.5, 7);  // upcasting
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println("\n");

        s1 = new Triangle("Green", 3.0, 8, 6);  // upcasting
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println("\n");
    }
}

// ======================= End Demo Class ================================
