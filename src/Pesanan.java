
/**
 * Pesanan digunakan untuk pengisian dan pengambilan data biaya, nama, statusdiproses, statusselesai.
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
public class Pesanan
{
    // instance variables pada class Pesanan
    private int id;
    private double biaya;
    private double jumlahHari;
    //private String nama_pelanggan;
    //private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Customer pelanggan;
    private Room kamar;
    //private TipeKamar tipe_kamar;
    private Date tanggalPesan;
    private boolean isAktif;
    /**
     * Constructor dari kelas Pesanan
     */
    
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        //this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        //this.kamar=kamar;
        //Date dob = new Date(tahun,bulan,hari);
        isAktif=true;
        tanggalPesan = new Date();
    }
    
    //public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    //{
     //   this.jumlahHari=jumlahHari;
      //  this.pelanggan=pelanggan;
       // this.kamar=kamar;
        
    //}
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari=jumlahHari;
        
    }
    
    /**
     * method untuk melakukan input nama
     * @return nama
     */
    //public String setNama(String nama)//set nama
    //{
        //this.nama_pelanggan = nama; //memindahkan data ke nama_pelanggan
        //return nama_pelanggan;
    //}
    
    /**
     * method untuk mendapatkan nama_pelanggan
     * @return nama_pelanggan - mengembalikkan nilai ke nama_pelanggan
     */    
    //public String getNama()//mendapatkan data nama
    //{
     //   return nama;
    
    //}
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan=pelanggan;
        
    }
    
    /**
     * method untuk mendapatkan nilai biaya
     * @retun biaya - mengembalikan nilai ke biaya
     */
    public double getBiaya()//mendapatkan data biaya
    {
        return biaya;

    }
    public int getID()
    {
        return id;
    }
    
    /**
     * method untuk mendapatkan data statusdiproses 
     * @return StatusDiproses - mengembalikan nilai StatusDiproses
     */
    public boolean getStatusDiproses(boolean StatusDiproses)//mendapatkan data statusdiproses
    {
        return StatusDiproses;
        
    }
    
    /**
     * method untuk mendapatkan data StatusSelesai
     * @return StatusSelesai - mengembalikan nilai StatusSelesai
     */
    public boolean getStatusSelesai(boolean StatusSelesai)
    {
        return StatusSelesai;
        
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    /**
     * method untuk menginput data biaya
     * @param - harga pesanan
     */
    public void setBiaya()
    {
        this.biaya=biaya;
        
    }
    public void setID()
    {
        this.id=id;
    }

    ///**
    // * method untuk menginput data pelanggan baru 
    // * @param pelanggan - pemesan pesanan 
    // */
    //public void setPelanggan(Customer pelanggan)
    //{
     //   this.pelanggan = pelanggan;
    //}

    /**
     * method untuk menginput StatusDiproses
     * @param - sesuatu yang diproses pada pesanan
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    /**
     * method untuk menginput StatusSelesai
     * @param  - sesuatu yang telah selesai pada pesanan
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }

    public void setStatusAktif(boolean aktif)
    {
        aktif=isAktif;
        isAktif=true;
    }
    /**
     * method untuk melakukan pencetakkan data
     */
    public void printData()
    {
        System.out.println("Nama : " + pelanggan.getNama());
        System.out.println("Jumlah Hari : " + jumlahHari);
        System.out.println("Besar Biaya : " + biaya);
        System.out.println("Status Diproses: " + isDiproses);
        System.out.println("Status Selesai: " + isSelesai);
    }
     
    public String toString()
    {
        String final_status = "KOSONG";
        return final_status;
        //return pelanggan.getNama()+ ""+jumlahHari+ ""+isDiproses+ ""+isSelesai;
    }

    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }

    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    public void setRoom(Room kamar)
    {
        
    }

    public boolean getStatusAktif(){
        return isAktif;
    }
}
