import java.util.Scanner;
public class Ex2 {
    //Setting up the variables that we're going to use.
        Scanner input = new Scanner(System.in);
        int[] matricula = {1, 2, 3, 4, 5};
        String[] name =new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] notaFinal = new double[5];
    //Input Method(It must be the first method to be executed)
    void Input(){
        System.out.println("Ola, agora nós iremos coletar as seguintes informações de 5 estudantes");
        for (int i = 0; i < matricula.length; i++) {
            System.out.println("--------------------------\n\n");
            System.out.printf("%d\n", i);
            System.out.printf("Aluno de matricula numero: %d\n", matricula[i]);
            System.out.printf("Insira o Nome do Aluno: ");
            name[i] = input.nextLine();
            System.out.printf("Insira a Nota1 do Aluno: ");
            nota1[i] = input.nextDouble();
            System.out.printf("Insira a Nota2 do Aluno: ");
            nota2[i] = input.nextDouble();
            input.nextLine();
            notaFinal[i] = (nota1[i] + nota2[i])/2;
        }
    }
    //Print Method
    void Print(){
        for (int i = 0; i < matricula.length; i++) {
            System.out.println("--------------------------\n\n");
        System.out.printf("Matricula: %05d\n", matricula[i]);
        System.out.printf("Nome: %s\n", name[i]);
        if (notaFinal[i] > 6) {
            System.err.println("Aprovado: (x) sim ( ) não");
        } else {
            System.err.println("Aprovado: ( ) sim (X) não");    
        }
        System.err.printf("Nota final: %.2f\n", notaFinal[i]);
        }
    }
    
}