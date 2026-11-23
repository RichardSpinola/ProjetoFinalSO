package p1;

import java.util.ArrayList;

public class Memoria {
    private int tamanho;
    private int[][] memoria;
   private ArrayList<Double> tempoLinhas = new ArrayList<>();
    private ArrayList<Double> tempoColunas = new ArrayList<>();

    public Memoria(int tamanho) {
        this.tamanho = tamanho;
        this.memoria = new int[tamanho][tamanho];
        preencher();
    }

    public Memoria() {
        this.tamanho = 2000;
        this.memoria = new int[tamanho][tamanho];
        preencher();
    }

    public void preencher() {

        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho; j++) {
                memoria[i][j] = 1;
            }
        }

    }

    public long linhas() {

        long soma = 0;
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho; j++) {
                soma += this.memoria[i][j];
            }
        }
        return soma;
    }

    public long colunas() {

        long soma = 0;
        for (int j = 0; j < this.tamanho; j++) {
            for (int i = 0; i < this.tamanho; i++) {
                soma += this.memoria[i][j];
            }
        }
        return soma;
    }

    public double miliS(long fim, long inicio) {
        double tempoMs = (fim - inicio) / 1_000_000.0;
        return tempoMs;
    }

    public double mediaLinhas() {
        double soma = 0;
        for (double tempo : tempoLinhas) {
            soma += tempo;
        }

        double media = soma / tempoLinhas.size();
        return media;

    }

    public double mediaColunas() {
        double soma = 0;
        for (double tempo : tempoColunas) {
            soma += tempo;
        }

        double media = soma / tempoColunas.size();
        return media;
    }

    public void iniciarLinhas() {
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            linhas();
            long fim = System.nanoTime();
            tempoLinhas.add(miliS(fim, inicio));
            System.out.println("Tempo: " + miliS(fim, inicio) + " ms");

        }
        System.out.println("Media de Linhas: " + mediaLinhas() + " ms");
    }

    public void iniciarColunas()
    {
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            colunas();
            long fim = System.nanoTime();
            tempoColunas.add(miliS(fim, inicio));
            System.out.println("Tempo: " + miliS(fim, inicio) + " ms");

        }
        System.out.println("Media de Colunas: " + mediaColunas() + " ms");
    }
}
