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
       Room test = new SingleRoom(A,"",true,StatusKamar.Status_1);
       Pesanan test1 = new Pesanan(100,D, test);
       Administrasi pesananditugasin = new Administrasi();
       pesananditugasin.pesananDitugaskan(test1, test);
       Room dobel = new DoubleRoom(A,"",true,StatusKamar.Status_1);
       test1.setJumlahHari(5);
       test1.setPelanggan(D);
       test1.setRoom(dobel);
       System.out.println("Welcome to JHotel");
       System.out.println(dobel instanceof DoubleRoom);
       C.printData();
       D.printData();
       A.printData();
       test.printData();
       test1.printData();
       dobel.printData();
       
       
       
       
    }
        
    }

