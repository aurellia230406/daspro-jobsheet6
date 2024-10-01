import java.util.Scanner;

public class Pemilihan2Percobaan103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        System.out.println("Tahun yang dimasukkan adalah: " + tahun);
        input.close();

        if (tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println("Bukan Tahun Kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}