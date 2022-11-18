import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Cadastro aluno = new Cadastro();
        Aluno infoAluno = null;
        String matricula, nomeAluno;
        int menu, qtdFaltas = 0;
        double mediaAluno;

        do {
            menu();
            menu = in.nextInt();
            switch (menu) {
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("Tente um valor inteiro entre 0 e 7");
                case 0:
                    System.out.println("Bye Bye");
                    break;
                case 1:
                    System.out.println("Insira o nome do aluno: ");
                    nomeAluno = in.nextLine();
                    System.out.println("Insira a mátricula do aluno: ");
                    matricula = in.nextLine();
                    System.out.println("Insira a média do aluno: ");
                    mediaAluno = in.nextDouble();
                    infoAluno = new Aluno(matricula, nomeAluno, mediaAluno, qtdFaltas);
                    aluno.CadastrarAluno(infoAluno);
                    break;
                case 2:
                    aluno.ListaCadastro();
                    break;
                case 3:
                    System.out.println("Insira a mátricula do aluno: ");
                    matricula = in.nextLine();
                    aluno.buscarAluno(infoAluno);
                    break;
                case 4:
                    System.out.println("Insira a mátricula do aluno: ");
                    matricula = in.nextLine();
                    aluno.alterarMedia(infoAluno);
                    break;
                case 5:
                    System.out.println("Insira a mátricula do aluno: ");
                    matricula = in.nextLine();
                    aluno.alteraQuantidadeFaltas(infoAluno);
                    break;
                case 6:
                    System.out.println("Insira a mátricula do aluno: ");
                    matricula = in.nextLine();
                    aluno.dadosAluno(infoAluno);
                    break;
                case 7:
                    System.out.println("Informe a mátricula do aluno: ");
                    matricula = in.nextLine();
                    aluno.removerAluno(infoAluno);
                    break;
            }

        } while (menu != 0);
        in.close();
    }
    public static void menu() {
        System.out.println("Menu de opções");
        System.out.println("");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Lista de todos alunos");
        System.out.println("3 - Buscar aluno");
        System.out.println("4 - Alterar média de um aluno");
        System.out.println("5 - Alterar faltas de um alun");
        System.out.println("6 - Exibir informações do aluno");
        System.out.println("7 - Remover aluno");
        System.out.println("0 - Sair");
        System.out.println("");
    }

}
