/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikurir;

/**
 *
 * @author zakyd
 */
public class LogikaKurir {

    String nama, alamat, jenis_layanan;
    double harga_layanan, berat_paket, harga_berat_paket, jarak, total_bayar = 0,
            total_bayar_berat = 0, harga_pelindung, total_harga_pelindung = 0;

    public String getNama() {
        return nama;
    }

    public void setNama(String val) {
        String nama = val;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String val) {
        String alamat = val;
    }

    public void setJenis_layanan(String val) {
        String jenis_layanan = val;

        if (jenis_layanan.equalsIgnoreCase("SAME DAY")) {
            harga_layanan = 10_000;

        } else if (jenis_layanan.equalsIgnoreCase("INSTANT")) {
            harga_layanan = 20_000;
        } else if (jenis_layanan.equalsIgnoreCase("KARGO")) {
            harga_layanan = 5_000;
        } else {
            harga_layanan = 0;
        }
    }

    public double getHarga_Layanan() {
        return harga_layanan;

    }

    public void setBerat_Paket(double val) {
        berat_paket = val;
    }

    public void setHarga_Berat_Paket() {
        if (berat_paket <= 5) {
            harga_berat_paket = 0;
        } else if (berat_paket >= 5) {
            harga_berat_paket = (berat_paket - 5) * 1000;
        }
    }

    public void setHitung_Harga_Berat() {
        total_bayar_berat = total_bayar + harga_berat_paket;
    }

    public double getTotal_bayar_Berat() {
        return total_bayar_berat;
    }

    public void setJarak(double val) {
        jarak = val;
    }

    public void setHarga_Jarak() {
        total_bayar = jarak * harga_layanan;
    }

    public double getTotal_bayar() {
        return total_bayar;
    }

    public void setHarga_Pelindung_Tambahan(double val) {
        harga_pelindung = val;
    }

    public void setTotal_Harga_pelindung_Tambahan(double val) {
        total_harga_pelindung = val;
  
    }

    public double getTotal_pelindung() {
        return total_harga_pelindung;
    }
    
    public void setTotal_Bayar_Semua (){
        total_bayar += total_harga_pelindung + harga_berat_paket;
    }
    
    
}
