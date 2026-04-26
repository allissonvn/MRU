package br.edu.ifba.ruido;

import br.edu.ifba.ruido.impl.OperacoesImpl;
import br.edu.ifba.ruido.impl.SensorRuido;
import br.edu.ifba.ruido.impl.SensoriamentoImpl;
import br.edu.ifba.ruido.ordenador.TipoOrdenacao;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        SensoriamentoImpl sensoriamento = new SensoriamentoImpl();
        ArrayList<SensorRuido> sensores = sensoriamento.gerar(10);
        OperacoesImpl operacoes = new OperacoesImpl();

        System.out.println("---- Lista de sensores ----");
        operacoes.listarSensores(sensores);

        System.out.println("---- Lista de leituras ----");
        operacoes.listarLeituras(sensores);

        System.out.println("---- Ordenar leituras ----");
        operacoes.ordenarSensores(sensores, TipoOrdenacao.POR_DECIBEIS);
        operacoes.listarLeituras(sensores);

        System.out.println("---- Analisando Pares ----");
        operacoes.analisarPares(sensores, 15); // limiar de 15 dB
    }
}
