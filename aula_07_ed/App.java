import java.util.Stack;

public class App{
    public static void main(String[] args) throws Exception {
        //Stack é a estrutura que imita o comportamento de uma pilha
        //Faz parte das categorias do TAD
        Stack<String>pilha_pratos = new Stack<>();
        //Empilhando Pratos 
        pilha_pratos.push("Prato laranja");// Base da pilha
        pilha_pratos.push("Prato azul");
        pilha_pratos.push("Prato Verde");
        pilha_pratos.push("Prato Vermelho");// Topo da pilha

        // Vizualiar elemento que está no topo da pilha(Peek)
        System.out.println("O elemento topo é"+pilha_pratos.peek());

        // Verificar se a pilha de pratos está vazia
        System.out.println("Esta Vazia: "+pilha_pratos.isEmpty());

        //Verificar o tamanho da pilha(Size)
        System.out.println("Tamanho da Pilha: "+pilha_pratos.size());

        //Removendo(Desempilhando) um elemento da pilha(Pop)
        System.out.println("Elemento removido: "+pilha_pratos.pop());

        // Convertendo a pilha para String
        System.out.println(pilha_pratos.toString());

        // Percorrer a pilha
        for(int i = pilha_pratos.size()-1; i>=0; i--){
            //Get é uma funçao utilizada para acessar o elemento da pilha através do seu index
            System.out.println("Elemento: "+pilha_pratos.get(i));
        }
// Estamos criando um objeto Caixa dentro do método PUSH
// Os valores estão sendo inseridos no construtor
        Stack<Caixa> pilha_caixas = new Stack<>();
        pilha_caixas.push(new Caixa(1,"Caixa de mouse Lenovo"));
        pilha_caixas.push(new Caixa(2,"Caixa de Mouse Dell"));
        pilha_caixas.push(new Caixa(3,"Caixa de mouse HP "));

        //Recuperar uma caixa
        System.out.println();
        // Recuperando obejeto.propriedades ou obejeto.metodos
        pilha_caixas.get(1).Exibir();
    }
}