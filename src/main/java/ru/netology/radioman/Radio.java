package ru.netology.radioman;

public class Radio {
    public int currentRadio;
    public int currentVolume;


    public void setToMaxRadio() { // Максимальная радиостанция
        currentRadio = 9;
    }

    public void increaseRadio() { // Переключение радиостанции на 1
        if (currentRadio < 9) {
            currentRadio = currentRadio + 1;
        }
    }

    public void nextRadio() { // Следующая после 9
        if (currentRadio > 9) {
            currentRadio = currentRadio;
        }
    }

    public void setCurrentRadio(int newCurrentRadio) { // выставление канала
        currentRadio = newCurrentRadio;
        if (newCurrentRadio > 9) {
            currentRadio = 9;
        }
    }

    public void setToMaxVolume() { // Максимальная громкость
        currentVolume = 10;
    }

    public void increaseVolume() { // Увеличение громкости
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void nextVolume() { //
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) { //
        currentVolume = newCurrentVolume;
        if (newCurrentVolume > 10) {
            currentVolume = 10;
        }
    }
}
