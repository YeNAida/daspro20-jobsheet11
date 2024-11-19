import java.util.Scanner;

public class Kafe_2_20 {
    public static void Menu(String namaPelanggan,String KODEPROMO, boolean isMember) {
    Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang, "+namaPelanggan+"!");

        if (isMember) {
            System.out.println("Anda adalah Member, mendapatkan 10% untuk setiap pembelian!");
        }
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam\t - Rp 15,000");
        System.out.println("2. Cappucinno\t - Rp 20,000");
        System.out.println("3. latte\t - Rp 22,000");
        System.out.println("4. Teh Tarik\t - Rp 12,000");
        System.out.println("5. Roti Bakar\t - 10,000");
        System.out.println("Mie Goreng\t - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silhakan pilih menu yang anda inginkan.");
        
        System.out.println("Masukkan Kode Promo Anda: ");
        KODEPROMO = input.nextLine();
        if (KODEPROMO.equals("DISKON50")) {
            System.out.print("Anda Mendapatkan diskon 50%");
        } else if (KODEPROMO.equals("DISKON30")) {
            System.out.println("Anda Mendaptkan diskon 30%");
        } else {
            System.out.println("kode promo yang berlaku, tampilkan kode invalid");
        }
    }
    public static void main(String[] args) {
        Menu("Andi", null, true);
    }
    
}
