//T: type
//<>Placeholder que permite definir uma tipagem
//futuramente, no momento está genérico

import java.util.ArrayList;
import java.util.List;

public class No<T> {
    private T valor;
    private List<No<T>> filho;

    public No(T valor){
        this.valor = valor;
        this.filho = new ArrayList<>();
    }

    public T getValor(){
        return valor;
    }

    public List<No<T>> getFilhos(){
        return filho;
    }

    public void addFilhos(No<T> f){
        filho.add(f);
    }
}
