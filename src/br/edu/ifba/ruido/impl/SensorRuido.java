package br.edu.ifba.ruido.impl;

import java.util.ArrayList;

public class SensorRuido {

    private String id;
    private ArrayList<Leitura> leituras;

    public SensorRuido(String id) {
        this.id = id;
        this.leituras = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Leitura> getLeituras() {
        return leituras;
    }

    public void adicionarLeitura(Leitura leitura){
        leituras.add(leitura);
    }

    @Override
    public String toString() {
        return "Sensor: " + id;

    }
}
