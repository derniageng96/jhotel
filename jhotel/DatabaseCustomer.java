
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
    
    /**
     * method untuk menambahkan data customer 
     * @param baru
     * @return false
     */
    public boolean addCustomer(Customer baru)
    {
        return false; 
    }

    /**
     * method untuk menghapus data customer 
     * @param id 
     * @return false 
     */
    public boolean removeCustomer(int id)
    {
        return false;
    }
    
    /**
     * method untuk mendapatkan data customer database
     * @return list_customer - list dari customer
     */
    public String[] getCustomerDatabase()
    {
       return list_customer;
    }
}
