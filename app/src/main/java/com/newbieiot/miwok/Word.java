package com.newbieiot.miwok;

public class Word {

    private String defaultWord;
    private String miwokWord;

    public Word(String defaultWord, String miwokWord){
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
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



}
