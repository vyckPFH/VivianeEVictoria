import java.util.Scanner;

public class Main {
  final static Scanner LER = new Scanner(System.in);

  public static void main(String[] args) {

    // String[] simbolosMetais = {
    // "Li", "Na", "K", "Rb", "Cs", "Fr",
    // "Be", "Mg", "Ca", "Sr", "Ba", "Ra",
    // "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn",
    // "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd",
    // "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg",
    // "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn",
    // "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm",
    // "Yb", "Lu",
    // "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md",
    // "No", "Lr",
    // "Al", "Ga", "In", "Sn", "Tl", "Pb", "Bi", "Po", "Nh", "Fl", "Mc", "Lv"
    // };
    // String[] metaisRedutivos = {
    // "Li", "Na", "K", "Rb", "Cs", "Fr",
    // "Be", "Mg", "Ca", "Sr", "Ba", "Ra",
    // "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn",
    // "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd",
    // "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg",
    // "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn",
    // "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm",
    // "Yb", "Lu",
    // "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md",
    // "No", "Lr",
    // "Al", "Ga", "In", "Sn", "Tl", "Pb", "Bi", "Po", "Nh", "Fl", "Mc", "Lv"
    // };
    // String[] metais = {"Zn","Zn2+","Cu", "Cu2+"};

    String expecie1 = null;
    String expecie2 = null;

    while (true) {
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
          System.out.println("TOMANOCU");
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
      return false;
    } else if (metal1.contains("(s)") && metal2.contains("(s)")) {
      System.out.println("2 metais ja reduzidas");
      return false;
    } else if (metal1.contains("+") && metal2.contains("+")) {
      System.out.println("2 especies ja oxidadas");
      return false;
    } else if (extrairMetal(metal1).equals(extrairMetal(metal2))) {
      System.out.println("não pode os mesmos metais");
      return false;
    }
    return true;
  }

}
