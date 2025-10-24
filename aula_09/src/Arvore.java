public class Arvore <T> {
    private No<T> raiz;

    public Arvore(T raiz){
        this.raiz = new No<>(raiz);
    }
    
    public No<T> getRaiz(){
        return raiz;
    }


    public void pre(No<T> no){
        if (no == null) return; // com 1 linha nao precisa colocar em chaves
        System.out.println(no.getValor() + "");
        for(No<T> filho : no.getFilhos()) 
            pre (filho);
    }

    public void preOrdem(){
        pre(raiz);
    }

    public void pos(No<T> no){
        if (no == null) return; // com 1 linha nao precisa colocar em chaves
            
        for (No<T> f : no.getFilhos())
        pos(f);
        System.out.println(no.getValor() + " ");
        }

        public void posOrdem(){
            pos(raiz);
        }
    }
