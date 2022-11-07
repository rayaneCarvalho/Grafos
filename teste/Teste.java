package teste;
import java.util.Scanner;
import modelo.*;

public class Teste {
    public static void main(String[] args) {
        int count = 0;
        int imprime = 0;
        Scanner entrada = new Scanner(System.in);
        Grafo grafo;
        
            System.out.println("Escolha o tipo de Matriz:");
            System.out.println("1 - Ordenada");
            System.out.println("2 - Não Ordenada");
            int escolha = entrada.nextInt();
                    System.out.println("Insira o número de vertices");
                    int v = entrada.nextInt();
                    System.out.println("Insira o número de Arestas");
                    int a = entrada.nextInt();

                    grafo = new Grafo(v);

                    System.out.println("Insira as ligações: <de> <para>");
                    while(count <= a){
                        System.out.println("<de>");
                        int de = entrada.nextInt();
                        System.out.println("<para>");
                        int para = entrada.nextInt();
                        System.out.println("<Peso>");
                        int peso = entrada.nextInt();


                        grafo.titulo(de,para,1,escolha,peso);
                        count++;
                    }
                    while(imprime != 3)
                    {
                        System.out.println("Escolha o tipo de Matriz:");
                        System.out.println("1 - Matriz adjacente");
                        System.out.println("2 - Matriz de Peso");
                        System.out.println("3 - Sair");
                        imprime = entrada.nextInt();

                        }

    }

}