package no.hvl.dat102.filmarkiv.impl;

import no.hvl.dat102.filmarkiv.adt.FilmarkivADT;

import java.util.ArrayList;

public class Filmarkiv2 implements FilmarkivADT {

    private int antall;
    private LinearNode<Film> start;

    public Filmarkiv2() {
        start = null;
        antall = 0;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        LinearNode<Film> ny = new LinearNode<>(nyFilm);
        ny.neste = start;
        start = ny;
        antall++;
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public Film finnFilm(int nr) {
        LinearNode<Film> p = start;
        while (p != null) {
            if (p.data.getFilmnr() == nr) {
                return p.data;
            }
            p = p.neste;
        }
        return null;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        if (start == null) return false;

        if (start.data.getFilmnr() == filmnr) {
            start = start.neste;
            antall--;
            return true;
        }

        LinearNode<Film> forrige = start;
        LinearNode<Film> p = start.neste;

        while (p != null) {
            if (p.data.getFilmnr() == filmnr) {
                forrige.neste = p.neste;
                antall--;
                return true;
            }
            forrige = p;
            p = p.neste;
        }
        return false;
    }

    @Override
    public Film[] soekTittel (String delstreng) {
        if (delstreng == null) {
            return new Film[0];
        }
        ArrayList<Film> treff = new ArrayList<>();
        LinearNode<Film> p = start;

        while (p != null) {
            film f = p.data;
            if (f != null && f.getTittel()) != null && f.getTittel(.dontains(delstreng)) {
                treff.add(f);
            }
            p = p.neste;
        }

        return treff.toArray(new Film [0]);
    }

    @Override
    public int antall(Sjanger sjanger) {
        if (sjanger == null) {
            return 0;
        }

        int teller = 0;
        LinearNode<Film> p = start;

        while (p != null) {
            Film f = p.data;
            if (f != null && sjanger.equals(f.getSjanger())) {
                teller++;
            }
            p = p.neste
        }
        return teller;
    }

    @Override
    public boolean slettFilm (int filmnr) {
        if (start == null) return false;
    }

}
