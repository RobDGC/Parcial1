public class MiLista {
    private Node head;
    private Node tail;

    public MiLista(){
        head = null;
        tail = null;
    }

    public boolean insertCola(PrintJob aux){
        boolean val = false;
        Node nuevo = new Node(aux);
        if(tail == null && head == null){
            head = nuevo;
            tail = nuevo;
        }else{
            tail.next = nuevo;
            tail = nuevo;
        }
        return val;
    }

    public PrintJob getHead() {
        if (head == null) return null;
        PrintJob job = head.data;
        head = head.next;

        if (head == null) tail = null;
        return job;
    }


    public boolean isEmpty(){
        return head == null;
    }
}
