package br.edu.ifba.ruido.impl;

import br.edu.ifba.ruido.sensoriamento.Sensoriamento;

import java.util.ArrayList;
import java.util.Random;

public class SensoriamentoImpl implements Sensoriamento {

    private static final int MAX_LEITURAS = 10;
    private static final int NORMAL_LEITURAS = 5;

    private static final int VALOR_NORMAL_DB = 40;
    private static final int VALOR_MAXIMO_DB = 120;


    /**
     * Complexidade: O(N²)
     * Motivo: loop externo cria N sensores e loop interno
     * gera entre 5 e 10 leituras para cada sensor.
     * Impacto: cresce quadraticamente com a entrada.
     */
    @Override
    public ArrayList<SensorRuido> gerar(int totalSensores) {
       ArrayList<SensorRuido> sensores = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < totalSensores; i++) {
            String id = String.format("SENSOR_%02d", i + 1);
            SensorRuido sensor = new SensorRuido(id);
            for (int j = 0; j < random.nextInt(NORMAL_LEITURAS, MAX_LEITURAS); j++) {
                Leitura leitura = new Leitura(random.nextInt(VALOR_NORMAL_DB, VALOR_MAXIMO_DB));
                sensor.adicionarLeitura(leitura);
            }

            sensores.add(sensor);
        }
        return sensores;
    }

}
