import java.util.Scanner;
import java.util.logging.Handler;
public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan_menu;
        String member;
        double diskon = 0, total_bayar, harga = 0;

        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Member");
        System.out.println("2. Hapus Member");
        System.out.print("Masukkan pilihan menu: ");
        pilihan_menu = input.nextInt();

        System.out.print("Masukkan nama member: ");
        String namaMember = input.nextLine();

        System.out.println("Pilihan menu yang dipilih: " + pilihan_menu);
        System.out.println("Nama member yang dimasukkan: " + namaMember);

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextInt();
        input.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.println("--------------------------------------");

        

        if (member.equalsIgnoreCase("y")) { 
            diskon= 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
            System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
            return; 
            }
            total_bayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon + " + total_bayar);
        }
    }
}