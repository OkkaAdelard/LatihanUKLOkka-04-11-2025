import java.util.Scanner;
public class No2Susah {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah baris matrix (Horizontal): ");
    int baris = input.nextInt();
    System.out.println("Masukkan jumlah kolom matrix (Vertikal): ");
    int kolom = input.nextInt();

    int[][] matrix1 = new int [baris][kolom];
    int[][] matrix2 = new int [baris][kolom];
    int[][] hasil = new int [baris][kolom];

    System.out.println("Masukkan elemen matrix pertama: ");
    for (int i=0 ; i<baris; i++){
        for (int j=0; j<kolom; j++){
            System.out.println("Elemen ke [" + i + "][" + j + "]: ");
            matrix1[i][j] = input.nextInt();
        }
    }
        System.out.println("Masukkan elemen matrix kedua: ");
    for (int i=0 ; i<baris; i++){
        for (int j=0; j<kolom; j++){
            System.out.println("Elemen ke [" + i + "][" + j + "]: ");
            matrix1[i][j] = input.nextInt();
        }
    }
    for (int i=0; i<baris; i++){
        for (int j=0; j<kolom;j++){
            hasil[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
                System.out.println();}
    }
    
}
