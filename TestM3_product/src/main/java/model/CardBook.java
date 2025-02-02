package model;

public class CardBook {
    private int colorID;
    private String colorName;

    public CardBook() {
    }

    public CardBook(String colorName) {
        this.colorName = colorName;
    }

    public CardBook(int colorID, String colorName) {
        this.colorID = colorID;
        this.colorName = colorName;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
