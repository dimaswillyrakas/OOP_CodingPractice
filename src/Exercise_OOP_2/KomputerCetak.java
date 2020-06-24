package Exercise_OOP_2;

final class KomputerCetak {
    KomputerCetak(){
        PersonalComputer PC = new PersonalComputer();
        PC.hidupkan_os();
        PC.matikan_os();
        PC.klik_kanan();
        PC.klik_kiri();
        PC.enter();
        PC.cetak_data();
        System.out.println("-----------------------------------");
        Notebook Note = new Notebook();
        Note.hidupkan_os();
        Note.matikan_os();
        Note.klik_kanan();
        Note.klik_kiri();
        Note.enter();
        Note.cetak_data();
        System.out.println("-----------------------------------");
        Netbook Net = new Netbook();
        Net.hidupkan_os();
        Net.matikan_os();
        Net.klik_kanan();
        Net.klik_kiri();
        Net.enter();
        Net.cetak_data();
    }
    
    public static void main(String[] args) {
        KomputerCetak KC = new KomputerCetak();
    }
}
