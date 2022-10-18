package ru.netology.FilmManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void findAll(){
        FilmManager manager = new FilmManager();

        manager.addTitle("film1");
        manager.addTitle("film2");
        manager.addTitle("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast(){
        FilmManager manager = new FilmManager();

        manager.addTitle("film1");
        manager.addTitle("film2");
        manager.addTitle("film3");
        manager.addTitle("film4");
        manager.addTitle("film5");
        manager.addTitle("film6");
        manager.addTitle("film7");
        manager.addTitle("film8");
        manager.addTitle("film9");
        manager.addTitle("film10");
        manager.addTitle("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllNull(){
        FilmManager manager = new FilmManager();

        manager.addTitle(null);
        manager.addTitle(null);
        manager.addTitle(null);
        manager.addTitle(null);


        String[] expected = {null, null, null, null};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllZero(){
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
