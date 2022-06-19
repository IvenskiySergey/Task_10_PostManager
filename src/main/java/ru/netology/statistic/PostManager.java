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
    public Movie[] findLast(){
        Movie[] postNew = new Movie[10];
        for (int i = 0; i < 10; i++){
            postNew[i] = post[post.length - i - 1];
        }
        return postNew;
    }

    public Movie[] findLast(int amount){
        Movie[] postNew = new Movie[amount];
        for (int i = 0; i < amount; i++){
            postNew[i] = post[post.length - i - 1];
        }
        return postNew;
    }

}