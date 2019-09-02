package coba;

import java.util.Scanner;

public class coba {
    public static void main(String args[]) {
        String nama,belakang;

        Scanner input = new Scanner(System.in);

        System.out.print("massukkan nama Depan :");
        nama = input.nextLine();
        belakang = "Ardiansyah";
        System.out.println(nama+" "+belakang);

        for (int i=0; i < 3; i++)
        {
            System.out.println("Knock");
        }
        System.out.println("Penny!");
    }
}