/*import  java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int sayi = 5;
        boolean asal = true;
        if (sayi <= 1) {
            System.out.println("Sayı Asal değil");
            return;
        }
        if (sayi == 2) {
            System.out.println("Sayı asaldır");
            return;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
            }
        }
        if (asal) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
        return;
    }}*/
//KULLANICI GİRDİRMELİ ASAL MI DEĞİL Mİ?

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Sayı Gir Güzel Kardeşim: ");
        Scanner asalmi = new Scanner(System.in);
        int sayi = asalmi.nextInt();
        boolean asal = true;

        if (sayi <= 1) {
            System.out.println("Sayı Asal Değildir");
        }
        if (sayi == 2) {
            System.out.println("Sayı Asaldır");
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;

            }
            if (asal) {
                System.out.println("Sayı Asaldır");

            } else {
                System.out.println("Sayı Asal Değildir");
            }
            return;
        }
    }
}
