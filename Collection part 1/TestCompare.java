import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Movies implements Comparable<Movies>{
    private double rating;
    private String name;
    private int year;
    
    public Movies( String name, double rating, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }
    
    @Override
    public int compareTo(Movies o) {
        return this.year - o.year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}


class RatingCompare implements Comparator<Movies>{

    @Override
    public int compare(Movies o1, Movies o2) {
        if(o1.getRating() > o2.getRating())
            return 1;
        
        if(o1.getRating() < o2.getRating())
            return -1;

       return 0;
    }
    
}

class NameCompare implements Comparator<Movies>{

    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

public class TestCompare {
    public static void main(String[] args) {
        ArrayList<Movies> list = new ArrayList<Movies>();
        list.add(new Movies("Force Awakens", 8.3, 2015));
        list.add(new Movies("Star Wars", 8.7, 1977));
        list.add(new Movies("Empire Strikes Back", 8.8, 1980));
        list.add(new Movies("Return of the Jedi", 8.4, 1983));
        
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movies movie: list){
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }

        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movies movie: list){
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }

        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movies movie : list)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName() + " ");
        


    
    
     }
}
