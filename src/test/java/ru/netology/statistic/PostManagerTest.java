package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostManagerTest {

    Movie movie1 = new Movie(101, "Бладшот", "Боевик");
    Movie movie2 = new Movie(102, "Вперёд", "Мультфильм");
    Movie movie3 = new Movie(103, "Отель Белград", "Комедия");
    Movie movie4 = new Movie(104, "Джентельмены", "Боевик");
    Movie movie5 = new Movie(105, "Человек-невидимка", "Ужасы");
    Movie movie6 = new Movie(106, "Тролли.Мировой тур", "Мультфильм");
    Movie movie7 = new Movie(107, "Номер один", "Комедия");
    Movie movie8 = new Movie(108, "Молодой человек", "Комедия");
    Movie movie9 = new Movie(109, "Одна", "Драмма");
    Movie movie10 = new Movie(110, "Пропавшая", "Триллер");
    Movie movie11 = new Movie(111, "Бультерьер", "Драма");
    Movie movie12 = new Movie(112, "Артек.Большое путешествие", "Комедия");
    Movie movie13 = new Movie(113, "Эскортницы", "Драма");
    Movie movie14 = new Movie(114, "Время патриотов", "Боевик");
    Movie movie15 = new Movie(115, "Асса", "Драма");
    Movie movie16 = new Movie(116, "Криминальный город 2", "Боевик");
    Movie movie17 = new Movie(117, "Бетмен", "Боевик");
    Movie movie18 = new Movie(118, "Одержимые", "Ужасы");
    Movie movie19 = new Movie(119, "Дикие истории", "Триллер");
    Movie movie20 = new Movie(120, "Кофе и сигареты", "Трагикомедия");

    @Test
    public void Movies5Test() {
        PostManager post = new PostManager();
        post.addMovie(movie1);
        post.addMovie(movie2);
        post.addMovie(movie3);
        post.addMovie(movie4);
        post.addMovie(movie5);

        Movie[] actual = post.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5};

        Movie[] actual1 = post.findLast();
        Movie[] expected1 = {movie5, movie4, movie3, movie2, movie1};

        Movie[] actual2 = post.findLast(7);
        Movie[] expected2 = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertArrayEquals(expected1, actual1);
        Assertions.assertArrayEquals(expected2, actual2);

    }

    @Test
    public void Movies10Test() {
        PostManager post = new PostManager();
        post.addMovie(movie1);
        post.addMovie(movie2);
        post.addMovie(movie3);
        post.addMovie(movie4);
        post.addMovie(movie5);
        post.addMovie(movie6);
        post.addMovie(movie7);
        post.addMovie(movie8);
        post.addMovie(movie9);
        post.addMovie(movie10);

        Movie[] actual = post.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};

        Movie[] actual1 = post.findLast();
        Movie[] expected1 = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Movie[] actual2 = post.findLast(10);
        Movie[] expected2 = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertArrayEquals(expected1, actual1);
        Assertions.assertArrayEquals(expected2, actual2);
    }

    @Test
    public void Movies20Test() {
        PostManager post = new PostManager();
        post.addMovie(movie1);
        post.addMovie(movie2);
        post.addMovie(movie3);
        post.addMovie(movie4);
        post.addMovie(movie5);
        post.addMovie(movie6);
        post.addMovie(movie7);
        post.addMovie(movie8);
        post.addMovie(movie9);
        post.addMovie(movie10);
        post.addMovie(movie11);
        post.addMovie(movie12);
        post.addMovie(movie13);
        post.addMovie(movie14);
        post.addMovie(movie15);
        post.addMovie(movie16);
        post.addMovie(movie17);
        post.addMovie(movie18);
        post.addMovie(movie19);
        post.addMovie(movie20);

        Movie[] actual = post.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14, movie15, movie16, movie17, movie18, movie19, movie20};

        Movie[] actual1 = post.findLast();
        Movie[] expected1 = {movie20, movie19, movie18, movie17, movie16, movie15, movie14, movie13, movie12, movie11};

        Movie[] actual2 = post.findLast(5);
        Movie[] expected2 = {movie20, movie19, movie18, movie17, movie16};

        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertArrayEquals(expected1, actual1);
        Assertions.assertArrayEquals(expected2, actual2);
    }

}
