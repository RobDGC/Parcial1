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

        servicio.processNext();

        //servicio.processAll();
    }

    /*Parte Teorica del parcial
    * 1.A: Suponiendo que A tiene tiene referencia del inicio y del final, si se agrefa al final seria constante
    * O(1), Ω(1) y Θ(1)
    * 1.B: Aun teniendo referencia del inicio y el final de la lista, como la lista debe estar ordenada segun el orden de llegada y
    * la priporidad, no seria constante como la opcion A, seria O(n) y Ω(1). No sabria decir con exactitud la otra complejidad
    *
    * 2.A: Al igaul que antes, se reduce a  O(1), Ω(1) y Θ(1)
    * 2.B: Como solo se modifica la cabeza, seria O(1), Ω(1) y Θ(1)
    *
    *
    *
    *
    *
    *
    *
    *
    * */
}
