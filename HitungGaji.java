import java.util.Scanner;

public class HitungGaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int golongan, jamLembur;
        double gajiPokok = 0, persenLembur = 0, gajiLembur, totalGaji;

        // Input
        System.out.println("=== PROGRAM HITUNG GAJI KARYAWAN ===");
        System.out.println("1. Golongan A (Rp 5.000.000)");
        System.out.println("2. Golongan B (Rp 6.500.000)");
        System.out.println("3. Golongan C (Rp 9.500.000)");
        
        System.out.print("Masukkan Golongan (1/2/3): ");
        golongan = input.nextInt();
        
        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();

        // Menentukan Gaji Pokok
        if (golongan == 1) {
            gajiPokok = 5000000;
        } else if (golongan == 2) {
            gajiPokok = 6500000;
        } else if (golongan == 3) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        // Menentukan Persentase Gaji Lembur
        if (jamLembur == 1) persenLembur = 0.30;
        else if (jamLembur == 2) persenLembur = 0.32;
        else if (jamLembur == 3) persenLembur = 0.34;
        else if (jamLembur == 4) persenLembur = 0.36;
        else if (jamLembur >= 5) persenLembur = 0.38;
        else persenLembur = 0;

        // Perhitungan
        gajiLembur = gajiPokok * persenLembur;
        totalGaji = gajiPokok + gajiLembur;

        // Output
        System.out.println("\n=================================");
        System.out.println("           HASIL PERHITUNGAN           ");
        System.out.println("=================================");
        System.out.printf("Gaji Pokok         : Rp %, .0f%n", gajiPokok);
        System.out.printf("Jam Lembur         : %d Jam%n", jamLembur);
        System.out.printf("Persentase Lembur  : %.0f%%%n", persenLembur * 100);
        System.out.printf("Gaji Lembur        : Rp %, .0f%n", gajiLembur);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL PENGHASILAN  : Rp %, .0f%n", totalGaji);
        System.out.println("=================================");

        input.close();
    }
}