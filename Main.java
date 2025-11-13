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
        boolean stop = false;
        String op1 = null;
        String op2 = null;
        while (!stop) {
            op1 = LER.next();
            op2 = LER.next();

          if (op1.equals(op2)) {
            System.out.println("n pod ser igual");
          }else if ( (op1.contains("+") && op2.contains("+")) ) {
            System.out.println("n sei1");
          }else if(op1.contains("s") && op2.contains("s")){
            System.out.println("n seiiiiiiimmm");
          }else{
            stop = true;
          }
        }

        if (op1.contains("+")) {
            System.out.println("a especie que reduz é: " + op1);
            System.out.println("a especie que oxida é: " + op2);
        } else {
            System.out.println("a especie que reduz é: " + op2);
            System.out.println("a especie que oxida é: " + op1);
        }

    }
}
