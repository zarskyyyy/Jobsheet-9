import java.util.Scanner;

public class ArrayNilai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {

            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        input.close();
    }
}