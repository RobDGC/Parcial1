public class PrintQueue {
    private MiLista high;
    private MiLista medium;
    private MiLista low;

    public PrintQueue(){
        high = new MiLista();
        medium = new MiLista();
        low = new MiLista();
    }

    public void addImpresion(PrintJob aux){
        switch (aux.getPriority()){
            case 'H':
                high.insertCola(aux);
                break;
            case 'L':
                low.insertCola(aux);
                break;
            default:
                medium.insertCola(aux);
        }
    }

    public PrintJob pedidoActual(){
        if(!high.isEmpty()) return high.getHead();
        if(!medium.isEmpty()) return medium.getHead();
        if(!low.isEmpty()) return low.getHead();
        return null;
    }

    public boolean isEmpty() {
        return high.isEmpty() && medium.isEmpty() && low.isEmpty();
    }

}
