package Exercise_OOP_2;

public class Netbook extends Komputer{

    @Override
    void hidupkan_os() {
        System.out.println("Netbook : Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("Netbook : Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook : Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook : Klik Kiri");
    }

    @Override
    public void enter() {
        System.out.println("Netbook : Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook : Cetak Data");
    }
    
}
