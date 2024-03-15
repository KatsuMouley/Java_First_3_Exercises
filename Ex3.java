import java.util.Scanner;
public class Ex3 {
    //Setting up the variables that we're going to use.
        Scanner input = new Scanner(System.in);
        int[][] matricula = new int[5][1];
        String[][] name =new String[5][1];
        Double[][] nota = new Double[5][5];
    //Input Method(It must be the first method to be executed)
    void Input(){
        System.out.println("Ola, agora nós vamos realizar o cadastro de 5 notas de alunos(as)");
        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------\n\n");
            System.out.printf("%d\n", i);
            System.out.printf("Insira a matricula do Aluno(a): ");
            matricula[i][0] = input.nextInt();
            input.nextLine();
            System.out.printf("Insira o Nome do Aluno(a): ");
            name[i][0] = input.nextLine();
            for (int j = 0; j < 5; j++) {
                do
                {
                    System.out.printf("Insira a %d ° nota do Aluno(a): ", (j+1));

                    nota[i][j] = input.nextDouble();//There's an bug when I input 1.6
                    //For some reason my Doubles are being reading as Integers
                    input.nextLine();//this line only clears the input

                    if(nota[i][j] > 10){
                        System.out.println("!!!||PLEASE INSERT AN NUMBER EQUALS OR UNDER 10||!!!");
                    }
                }
                    while (nota[i][j] > 10);
                }
            }
        }
    
    //Print Method
    void Print(){for (int i = 0; i < 5; i++) {
        System.out.println("--------------------------\n\n");
        System.out.printf("%d\n", i);
        System.out.printf("Aluno(a) de matricula %05d\n", matricula[i][0]);
        System.out.printf("Aluno(a) de matricula %s\n", name[i][0]);
        for (int j = 0; j < matricula.length; j++) {
            System.out.printf("Esta é a %d° nota do Aluno(a): %.2f\n", (j+1), nota[i][j]);
        }
    }
    }
    
}

