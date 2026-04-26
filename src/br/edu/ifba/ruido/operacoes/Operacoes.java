package br.edu.ifba.ruido.operacoes;

import br.edu.ifba.ruido.impl.SensorRuido;
import br.edu.ifba.ruido.ordenador.TipoOrdenacao;

import java.util.ArrayList;

public interface Operacoes {

    public void listarLeituras(ArrayList<SensorRuido> sensores);
    public void listarSensores(ArrayList<SensorRuido> sensores);

    public void ordenarSensores(ArrayList<SensorRuido> sensores, TipoOrdenacao tipoOrdenacao);

    public void analisarPares(ArrayList<SensorRuido> sensores, int limiar);
}
