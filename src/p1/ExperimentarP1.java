package p1;

import java.util.ArrayList;

public class ExperimentarP1 {
    public static void main(String[] args) {
        
        Matriz mem = new Matriz();
        ArrayList<Double> tempoLinhas = new ArrayList<>();
        ArrayList<Double> tempoColunas = new ArrayList<>();

        mem.preencher();

        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            mem.somarLinhas();
            long fim = System.nanoTime();
            tempoLinhas.add(mem.miliS(fim, inicio));
            System.out.println("Tempo: " + mem.miliS(fim, inicio) + " ms");

        }
        double soma = 0;
        for (double tempo : tempoLinhas){
            soma += tempo;
        }

        double media = soma/ tempoLinhas.size();
        System.out.println("Media de Linhas: " + media);

        //--------------------------------------------
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            mem.somarColunas();
            long fim = System.nanoTime();
            tempoColunas.add(mem.miliS(fim, inicio));
            System.out.println("Tempo: " + mem.miliS(fim, inicio) + " ms");

        }
        soma = 0;
        for (double tempo : tempoColunas){
            soma += tempo;
        }

        media = soma/ tempoColunas.size();
        System.out.println("Media de Colunas: " + media);

    }
}