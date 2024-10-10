package logico;

public class PrintManager {
    public static void main(String[] args) {
        PrintService printService = new PrintService();

        printService.submitJob("User1", "H");  
        printService.submitJob("User2", "M");  
        printService.submitJob("User3", "L");   
        printService.submitJob("User4", "H");   
 
        System.out.println("\nprocesando...");
        printService.procesarJobs();
    }
}

