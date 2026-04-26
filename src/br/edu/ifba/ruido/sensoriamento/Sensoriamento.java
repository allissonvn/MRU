package br.edu.ifba.ruido.sensoriamento;

import br.edu.ifba.ruido.impl.SensorRuido;

import java.util.ArrayList;

public interface Sensoriamento {

    public ArrayList<SensorRuido> gerar(int totalSensores);
}
