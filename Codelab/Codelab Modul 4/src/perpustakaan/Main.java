package perpustakaan;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Fiksi("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new NonFiksi("Filsafat Ilmu", "Jujun S. Suriasumantri");

        buku1.displayInfo();
        System.out.println();
        buku2.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Muhammad Nazril Irham", "TI230506");
        anggota1.pinjamBuku("Laskar Pelangi");
        anggota1.pinjamBuku("Filsafat Ilmu", 7);
        anggota1.kembalikanBuku("Laskar Pelangi");
    }
}
