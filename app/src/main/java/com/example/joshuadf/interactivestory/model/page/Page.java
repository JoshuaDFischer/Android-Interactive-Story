package com.example.joshuadf.interactivestory.model.page;

public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;


    public Page(int image, String text, Choice choice1, Choice choice2){
        mImageId = image;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int image, String text){
        mImageId = image;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }


    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public boolean isFinal() {

        return mIsFinal;
    }


    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public int getImageId() {

        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }
}
