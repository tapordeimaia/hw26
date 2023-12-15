import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int numarProcesoare = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numarProcesoare);
        Contor contor = new Contor();
        int numarIncrementariTotale = 100;
        for (int i = 0; i<numarIncrementariTotale; i++){
            executor.execute(() ->{
                contor.incrementeaza();
                System.out.println("Contor: " + contor.getValoare());
            });
        }
        executor.shutdown();
    }
}