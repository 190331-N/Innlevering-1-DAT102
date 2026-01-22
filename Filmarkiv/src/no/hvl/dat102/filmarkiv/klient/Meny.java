package no.hvl.dat102.filmarkiv.klient;

import no.hvl.dat102.filmarkiv.adt.FilmarkivADT;
import no.hvl.dat102.filmarkiv.impl.Film;
import no.hvl.dat102.filmarkiv.impl.Sjanger;


public class Meny {

    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;

    public Meny(FilmarkivADT filmarkiv){
        tekstgr = new Tekstgrensesnitt();
        this.filmarkiv = filmarkiv;
    }
    public void start(){
        Film f1 = new Film(1, "Peter Jackson", "Ringenes herre", 2001, Sjanger.FANTASY, "New Line");
        Film f2 = new Film(2, "James Cameron", "Titanic", 1997, Sjanger.DRAMA, "Fox");
        Film f3 = new Film(3, "Gore Verbinski", "Pirates", 2003, Sjanger.EVENTYR, "Disney");



// TODO
    }
}
