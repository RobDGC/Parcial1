public class Main {
    public static void main(String[] args) {

        PrintService servicio = new PrintService();

        PrintJob job1 = new PrintJob("Juan", 5, 'M');
        PrintJob job2 = new PrintJob("Ana", 2, 'H');
        PrintJob job3 = new PrintJob("Luis", 10, 'L');
        PrintJob job4 = new PrintJob("Carlos", 3, 'H');
        PrintJob job5 = new PrintJob("Maria", 4, 'M');

        servicio.addJob(job1);
        servicio.addJob(job2);
        servicio.addJob(job3);
        servicio.addJob(job4);
        servicio.addJob(job5);

        servicio.processAll();
    }
}
