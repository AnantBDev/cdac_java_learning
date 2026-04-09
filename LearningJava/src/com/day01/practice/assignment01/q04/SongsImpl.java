package com.day01.practice.assignment01.q04;

import java.util.*;

public class SongsImpl {
    public static void main(String[] args){
        List<Songs> s=new ArrayList<Songs>();
        initializedata(s);

        System.out.println("========================================================");
        System.out.println("==============Adding an element============");
        System.out.println("Before Insertion: \n" +s);
        add(s,new Songs(7,"TaraRumPum",Set.of("Shaan","Kumar Da"),2010,4.5));
        System.out.println("After Insertion: \n"+s);
        System.out.println("");


        System.out.println("=========================================================");
        System.out.println("==============Removing an element============");
        System.out.println("Before Removal: \n" +s);
        remove(s,new Songs(5,"Brown Rang",Set.of("Honey Singh","Daljeet Dosanjh"),2025,4));
        System.out.println("After Removal: \n"+s);
        System.out.println("");


        System.out.println("=========================================================");
        System.out.println("==============Updating an element============");
        System.out.println("Before Update: \n" +s);
        update(s,new Songs(2,"Mann Mera",Set.of("Gajendra Verma"),2018,4.5));
        System.out.println("After Update: \n"+s);
        System.out.println("");


        System.out.println("=========================================================");
        System.out.println("Displaying List: \n"+s);
        System.out.println("");

        System.out.println("=========================================================");
        System.out.println("=============Sort by title============");
        Collections.sort(s,new TitleComparator());
        System.out.println(s);


        System.out.println("=========================================================");
        System.out.println("=============Search by title============");
        Songs st=findbyTitle(s,"EkOmkar");
        System.out.println(st);
        System.out.println("");

        System.out.println("=========================================================");
        System.out.println("=============List of Songs released in current year============");
        List<Songs> so=releasedincurrentyear(s, 2026);
        System.out.println(so);
        System.out.println("");

        System.out.println("=========================================================");
        System.out.println("=============List of Songs by specific artist============");
        List<Songs> lst=byspecificArtist(s,"Honey Singh");
        System.out.println(lst);
        System.out.println("");

        System.out.println("=========================================================");
        System.out.println("=============List to show song title and release year============");
        showtitleandreleaseyear(s);
        System.out.println("");

        System.out.println("=========================================================");
        System.out.println("=============song with lowest Rating============");
        Songs minrat=Collections.min(s, new RatingComparator());
        System.out.println(minrat);
        System.out.println("");

        System.out.println("=========================================================");
        System.out.println("=============song with highest Rating============");
        Songs maxrat=Collections.max(s, new RatingComparator());
        System.out.println(maxrat);


    }

    private static void showtitleandreleaseyear(List<Songs> s) {
        System.out.println("SongTitle : SongReleaseYear");
        for(Songs st: s){
            System.out.println(st.getTitle()+":"+st.getReleaseYear());
        }
    }

    private static List<Songs> byspecificArtist(List<Songs> s, String artist) {
        List<Songs> lst=new ArrayList<Songs>();
        for(Songs st:s){
            if(st.getArtists().contains(artist)){
                lst.add(st);
            }
        }
        return lst;
    }



    private static List<Songs> releasedincurrentyear(List<Songs> s, int i) {
        List<Songs> lst=new ArrayList<Songs>();
        for(Songs st:s){
            if(st.getReleaseYear()==i){
                lst.add(st);
            }
        }
        return lst;
    }

    private static Songs findbyTitle(List<Songs> s, String tit) {
        for(Songs st:s){
            if(st.getTitle().equals(tit)){
                return st;
            }
        }
        return null;
    }

    private static void update(List<Songs> s, Songs songs) {
        for(Songs st:s){
            if(st.getSerialno()==songs.getSerialno()){
                st.setSerialno(songs.getSerialno());
                st.setTitle(songs.getTitle());
                st.setArtists(songs.getArtists());
                st.setReleaseYear(songs.getReleaseYear());
                st.setRating(songs.getRating());
            }
        }
    }

    private static void remove(List<Songs> s, Songs songs) {
     Iterator<Songs> it=s.iterator();
     while(it.hasNext()){
         Songs so=it.next();
         if(so.getSerialno()==songs.getSerialno()){
             it.remove();
             break;
         }
     }
    }

    private static void add(List<Songs> s, Songs songs) {
        s.add(songs);
    }

    private static void initializedata(List<Songs> s) {
        s.add(new Songs(1,"EkOmkar", Set.of("GuruNanakSahib", "SacheBadsha"),1700,5));
        s.add(new Songs(2,"Mann Mera",Set.of("Gajendra Verma"),1800,4.5));
        s.add(new Songs(3,"Glassy",Set.of("Honey Singh","Gipyy Grewal"),2012,3.5));
        s.add(new Songs(4,"Jaan se guzarte hai",Set.of("Sukhvinder Singh"),2026,4.5));
        s.add(new Songs(5,"Brown Rang",Set.of("Honey Singh","Daljeet Dosanjh"), 2025,4));

    }
}
