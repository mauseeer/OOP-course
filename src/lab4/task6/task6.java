package lab4.task6;

class task6 {

    public static void printNumber() {
        int num = 10;
        System.out.println("Значення num у методі printNumber: " + num);
    }

    public static void main(String[] args) {
        printNumber();


        //System.out.println(num); // Змінна num є локальною змінною в методі, тобто вона існує лише всередині цього методу.
        // Її не видно за межами, тому в main() вона недоступна.
    }
}
