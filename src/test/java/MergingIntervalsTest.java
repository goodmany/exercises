import model.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertTrue;

/**
 * Created by Yael on 7/4/16.
 */
public class MergingIntervalsTest {

    @Test
    public void testMergingIntervalsEmpty(){
        ArrayList<Interval> a = new ArrayList<Interval>();
        ArrayList<Interval> b = new ArrayList<Interval>();

        ArrayList<Interval> actual = MergingIntervals.mergeArraysInterval(a, b);
        assertTrue(actual.equals(Collections.emptyList()));
    }

    @Test
    public void testMergingIntervals1(){
        ArrayList<Interval> a = new ArrayList<Interval>();
        ArrayList<Interval> b = new ArrayList<Interval>();

        a.add(new Interval(3,17));
        a.add(new Interval(18,30));
        a.add(new Interval(31,40));

        b.add(new Interval(2,9));
        b.add(new Interval(10,12));
        b.add(new Interval(13,19));
        b.add(new Interval(20,25));
        b.add(new Interval(32,33));
        b.add(new Interval(50,60));

        ArrayList<Interval> expectedResult = new ArrayList<Interval>();

        expectedResult.add(new Interval(2,30));
        expectedResult.add(new Interval(31,40));
        expectedResult.add(new Interval(50, 60));

        ArrayList<Interval> actual = MergingIntervals.mergeArraysInterval(a, b);
        assertTrue(actual.equals(expectedResult));
    }

    @Test
    public void testMergingIntervals2(){
        ArrayList<Interval> a = new ArrayList<Interval>();
        ArrayList<Interval> b = new ArrayList<Interval>();

        a.add(new Interval(1,2));
        a.add(new Interval(3,4));
        a.add(new Interval(5,6));

        b.add(new Interval(7,8));
        b.add(new Interval(9,10));

        ArrayList<Interval> expectedResult = new ArrayList<Interval>();

        expectedResult.add(new Interval(1,2));
        expectedResult.add(new Interval(3,4));
        expectedResult.add(new Interval(5,6));
        expectedResult.add(new Interval(7,8));
        expectedResult.add(new Interval(9,10));

        ArrayList<Interval> actual = MergingIntervals.mergeArraysInterval(a, b);
        assertTrue(actual.equals(expectedResult));
    }

    @Test
    public void testMergingIntervals3(){
        ArrayList<Interval> a = new ArrayList<Interval>();
        ArrayList<Interval> b = new ArrayList<Interval>();

        a.add(new Interval(1,10));
        a.add(new Interval(14,25));

        b.add(new Interval(9,15));
        b.add(new Interval(24,28));

        ArrayList<Interval> expectedResult = new ArrayList<Interval>();

        expectedResult.add(new Interval(1,28));

        ArrayList<Interval> actual = MergingIntervals.mergeArraysInterval(a, b);
        assertTrue(actual.equals(expectedResult));
    }

    @Test
    public void testMergingIntervals4(){
        ArrayList<Interval> a = new ArrayList<Interval>();
        ArrayList<Interval> b = new ArrayList<Interval>();

        a.add(new Interval(1,10));
        a.add(new Interval(24,28));

        b.add(new Interval(9,15));
        b.add(new Interval(16,25));


        ArrayList<Interval> expectedResult = new ArrayList<Interval>();

        expectedResult.add(new Interval(1,15));
        expectedResult.add(new Interval(16,28));

        ArrayList<Interval> actual = MergingIntervals.mergeArraysInterval(a, b);
        assertTrue(actual.equals(expectedResult));
    }

    @Test
    public void testMergingIntervals5(){
        ArrayList<Interval> a = new ArrayList<Interval>();
        ArrayList<Interval> b = new ArrayList<Interval>();

        a.add(new Interval(1,10));
        a.add(new Interval(24,28));
        a.add(new Interval(29,38));
        a.add(new Interval(39,42));

        b.add(new Interval(9,15));
        b.add(new Interval(16,25));


        ArrayList<Interval> expectedResult = new ArrayList<Interval>();

        expectedResult.add(new Interval(1,15));
        expectedResult.add(new Interval(16,28));
        expectedResult.add(new Interval(29,38));
        expectedResult.add(new Interval(39,42));

        ArrayList<Interval> actual = MergingIntervals.mergeArraysInterval(a, b);
        assertTrue(actual.equals(expectedResult));
    }

}
