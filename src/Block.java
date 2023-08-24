import java.awt.Graphics;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import  java.awt.Toolkit;


public class Block extends Rectangle {//rectangle class can be used to extract all the functions of it
  Image pic;
    Block(int a,int b,int w,int h,String s){//default constructor
    x=a;
    y=b;
    width=w;
    height=h;
    pic= Toolkit.getDefaultToolkit().getImage(s);//getting the image based on the string s we r passing on
    }
  public void draw( Graphics g,Component c){
        g.drawImage(pic,x,y,width,height,c);
  }
}
