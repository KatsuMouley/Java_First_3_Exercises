public class Ex1 {
    void PrintEx1(){
        int matricula = 1;
        String name = "Katsu Mouley";
        double nota1 = 9.5;
        double nota2 = 9.5;
        double notaFinal = (nota1 + nota2) / 2;
        System.out.printf("Matricula: %05d\n", matricula);
        System.out.printf("Nome: %s\n", name);
        if (notaFinal > 6) {
            System.err.println("Aprovado: (x) sim ( ) não");
        } else {
            System.err.println("Aprovado: ( ) sim (X) não");    
        }
        System.err.printf("Nota final: %.2f\n", notaFinal);
    }
}
