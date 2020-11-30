package com.project1.demo.Models;
import com.sun.istack.NotNull;
import javax.persistence.*;

    @Entity
    public class Movies {
        @Id
        @GeneratedValue
        private int id;
        @NotNull
        private String movieName;
        @NotNull
        private String rating;
        @NotNull
        private String year;
        @Lob
        private String genre;

        @Override
        public String toString() {
            return "Movies{" +
                    "id=" + id +
                    ", movieName='" + movieName + '\'' +
                    ", rating='" + rating + '\'' +
                    ", year='" + year + '\'' +
                    ", Genre='" + genre + '\'' +
                    '}';
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }
    }
