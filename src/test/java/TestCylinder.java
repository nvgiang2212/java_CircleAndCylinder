public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3, 6,"yellow");
        System.out.println(cylinder);

        cylinder = new Cylinder(14, 3, "pink");
        System.out.println(cylinder);
    }
}
