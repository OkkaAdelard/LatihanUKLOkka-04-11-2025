import java.util.Scanner;
public class No2Mudah {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int angka;
    System.out.println("masukkan angka");
    angka = input.nextInt();
    if (angka % 2 == 0) {
        System.out.println("angka " + angka + " adalah bilangan genap");
    } else {
        System.out.println("angka " + angka + " adalah bilangan ganjil");
    }
}
}