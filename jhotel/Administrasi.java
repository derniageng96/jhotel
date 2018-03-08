
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
        kamar.setStatusKamar("Booked");
        kamar.setPesanan(pesan);
    }

    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar("Vacant");
        kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan.setStatusSelesai(false);
        kamar.getPesanan.setStatusDiproses(false);
        pesan.setPesanan(null);
    }

    public static void pesananSelesai(Room kamar)
    {
      kamar.getPesanan.setStatusSelesai(true);
      kamar.getPesanan.setStatusDiproses(false);
      
    }

    public static void pesananDibatalkan(Pesanan pesan)
    {
        
    }

    public static void pesananSelesai(Pesanan pesan)
    {
        
    }
}



