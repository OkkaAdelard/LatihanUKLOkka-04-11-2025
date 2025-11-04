import java.util.Scanner;
public class No2Sedang {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Masukkan jari-jari dan tinggi tabung untuk dihitung volumenya:");
        int jarijari = input.nextInt(); 
        int diameter = jarijari * 2;
        double phi = 3.14;
        System.out.println("Lalu masukkan tinggi tabung: ");
        int tinggi = input.nextInt();
        System.out.println();

        double volume = phi * jarijari * jarijari * tinggi;
        System.out.println("Volume tabung dengan jari-jari " + jarijari + " cm (diameter " + diameter + " cm) dan tinggi " + tinggi + " cm adalah " + volume + " cm³");
    }
}
