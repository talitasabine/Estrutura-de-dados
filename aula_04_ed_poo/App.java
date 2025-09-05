import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma(3, "3SEM_ADS");
        Scanner sc = new Scanner(System.in);
        int opcao=0;

        do{
            try {
                System.out.println("\n[1] Inserir \n[2] Buscar \n[3] Remover \n[4] Listar \n[5] Capacidade de turma\n[0] Sair");
                System.out.print("Opcao:");
                opcao = Integer.parseInt(sc.nextLine());
                
                switch (opcao) {
                    case 1:
                        System.out.print("RA: ");
                        int ra = Integer.parseInt(sc.nextLine());

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        boolean status = turma.inserir(new Aluno
                        (ra, nome));

                        System.out.println(status ? "Inserido com Sucesso": "Falha ao Inserir");

                        break;
                    case 2:
                        System.out.print("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        Aluno a = turma.localizarRA(ra);
                        System.out.println(a!=null ? a: "Não encontrado");

                        break;
                    case 4:
                        for (Aluno al: turma.listar()){
                            System.out.println(al.getRa()+"|"+al.getNome());
                        }
                        System.out.println("Vagas livres: " +turma.capacidadeTurma());
                        break;
                    case 0:
                        System.out.println("Encerrado!");
                    default:
                    System.out.println("Opção Inválida");
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        } while (opcao != 0);
        sc.close();
        //Aluno a1 = new Aluno(1, "Francisco");
        //Aluno a2 = new Aluno(1, "Gabriel");
        //Aluno a3 = new Aluno(1, "Yago");

        //System.out.println(turma.capacidadeTurma());
        //System.out.println(turma.inserir(a1));
        //System.out.println(turma.inserir(a2));
        //System.out.println(turma.inserir(a3));
        //System.out.println(turma.inserir(a3));
        //System.out.println(turma.inserir(a3));
        //System.out.println(turma.capacidadeTurma());

    }
}