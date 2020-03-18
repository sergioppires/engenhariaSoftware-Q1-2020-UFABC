package requisitos;

public class ListaRequisitos {

    private Requisito1 requisito1;
    private Requisito2 requisito2;
    private Requisito3 requisito3;

    public ListaRequisitos(Requisito1 requisito1, Requisito2 requisito2, Requisito3 requisito3) {
        this.requisito1 = requisito1;
        this.requisito2 = requisito2;
        this.requisito3 = requisito3;
    }

    public Requisito1 getRequisito1() {
        return requisito1;
    }

    public void setRequisito1(Requisito1 requisito1) {
        this.requisito1 = requisito1;
    }

    public Requisito2 getRequisito2() {
        return requisito2;
    }

    public void setRequisito2(Requisito2 requisito2) {
        this.requisito2 = requisito2;
    }

    public Requisito3 getRequisito3() {
        return requisito3;
    }

    public void setRequisito3(Requisito3 requisito3) {
        this.requisito3 = requisito3;
    }
}
