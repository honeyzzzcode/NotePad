package com.ZLATA;

public class Sticker extends Record {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        var str = super.toString();
        return String.format("%s Text: %s", str, text);
    }
}