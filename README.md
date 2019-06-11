# opencv
opencv工具类




## 引入

### gradle 引入

> 1

    allprojects {
      repositories {
        ...
        maven { url 'https://www.jitpack.io' }
      }
    }
    
> 2

    dependencies {
              implementation 'com.github.HerbLee1218:opencv:1.0'
    }
  

### maven引入

> 1

    <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://www.jitpack.io</url>
      </repository>
    </repositories>

> 2

    <dependency>
	    <groupId>com.github.HerbLee1218</groupId>
	    <artifactId>opencv</artifactId>
	    <version>1.0</version>
	  </dependency>
    


##使用

#### 缩放

    OpenCvManager.zoom(String filePath, String targePath, int zoom);

    //filePath 为要缩放的图片,
    //targePath 为缩放后图片地址,
    //zoom 为图片缩放后短边的像素
 
#### 图片切图(正方形)

    OpenCvManager.thumbnail(String filePath, String targePath);

    filePath 为要缩放的图片,
    targePath 为缩放后图片地址
  

    
## 注意

>  如用win系统,请下载根目录的opencv_java340-x64.dll 放入系统相关位置
   在调用时使用System.load(path)
   示例:
   
        System.load("D:/opencv_java340-x64.dll");
        OpenCvManager.thumbnail("D:/456.jpg", "D:/789.jpg");
    
  

