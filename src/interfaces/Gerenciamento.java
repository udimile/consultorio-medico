package interfaces;

//com metodos padroes de cadastro, alteração e exclusão de registro
public interface Gerenciamento<E> {

    public abstract void adicionar(E entidade);

    public abstract void atualizar(E entidade);

    public abstract void remover(E entidade);
}
