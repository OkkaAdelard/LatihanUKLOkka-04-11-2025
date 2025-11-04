import java.util.Scanner;

public class No1Susah {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah siswa: ");
    int jumlahsiswa = input.nextInt();
    boolean kondisi = true;
    int counter = 0;
    int nilai =0;
    int totalnilai =0;

    while (kondisi) {
        System.out.println("Masukkan nilai siswa ke-" + (counter + 1) + ": ");
        nilai = input.nextInt();
        counter++;

        if (counter == jumlahsiswa) {
            kondisi = false;
        }
    totalnilai += nilai;
    }
    System.out.println("Nilai rata-rata : " + (totalnilai / counter));
    System.out.println("Anda telah memasukkan nilai untuk " + counter + " siswa.");

 }   
}
