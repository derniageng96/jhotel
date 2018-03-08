
/**
 * Pesanan digunakan untuk pengisian dan pengambilan data biaya, nama, statusdiproses, statusselesai.
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
public class Pesanan
{
    // instance variables pada class Pesanan
    private double biaya; 
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Customer pelanggan;
    private Room kamar;
    
    /**
     * Constructor dari kelas Pesanan
     */
    public Pesanan(int biaya, Customer pelanggan)
    {
        this.biaya = biaya; //biaya
        this.pelanggan = pelanggan; //pelanggan, diambil dari class Customer
        
    }
    
    /**
     * method untuk melakukan input nama
     * @return nama
     */
    public String setNama(String nama)//set nama 
    {
        this.nama_pelanggan = nama; //memindahkan data ke nama_pelanggan
        return nama_pelanggan;
    }
    
    /**
     * method untuk mendapatkan nama_pelanggan
     * @return nama_pelanggan - mengembalikkan nilai ke nama_pelanggan
     */    
    public String getNama()//mendapatkan data nama 
    {
        return nama_pelanggan; 
    
    }
    
    /**
     * method untuk mendapatkan nilai biaya
     * @retun biaya - mengembalikan nilai ke biaya
     */
    public double getBiaya()//mendapatkan data biaya
    {
        return biaya;

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
    
    /**
     * method untuk menginput data biaya
     * @param biaya - harga pesanan
     */
    public void setBiaya(double Biaya)
    {
        biaya = Biaya;
        
    }

    /**
     * method untuk menginput data pelanggan baru 
     * @param pelanggan - pemesan pesanan 
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }

    /**
     * method untuk menginput StatusDiproses
     * @param isDiproses - sesuatu yang diproses pada pesanan
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    /**
     * method untuk menginput StatusSelesai
     * @param isSelesai - sesuatu yang telah selesai pada pesanan
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    
    /**
     * method untuk melakukan pencetakkan data
     */
    public void printData()
    {
        System.out.println(pelanggan);
        System.out.println(biaya);
    
    }
    
    public void setRoom(Room kamar)
    {
        
    }
}
