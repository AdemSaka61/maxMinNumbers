import java.util.Scanner;

public class maxMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, i = 1;

        System.out.println("Kaç Adet Sayı Gireceksiniz :");
        n = input.nextInt();
        int number = 1, maxNumber = 0, minNumber = 0;
        for (i = 1; i <= n; i++) {

            System.out.print("Sayı Giriniz :");
            number = input.nextInt();

            if (i == 1) {
                maxNumber=number;
                minNumber=number;
            } else if (maxNumber<number){
                maxNumber=number;
            }else if (minNumber>number){
                minNumber=number;
            }


        }
        System.out.println("En Büyük Sayı :" + maxNumber);

        System.out.println("En Küçük Sayı :" + minNumber);


    }
}
