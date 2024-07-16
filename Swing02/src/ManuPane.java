import javax.swing.*;
import java.awt.*;

public class ManuPane extends JPanel {
    private Car car1;
    private Car car2;

    public ManuPane(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        //this.setLayout(null);
        this.setBackground(Color.gray);
        //GridLayout gridLayout = new GridLayout(1,6); //תפקידו לחלק את הפנאל לעמודות ושורות נגיד כמו שנרצה שיהיה 6 לחצים אחד מתחת לשני
        //this.setLayout(gridLayout);
        //this.add(new JButton());

        this.car1 = new Car(50, 50, 200, 200); // משיכת הגדלים ממחלקת CAR
        this.car2 = new Car(50, 500, 200, 200); //car number 2
        this.setFocusable(true); //בדיקה על לחיצת כפתור
        this.requestFocus();
        this.addKeyListener(new MovementListener(this)); //אחראי על התזוזה דרך המקלדת

    }

    protected void paintComponent(Graphics g) {  //חייב אותו בשביל לצייר בפאנל
        super.paintComponent(g);
        //g.drawRect(50, 50, 200 ,200); //  לדוגמא פה יצייר מלבן  בתור מסגרת
        //ןזה יצייר רק בפנאל הזה
        //g.fillRect(50,50,200,200); // יצבע את המלבן מבפנים
        this.car1.paint(g); //מושך את  המתודה ממחלקת CAR
        this.car2.paint(g);// מצייר גם את המכונית השניה
    }
    public Car getCar1(){
        return this.car1;
    }


}
