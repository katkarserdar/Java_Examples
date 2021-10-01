package ornekSorular;

import java.util.Scanner;

public class tek_mi_cift_mi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(count<3){

            System.out.print("Bir sayı giriniz: ");//println \n görevi görür.
            int sayi = scanner.nextInt();

            if(sayi % 2 == 0){
                System.out.println("Sayı çifttir.");
            }
            else{
                System.out.println("Sayı tektir.");
            }

            count++;
        }
    }

}
