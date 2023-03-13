package basic.study.chapter16;

public record PointRecord(int x, int y) {

    public PointRecord {
        if (x < 0) x = 0;
        if (y < 0) y = 0;
    }

}
