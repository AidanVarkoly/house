 
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
     private Square sky;
    private Square ground;
    private Circle moon;
    private Circle star;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Circle star8;
    private boolean drawn;
    
    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        sky = new Square();
        ground = new Square();
        moon = new Circle();
        star = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        star8 = new Circle();
        drawn = false;
    }
    public void draw()
    {
        if(!drawn) {
            sky.moveVertical(-450);
            sky.moveHorizontal(-400);
            sky.changeSize(600);
            sky.changeColor("black");
            sky.makeVisible();
            
            moon.changeColor("yellow");
            moon.moveHorizontal(100);
            moon.moveVertical(90);
            moon.changeSize(80);
            moon.makeVisible();
            
            star.changeColor("white");
            star.moveHorizontal(-200);
            star.moveVertical(40);
            star.changeSize(5);
            star.makeVisible();
            
            star2.changeColor("yellow");
            star2.moveHorizontal(100);
            star2.moveVertical(35);
            star2.changeSize(5);
            star2.makeVisible();
            
            star3.changeColor("white");
            star3.moveHorizontal(-20);
            star3.moveVertical(25);
            star3.changeSize(5);
            star3.makeVisible();
            
            star4.changeColor("yellow");
            star4.moveHorizontal(-50);
            star4.moveVertical(90);
            star4.changeSize(5);
            star4.makeVisible();
            
            star5.changeColor("yellow");
            star5.moveHorizontal(85);
            star5.moveVertical(-60);
            star5.changeSize(5);
            star5.makeVisible();
            
            star6.changeColor("white");
            star6.moveHorizontal(-90);
            star6.moveVertical(-40);
            star6.changeSize(5);
            star6.makeVisible();
            
            star7.changeColor("yellow");
            star7.moveHorizontal(200);
            star7.moveVertical(10);
            star7.changeSize(5);
            star7.makeVisible();
            
            star8.changeColor("white");
            star8.moveHorizontal(250);
            star8.moveVertical(-50);
            star8.changeSize(5);
            star8.makeVisible();
            
            ground.moveVertical(120);
            ground.moveHorizontal(-320);
            ground.changeSize(600);
            ground.changeColor("green");
            ground.makeVisible();
            drawn = true;
        }
    }
}

