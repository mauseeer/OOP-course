package lab4.task7;

class task7 {
    static int counter = 0;

    public static void increment() {
        counter++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();

        System.out.println("Значення counter: " + counter);
    }
}
