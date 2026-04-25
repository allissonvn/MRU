package br.edu.ifba.ruido.impl;

public class Leitura {

    Integer decibeis;

    public Leitura(Integer decibeis) {
        this.decibeis = decibeis;
    }

    public Integer getDecibeis() {
        return decibeis;
    }

    public void setDecibeis(Integer decibeis) {this.decibeis = decibeis;}

    @Override
    public String toString() {
        return "decibeis = " + decibeis;
    }
}
