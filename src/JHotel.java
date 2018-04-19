/**
 * Class Jhotel.
 *
 * @author Derni Ageng
 * @version 03/01/2018

*/
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
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
        DatabaseCustomer.addCustomer(new Customer("budi", new Date(2012,12,12)));
        DatabaseCustomer.addCustomer(new Customer("abi", new Date(2000, 12, 5)));
        DatabaseCustomer.addCustomer(new Customer("cece", new Date(2001, 10, 10)));
        ArrayList<Customer>CUSTOMER_DATABASE = DatabaseCustomer.getCustomerDatabase();
        System.out.print("Customer \n");
        for(Customer c : CUSTOMER_DATABASE)
        {

            //String nama = tes.getNama();
            //Date date = tes.getDOB();
            System.out.println(c);
        }
        Lokasi test1 = new Lokasi(12,13,"Jakarta");
        Lokasi test2 = new Lokasi(69,69,"Jakarta");
        Lokasi test3 = new Lokasi(13,77,"Jakarta");
        DatabaseHotel.addHotel(new Hotel("Ibis", test1, 12 ));
        DatabaseHotel.addHotel(new Hotel("Hilton", test2, 13));
        DatabaseHotel.addHotel(new Hotel("Aston", test3, 10));
        ArrayList<Hotel>HOTEL_DATABASE = DatabaseHotel.getHotelDatabase();
        System.out.print("Hotel \n");
        for(int i=0; i<HOTEL_DATABASE.size(); i++)
        {
            Hotel tes1 = HOTEL_DATABASE.get(i);
            //String nama = tes1.getNama();
            //Lokasi lokasi = tes1.getLokasi();
            //int bintang = tes1.getBintang();
            System.out.println(tes1);
        }
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A101"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B202"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "C103"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D404"));

        for(Room ruangan: DatabaseRoom.getRoomDatabase()){
            System.out.println(ruangan);
        }
        DatabasePesanan.addPesanan(new Pesanan(15,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(12,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(10,DatabaseCustomer.getCustomer(3)));
        System.out.println("Pesanan");
        for(Pesanan pesenan: DatabasePesanan.getPesananDatabase()){
            System.out.println(pesenan);

        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A101"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "B202"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(3), "C103"));
        System.out.println("Pesanan Ditugaskan");
        for (Pesanan tugas: DatabasePesanan.getPesananDatabase()){
            System.out.println(tugas);
        }
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));
        System.out.println("Pesanan Selesai");
        for (Pesanan coba6 :DatabasePesanan.getPesananDatabase()){
            System.out.println(coba6);
        }

        /*Customer A = new Customer("Derni", 17, 4,2018);
        DatabaseCustomer.addCustomer(A);
        Customer B = new Customer("Ageng", 16, 4,2018);
        DatabaseCustomer.addCustomer(B);
        Customer C = new Customer("inreD", 15, 4,2018);
        DatabaseCustomer.addCustomer(C);
        System.out.println("Data pada Database Customer");
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        SingleRoom Ibis A101
        Double Room Hilton B202
        Premium Room Aston C103
        Premium Ibis D404

        Hotel D = new Hotel("KST", test1, 5);
        DatabaseHotel.addHotel(D);
        Hotel E = new Hotel("Hotel Terserah", test2, 4);
        DatabaseHotel.addHotel(E);
        Hotel F = new Hotel("Cibubur", test3, 3);
        DatabaseHotel.addHotel(F);

        System.out.println("Data pada Database Hotel");
        System.out.println(DatabaseHotel.getHotelDatabase());

        Room A101 = new SingleRoom(D, "A101", StatusKamar.Status_3);
        DatabaseRoom.addRoom(A101);
        Room D404 = new PremiumRoom(D, "D404", StatusKamar.Status_3);
        DatabaseRoom.addRoom(D404);
        Room B202 = new DoubleRoom(E, "B202", StatusKamar.Status_3);
        DatabaseRoom.addRoom(B202);
        Room C303 = new PremiumRoom(F, "C303", StatusKamar.Status_3);
        DatabaseRoom.addRoom(C303);
        System.out.println("Data pada Database Room");
        System.out.println(DatabaseRoom.getRoomsFromHotel(D));
        System.out.println(DatabaseRoom.getRoomsFromHotel(E));
        System.out.println(DatabaseRoom.getRoomsFromHotel(F));

        Pesanan pesan1 = new Pesanan(69, A);
        DatabasePesanan.addPesanan(pesan1);
        Pesanan pesan2 = new Pesanan(13, B);
        DatabasePesanan.addPesanan(pesan2);
        Pesanan pesan3 = new Pesanan(45, C);
        DatabasePesanan.addPesanan(pesan3);

        System.out.println("Data PESANAN biasa");
        System.out.println(DatabasePesanan.getPesananDatabase());

        Administrasi.pesananDitugaskan(pesan1, A101);
        Administrasi.pesananDitugaskan(pesan2, B202);
        Administrasi.pesananDitugaskan(pesan3, C303);

        System.out.println("Data Pesanan yang Ditugaskan");
        System.out.println(DatabasePesanan.getPesananDatabase());

        System.out.println("Data Pesanan telah Selesai dan Dibatalkan");
        Administrasi.pesananSelesai(pesan1);
        Administrasi.pesananSelesai(pesan2);
        Administrasi.pesananDibatalkan(pesan3);

        System.out.println(DatabasePesanan.getPesananDatabase());

        //Customer D = new Customer(12,"inreD",10,10,2010);
       //Lokasi C = new Lokasi(1,1,"Depok");
       //Hotel A = new Hotel("A",C,1);
       //Room test = new SingleRoom(A,"",true,StatusKamar.Status_1);
       //Pesanan test1 = new Pesanan(100,D, test);
       //Administrasi pesananditugasin = new Administrasi();
       //pesananditugasin.pesananDitugaskan(test1, test);
       //Room dobel = new DoubleRoom(A,"",true,StatusKamar.Status_1);
       //test1.setJumlahHari(5);
       //test1.setPelanggan(D);
       //test1.setRoom(dobel);
       //System.out.println("Welcome to JHotel");
       //System.out.println(dobel instanceof DoubleRoom);
       //C.printData();
       //D.printData();
       //A.printData();
       //test.printData();
       //test1.printData();
       //dobel.printData();
       Customer Derni = new Customer (1, "Derni", new GregorianCalendar(1997,06,23).getTime());
       System.out.println(Derni.getDOB());
       */
       
    }
        
    }

