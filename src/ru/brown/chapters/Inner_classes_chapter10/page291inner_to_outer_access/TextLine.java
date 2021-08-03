package ru.brown.chapters.Inner_classes_chapter10.page291inner_to_outer_access;

public class TextLine {
    private String text;

    public TextLine(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextLine{" +
                "text='" + text + '\'' +
                '}';
    }
}
