import lingkaran.Lingkaran;
import lingkaran.LuasSetengah;
import lingkaran.SetengahLingkaran;

// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

public class Main {
    public static void main(String[] args) {
        Lingkaran circle_satu = new SetengahLingkaran();
        LuasSetengah luassatu = new LuasSetengah(circle_satu);
        
        luassatu.hitung();
        luassatu.tampilkan();
    } 
}