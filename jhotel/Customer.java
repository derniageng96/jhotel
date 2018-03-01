/**
 * Class Customer untuk menampilkan informasi customer.
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    
    /**
     * constructor dari customer 
     * @param id, nama - nama baru dan id baru 
     */
    public Customer(int idNew, String namaBaru)
    {
        id = idNew;
        nama = namaBaru;
        
    }

    /**
     * method untuk mendapatkan data ID 
     * @return id - mengembalikan nilai ID 
     */
    public int getID()
    {
      return id;
    }

    /**
     * method untuk mendapatkan data nama
     * @return nama - mendapatkan nilai nama
     */
    public String getNama()
    {
        return nama;

    }

    /**
     * method untuk menginput ID baru 
     * @param idNew 
     * 
     */
    public void setID(int idNew)
    {
        id=idNew;
    }

    /**
     * method untuk menginput NamaBaru
     * @param NamaBaru - nama baru 
     */
    public void setNama(String NamaBaru)
    {
        nama=NamaBaru;
    }
    
    /**
     * method untuk mencetak data
     */
    public void printData()
    {
        
    }
}
