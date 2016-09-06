package com.example.joshuadf.interactivestory.model.page;

/**
 * Created by Joshuadf on 8/9/2016.
 */
public class Choice {
    private String mText;
    private int mNextPage;


    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setNextPage(int nextPage) {
        this.mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }
}
