package vn.t3h.xemanh;

/**
 * Created by PC14-04 on 10/12/2017.
 */

public class Photo {
    int image;
    String text;


    public Photo(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
