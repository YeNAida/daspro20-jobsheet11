public class PengunjungCafe20 {
//     String nama;
//     int usia;

// }

// public static void daftarOrang(Person... orang) {
//     for (Person p : orang) {
//         System.out.println("Nama: " + p.nama + ", Usia: " + p.usia);
//     }
// }

    public static void daftarPengunjung(String... namaPengunjung) {
            System.out.println("Daftar Nama Pengunjung:");
            for (String nama : namaPengunjung) {
                System.out.println("- " + nama);
            }
        }
        public static void main(String[] args) {
            daftarPengunjung("Ali","Budi", "Citra");
    }
}
