package p1;

public class Matriz {
    private int tamanho;
    private int[][] memoria;

    public Matriz(int tamanho) {
        this.tamanho = tamanho;
        this.memoria = new int[tamanho][tamanho];
    }

    public Matriz() {
        this.tamanho = 2000;
        this.memoria = new int[tamanho][tamanho];
    }

    public void preencher() {

        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho; j++) {
                memoria[i][j] = 1;
            }
        }

    }

    public long somarLinhas() {
        long soma = 0;
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho; j++) {
                soma += this.memoria[i][j];
            }
        }
        return soma;
    }

    public long somarColunas() {
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

}
