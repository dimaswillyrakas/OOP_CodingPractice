package Exercise_OOP_2;

public class PersonalComputer extends Komputer {

    @Override
    void hidupkan_os() {
        System.out.println("Personal Computer : Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("Personal Computer : Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Personal Computer : Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Personal Computer : Klik Kiri");
    }

    @Override
    public void enter() {
        System.out.println("Personal Computer : Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Personal Computer : Cetak Data");
    }
    
}
