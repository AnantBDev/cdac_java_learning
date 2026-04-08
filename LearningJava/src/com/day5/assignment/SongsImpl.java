package com.day5.assignment;

import java.util.*;

public class SongsImpl {

    public static void main(String[] args){

        // Initialise data
        System.out.println("-------Initialising data----------");
        List<Songs> songlst=initializedata();
        displaylist(songlst);


        //Add data
        System.out.println("-------After adding data-------");
        adddata(songlst, new Songs(7,"Mann Bharya",Set.of("B Praak"),2020,3.5));
        displaylist(songlst);

        // Removing data
        System.out.println("");
        System.out.println("------Removing data-------");
        removedata(songlst,new Songs(3,"what makes you beautiful",Set.of("One direction"),2000,2));
        displaylist(songlst);

        // Update data
        System.out.println("");
        System.out.println("-------Updating data---------");
        updatedata(songlst, new Songs(7,"Hindustan Meri Jaan",Set.of("B Praak"),2026,3.5));
        displaylist(songlst);

        // Display Data
        System.out.println("");
        System.out.println("-----Displaying data---------");
        displaylist(songlst);


        //Sort Data
        System.out.println("");
        System.out.println("-----Sorted data---------");
        Collections.sort(songlst, new TitleComparator());
        displaylist(songlst);


        //Search by title
        System.out.println("");
        System.out.println("-----Search by Title---------");
        boolean check=searchbytitle(songlst, "Hindustan Meri Jaan");
        if(check)
            System.out.println("This song is present in list");
        else
            System.out.println("This song is not present in list");


        //ReleasedinCurrentYear
        System.out.println("");
        System.out.println("-----Released in Current Year---------");
        Songs s=releasedincurrentyear(songlst, 2026);
        if(s!=null){
            System.out.println("Song with title "+s.getTitle()+" has released in current year");
        }
        else{
            System.out.println("No song has released in current year");
        }

        //Song by Artists
        System.out.println("");
        System.out.println("-----Song by particular Artist---------");
        List<Songs> lst=byspecificartists(songlst,"Gajendra Verma");
        if(lst.isEmpty()){
            System.out.println("No song sung by this artist");
        }
        else{
            for(Songs item: lst){
                System.out.println(item);
            }
        }

        //Song Title and Release Year
        System.out.println("");
        System.out.println("-----Song Title and Release Year---------");
        songtitleandreleaseyear(songlst);

        //Song Title and Release Year
        System.out.println("");
        System.out.println("-----Song with minimum rating---------");
        Songs minrat=Collections.min(songlst, new RatingComparator());
        System.out.println(minrat);

        //Song Title and Release Year
        System.out.println("");
        System.out.println("-----Song with maximum rating---------");
        Songs maxrat=Collections.max(songlst, new RatingComparator());
        System.out.println(maxrat);
    }

    private static void songtitleandreleaseyear(List<Songs> songlst) {
        for(Songs item: songlst){
            System.out.println("Title: "+ item.getTitle() +", Release Year: "+item.getReleaseYear());
        }
    }

    private static List<Songs> byspecificartists(List<Songs> songlst, String artist) {
        List<Songs> format=new ArrayList<Songs>();
        for(Songs s: songlst){
            if(s.getArtists().contains(artist)){
                format.add(s);
            }
        }
        return format;
    }

    private static Songs releasedincurrentyear(List<Songs> songlst, int i) {
        for(Songs s: songlst){
            if(s.getReleaseYear()==i){
                return s;
            }
        }
        return null;
    }

    private static boolean  searchbytitle(List<Songs> songlst, String title) {
        for(Songs s: songlst) {
            if (s.getTitle().equals(title))
                return true;
        }
        return false;
        }


//    private static void sortbytitle(List<Songs> songlst) {
//        songlst.sort(Comparator.comparing(Songs));
//    }

    private static void removedata(List<Songs> songlst, Songs songs) {
        Iterator<Songs> it=songlst.iterator();
        while(it.hasNext()){
            Songs s=it.next();
            if(s.serialno==songs.serialno){
                it.remove();
                break;
            }
        }
    }

    private static void updatedata(List<Songs> songlst, Songs songs) {
        //        int serialno, String title, Set<String> artists, int releaseYear, double rating

        for(Songs s: songlst){
            if(s.serialno==songs.serialno){
                if(s.title!=songs.title){
                    s.title=songs.title;
                }
                if(!s.artists.contains(songs.artists)){
                    s.artists=songs.artists;
                }
                if(s.releaseYear!=songs.releaseYear){
                    s.releaseYear=songs.releaseYear;
                }
                if(s.rating!=songs.rating){
                    s.rating=songs.rating;
                }
            }
        }
    }

    private static void adddata(List<Songs> songlst, Songs songs) {
        songlst.add(songs);
    }

    private static void displaylist(List<Songs> songlst) {
        for(Songs s: songlst){
            System.out.println(s);
        }
    }


    private static List<Songs> initializedata() {
        List<Songs> songs = new ArrayList<Songs>();
//        int serialno, String title, Set<String> artists, int releaseYear, double rating

        songs.add(new Songs(2,"gymclass heros",Set.of("Gym class heros","XXX"),2024,4));
        songs.add(new Songs(1,"Gurbani",Set.of("Babaji Waheguru"),1600,5));
        songs.add(new Songs(3,"what makes you beautiful",Set.of("One direction"),2000,2));
        songs.add(new Songs(4,"paravashanadenu",Set.of("Yograj bhat"),2008,5));
        songs.add(new Songs(5,"Aam Jahe munde",Set.of("Parmish Verma"),2018,4.5));
        songs.add(new Songs(6,"Mann Mera",Set.of("Gajendra Verma"),2016,4));
        return songs;
    }
}
