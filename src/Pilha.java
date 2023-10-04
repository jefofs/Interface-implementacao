import java.util.ArrayList;

public class Pilha implements Stack{
    String stackToString = "";
    int tamanho;
    public Pilha(int tamanho){
        this.tamanho = tamanho;
    }

    ArrayList<String> pilha = new ArrayList<>(tamanho);

    @Override
    public void push(String item){
        if(pilha.size() <= tamanho){
            pilha.add(item);
        }
    }

    @Override
    public String pop(){
        return pilha.remove(pilha.size()-1);
    }

    @Override
    public String peek(){
        return pilha.get(pilha.size()-1);
    }

    @Override
    public boolean isEmpty(){
        return pilha.size() == 0;
    }

    @Override
    public boolean isFull(){
        return pilha.size() == tamanho;
    }

    @Override
    public String toString(){
        for(int i = 0; i <= pilha.size(); i++){
            stackToString += pilha.get(i);
        }
        return stackToString;
    }
}
