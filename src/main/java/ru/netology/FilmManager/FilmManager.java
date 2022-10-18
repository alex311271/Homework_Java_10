package ru.netology.FilmManager;

public class FilmManager {

    private String[] titles = new String[0];
    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = 10;
    }


    public void addTitle(String title) {
        String[] temp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            temp[i] = titles[i];
        }
        temp[temp.length - 1] = title;
        titles = temp;
    }

    public String[] findAll() {
        return titles;
    }


    public String[] findLast() {
        int currentLength;
        if (titles.length < limit) {
            currentLength = titles.length;
        } else {
            currentLength = limit;
        }
        String[] temp = new String[currentLength];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = titles[titles.length - 1 - i];
        }
        return temp;

    }
}

