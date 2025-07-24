package keyword;

enum Shape {
    CIRCLE, TRIANGLE, RECTANGLE, SQUARE
}

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Shape.CIRCLE);

        int a = 5;
        Shape obj = Shape.SQUARE;
        System.out.println(obj);

        Shape[] obj1 = Shape.values();
        for (Shape val: obj1) {
            System.out.println(val);
        }


        Shape ob = Shape.SQUARE;
        if (ob == Shape.CIRCLE) System.out.println("No sides");
        else if (ob == Shape.SQUARE) System.out.println("4 sides");
        else if (ob == Shape.TRIANGLE) System.out.println("3 sides");
        else System.out.println("Something going wrong");

        Shape ob1 = Shape.SQUARE;

        switch (ob1) {
            case CIRCLE:
                System.out.println("No sides");
                break;
            case SQUARE:
                System.out.println("4 sides");
                break;
            case TRIANGLE:
                System.out.println("3 sides");
                break;
            default:
                System.out.println("Something going wrong");
        }

    }
}
