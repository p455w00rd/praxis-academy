package transaksi;

//Inheritance digunakan ketika parent memiliki atribut dan metode dan lalu semuanya diturunkan pada child.
//Contoh : class Transaksi extends Costumer (Transaksi merupakan kelas child, Costumer merupakan kelas parent).
//contoh inheritance
public class Transaksi extends transaksi.Costumer implements transaksi.Buku {

    private int kodeBuku;
    private String namaBuku;
    private float harga;

    private int kodeTransaksi;
    private int banyak;

    //konstruktor
    public Transaksi() {
    }

    //dari kelas parent
    public Transaksi(int noId, String nama, String alamat) {
        super(noId, nama, alamat);
    }

    public void setTransaksi(int kodeTransaksi, int banyak) {
        this.kodeTransaksi = kodeTransaksi;
        this.banyak = banyak;
    }

    //total transaksi = banyaknya barang * harga barang
    public float totalTransaksi() {
        return (banyak * harga);
    }

    //override class interface
    public void setBuku(int kodeBuku, String namaBuku, float harga) {
        this.kodeBuku = kodeBuku;
        this.namaBuku = namaBuku;
        this.harga = harga;
    }

    //output
    public void cetakStruk() {
        System.out.println("\n");
        System.out.println("=============================================================");
        System.out.println("                        Nota Pembelian Buku                  ");
        System.out.println("=============================================================");
        System.out.println("ID Pembeli                  : " + super.getNoId());
        System.out.println("Nama Pembeli                : " + super.getNama());
        System.out.println("Alamat                      : " + super.getAlamat());

        System.out.println("Kode Barang                 : " + kodeBuku);
        System.out.println("Nama Barang                 : " + namaBuku);
        System.out.println("Harga                       : " + harga);

        System.out.println("Kode transaksi              : " + kodeTransaksi);
        System.out.println("Banyak                      : " + banyak);

        System.out.println("Total Transaksi             : " +"Rp. "+totalTransaksi());

        System.out.println("=============================================================");
        System.out.println("                          Terima kasih                       ");
        System.out.println("=============================================================");
    }

}

