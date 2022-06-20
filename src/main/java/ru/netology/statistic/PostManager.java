package ru.netology.statistic;

public class PostManager {
    private Movie[] post = new Movie[0];

    public void addMovie(Movie movie) {
        Movie[] postNew = new Movie[post.length + 1];
        for (int i = 0; i < post.length; i++) {
            postNew[i] = post[i];
        }
        postNew[postNew.length - 1] = movie;
        post = postNew;
    }

    public Movie[] findAll() {
        return post;
    }

    public Movie[] findLast() {
        int resultLength;
        if (post.length > 10) {
            resultLength = 10;
        } else {
            resultLength = post.length;
        }
        Movie[] postNew = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            postNew[i] = post[post.length - i - 1];
        }
        return postNew;
    }

    public Movie[] findLast(int amount) {
        int resultLength;
        if (post.length > amount) {
            resultLength = amount;
        } else {
            resultLength = post.length;
        }
        Movie[] postNew = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            postNew[i] = post[post.length - i - 1];
        }
        return postNew;
    }

}