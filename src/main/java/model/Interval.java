package model;

/**
 * Created by Yael on 7/4/16.
 */
public class Interval {
    private int min;
    private int max;

    public Interval(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Interval interval = (Interval) o;

        if(min != interval.min) return false;
        return max == interval.max;

    }

    @Override
    public int hashCode() {
        int result = min;
        result = 31 * result + max;
        return result;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
