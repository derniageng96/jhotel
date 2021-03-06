
public class PelangganSudahAdaException extends Exception
{
    private Customer pelanggan_error;

    public PelangganSudahAdaException(Customer pelanggan_input)
    {
        super("Data Customer dengan ID: ");
        pelanggan_error=pelanggan_input;
    }
    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + " sudah terdaftar.";
    }
}
