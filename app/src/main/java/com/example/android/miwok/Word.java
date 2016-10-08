package com.example.android.miwok;

/**
 * Created by zakaria_afir on 20/09/2016.
 */
public class Word {

    private String mDefaultWord, mTranslationWord;
    private int mRessourceIdImageWord = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public int getmRessourceIdImageWord() {
        return mRessourceIdImageWord;
    }

    public void setmRessourceIdImageWord(int mRessourceIdImageWord) {
        this.mRessourceIdImageWord = mRessourceIdImageWord;
    }

    public Word(String defaultw, String translationw, int audioResourceId)
    {
        this.mDefaultWord =defaultw;
        this.mTranslationWord =translationw;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultw, String translationw,int resourceIdImagew,int audioResourceId)
    {
        this(defaultw,translationw, R.raw.phrase_where_are_you_going);
        this.mRessourceIdImageWord =resourceIdImagew;
        this.mAudioResourceId = audioResourceId;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public void setmDefaultWord(String mDefaultWord) {
        this.mDefaultWord = mDefaultWord;
    }

    public String getmTranslationWord() {
        return mTranslationWord;
    }

    public void setmTranslationWord(String mTranslationWord) {
        this.mTranslationWord = mTranslationWord;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultWord='" + mDefaultWord + '\'' +
                ", mTranslationWord='" + mTranslationWord + '\'' +
                ", mRessourceIdImageWord=" + mRessourceIdImageWord +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /**
     * @return whether or not there is an image for this word
     */

    public boolean hasImage()
    {
        return (mRessourceIdImageWord!=NO_IMAGE_PROVIDED);
    }
}
