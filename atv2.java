import java.util.Scanner;

public class atv2 {
    final static Scanner LER = new Scanner(System.in);

    public static void imprimirMetais() {
        for (int i = 0; i < metais.length; i++) {
            System.out.println("Metal: " + metais[i] + " -> " + i);
        }
    }

    static float[] potenxialDeOxireducao = {
            -0.76f, 0.76f, // Zn(s), Zn+2

            -0.34f, 0.34f, // Cu(s), Cu+2

            -0.44f, 0.44f, // Fe(s), Fe2+

            -2.37f, 2.37f, // Mg(s), Mg2+

            -0.80f, 0.80f, // Ag(s), Ag+

            -0.28f, 0.28f, // Co(s), Co2+

            -3.04f, 3.04f, // Li(s), Li+

            -2.71f, 2.71f, // Na(s), Na+

            -2.88f, 2.88f, // Sr(s), Sr2+

            -1.66f, 1.66f // Al(s), Al3+
    };

    static String[] metais = {
            "Zn(s)", "Zn+2(aq)", // +0,76

            "Cu(s)", "Cu+2(aq)", // -0,34

            "Fe(s)", "Fe2+(aq)", // +0,44

            "Mg(s)", "Mg2+(aq)", // +2,37

            "Ag(s)", "Ag+(aq)", // +0,80

            "Co(s)", "Co2+(aq)", // +0,28

            "Li(s)", "Li+(aq)", // +3,04

            "Na(s)", "Na+(aq)", // +2,71

            "Sr(s)", "Sr2+(aq)", // +2,88

            "Al(s)", "Al3+(aq)" // +1,66
    };

    public static void main(String[] args) {
        imprimirMetais();

        int especie1;
        int especie2;

        while (true) {
            especie1 = LER.nextInt();
            especie2 = LER.nextInt();

            float eOxida;
            float eReduz;

            String oxida;
            String reduz;

            if (potenxialDeOxireducao[especie1] > potenxialDeOxireducao[especie2]) {
                oxida = metais[especie2];
                reduz = metais[especie1];

                if (verfCondiciones(oxida, reduz)) {

                    eOxida = potenxialDeOxireducao[especie2];
                    eReduz = potenxialDeOxireducao[especie1];
                    System.out.println("a especie que oxida é: " + oxida + " " + eOxida + "V");
                    System.out.println("a especie que reduz é: " + reduz + " " + eReduz + "V");
                    System.out.printf("potencial: %.2f", calcularPotencial(eOxida, eReduz));
                    System.out.println();

                }

            } else {
                oxida = metais[especie1];
                reduz = metais[especie2];

                if (verfCondiciones(oxida, reduz)) {
                    eOxida = potenxialDeOxireducao[especie1];
                    eReduz = potenxialDeOxireducao[especie2];

                    System.out.println("a especie que oxida é: " + oxida + " " + eOxida + "V");
                    System.out.println("a especie que reduz é: " + reduz + " " + eReduz + "V");
                    System.out.printf("potencial: %.2f" , calcularPotencial(eOxida, eReduz));
                    System.out.println();
                }

            }

            // expecie1 = LER.next().trim();// tirar " "
            // expecie2 = LER.next().trim();// dei uma pesquisad

        }
        // while (true) {
        // expecie1 = LER.next().trim();// tirar " "
        // expecie2 = LER.next().trim();// dei uma pesquisad
        // float eOxida;
        // float eReduz;
        // if (verfCondiciones(expecie1, expecie2)) {
        // if (expecie1.contains("+")) {
        // System.out.println("a especie que oxida é: " + expecie2);
        // System.out.println("a especie que reduz é: " + expecie1);
        // eOxida = encontrarPotencial(expecie2);
        // eReduz = encontrarPotencial(expecie1);
        // System.out.println(eOxida);
        // System.out.println(eReduz);
        // System.out.println("Potencial: " + calcularPotencial(eOxida, eReduz));
        // break;
        // } else if (expecie1.contains("(s)")) {
        // System.out.println("a especie que oxida é: " + expecie1);
        // System.out.println("a especie que reduz é: " + expecie2);
        // eOxida = encontrarPotencial(expecie1);
        // eReduz = encontrarPotencial(expecie2);
        // System.out.println("Potencial: " + calcularPotencial(eOxida, eReduz));
        // break;
        // } else {
        // System.out.println("au");
        // }
        // }
        // }

    }

    public static float calcularPotencial(float anodo, float catodo) {
        anodo *= -1;
        return anodo + catodo;
    }

    public static float encontrarPotencial(String especie) {
        for (int i = 0; i < potenxialDeOxireducao.length; i++) {
            if (metais[i].equals(especie)) {
                return potenxialDeOxireducao[i];
            }
        }
        return 0;
    }

    // dei uma pesquisada :|
    public static String extrairMetal(String especie) {
        int i = 0;

        while (i < especie.length() && Character.isLetter(especie.charAt(i))) {
            i++;
        }

        return especie.substring(0, i);
    }

    public static boolean verfCondiciones(String metal1, String metal2) {
        if (metal1.equals(metal2)) {
            System.out.println("As especies não podem ser iguais!");
            System.out.println();
            return false;
        } else if (metal1.contains("(s)") && metal2.contains("(s)")) { // altera
            System.out.println("2 metais ja reduzidas");
            System.out.println();
            return false;
        } else if (metal1.contains("+") && metal2.contains("+")) {
            System.out.println("2 especies ja oxidadas");
            System.out.println();
            return false;
        } else if (extrairMetal(metal1).equals(extrairMetal(metal2))) {
            System.out.println("não pode os mesmos metais");
            return false;
        }
        return true;
    }

}
