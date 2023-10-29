import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan daftar angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();


        int jumlahAngka = 0;
        double total = 0.0;


        String[] angkaString = input.split(" ");

        for (String angka : angkaString) {
            try {

                double angkaDouble = Double.parseDouble(angka);
                total += angkaDouble;
                jumlahAngka++;
            } catch (NumberFormatException e) {
                System.out.println("Angka tidak valid: " + angka);
            }
        }

        if (jumlahAngka == 0) {
            System.out.println("Tidak ada angka yang dimasukkan.");
        } else {
            double rataRata = total / jumlahAngka;
            System.out.println("Rata-rata angka adalah: " + rataRata);
        }

        scanner.close();
    }
}