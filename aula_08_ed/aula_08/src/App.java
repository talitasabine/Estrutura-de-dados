import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
       Queue<String> veiculos = new LinkedList<>();

       //adicionando veiculos na fila
       veiculos.offer("Corsa");
       veiculos.offer("Astra");
       veiculos.offer("Uno");
       veiculos.offer("Kwid");
       veiculos.offer("Mobi");

       //visualizar o primeiro elemento da fila
       System.out.println("Primeiro da lista: " +veiculos.peek());

       //Remover o elemento da fila
       System.out.println("Veiculo foi removido:" +veiculos.poll());

       //Verificar se a fila esta vazia
       System.out.println("A fila está vazia?" +veiculos.isEmpty());

       //Verificar tamanho da fila
       System.out.println("Tamanho da fila: " +veiculos.size());

       //Percorrer uma fila
       int i=1;
       for(String veiculo: veiculos){

        System.out.println("Posição da fila: ["+i+"]: " +veiculo);
        i++;
       }
    }
}
