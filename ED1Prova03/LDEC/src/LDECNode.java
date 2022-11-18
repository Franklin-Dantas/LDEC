public class LDECNode<T extends Comparable<T>> {
    private LDECNode<T> anterior;
    private LDECNode<T> proximo;
    private T info;

    public LDECNode(T info) {
        this.info = info;
    }

    public void setAnterior(LDECNode<T> anterior) {
        this.anterior = anterior;
    }

    public void setProximo(LDECNode<T> proximo) {
        this.proximo = proximo;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public LDECNode<T> getAnt() {
        return this.anterior;
    }

    public LDECNode<T> getProx() {
        return this.proximo;
    }

    public T getInfo() {
        return this.info;
    }
}