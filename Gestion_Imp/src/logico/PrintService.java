package logico;

import java.time.LocalDateTime;

import logico.PrintJob;
import logico.PrintQueue;

public class PrintService {
    private PrintQueue printQueue;

    public PrintService() {
        printQueue = new PrintQueue();
    }
/*submitJob
 * usado para insertar los datos del trabajo en el queue*/
    public void submitJob(String user, String priority) {
        LocalDateTime submissionTime = LocalDateTime.now();
        PrintJob job = new PrintJob(user, submissionTime, priority);
        printQueue.addJob(job);
        System.out.println("trabajo entregado por  " + user + " con prioridad " + priority);
    }
/*procesarJobs
 * para mostrar los trabajos*/
    public void procesarJobs() {
        while (!printQueue.isEmpty()) {
            PrintJob job = printQueue.processNextJob();
            System.out.println("Procesando trabajo para usuiario  " + job.getnomusuario() + " con prioridad " + job.getPriority());
        }
    }
}
