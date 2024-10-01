import java.util.Scanner;

public class KategoriPebisnis {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input12.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input12.nextInt();

        if (kategori.equals("pebisnis")) {
            if (penghasilan <= 25000000) {
                pajak = 0.15;
            } else if (penghasilan <= 35000000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else {
            System.out.println("Masukan Kategori Salah");
        }
    }
}