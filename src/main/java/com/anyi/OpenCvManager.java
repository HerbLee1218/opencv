package com.anyi;


import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class OpenCvManager {


    /***
     * 缩放图片
     * @param imagePath 要缩放图片地址
     * @param newPath 要保存图片地址
     * @param zoom 要缩放的最小边
     * @return
     */
    public static String zoom(String imagePath,String newPath,int zoom){
        //读入图片
        Mat src = Imgcodecs.imread(imagePath);
        Mat mat = new Mat();
        Imgproc.resize(src,mat,Utils.imageSize(src,zoom),0,0,Imgproc.INTER_AREA);
        Imgcodecs.imwrite(newPath,mat);
        return "完成";
    }

    /**
     * 切正方形缩略图
     * @param imagePath 要切图的图片
     * @param newPath 切图后保存的地址
     * @return
     */
    public static String thumbnail(String imagePath,String newPath){

        Mat imread = Imgcodecs.imread(imagePath);
        Mat mat = new Mat(imread, Utils.imageRect(imread));
        Mat mat1 = new Mat();
        mat.copyTo(mat1);
        Imgcodecs.imwrite(newPath,mat1);
        return "完成";
    }




    public static void main(String [] arg){
        System.load("D:/opencv_java340-x64.dll");
//        zoom("D:/123.jpg","D:/456.jpg",Const.ImageSize.ZOOM_750);
        thumbnail("D:/456.jpg","D:/789.jpg");

    }

}
