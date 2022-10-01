package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void shouldToMaxRadio() { // Максимальная радиостанция
        Radio radio = new Radio();

        radio.setToMaxRadio();

        int expected = 9;
        int actual = radio.currentRadio;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingRadio() { // Переключение радио на 1
        Radio radio = new Radio();

        radio.increaseRadio();
        int expected = 1;
        int actual = radio.currentRadio;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNext() { //
        Radio radio = new Radio();

        radio.nextRadio();
        int expected = 0;
        int actual = radio.currentRadio;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadio() { // Выставление номера станции
        Radio radio = new Radio();

        radio.setCurrentRadio(7);

        int expected = 7;
        int actual = radio.currentRadio;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldToMaxVolume() { // Максимальная громкость
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void switchingVolume() { // Увеличение громкости на 1
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increasenextt() { //
        Radio radio = new Radio();

        radio.nextVolume();
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() { //
        Radio radio = new Radio();

        radio.setCurrentVolume(9);


        int expected = 9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}