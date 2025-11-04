import java.util.Scanner;
public class No1Sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan angka yang ingin di faktorialkan: ");
        int angka = input.nextInt();
        for (int i =1; i <= angka; i++) ;
        int faktorial = angka;
        for (int i = angka -1; i >=1; i--) {
            faktorial = faktorial * i;
            }
            System.out.println("Hasil dari " +angka+ " faktorial adalah " + faktorial);
        }       
    }
    
