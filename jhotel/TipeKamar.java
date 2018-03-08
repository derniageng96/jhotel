
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TipeKamar
{
    Tipe_1("Booked"), Tipe_2("Processed"), Tipe_3("Vacant") ;
    private String tipe;
    TipeKamar(String tipe){
        this.tipe=tipe;
    }
    
    public String tipe(){
     return tipe;   
    }
    
    public String toString()
    {
        return tipe;
    }
}
