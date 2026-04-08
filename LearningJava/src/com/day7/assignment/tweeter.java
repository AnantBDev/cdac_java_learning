package com.day7.assignment;

import com.day7.module.Employee;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tweeter implements Comparable<tweeter> {
    String subject;
    int yearofpost;
    int noofviews;
    Set<String> hashtags;

    public tweeter(String subject, int yearofpost, int noofviews, Set<String> hashtags) {
        this.subject = subject;
        this.yearofpost = yearofpost;
        this.noofviews = noofviews;
        this.hashtags = hashtags;
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

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }


    @Override
    public String toString() {
        return "tweeter{" +
                "subject='" + subject + '\'' +
                ", yearofpost=" + yearofpost +
                ", noofviews=" + noofviews +
                ", hashtags=" + hashtags +
                '}';
    }




    @Override
    public int compareTo(tweeter o) {
        return CharSequence.compare(this.getSubject(),o.getSubject());
    }


}
