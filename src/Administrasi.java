
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{


    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }

    
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(kamar);
        
    }

    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Status_1);
        kamar.setPesanan(pesan);
    }

    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Status_3);
        kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan1 = new Pesanan();
        //pesan1 = kamar.getPesanan();
        //pesan1.setStatusSelesai(false);
        //pesan1.setStatusDiproses(false);
        //pesan1.setRoom(null);
        //kamar.setPesanan(pesan1);
        pesan1.setStatusAktif(false);
        
        roomLepasPesanan(kamar);
    }

    public static void pesananSelesai(Room kamar)
    {
      kamar.getPesanan().setStatusSelesai(true);
      kamar.getPesanan().setStatusDiproses(false);
      kamar.setPesanan(null);
      
    }

    public static void pesananDibatalkan(Pesanan pesan) 
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusSelesai(false);
        pesan.setRoom(null);
    }

    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        Pesanan pesan1 = new Pesanan();
        pesan1.setStatusAktif(false);
    }
    
}



