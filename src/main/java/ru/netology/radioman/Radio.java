package ru.netology.radioman;

public class Radio {
    private int currentRadio;
    private int currentVolume;

    public void next() {
        if (currentRadio < 9) {
            currentRadio++;
        } else {
            currentRadio = 0;
        }
    }

    public void prev() {
        if (currentRadio > 0) {
            currentRadio--;
        } else {
            currentRadio = 9;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
