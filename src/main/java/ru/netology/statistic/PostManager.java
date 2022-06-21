package ru.netology.statistic;

public class PostManager {
    private int resultLength = 10;
    private Movie[] post = new Movie[0];

    public PostManager() {
    }

    public PostManager(int amount) {
        resultLength = amount;
    }

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
        if (post.length < resultLength) {
            resultLength = post.length;
        }
        Movie[] postNew = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int lokalLenght = post.length - i - 1;
            postNew[i] = post[lokalLenght];
        }
        return postNew;
    }

}