package logico;


import logico.PrintJob;
import java.util.PriorityQueue;

public class PrintQueue {
    private PriorityQueue<PrintJob> queue;
/*printqueue
 * usado para hacer el queue de la prioridad de los trabajos*/
    public PrintQueue() {
        queue = new PriorityQueue<>();
    }
/*addJob
 * para agregar un trabajo al queue*/
    public void addJob(PrintJob job) {
        queue.add(job);
    }
/*processNextJob
 * para procesar el siguiente trabajo */
    public PrintJob processNextJob() {
        return queue.poll();
    }
 /*isEmpty
  * por si esta vacio el queue*/
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}