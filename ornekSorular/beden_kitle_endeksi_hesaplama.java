package ornekSorular;

import java.util.Scanner;

public class beden_kitle_endeksi_hesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Boy: (Metre cinsinden) örn: 1,70>>>");
        float boy = sc.nextFloat();

        System.out.print("Kilo: >>>>");
        float kilo = sc.nextFloat();

        float kitleE = kilo/(boy*boy);

        System.out.println("Vücut kitle endeksiniz : "+kitleE);

        if(kitleE < 18.5){
            System.out.println("Durum : Zayıf..........");
        }
        else if(kitleE >= 18.5 && kitleE<= 24.9 ){
            System.out.println("Durum : Normal..........");
        }
        else if (kitleE>24.9 && kitleE <= 29.9){
            System.out.println("Durum : Kilolu..........");
        }

    }
}
