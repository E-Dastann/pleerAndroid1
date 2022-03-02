package com.example.pleerandroid1;

public class ModelForPlear {
    private String personName;
    private String musicName;
    private int numberMusic;
    private String timeMusic;

    public ModelForPlear(String personName, String musicName, int numberMusic, String timeMusic) {
        this.personName = personName;
        this.musicName = musicName;
        this.numberMusic = numberMusic;
        this.timeMusic = timeMusic;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public int getNumberMusic() {
        return numberMusic;
    }

    public void setNumberMusic(int numberMusic) {
        this.numberMusic = numberMusic;
    }

    public String getTimeMusic() {
        return timeMusic;
    }

    public void setTimeMusic(String timeMusic) {
        this.timeMusic = timeMusic;
    }
}
