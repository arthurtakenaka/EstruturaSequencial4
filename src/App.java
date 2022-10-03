import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, soma;
        double media;
        System.out.println("Primeiro brimestre: ");
        nota1 = entrada.nextInt();
        System.out.println("Segundo brimestre: ");
        nota2 = entrada.nextInt();
        System.out.println("Terceiro brimestre: ");
        nota3 = entrada.nextInt();
        System.out.println("Quarto brimestre: ");
        nota4 = entrada.nextInt();
        
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;

        System.out.println("A media dos 4 bimestres sao: "+media);
    }
}
