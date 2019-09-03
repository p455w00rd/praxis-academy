package transaksi;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //var temporary
        int tempNoId = 0;
        String tempNama = "";
        String tempAlamat = "";
        int tempKodeBuku = 0;
        int tempHarga = 0;
        String tempNamaBuku = "";
        int tempKodeTransaksi = 0;
        int tempBanyak = 0;

        //Proses menerima masukan
        System.out.println("======================================================");
        System.out.println("             Input data penjualan Buku                ");
        System.out.println("======================================================");
        System.out.print("Id Pembeli : ");
        tempNoId = sc.nextInt();

        tempNama = sc.nextLine();
        System.out.print("Nama Pembeli : ");
        tempNama = sc.nextLine();

        System.out.print("Alamat Pembeli : ");
        tempAlamat = sc.nextLine();

        System.out.print("\nKode Buku : ");
        tempKodeBuku = sc.nextInt();

        tempNamaBuku = sc.nextLine();
        System.out.print("Nama Buku : ");
        tempNamaBuku = sc.nextLine();

        System.out.print("Harga Buku : ");
        tempHarga = sc.nextInt();

        System.out.print("\nKode Transaksi : ");
        tempKodeTransaksi = sc.nextInt();

        System.out.print("Banyak Buku : ");
        tempBanyak = sc.nextInt();

        //eksekusi
        transaksi.Transaksi t = new transaksi.Transaksi(tempNoId, tempNama, tempAlamat);
        t.setBuku(tempKodeBuku, tempNamaBuku, tempHarga);
        t.setTransaksi(tempKodeTransaksi, tempBanyak);

        //output hasil masukan dan mengeluarkan total belanja
        t.cetakStruk();
    }

}
