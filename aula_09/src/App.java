public class App {
    public static void main(String[] args) throws Exception {
        Arvore<String> a = new Arvore<String>("José");

        No<String> n1 = new No<String>("Fernando");
        No<String> n2 = new No<String>("Maria");

        a.getRaiz().addFilhos(n1);
        a.getRaiz().addFilhos(n2);

        No<String> n3 = new No<String>("Enzo");
        No<String> n4 = new No<String>("Leticia");
        No<String> n5 = new No<String>("Paloma");

        No<String> n6 = new No<String>("Erick");
        No<String> n7 = new No<String>("Fernanda");

        n1.addFilhos(n3);
        n1.addFilhos(n4);
        n1.addFilhos(n5);

        n2.addFilhos(n6);
        n2.addFilhos(n7);

        System.out.println("Pré-Ordem: ");
        a.preOrdem();

        System.out.println("Pós-Ordem: ");
        a.posOrdem();
    }
}
