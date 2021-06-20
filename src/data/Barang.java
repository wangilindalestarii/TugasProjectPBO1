package data;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Barang {

    public void sapa()
    {
        System.out.println("Anda Sedang Berada di server Penyimpanan Data Barang");
    }

    void welcome(String namaPenerimaBarang)
    {
        JOptionPane.showMessageDialog(null,"Hai "+namaPenerimaBarang,"Selamat Datang",JOptionPane.WARNING_MESSAGE);
    }

    int kodeBarang, idBarang, jumlahBarang;
    String namaToko;
    String namaBarang, kategori;
    String namaPenerimaBarang, namaAgen, alamatPenerima;
    Date tanggalMasuk;

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNamaPenerimaBarang() {
        return namaPenerimaBarang;
    }

    public void setNamaPenerimaBarang(String namaPenerimaBarang) {
        this.namaPenerimaBarang = namaPenerimaBarang;
    }

    public String getNamaAgen() {
        return namaAgen;
    }

    public void setNamaAgen(String namaAgen) {
        this.namaAgen = namaAgen;
    }

    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    public void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("Nama Barang         : " + this.namaBarang);
        System.out.println("Kategori            : " + this.kategori);
        System.out.println("Kode Barang         : " + this.kategori);
        System.out.println("Id Barang           : " + this.idBarang);
        System.out.println("Jumlah Barang       : " + this.jumlahBarang);
        System.out.println("Nama Penerima Barang: " + this.namaPenerimaBarang);
        System.out.println("Alamat Penerima     : " + this.alamatPenerima);
        System.out.println("Nama Agen           : " + this.namaAgen);
        System.out.println("Tanggal Masuk Barang: " + simpleDateFormat.format(this.tanggalMasuk));

        System.out.println("=============================================================================");


    }
}

