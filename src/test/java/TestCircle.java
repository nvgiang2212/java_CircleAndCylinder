public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2, "red");
        System.out.println(circle);

        circle = new Circle(10.5, "green");
        System.out.println(circle);
    }
}
