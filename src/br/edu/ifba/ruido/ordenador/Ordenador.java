package br.edu.ifba.ruido.ordenador;

import br.edu.ifba.ruido.impl.SensorRuido;

import java.util.ArrayList;

public abstract class Ordenador {

    protected TipoOrdenacao tipoOrdenacao;
    public Ordenador(TipoOrdenacao tipoOrdenacao) {this.tipoOrdenacao = tipoOrdenacao;}

    public abstract void ordenar(ArrayList<SensorRuido> sensores);
}
