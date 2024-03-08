import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner InputReader = new Scanner(System.in);
        System.out.printf("Aluno(Matricula|Nome|nota1|nota2): 0001, Vitor, ?, ?\n");
        System.out.printf("Aluno(Matricula|Nome|nota1|nota2): 0002, Elisabeth, ?, ?\n");
        System.out.printf("Aluno(Matricula|Nome|nota1|nota2): 0003, Luiz, ?, ?\n");
        System.out.printf("Por favor insira a matricula de um aluno: ");
        var Matricula = InputReader.nextInt();
        String Alunonome = "";
        switch (Matricula) {
            case 1:
                Alunonome = "Vitor";
                break;
            case 2:
                Alunonome = "Elisabeth";
                break;
            case 3:
                Alunonome = "Luiz";
                break;

            default:
                System.out.printf("Please Inset an actual student...\n");
                break;
        }
        System.out.println("Bem vindo(a) ao cadastro de " + Alunonome);
        System.out.printf("Por favor insira a nota1 do aluno(a): ");
        var Nota1 = InputReader.nextFloat();
        System.out.printf("Por favor insira a nota2 do aluno(a): ");
        var Nota2 = InputReader.nextFloat();
        var Media = (Nota2 + Nota1) / 2;
        System.out.printf("Matricula =" + Matricula + "\nNome =" + Alunonome + "\nNota1 =" + Nota1 + "\nNota2 =" + Nota2
                + "\nMedia total =" + Media);
        // Boolean aprovado;
        // If (Media >= 6){
        // aprovado = true;
        // } else {
        // aprovado = false;
        // }
        // System.out.println("\n Aprovado =" + aprovado);
        // ^^^^ Mais simples e rápido
        String aprovado, reprovado;
        if (Media >= 6) {
            aprovado = "X";
        } else {
            aprovado = " ";
        }
        if (Media < 6) {
            reprovado = "X";
        } else {
            reprovado = " ";
        }
        System.out.println("\nAprovado: Sim(" + aprovado + ") Não(" + reprovado + ")");
    }
}
