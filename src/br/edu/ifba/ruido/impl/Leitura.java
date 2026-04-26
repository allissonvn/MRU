package br.edu.ifba.ruido.impl;

public class Leitura {

     private int decibeis;

    public Leitura(int decibeis) {
        this.decibeis = decibeis;
    }

    public int getDecibeis() {
        return decibeis;
    }


    @Override
    public String toString() {
        return "Leitura = " + decibeis + " dB";
    }
}