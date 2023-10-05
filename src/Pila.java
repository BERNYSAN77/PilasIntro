import java.util.Stack;

public class Pila {
    private Stack<Character> pila;

    public Pila(){
        pila = new Stack<Character>();
    }

    public boolean estaVacia(){
        return pila.empty();
    }

    public Character top(){
        return pila.peek();
    }

    public Character pop(){
        return pila.pop();
    }
    public void push(Character elemento){
        pila.push(elemento);
    }

    public int buscar(Character elemento){
        return pila.search(elemento);
    }

    public int tamanio(){
        return pila.size();
    }

    @Override
    public String toString() {
        String resultado= "==Pila==\n" ;
        for(int i=pila.size()-1;i>=0;i--){
            resultado+=pila.get(i)+"\n";
        }
        return resultado;
    }
}
