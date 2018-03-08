
/**
 * class DatabasePesanan untuk menampilkan database pesanan.
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private String[] list_pesanan;
    
    
    /**
     * method untuk menambah pesanan baru 
     * @return false
     * 
     */
    public boolean addPesanan(Pesanan baru)
    {
        return false;
    }
    
    /**
     * method untuk menghapus data pesanan
     * @return false
     */
    public boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    /**
     * method untuk mendapatkan data pesanan
     * @param cust
     */
    public Pesanan getPesanan(Customer cust)
    {
        return null;
    }

    /**
     * method untuk mendapatkan data pesanan database 
     * @return list_pesanan - list dari pesanan
     */
    public String[] getPesananDatabase()
    {
        return list_pesanan;
    }
    
    /**
     * method untuk membatakan pesanan 
     * @param pesan - pesanan 
     */
    public void pesananDibatalkan(Pesanan pesan)
    {
    
    }
}
