package com.newbieiot.miwok;

public class Word {

    private String defaultWord;
    private String miwokWord;
    private int refImage = NO_IMG;
    private static final int NO_IMG = -1;


    private int refAudio;

    public Word(String defaultWord, String miwokWord, int refImage, int refAudio){
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.refImage = refImage;
        this.refAudio = refAudio;
    }

    public Word(String defaultWord, String miwokWord, int refAudio){
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.refAudio = refAudio;
    }

    public int getRefImage() {
        return refImage;
    }

    public void setRefImage(int refImage) {
        this.refImage = refImage;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public boolean hasImage(){ return refImage != NO_IMG; }

    public int getRefAudio() {
        return refAudio;
    }

}
