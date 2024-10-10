package logico;

import java.time.LocalDateTime;

public class PrintJob implements Comparable<PrintJob> {
    private String nomusuario;
    private LocalDateTime hora;
    private String prioridad;

    public PrintJob(String nomusuario, LocalDateTime hora, String prioridad) {
        this.nomusuario = nomusuario;
        this.hora = hora;
        this.prioridad = prioridad;
    }

    public String getnomusuario() {
        return nomusuario;
    }

    public LocalDateTime gethora() {
        return hora;
    }

    public String getPriority() {
        return prioridad;
    }

    @Override
    public int compareTo(PrintJob otherJob) {
        int compareprioridad = this.getvalorprioriedad() - otherJob.getvalorprioriedad();
        if (compareprioridad == 0) {
            // si es la misma prioridad, entonces se hace por la hora
            return this.hora.compareTo(otherJob.hora);
        }
        return compareprioridad;
    }

    private int getvalorprioriedad() {
        switch (this.prioridad) {
            case "H": return 1; // alta prioridad
            case "M": return 2; // Media prioridad
            case "L": return 3; // baja prioridad
            default: return 2;  // si no tiene se va a media
        }
    }
}

