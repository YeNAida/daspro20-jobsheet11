import java.util.Scanner;

public class HitungTotalHarga20 {

    public static int HitungTotalHarga(int pilihanMenu, int banyakItem, String KodePromo) {
        
        
        
        int [] HargaItems = {15000,20000,22000,12000,10000,18000};

        int HargaTotal = HargaItems[pilihanMenu-1]*banyakItem;

        if (KodePromo.equals("DISKON50")) {
            System.out.println("Anda Mendapatkan Diskon 50%");
        } else if (KodePromo.equals("DISKON30")) {
            System.out.println("Anda Mendapatkan Diskon 30%");
        } else {
            System.out.println("Kode tidak valid");
        }
        return HargaTotal;
    }

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        while (true) {
            System.out.println("Selamat Datang Di Cafe kami");
            System.out.println("Pilih yang ingin anda lakukan:");
            System.out.println("1. Menu");
            System.out.println("2. selesai");
            System.out.println("Ketik Opsi(1/2):");
            String Pilihan = input.next();
            
            switch (Pilihan) {
                case "1" :
                System.out.println("===== MENU RESTO KAFE =====");
                System.out.println("1. Kopi Hitam\t - Rp 15,000");
                System.out.println("2. Cappucinno\t - Rp 20,000");
                System.out.println("3. latte\t - Rp 22,000");
                System.out.println("4. Teh Tarik\t - Rp 12,000");
                System.out.println("5. Roti Bakar\t - 10,000");
                System.out.println("Mie Goreng\t - Rp 18,000");
                System.out.println("============================");
                System.out.println("Silhakan pilih menu yang anda inginkan.");
                System.out.print("\n Masukkan nomor menu yang ingin anda pesan: ");
                    int pilihanMenu = input.nextInt();
                System.out.print("\n Masukkan jumlah item yang ingin di pesan: ");
                    int banyakItem = input.nextInt(); 
                System.out.print("\nMasukkan Kode Promo: ");
                    String KodePromo = input.next();
                int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem, KodePromo);
                System.out.println("Total harga untuk pesanan Anda : Rp"+ totalHarga);
                    break;
                case "2" :
                System.out.println("Terima kasih!");
                    lanjut = false;
                default:
                    break;
            }
        break;
        } 
    } 
    
}
