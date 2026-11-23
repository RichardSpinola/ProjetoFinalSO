package p1;

public class App {
    public static void main(String[] args) {
        int[] tamanho = { 2000, 3000, 4000 }; 

        System.out.println("LINHAS ========================");

        for (int tam : tamanho) {
            System.out.println("=== Tamanho: " + tam + " ===");
            Memoria memoriaLinhas = new Memoria(tam);
            memoriaLinhas.iniciarLinhas();
        }
        System.out.println(" ");
        System.out.println("COLUNAS ========================");

        for (int tam : tamanho) {
            System.out.println("=== Tamanho: " + tam + " ===");
            Memoria memoriaColunas = new Memoria(tam);
            memoriaColunas.iniciarColunas();
        }

    }
}