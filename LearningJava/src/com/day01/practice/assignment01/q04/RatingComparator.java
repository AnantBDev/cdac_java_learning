package com.day01.practice.assignment01.q04;

import java.util.Comparator;

public class RatingComparator implements Comparator<Songs> {

    @Override
    public int compare(Songs o1, Songs o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}
