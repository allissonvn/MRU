package br.edu.ifba.ruido.impl;

import br.edu.ifba.ruido.ordenador.Ordenador;
import br.edu.ifba.ruido.ordenador.TipoOrdenacao;

import java.util.ArrayList;

public class OrdenadorImpl extends Ordenador {


    public OrdenadorImpl(TipoOrdenacao tipoOrdenacao) {
        super(tipoOrdenacao);
    }

    /**
     * Complexidade: O(N^3)
     * Motivo: 3 loops aninhados — loop externo percorre
     * os sensores, e dois loops internos do bubble sort
     * percorrem e comparam as leituras de cada sensor.
     * Impacto: é muito custoso caso for uma entrada grande, 100 sensores resultam
     * em aproximadamente  ~1.000.000  operações.
     */
    @Override
    public void ordenar(ArrayList<SensorRuido> sensores) {

        for(SensorRuido sensor: sensores){
            ArrayList<Leitura> leituras = sensor.getLeituras();
            for (int i = 0; i < leituras.size(); i++) {
                for (int j = 0; j < leituras.size() - i - 1; j++) {
                    if (leituras.get(j).getDecibeis() > leituras.get(j + 1).getDecibeis()) {
                        Leitura temp = leituras.get(j);
                        leituras.set(j, leituras.get(j + 1));
                        leituras.set(j + 1, temp);
                    }
                }
            }
        }
    }


}



