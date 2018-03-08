
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvaible;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    Private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        // initialise instance variables
        
    }

    
    public Hotel getHotel()
    {
        // put your code here
        return hotel;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getNomorkamar()
    {
        return nomor_kamar;
    }
    
    public boolean getStatusAvaible()
    {
        return isAvaible;
    }
    
    
}
