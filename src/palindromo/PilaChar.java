package palindromo;

import java.util.Stack;

public class PilaChar {
    private Stack<Character> pila;

    public PilaChar(){
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

    public int tamanio(){
        return pila.size();
    }

    @Override
    public String toString() {
        String resultado = new String();
        for(int i=pila.size()-1;i>=0;i--){
            resultado+=pila.get(i);
        }
        return resultado;
    }
}


