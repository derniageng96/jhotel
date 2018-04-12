import java.util.ArrayList;

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
    private static ArrayList<Pesanan> PESANAN_DATABASE ;
    private static int LAST_PESANAN_ID;
    /**
     * method untuk menambah pesanan baru 
     * @return false
     * 
     */
    public static boolean addPesanan(Pesanan baru)
    {
        boolean status = false;

        if(baru.getStatusAktif()){
            System.out.print("Pesanan tidak dapat diproses");
        }
        else
        {
            PESANAN_DATABASE.add(baru);
            status=true;
        }
        return status;
    }
    
    /**
     * method untuk menghapus data pesanan
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    /**
     * method untuk mendapatkan data pesanan
     * @param cust
     */

    public static Pesanan getPesanan(Room kamar)
    {
        int ID = 0;
        for(int i = 0;i<PESANAN_DATABASE.size();i++)
        {
            if(PESANAN_DATABASE.get(i).getRoom() == kamar)
            {
                return PESANAN_DATABASE.get(i);
            }
            else {
                return null;
            }
        return null;
    }
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        return null;
    }
    /**
     * method untuk mendapatkan data pesanan database 
     * @return list_pesanan - list dari pesanan
     */
    public static String[] getPesananDatabase()
    {
        return null;
    }
    
    /**
     * method untuk membatakan pesanan 
     * @param pesan - pesanan 
     */

    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }
    public Pesanan getPesanan(int id)
    {
        int ID = 0;
        for(int i = 0;i<PESANAN_DATABASE.size();i++)
        {
            if(PESANAN_DATABASE.get(i).getID() == id)
            {
                return PESANAN_DATABASE.get(id);
            }
            else {
                return null;
            }


        }
        return null;
    }
}
