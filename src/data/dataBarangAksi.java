package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dataBarangAksi {
    String namaToko;
    String alamatToko;
    String telpon;

public dataBarangAksi(String namaToko, String alamatToko, String telpon) {
    this.namaToko = namaToko;
    this.alamatToko = alamatToko;
    this.telpon = telpon;
    System.out.println("Selamat Datang Di Toko" + namaToko);
}

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public dataBarangAksi() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Barang barang = new Barang();
        barang.namaBarang = "Modem Smartfren";
        barang.kategori = "Modem";
        barang.kodeBarang = 001;
        barang.idBarang = 00112233;
        barang.jumlahBarang = 15;
        barang.namaPenerimaBarang = "Wangi Linda Lestari";
        barang.alamatPenerima = "Banjarbaru";
        barang.namaAgen = "Agen Smartfreen";
        barang.tanggalMasuk = simpleDateFormat.parse("19-05-2020");

        System.out.println("Nama Barang         : " + barang.namaBarang);
        System.out.println("Kategori            : " + barang.kategori);
        System.out.println("Kode Barang         : " + barang.kategori);
        System.out.println("Id Barang           : " + barang.idBarang);
        System.out.println("Jumlah Barang       : " + barang.jumlahBarang);
        System.out.println("Nama Penerima Barang: " + barang.namaPenerimaBarang);
        System.out.println("Alamat Penerima     : " + barang.alamatPenerima);
        System.out.println("Nama Agen           : " + barang.namaAgen);
        System.out.println("Tanggal Masuk Barang: " + simpleDateFormat.format(barang.tanggalMasuk));

        System.out.println("=============================================================================");

        Barang barang2 = new Barang();
        barang2.namaBarang = "Keyboard Asus X441B";
        barang2.kategori = "Keyboard";
        barang2.kodeBarang = 002;
        barang2.idBarang = 012345;
        barang2.jumlahBarang = 7;
        barang2.namaPenerimaBarang = "Nur Aulia Afridha";
        barang2.alamatPenerima = "Banjarbaru";
        barang2.namaAgen = "Agen Asus";
        barang2.tanggalMasuk = simpleDateFormat.parse("02-06-2020");

        System.out.println("Nama Barang         : " + barang2.namaBarang);
        System.out.println("Kategori            : " + barang2.kategori);
        System.out.println("Kode Barang         : " + barang2.kategori);
        System.out.println("Id Barang           : " + barang2.idBarang);
        System.out.println("Jumlah Barang       : " + barang2.jumlahBarang);
        System.out.println("Nama Penerima Barang: " + barang2.namaPenerimaBarang);
        System.out.println("Alamat Penerima     : " + barang2.alamatPenerima);
        System.out.println("Nama Agen           : " + barang2.namaAgen);
        System.out.println("Tanggal Masuk Barang: " + simpleDateFormat.format(barang2.tanggalMasuk));

        System.out.println("=============================================================================");

        Barang barang3 = new Barang();
        barang3.namaBarang = "Speaker Logitec";
        barang3.kategori = "Speaker";
        barang3.kodeBarang = 003;
        barang3.idBarang = 023456;
        barang3.jumlahBarang = 10;
        barang3.namaPenerimaBarang = "Irene Putri";
        barang3.alamatPenerima = "Banjarbaru";
        barang3.namaAgen = "Agen Logitec";
        barang3.tanggalMasuk = simpleDateFormat.parse("10-06-2020");

        System.out.println("Nama Barang         : " + barang3.namaBarang);
        System.out.println("Kategori            : " + barang3.kategori);
        System.out.println("Kode Barang         : " + barang3.kategori);
        System.out.println("Id Barang           : " + barang3.idBarang);
        System.out.println("Jumlah Barang       : " + barang3.jumlahBarang);
        System.out.println("Nama Penerima Barang: " + barang3.namaPenerimaBarang);
        System.out.println("Alamat Penerima     : " + barang3.alamatPenerima);
        System.out.println("Nama Agen           : " + barang3.namaAgen);
        System.out.println("Tanggal Masuk Barang: " + simpleDateFormat.format(barang3.tanggalMasuk));

    }
}
