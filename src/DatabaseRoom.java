/**
 *
 * @author Derni Ageng
 * @version 2018.03.10
 */
import java.util.*;
// Class ini digunakan untuk memproses data Room

public class DatabaseRoom
{

    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();
    /*
     * Deklarasi variable
     */

    /**
     * Metode untuk menambah Room
     *
     * @param baru room baru
     *
     */
    public static boolean addRoom(Room baru)
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(baru.getHotel())&&tes.getNomorkamar()==baru.getNomorkamar()){
                return false;
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menghapus room
     *
     * @param hotel Hotel
     * @param nomor_kamar nomer
     * @return null
     *
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorkamar()==nomor_kamar){
                return tes;
            }
        }
        return null;
    }

    /**
     * Metode untuk menghapus room
     *
     * @param hotel Hotel
     * @return null
     *
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)){
                REQUEST_ROOM.add(tes);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * Metode untuk menghapus room
     *
     * @return null
     *
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getStatusKamar()==StatusKamar.Status_3){
                REQUEST_ROOM.add(tes);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * Metode untuk menghapus room
     *
     * @param hotel Hotel
     * @param nomor_kamar nomer
     *
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorkamar()==nomor_kamar){
                if(DatabasePesanan.getPesanan(tes) != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }

                if(ROOM_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Metode untuk mengambil data di database
     *
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
}
