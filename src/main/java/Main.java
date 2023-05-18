public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Dot circleCenter = new Dot(1.2, 3.4);
        Circumference circumference = new Circumference();
        circumference.length = 12;
        circle.circumference = circumference;
        circle.square = 16;
        circle.dot = circleCenter;
    }
}
