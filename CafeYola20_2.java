import java.util.Scanner;

public class CafeYola20_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah menu dan hari dari pengguna
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();

        // Array untuk menyimpan data penjualan
        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        // Panggil fungsi-fungsi lainnya
        inputData(penjualan, scanner);
        tampilkanData(penjualan);
        tampilkanMenuTertinggi(penjualan);
        hitungRataRata(penjualan);
    }

    // Fungsi untuk menginputkan data penjualan
    public static void inputData(int[][] penjualan, Scanner scanner) {
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu ke-" + (i+1));
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data
    public static void tampilkanData(int[][] penjualan) {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void tampilkanMenuTertinggi(int[][] penjualan) {
        int[] totalPenjualan = new int[penjualan.length];
        int indexMenuTertinggi = 0;
        int maxPenjualan = 0;

        // Hitung total penjualan untuk setiap menu
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan[i] += penjualan[i][j];
            }
            // Cari menu dengan penjualan tertinggi
            if (totalPenjualan[i] > maxPenjualan) {
                maxPenjualan = totalPenjualan[i];
                indexMenuTertinggi = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah menu ke-" + (indexMenuTertinggi+1) +
                " dengan total penjualan " + maxPenjualan);
    }

    // Fungsi untuk menghitung dan menampilkan rata-rata penjualan per menu
    public static void hitungRataRata(int[][] penjualan) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println("Menu ke-" + (i+1) + ": " + rataRata);
        }
    }
}