
/**
 * Write a description of class Pesanan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Customer pelanggan;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan()
    {
        // initialise instance variables
        
    }
    
    public double getBiaya()
    {
        return biaya;

    }
    
    public boolean getStatusDiproses(boolean StatusDiproses)
    {
        return StatusDiproses;
        
    }
    
    public boolean getStatusSelesai(boolean StatusSelesai)
    {
        return StatusSelesai;
        
    }
    
    public void setBiaya(double Biaya)
    {
        biaya = Biaya;
        
    }

    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }

    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
}
