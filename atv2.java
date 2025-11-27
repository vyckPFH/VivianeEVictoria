import java.util.Scanner;

public class atv2 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        String[] metaix = {
                "Zn(s)", 
                "Zn+2(aq)", 
                "Cu(s)", 
                "Cu+2(aq)",
                "Fe(s)",
                "Fe2+(aq)",
                "Mg(s)",
                "Mg2+(aq)",
                "Ag(s)",
                "Ag+(aq)",
                "Co(s)",
                "Co2+(aq)",
                "Li(s)",
                "Li+(aq)",
                "Na(s)",
                "Na+(aq)",
                "Sr(s)",
                "Sr2+(aq)",
                "Al(s)",
                "Al3+(aq)"
        };

        float[] potenxialDeOxireducao = {
            //-0,76
            //+0,76
            //+0,34
            //-0,34
            //-0,44
            //+0,44
            //-2,37
            //+2,37
            //+0,80
            //-0,80
            //-0,28
            //+0,28
            //-3,04
            //+3,04
            //-2,71
            //+2,71
            //-2,88  
            //+2,88
            //-1,66
            //+1,66
        };

        String expecie1 = null;
        String expecie2 = null;

        while (true) {

            // System.out.println("•·• Opções de Metal •·•");
            // System.out.println("Zn(s)");
            // System.out.println("Zn2+(aq)");
            // System.out.println("Cu(s)");
            // System.out.println("Cu2+(aq)");
            // System.out.println();

            expecie1 = LER.next().trim();// tirar " "
            expecie2 = LER.next().trim();// dei uma pesquisad

            if (verfCondiciones(expecie1, expecie2)) {
                if (expecie1.contains("+")) {
                    System.out.println("a especie que oxida é: " + expecie2);
                    System.out.println("a especie que reduz é: " + expecie1);
                    break;
                } else if (expecie1.contains("(s)")) {
                    System.out.println("a especie que oxida é: " + expecie1);
                    System.out.println("a especie que reduz é: " + expecie2);
                    break;
                } else {
                    System.out.println("au");
                }
            }

        }

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
