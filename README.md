# WaterDropCompass
An Android customer drawble
## import
### maven
``` xml
<dependency>
  <groupId>com.huangshikun.waterdropcompass</groupId>
  <artifactId>library</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```
### gradle
``` gralde
compile 'com.huangshikun.waterdropcompass:library:1.0.1'
```
## usage
### layout xml
``` xml
<ImageView
   android:id="@+id/image"
   android:layout_width="240dp"
   android:layout_height="200dp"
   android:layout_centerInParent="true" />
```
any view can be the container
### java
#### first init
``` java
int[] colors colors = new int[]{Color.RED,Color.GREEN,Color.YELLOW};//at least three colors
WaterDropCompassDrawable drawable = new WaterDropCompassDrawable(colors);
```
#### second setCurrent
``` java
drawable.setCurrentColor(0, "health");//you can use this code in onClickListener or other event
```
