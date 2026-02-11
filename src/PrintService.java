public class PrintService {
    private PrintQueue aux;

    public PrintService(){
        aux = new PrintQueue();
    }

    public boolean addJob(PrintJob job){
        aux.addImpresion(job);
        return true;
    }

    public void processNext(){
        PrintJob job = aux.pedidoActual();
        if(job != null){
            System.out.println("Imprimiendo: "+ job.getUser()+"("+job.getPages()+" paginas, prioridad: "+job.getPriority()+")");
        }else{
            System.out.println("Sin pedidos pendientes");
        }
    }

    public void processAll() {
        while (!aux.isEmpty()) {
            processNext();
        }
        System.out.println("Se han procesado todos los pedidos");
    }





}
