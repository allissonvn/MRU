package br.edu.ifba.ruido.impl;

import br.edu.ifba.ruido.operacoes.Operacoes;
import br.edu.ifba.ruido.ordenador.TipoOrdenacao;

import java.util.ArrayList;


public class OperacoesImpl implements Operacoes {

    private OrdenadorImpl ordenador;

    public OperacoesImpl() {
        this.ordenador = new OrdenadorImpl(TipoOrdenacao.POR_DECIBEIS);
    }

    /**
     * Complexidade: O(N^2)
     * Motivo: percorre uma vez cada sensor da lista e em cada leitura do sensor.
     * Impacto com entrada grande: Com uma entrada Grande ele vai crescer exponencialmente
     * 100 sensores = ~10.000 operações. Sem nenhum problema
     */
    @Override
    public void listarLeituras(ArrayList<SensorRuido> sensores) {
        for (SensorRuido sensor : sensores) {
            ArrayList<Leitura> leituras = sensor.getLeituras();
            System.out.println(sensor);
            for (int i = 0; i < leituras.size(); i++) {
                System.out.println(leituras.get(i).toString());
            }
        }
    }

    /**
    * Complexidade: O(N)
    * Motivo: percorre uma vez cada sensor da lista.
    * Impacto com entrada grande: cresce linearmente
    * 1000 sensores = 1000 operações. Sem problema
    */
    @Override
    public void listarSensores(ArrayList<SensorRuido> sensores) {
        for (SensorRuido sensor : sensores) {
            System.out.println(sensor);
        }
    }

    /**
     * Complexidade: O(N^3)
     * Motivo: loop de sensores + dois loops aninhados do
     * bubble sort para ordenar as leituras de cada sensor.
     * Impacto: muito custoso com entradas grandes.
     * 100 sensores = ~1.000.000 de operações.
     */
    @Override
    public void ordenarSensores(ArrayList<SensorRuido> sensores, TipoOrdenacao tipoOrdenacao) {
        ordenador.ordenar(sensores);
    }

    /**
     * Complexidade: O(N^2)
     * Motivo: dois loops aninhados comparam todos os pares
     * possíveis de sensores (N * N-1 / 2 combinações).
     * Impacto: 100 sensores = ~5000 comparações de pares.
     */
    @Override
        public void analisarPares(ArrayList<SensorRuido> sensores, int limiar) {
            for (int i = 0; i < sensores.size(); i++) {
                int somaI = 0;
                ArrayList<Leitura> leituras1 = sensores.get(i).getLeituras();
                for (int j = 0; j < leituras1.size(); j++) {
                    somaI += leituras1.get(j).getDecibeis();
                }
                int mediaI = somaI / leituras1.size();

                for (int j = i+1; j < sensores.size(); j++) {
                    int somaJ = 0;
                    ArrayList<Leitura> leituras2 = sensores.get(j).getLeituras();
                    for (int y = 0; y < leituras2.size(); y++) {
                        somaJ += leituras2.get(y).getDecibeis();
                    }
                    int mediaJ = somaJ / leituras2.size();
                    int diferencal = Math.abs(mediaI - mediaJ);
                    if (diferencal > limiar) {
                        System.out.println(sensores.get(i) + " e " + sensores.get(j) + " | Diferença: " + diferencal + " dB");
                    }

                }


            }

    }
}
