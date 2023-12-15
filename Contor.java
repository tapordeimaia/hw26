public class Contor {
    private int valoare = 0;
    public synchronized void incrementeaza(){
        valoare++;
    }
    public int getValoare(){
        return valoare;
    }
}
