package ornekSorular;

import java.util.Random;
import java.util.Scanner;

public class sayi_Tahmin_oyunu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int rndsayi = rnd.nextInt(10);//sayı 0-10 arasında random olacaktır.
        int count = 0;
        int count2 = 2;

        while(count<3){

            System.out.print("Bir sayi giriniz:");
            int sayi = sc.nextInt();

            if(sayi<rndsayi){
                System.out.println("Girdiğin sayı küçük");
            }
            else if (sayi>rndsayi){
                System.out.println("Girdiğin sayı büyük");
            }
            else{
                System.out.println("Buldunuz tebrikler..........");
                break;
            }
            if(count2 != 0)
                System.out.println(count2 + " hakkınız kaldı.");
            else
                System.out.println("Hakkınız kalmadı");
            count2--;
            count++;
        }





    }
}
