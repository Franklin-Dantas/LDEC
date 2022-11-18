import java.util.Scanner;

public class Cadastro {
    Scanner in = new Scanner(System.in);
    private LDECircular<Aluno> cadastrar;

    public Cadastro() {
        cadastrar = new LDECircular<>();
    }

    public void CadastrarAluno(Aluno aluno) {
        cadastrar.inserirNovoAluno(aluno);
    }

    public void ListaCadastro() {
        cadastrar.exibirAluno();
    }

    public void dadosAluno(Aluno aluno) {
        cadastrar.buscarAluno(aluno);
        if (cadastrar.isEmpty() == true)
            System.out.println("Aluno não cadastrado tente novamente.");
        else {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média: " + aluno.getMedia());
            System.out.println("Quantidade de faltas: " + aluno.getFaltas());
        }
    }

    public void removerAluno(Aluno aluno) {
        if (cadastrar.isEmpty() == true) 
            System.out.println("Aluno não cadastrado tente novamente.");
         else {
            System.out.println("Aluno" + aluno.getNome() + "removido do cadastro!");
            cadastrar.removerAluno(aluno);
        }
    }

    public void buscarAluno(Aluno aluno) {
        if (cadastrar.isEmpty() == true) 
        System.out.println("Aluno não cadastrado tente novamente.");
        else 
            System.out.println("Aluno: " + cadastrar.buscarAluno(aluno));
    }

    public void alterarMedia(Aluno aluno) {
        LDECNode<Aluno> info = cadastrar.buscarAluno(aluno);
        if (info == null) 
            System.out.println("Aluno não cadastrado tente novamente.");
        else {
            System.out.println("Informe a média do aluno: ");
            info.getInfo().setMedia(in.nextDouble());
        }
    }

    public void alteraQuantidadeFaltas(Aluno aluno) {
        LDECNode<Aluno> info = cadastrar.buscarAluno(aluno);
        if (info == null) 
            System.out.println("Aluno não cadastrado tente novamente.");
        else {
            System.out.println("Informe a quantidade de faltas do aluno: ");
            info.getInfo().setFaltas(in.nextInt());
        }
    }
}
