package lab1.task1;

import java.util.Scanner;

class UserAge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();
        System.out.println("Ваш вік: " + age + " років.");
        scanner.close();
    }
}