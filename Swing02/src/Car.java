import java.awt.*;

public class Car { //ניצור מכונית, לפני הרכיבים הבאים:
    public static final int BODY_WIDTH = 100;
    public static final int BODY_HEIGHT = 80;
    private int x;
    private int y;
    //private int bodyWidth; // הגדרנו קבוע
    //private int bodyHeight; // הגדרנו קבוע
    private boolean visible;


    public Car(int x, int y, int bodyWidth, int bodyHeight) { //בנאי
        this.x = x;
        this.y = y;
        this.visible = true;

        //this.bodyWidth = bodyWidth;
        //this.bodyHeight = bodyHeight;
    }

    public void paint(Graphics g) { //רוצים לצייר מכונית מעביר לה מהפאנל את הצייר גראפיקס
        if (this.visible){
            //BODY: Car
            g.setColor(Color.BLACK); //כדי שהצבע של כל המכוניות יהיה אחיד(הגוף של המכונית)
            g.fillRect(this.x, this.y, BODY_WIDTH, BODY_HEIGHT); //גודל המלבן

            //FRONT: Paint Car Head
            g.setColor(Color.red); //לצבוע את החזית באדום המיקום משנה, עדיף ראשון
            g.fillRect(this.x + BODY_WIDTH, this.y + BODY_HEIGHT / 2, BODY_WIDTH / 2, BODY_HEIGHT / 2);
            //BACK WHEELS:
            g.setColor(Color.white); //לצבוע את הגלגל בלבן
            g.fillOval(this.x, this.y + BODY_HEIGHT- BODY_WIDTH /4 /2, BODY_WIDTH /4, BODY_HEIGHT /4);
//FRONT WHELLS:
            //g.setColor(Color.white); //לצבוע את הגלגל בלבן
            g.fillOval(this.x + BODY_WIDTH, this.y + BODY_HEIGHT- BODY_WIDTH /4 /2, BODY_WIDTH /4, BODY_HEIGHT /4);

        }else {
            g.setColor(Color.blue);
            g.fillRect(0,0,1000,1000);
        }

    }
    public void moveRight(){
        this.x ++;

    }
    public void moveLeft(){
        this.x--;
    }

    public void explode(){ // אופציה להתנגשות המכונית
       this.visible = false;
    }
}
