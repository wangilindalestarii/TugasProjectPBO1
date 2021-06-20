package data;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class dataBarangMethod {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        Barang barang   = new Barang();
        barang.namaBarang = "Modem Smartfren";
        barang.kategori = "Modem";
        barang.kodeBarang = 001;
        barang.idBarang = 00112233;
        barang.jumlahBarang = 15;
        barang.namaPenerimaBarang = "Wangi Linda Lestari";
        barang.alamatPenerima = "Banjarbaru";
        barang.namaAgen = "Agen Smartfreen";
        barang.tanggalMasuk = formatTanggal.parse("19-05-2020");

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
        barang2.tanggalMasuk = formatTanggal.parse("02-06-2020");

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
        barang3.tanggalMasuk = formatTanggal.parse("10-06-2020");

        barang.tampilkanAtribut();
        barang2.tampilkanAtribut();
        barang3.tampilkanAtribut();
        barang2.welcome("YOUU!!");
    }
}
