import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 1;

        System.out.println("give me any number between 1 - 100 pls");
        number = s.nextInt();
        boolean checked_number = checking_number(number);

        while (checked_number) {
            roman_numbers_maker(number);
            roman_numbers_maker_units(number);
            if(number != 100)
                roman_numbers_maker_tens(number);
            System.out.println("give me any number between 1 - 100 pls");
            number = s.nextInt();
            checked_number = checking_number(number);
        }
        System.out.println("you wrote a negative number, so the program ended");
    }
    public static boolean checking_number(int number){
        if(number > 0)
            return true;
        else
            return false;
    }
    public static void roman_numbers_maker(int number){
        if (number == 100) {
            System.out.printf("C");
            System.out.println("");
        }
        else {
            int num12 = 0, num22 = 0;
            int num1 = number % 10;
            int num32 = num1 / 5;
            int num2 = num1 % 5;
            for(int i = num2; i > 0; i--)
                System.out.printf("I");
            for(int i = num32; i > 0; i--)
                System.out.printf("V");
            if(number > 50) {
                num22 = number % 50;
                num22 = num22 / 10;
            }
            else {
                num22 = number / 10;
            }
            for(int i = num22; i > 0; i--)
                System.out.printf("X");
                number = number/50;
            for(int i = number; i > 0; i--)
                System.out.printf("L");
            System.out.println("");
        }
    }
    public static void roman_numbers_maker_units(int number){
        int num22 = 0;
        int num1 = number % 10;
        int num32 = num1 / 5;
        int num2 = num1 % 5;
        for(int i = num2; i > 0; i--)
            System.out.printf("I");
        for(int i = num32; i > 0; i--)
            System.out.printf("V");
        if(number > 50) {
            num22 = number % 50;
            num22 = num22 / 10;
        }
        System.out.println("");
    }
    public static void roman_numbers_maker_tens(int number){
        int num12 = 0, num22 = 0;
        if(number > 50) {
            num22 = number % 50;
            num22 = num22 / 10;
        }
        else {
            num22 = number / 10;
        }
        for(int i = num22; i > 0; i--)
            System.out.printf("X");
        number = number/50;
        for(int i = number; i > 0; i--)
            System.out.printf("L");
        System.out.println("");
    }
}
