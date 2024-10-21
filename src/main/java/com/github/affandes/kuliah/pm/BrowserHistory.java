package com.github.affandes.kuliah.pm;

import java.util.ArrayList;

public class BrowserHistory {
    private final ArrayList<String> history;
    private int currentIndex;

    public BrowserHistory() {
        history = new ArrayList<>();
        currentIndex = -1;
    }

    public void view() {
        if (history.isEmpty()) {
            System.out.println("History kosong.");
        } else {
            System.out.println("History browser:");
            for (int i = currentIndex; i >= 0; i--) {
                System.out.println((currentIndex - i + 1) + ". " + history.get(i));
            }
        }
    }

    public void browse(String url) {
        currentIndex++;
        if (currentIndex < history.size()) {
            history.subList(currentIndex, history.size()).clear();
        }
        history.add(url);
        System.out.println("Membuka website: " + url);
    }

    public void back() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Kembali ke website: " + history.get(currentIndex));
        } else {
            System.out.println("Tidak dapat kembali. Sudah di awal history.");
        }
    }
}