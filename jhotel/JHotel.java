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
       Customer D = new Customer(12,"adsd");
       //D.nama = "Derni";
       //D.id = 12;
       Lokasi C = new Lokasi(1,1,"Depok");
       Hotel A = new Hotel("A",C,1);
       Pesanan P = new Pesanan(1000000, D);
       P.printData();
       A.printData();
       C.printData();
       D.printData();
       
       D.setNama("ooo");
       D.printData();
    }
        
    }

