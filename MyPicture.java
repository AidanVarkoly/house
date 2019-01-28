
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Square ground;
    private Square sky;
    private Triangle roof;
    private Triangle fin;
    private Circle sun;
    private boolean drawn;


    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        wall = new Square();
        window = new Square();
        ground = new Square();
        sky = new Square();
        roof = new Triangle();
        fin = new Triangle();
        sun = new Circle();
        drawn = false;
    }
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("red");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            ground.moveVertical(120);
            ground.moveHorizontal(-320);
            ground.changeSize(600);
            ground.changeColor("blue");
            ground.makeVisible();
            
            sky.moveVertical(-120);
            sky.moveHorizontal(220);
            sky.changeSize(600);
            sky.changeColor("magenta");
            sky.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            fin.changeSize(40,40);
            fin.moveHorizontal(200);
            fin.moveVertical(60);
            fin.changeColor("blue");
            fin.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }
}

