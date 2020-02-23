package bagliliste;

import bl.BListe;
import bl.Dugum;
import java.awt.PageAttributes;

public class BagliListe {

    public static void main(String[] args) {
        BListe bl = new BListe();
        bl.print();
        System.out.println("Başa Ekle");
        bl.basaEkle(new Dugum(new Human("Mehmed", 20)));
        bl.print();
        System.out.println("Başa Ekle");
        bl.basaEkle(new Dugum(new Human("Barkın", 18)));
        bl.print();
        System.out.println("Başa Ekle");
        bl.basaEkle(new Dugum(new Human("Kenan", 25)));
        bl.print();
        System.out.println("Başa Ekle");
        bl.basaEkle(new Dugum(new Human("Selim", 21)));
        bl.print();
        System.out.println("Araya Ekle");
        bl.arayaEkle(new Dugum(new Human("PELİN", 100)));
        bl.print();
        System.out.println("Araya Ekle");
        bl.arayaEkle(new Dugum(new Human("AYŞE", 57)));
        bl.print();
        System.out.println("Araya Ekle");
        bl.arayaEkle(new Dugum(new Human("YAHYA", 48)));
        bl.print();
        System.out.println("Sona Ekle");
        bl.SonaEkle(new Dugum(new Human("ALİ", 99)));
        bl.print();
        System.out.println("Sona Ekle");
        bl.SonaEkle(new Dugum(new Human("ALİ", 99)));
        bl.print();
        System.out.println("Sona Ekle");
        bl.SonaEkle(new Dugum(new Human("ALİ", 99)));
        bl.print();
        System.out.println("Araya Ekle");
        bl.arayaEkle(new Dugum(new Human("PELİN", 26)));
        bl.print();
        System.out.println("Araya Ekle");
        bl.arayaEkle(new Dugum(new Human("MURAT", 14)));
        bl.print();
        System.out.println("Baştan Sil");
        bl.bastanSil();
        bl.print();
        System.out.println("Baştan Sil");
        bl.bastanSil();
        bl.print();
        System.out.println("Sondan Sil");
        bl.sondanSil();
        bl.print();
        System.out.println("Sondan Sil");
        bl.sondanSil();
        bl.print();
        System.out.println("Sondan Sil");
        bl.sondanSil();
        bl.print();
        System.out.println("Sondan Sil");
        bl.sondanSil();
        bl.print();
        System.out.println("-----------------------------------------------");
        System.out.println("Aradan Sil");
        bl.aradanSil(new Dugum(new Human("YAHYA", 48)));
        bl.print();
        System.out.println("Aradan Sil");
        bl.aradanSil(new Dugum(new Human("Barkın", 18)));
        bl.print();
        System.out.println("Aradan Sil");
        bl.aradanSil(new Dugum(new Human("PELİN", 26)));
        bl.print();
        System.out.println("Aradan Sil");
        bl.aradanSil(new Dugum(new Human("PELİN", 100)));
        bl.print();
        System.out.println("Aradan Sil");
        bl.aradanSil(new Dugum(new Human("Kenan", 25)));
        bl.print();

        // bl.sondanSil(new Dugum(new Human("Kenan",21)));
    }

}
