public class PrintJob {
    private String user;
    private int pages;
    private char priority;

    public PrintJob(String user, int pages, char priority){
        this.user = user;
        this.pages = pages;
        this.priority = priority;
    }

    public char getPriority(){
        return priority;
    }

    public String getUser(){
        return user;
    }

    public int getPages(){
        return pages;
    }

}
