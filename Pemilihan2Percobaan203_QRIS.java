import java.util.Scanner;

public class Pemilihan2Percobaan203_QRIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan_menu;
        String member, pembayaran;
        double diskon = 0, total_bayar, harga = 0;

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
        System.out.print("Jenis pembayaran (cash/QRIS) ? = ");
        pembayaran = input.nextLine();
        System.out.println("--------------------------------------");

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

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1 * harga; // 10% discount for members
        }

        if (pembayaran.equalsIgnoreCase("QRIS")) {
            diskon += 1000; // Additional discount for QRIS payment
        }

        total_bayar = harga - diskon;
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        System.out.println("-----------------------------------------");
    }
}