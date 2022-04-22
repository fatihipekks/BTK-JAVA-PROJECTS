import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {

        String letter = "a";
        boolean harf = false;

        String[] kalinHarfler = {"a", "ı", "o", "u"};
        String[] inceHarfler = {"e", "i", "ö", "ü"};

        for (String kalin : kalinHarfler) {
            if (letter.equals(kalin)) {
                System.out.println(letter + " = " + "Kalın Harftir");
                harf = true;
            }
        }
        for (String ince : inceHarfler) {
            if (letter.equals(ince)) {
                System.out.println(letter + " = İnce Harftir");
                harf = true;
            }
        }
        if (harf == false) {
            System.out.println("Geçersiz Karakter Girdiniz..");
        }
    }
}*/
//KULLANICI GİRDİLİ KALIN MI İNCE Mİ
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Harf Giriniz: ");
        Scanner kalinMiİnceMi = new Scanner(System.in);
        String letter = kalinMiİnceMi.nextLine();

        boolean harf = false;

        String[] kalinHarfler = {"a", "ı", "o", "u"};
        String[] inceHarfler = {"e", "i", "ö", "ü"};

        for (String kalin : kalinHarfler) {
            if (letter.equals(kalin)) {
                System.out.println(letter + " = " + "Kalın Harftir");
                harf = true;
            }
        }
        for (String ince : inceHarfler) {
            if (letter.equals(ince)) {
                System.out.println(letter + " = Ince Harftir");
                harf = true;
            }
        }
        if (harf == false) {
            System.out.println("Geçersiz Karakter Girdiniz..");
        }
    }
}*/
//SWİTCH CASE YAPISI İLE
public class Main {
    public static void main(String[] args) {
        System.out.printf("Harf Giriniz: ");
        Scanner kalinMiİnceMi = new Scanner(System.in);
        String letter = kalinMiİnceMi.nextLine();
        switch (letter) {
            case "a":
            case "ı":
            case "o":
            case "u":
                System.out.println(letter + " = " + "Kalın Harfdir.");
                break;
            case "e":
            case "i":
            case "ö":
            case "ü":
                System.out.println(letter + " = " + "İnce Harfdir.");
                break;
            default:
                System.out.println("Yanlış Karakter Girdiniz.");
        }
    }
}