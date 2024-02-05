public class Event extends Task{

    protected String from;
    protected String to;

    public Event(String description, String from, String to){
        super(description);
        this.type = "[E]";
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString(){
        return type + super.toString() + " (from: " + from + " to: " + to + ")";
    }

}