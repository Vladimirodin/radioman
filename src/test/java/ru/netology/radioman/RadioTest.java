package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void increaseRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(7);
        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(7);

        int expected = 7;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() { //
        Radio radio = new Radio();

        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}