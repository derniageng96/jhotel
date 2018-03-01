
/**
 * class Hotel untuk menampilkan dan menginput data hotel .
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     * @param lokasi, bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi =lokasi;
        this.bintang = bintang;
        
    }

    /**
     * method untuk mendapatkan data bintang dari suatu hotel 
     * @return bintang - jumlah bintang
     */
    public int getBintang()
    {
        return bintang;
        
    }
    
    /**
     * method untuk mendapatkan data nama
     * @return nama - nama hotel 
     */
    public String getNama()
    {
        return nama;
    
    }
    
    /**
     * method untuk mendapatkan data lokasi 
     * @return lokasi - lokasi dari suatu hotel 
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * method untuk memasukkan data nama 
     * @param nama - nama hotel 
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * method untuk memasukkan data lokasi suatu hotel 
     * @param lokasi - lokasi hotel 
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * method untuk memasukkan data bintang dari suatu hotel
     * @param bintang - jumlah bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    /**
     * method untuk mencetak suatu data
     */
    public void printData()
    {
        
    }
}



