package lab4.task8;

class task8 {
    static int counter = 0;

    public static void setCounter(int counter) {
        System.out.println("Локальна змінна counter: " + counter);
    }

    public static void main(String[] args) {
        setCounter(5);

        System.out.println("Глобальна змінна counter: " + counter);
    }
}

