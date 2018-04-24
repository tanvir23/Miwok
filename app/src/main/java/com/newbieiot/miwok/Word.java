package com.newbieiot.miwok;

public class Word {

    private String defaultWord;
    private String miwokWord;
    private int refImage = NO_IMG;
    private static final int NO_IMG = -1;

    public Word(String defaultWord, String miwokWord, int refImage){
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.refImage = refImage;
    }

    public Word(String defaultWord, String miwokWord){
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
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

}
