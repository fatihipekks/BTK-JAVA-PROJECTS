public class Main {

    public static void main(String[] args) {
	int[] numbers = new int[] {1,2,5,7,9,0};
    int find = 5;
    boolean have = false;

    for(int sayilar : numbers) {
        if(sayilar==find) {
            have = true;
            break;
        }
    }
if(have){
    System.out.println("Sayı Mevcuttur.");
}else{
    System.out.println("Sayı Mevcut Değildir.");
}
    }
}
