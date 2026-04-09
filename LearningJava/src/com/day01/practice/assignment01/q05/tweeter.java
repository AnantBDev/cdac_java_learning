package com.day01.practice.assignment01.q05;

import java.util.Set;

public class tweeter {
    String subject;
    int yearofpost;
    int noofviews;
    Set<String> hastags;

    public tweeter(String subject, int yearofpost, int noofviews, Set<String> hastags) {
        this.subject = subject;
        this.yearofpost = yearofpost;
        this.noofviews = noofviews;
        this.hastags = hastags;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearofpost() {
        return yearofpost;
    }

    public void setYearofpost(int yearofpost) {
        this.yearofpost = yearofpost;
    }

    public int getNoofviews() {
        return noofviews;
    }

    public void setNoofviews(int noofviews) {
        this.noofviews = noofviews;
    }

    public Set<String> getHastags() {
        return hastags;
    }

    public void setHastags(Set<String> hastags) {
        this.hastags = hastags;
    }

    @Override
    public String toString() {
        return "tweeter{" +
                "subject='" + subject + '\'' +
                ", dateofpost='" + yearofpost + '\'' +
                ", noofviews=" + noofviews +
                ", hastags=" + hastags +
                '}';
    }
}
