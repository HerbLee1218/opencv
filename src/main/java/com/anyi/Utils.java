package com.anyi;

import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Size;

public class Utils {

    /**
     * 要缩放的图片
     * @param width 图片宽度
     * @param height 图片高度
     * @param zoom 最小边大小
     * @return
     */
    public static Size imageSize(int width, int height, int zoom){
        if (zoom<0){
            return null;
        }
        int newWidth = 0;
        int newHeight = 0;
        //如果宽大于高说明是横版的
        if (width<height){

            newWidth = zoom;
            newHeight = (int) (zoom*height)/width;
        }else {
            newHeight = zoom;
            newWidth = (int)(zoom*width)/height;
        }

        return new Size(newWidth,newHeight);
    }

    public static Size imageSize(Mat src, int zoom){
        return imageSize(src.width(),src.height(),zoom);
    }

    public static Rect imageRect(Mat src){

        int width = src.width();
        int height = src.height();
        if (width>height){
            return new Rect((int) (width/2-height/2),0,height,height);
        }else {
            return new Rect(0,(int) (height/2-width/2),width,width);
        }
    }


}
