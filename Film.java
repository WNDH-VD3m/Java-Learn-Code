package test15;

import java.lang.reflect.Array;
import java.util.*;

public class Film implements Comparable<Film>{

    public static final String[] RATINGS = {"U","PG","12U","15U","18U"};
    private String title;
    private Integer duration;
    private String rating;

    public Film(String title, int duration, String rating){
        if (validTitle(title)&&validDuration(duration)&&validRating(rating)){
            this.title=title;
            this.duration=duration;
            this.rating=rating;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getDuration(){
        return duration;
    }

    private boolean validTitle(String title){
        return title!=null&&title.length()>0&&Character.isUpperCase(title.charAt(0));
    }

    private boolean validDuration(int duration){
        return duration>=60;
    }

    private boolean validRating(String rating){
        for (String existingRating:RATINGS) {
            if (rating.equals(existingRating)){
                return true;
            }
        }
        return false;
    }

    //可以省略
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (duration != film.duration) return false;
        if (!title.equals(film.title)) return false;
        return rating.equals(film.rating);
    }

    @Override
    public String toString() {
        return "{"+this.title+", "+this.duration+" minutes, "+this.rating+"}";
    }

    @Override
    public int compareTo(Film o) {
        return this.duration.compareTo(o.getDuration());
    }

    public static void main(String[] args) {
        Film a = new Film("Aas",109,"U");
        Film b = new Film("Fas",110,"PG");
        Film c = new Film("BMas",111,"15U");
        Film d = new Film("Sdas", 97,"18U");
        List<Film> films = new ArrayList<>(Arrays.asList(a,c,b,d));
        System.out.println(films); //按着字母顺序列出来

        System.out.println();

        Collections.sort(films); //sort重新排序（sort方法也是根据刚才重写的一些方法完成的）
        System.out.println(films); //按着电影时间的顺序列出来
    }

}


