package Br.edu.unoesc;

public class Entrega {

    public static void main(String[] args) {
        double empresA = 500000.00;
        double empresB = 1200000;
        double crescimentoA = 0.08;
        double crescimentoB = 0.04;
        int anos = 50;
        calculo(anos, empresA, empresB, crescimentoA, crescimentoB);
        ultrapassar(anos, empresA, empresB, crescimentoA, crescimentoB);
    }

    public static void calculo(int anos, double empresA, double empresB, double crescimentoA, double crescimentoB) {
        for (int i = 0; i < anos; i++) {
            empresA = empresA * (1 + crescimentoA);
            String FormatadoA = String.format("%.2f", empresA);
            System.out.println("\nValor após " + (i + 1) + " ano(s) da empresa A: R$" + FormatadoA);
        }

        for (int i = 0; i < anos; i++) {
            empresB = empresB * (1 + crescimentoB);
            String FormatadoB = String.format("%.2f", empresB);
            System.out.println("\nValor após " + (i + 1) + " ano(s) da empresa B: R$" + FormatadoB);
        }
    }

    public static void ultrapassar(int anos, double empresA, double empresB, double crescimentoA, double crescimentoB) {
        int anosUltrapassar = 0;
        for (int i = 0; i < anos; i++) {
            empresA = empresA * (1 + crescimentoA);
            empresB = empresB * (1 + crescimentoB);
            if (empresA > empresB) {
                anosUltrapassar = i + 1;
                break; 
            }
        }

        if (anosUltrapassar > 0) {
            System.out.println("\nA empresa A ultrapassa a empresa B após " + anosUltrapassar + " ano(s).");
        } else {
            System.out.println("\nA empresa A não ultrapassa a empresa B nos " + anos + " anos simulados.");
        }
    }
}