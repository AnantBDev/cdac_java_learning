package com.day01.practice.assignment01.q04;

import java.util.Comparator;

public class TitleComparator implements Comparator<Songs> {

    @Override
    public int compare(Songs o1, Songs o2) {
        return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
    }
}
