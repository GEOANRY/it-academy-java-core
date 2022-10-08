package by.it_academy.lesson3;

public class Main {

    public static void main(String[] args) {
        //First task
        int giftValue = 26000;
        if (giftValue < 5000) {
            System.out.println("Налог равен = " + 0);
        } else if (25000 >= giftValue && giftValue >= 5000) {
            System.out.println("Налог равен = " + (100 + (giftValue - 5000) * 0.08));
        } else {
            System.out.println("Налог равен = " + (1700 + (giftValue - 25000) * 0.1));
        }

        //Second Task

        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("Distinction");
                break;
            case 'B':
            case 'C':
                System.out.println("First class");
                break;
            case 'D':
                System.out.println("You have passed");
                break;
            case 'F':
                System.out.println("Fail. Try again");
                break;
            default:
                System.out.println("Invalid grade");

        }


    }

}
