package com.day5.assignment;

import java.util.Comparator;

public class RatingComparator implements Comparator<Songs> {

    @Override
    public int compare(Songs o1, Songs o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}
