public class LDECircular<T extends Comparable<T>> {
    private LDECNode<T> primeiro;
    private LDECNode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0)
            return true;
        else
            return false;
    }

    public void exibirAluno() {
        LDECNode<T> aux = this.primeiro;
        int contAluno = 0;
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else {
            while (aux != null) {
                contAluno++;
                System.out.println("Aluno: " + contAluno);
                System.out.println(aux.getInfo() + "");
                aux = aux.getProx();
            }
            System.out.println("");
        }
    }

    public LDECNode<T> buscarAluno(T info) {
        LDECNode<T> aux = this.primeiro;
        if (this.isEmpty() == true)
            return null;
        else if (info.compareTo(this.ultimo.getInfo()) > 0)
            return null;
        else {
            while (aux != null) {
                if (aux.getInfo().compareTo(info) == 0)
                    return aux;
                else if (info.compareTo(aux.getInfo()) > 0)
                    aux = aux.getProx();
                else
                    return null;
            }
        }
        return aux;
    }

    public void inserirNovoAluno(T info) {
        LDECNode<T> novo = new LDECNode(info);
        LDECNode<T> anterior;
        LDECNode<T> aux = this.primeiro.getProx();
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (info.compareTo(this.primeiro.getInfo()) < 0) {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (info.compareTo(this.primeiro.getInfo()) == 0)
            System.out.println("Aluno ja cadastrado tente novamente.");
        else if (info.compareTo(this.ultimo.getInfo()) > 0) {
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else if (info.compareTo(this.ultimo.getInfo()) == 0)
            System.out.println("Aluno ja cadastrado tente novamente.");
        else {
            while (true) {
                if (info.compareTo(aux.getInfo()) == 0)
                    System.out.println("Aluno ja cadastrado tente novamente.");
                else if (info.compareTo(aux.getInfo()) < 0) {
                    anterior = aux.getAnt();
                    anterior.setProximo(novo);
                    aux.setAnterior(novo);
                    novo.setProximo(aux);
                    novo.setAnterior(anterior);
                    this.qtd++;
                    break;
                } else
                    aux = aux.getProx();
            }
        }
    }

    public void removerAluno(T info) {
        LDECNode<T> remover = this.buscarAluno(info);
        LDECNode<T> proximo;
        LDECNode<T> anterior;
        if (remover == null)
            System.out.println("Aluno não cadastrado tente novamente.");
        else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else if (remover == this.primeiro) {
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnterior(null);
            this.qtd--;
        } else if (remover == this.ultimo) {
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.getProx();
            this.qtd--;
        } else {
            anterior = remover.getAnt();
            proximo = remover.getProx();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            this.qtd--;
        }
    }
}
