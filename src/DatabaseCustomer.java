import java.util.ArrayList;
/**
 * class DatabaseCustomer untuk melihat dan memodifikasi database customer.
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private String[] list_customer;
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;
    /**
     * method untuk menambahkan data customer 
     * @param baru
     * @return false
     */
    public static boolean addCustomer(Customer baru)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==baru.getID()){
                return false;
            }
        }
        LAST_CUSTOMER_ID=baru.getID();
        CUSTOMER_DATABASE.add(baru);
        return true;
    }

    /**
     * method untuk menghapus data customer 
     * @param id 
     * @return false 
     */
    public static boolean removeCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(tes);
                DatabasePesanan.removePesanan(pesan);
                if(CUSTOMER_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * method untuk mendapatkan data customer database
     * @return list_customer - list dari customer
     */
    //public String[] getCustomerDatabase()
    //{
       //return list_customer;
    //}
    public static Customer getCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
}
