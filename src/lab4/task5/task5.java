package lab4.task5;

class task5 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double circleArea = calculateArea(9);
        double rectangleArea = calculateArea(9, 18);

        System.out.println("Площа кола: " + circleArea);
        System.out.println("Площа прямокутника: " + rectangleArea);
    }
}

