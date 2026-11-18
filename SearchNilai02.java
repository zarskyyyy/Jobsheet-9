import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] == key) {

                System.out.println("Nilai " + key
                        + " ditemukan pada indeks ke-" + i);

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
            System.out.println("Nilai " + key
                    + " tidak tersedia dalam array.");
            System.out.println("Silakan masukkan nilai yang terdapat dalam array.");
        }

        input.close();
    }
}