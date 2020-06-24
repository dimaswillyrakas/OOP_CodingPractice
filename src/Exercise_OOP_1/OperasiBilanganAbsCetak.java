package Exercise_OOP_1;

import java.util.InputMismatchException;
import java.util.Scanner;

final class OperasiBilanganAbsCetak {
    private static void cetaksemua(OperasiBilanganAbs OB, double a, double b){
        OB.setA(a);
        OB.setB(b);
        OB.setC();
        OB.tampil();
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a = 0;
        double b = 0;
        int err = 0;
        
        try {
            System.out.println("Masukkan angka pertama : ");
            a = keyboard.nextInt();
            System.out.println("Masukkan angka kedua : ");
            b = keyboard.nextInt();
        } catch (InputMismatchException e) {
            err = 1;
            System.out.println("Terjadi error pada " + e);
        }finally {
            if (err == 0) {
                OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
                OperasiPengurangan kurang = new OperasiPengurangan();
                OperasiPerkalian kali = new OperasiPerkalian();
                OperasiPembagian bagi = new OperasiPembagian();
                cetaksemua(jumlah, a, b);
                cetaksemua(kurang, a, b);
                cetaksemua(kali, a, b);
                cetaksemua(bagi, a, b);
            } else {
                System.out.println("Mengakibatkan program tidak dapat berjalan");
            }
        }
    }
}
