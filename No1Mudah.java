
import java.util.Scanner;

public class No1Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        int jarak;
        int panjang;
        int tinggi;
        int lebar;
        int volume;
        System.out.println("masukkan berat paket anda (kg)");
        berat = input.nextInt();
        System.out.println("masukkan jarak paket anda (km)");
        jarak = input.nextInt();
        int harga = 0;
        if (jarak <= 10) {
            harga = berat*4250;
        } else if (jarak > 10) {
            harga = berat*6000;
        } else {
            System.out.println("error");
            harga = 0;
        }
        System.out.println("masukkan panjang paket anda (cm)");
        panjang = input.nextInt();
        System.out.println("masukkan tinggi paket anda (cm)");
        tinggi = input.nextInt();
        System.out.println("masukkan lebar paket anda (cm)");
        lebar = input.nextInt();
        volume = panjang*tinggi*lebar;
        int hargaTotal = 0;
        if (volume >100) {
            hargaTotal = harga + 50000;
        } else {
            hargaTotal = harga;
        }
        System.out.println("harga total paket anda adalah " + hargaTotal);
        }
    }
