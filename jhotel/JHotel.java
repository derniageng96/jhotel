/**
 * Class Jhotel.
 *
 * @author Derni Ageng
 * @version 03/01/2018
 */
public class JHotel
{
    // instance variables - replace the example below with your o
    /**
     * constractor Jhotel
     */
    public JHotel()
    {
      
    }

    /**
     * main
     */
    public static void main(String[] args) 
    {
       Customer D = new Customer(12,"inreD");
      
       Lokasi C = new Lokasi(1,1,"Depok");
       
       Hotel A = new Hotel("A",C,1);
       System.out.println("Welcome to JHotel");
       C.printData();
       D.printData();
       A.printData();
       
       
       
       
       
    }
        
    }

