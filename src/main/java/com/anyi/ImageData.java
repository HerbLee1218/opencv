package com.anyi;

public class ImageData {

    private int width;//宽度
    private int height;//高度

    public ImageData() {
    }

    public ImageData(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ImageData{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
