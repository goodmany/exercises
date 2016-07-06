import model.Interval;

import java.util.ArrayList;

/**
 * Created by Yael on 7/4/16.
 */
public class MergingIntervals {

    public static ArrayList<Interval> mergeArraysInterval(ArrayList<Interval> a, ArrayList<Interval> b) {
        ArrayList<Interval> result = new ArrayList<Interval>();

        int i=0,j=0;
        Integer minValue = null;
        Integer maxValue = null;
        Interval aInterval;
        Interval bInterval;

        while (i < a.size() && j < b.size()) {
            aInterval = a.get(i);
            bInterval = b.get(j);

            if(minValue == null) {
                minValue = Math.min(aInterval.getMin(), bInterval.getMin());
            }

            if(aInterval.getMax() < bInterval.getMin()) {
                maxValue = aInterval.getMax();
                result.add(new Interval(minValue, maxValue));
                minValue = null;
                maxValue = null;
                i++;
            } else if(bInterval.getMax() < aInterval.getMin()) {
                maxValue = bInterval.getMax();
                result.add(new Interval(minValue, maxValue));
                minValue = null;
                maxValue = null;
                j++;
            }
            else if(aInterval.getMax() < bInterval.getMax()) {
                i++;
            } else if(bInterval.getMax() < aInterval.getMax()) {
                j++;
            } else {
                System.out.println("No good");
            }

        }

        while(i < a.size()) {
            System.out.println("Adding remaining elements from a array.");
            if(minValue != null && maxValue == null) { //There was no closing - one interval
                maxValue = a.get(i).getMax();
                result.add(new Interval(minValue, maxValue));
            } else {
                result.add(a.get(i));
            }
            i++;
        }

        while(j < b.size()) {
            System.out.println("Adding remaining elements from b array.");
            if(minValue != null && maxValue == null) { //There was no closing - one interval
                maxValue = b.get(j).getMax();
                result.add(new Interval(minValue, maxValue));
            } else {
                result.add(b.get(j));
            }
            j++;
        }

        return result;
    }

}
