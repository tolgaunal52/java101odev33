import java.util.Scanner;

public class odev33 {
    static boolean isPal(int number) {

        int temp = number, newnumber = 0, lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            newnumber = (newnumber * 10) + lastnumber;
            temp /= 10;

        }
        if (number == newnumber) {
            System.out.println(number + "  Palindrom bir sayidir");
            return true;
        } else {
            System.out.println(number + "  Palindrom sayi degildir");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Bir sayi girin :");

        int a = scr.nextInt();

        isPal(a);


    }
}
