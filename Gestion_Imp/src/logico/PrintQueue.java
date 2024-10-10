package logico;


import java.awt.PrintJob;
import java.util.PriorityQueue;

public class PrintQueue {
    private PriorityQueue<PrintJob> queue;

    public PrintQueue() {
        queue = new PriorityQueue<>();
    }

    public void addJob(PrintJob job) {
        queue.add(job);
    }

    public PrintJob processNextJob() {
        return queue.poll();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}