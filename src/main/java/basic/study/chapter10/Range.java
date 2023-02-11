package basic.study.chapter10;

public class Range {
    private int from;
    private int to;

    Range(int from, int to) {
        setFrom(from);
        setTo(to);
    }

    public int getFrom() {
        return from;
    }
    public void setFrom(int fron) {
        this.from = fron;
        if(to < from) {
            to = from;
        }
    }
    public int getTo() {
        return to;
    }
    public void setTo(int to) {
        this.to = to;
        if(from > to) {
            to = from;
        }
    }

    public void outRange() {
        System.out.println(from + " ~ " + to);
    }
}
