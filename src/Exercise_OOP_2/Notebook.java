package Exercise_OOP_2;

public class Notebook extends Komputer {

    @Override
    void hidupkan_os() {
        System.out.println("Notebook : Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("Notebook : Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Notebook : Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Notebook : Klik Kiri");
    }

    @Override
    public void enter() {
        System.out.println("Notebook : Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Notebook : Cetak Data");
    }
    
}
