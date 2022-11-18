public class Aluno implements Comparable<Aluno> {
    private String nomeAluno;
    private String matricula;
    private double mediaAluno;
    private int faltasAluno;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String matricula, String nome, double mediaAluno, int faltasAluno) {
        this.matricula = matricula;
        this.nomeAluno = nome;
        this.mediaAluno = mediaAluno;
        this.faltasAluno = faltasAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nomeAluno;
    }

    public double getMedia() {
        return mediaAluno;
    }

    public int getFaltas() {
        return faltasAluno;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setMedia(double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public void setFaltas(int faltasAluno) {
        this.faltasAluno = faltasAluno;
    }

    @Override
    public int compareTo(Aluno aluno) {
        int compara;
        compara = this.getMatricula().compareTo(aluno.getMatricula());
        return compara;
    }

    @Override
    public String toString() {
        return " Matricula: " + this.matricula + "/n Nome: " + this.nomeAluno + "/n Media Final: " + this.mediaAluno + "/n Faltas totais: " + this.faltasAluno;
    }
}
