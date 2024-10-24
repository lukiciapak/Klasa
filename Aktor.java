package Desktopowka.Projekt_Aktorzy.Pliki;

public class Aktor {
    private String imie;
    private String nazwisko;
    private String narodowosc;
    private String sciezkaDoZdjecia;
    private String film1;
    private String film2;
    private String film3;
    private String film4;


    public Aktor(String imie, String nazwisko, String narodowosc, String sciezkaDoZdjecia, String film1, String film2, String film3, String film4) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.narodowosc = narodowosc;
        this.sciezkaDoZdjecia = sciezkaDoZdjecia;
        this.film1 = film1;
        this.film2 = film2;
        this.film3 = film3;
        this.film4 = film4;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNarodowosc() {
        return narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }

    public String getSciezkaDoZdjecia() {
        return sciezkaDoZdjecia;
    }

    public void setSciezkaDoZdjecia(String sciezkaDoZdjecia) {
        this.sciezkaDoZdjecia = sciezkaDoZdjecia;
    }

    public String getFilm1() {
        return film1;
    }

    public void setFilm1(String film1) {
        this.film1 = film1;
    }

    public String getFilm2() {
        return film2;
    }

    public void setFilm2(String film2) {
        this.film2 = film2;
    }

    public String getFilm3() {
        return film3;
    }

    public void setFilm3(String film3) {
        this.film3 = film3;
    }

    public String getFilm4() {
        return film4;
    }

    public void setFilm4(String film4) {
        this.film4 = film4;
    }
}

