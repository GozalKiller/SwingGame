import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener implements KeyListener {//ממשק של מקלדת
        private ManuPane manuPane;


    public MovementListener(ManuPane manuPane) {
        this.manuPane = manuPane;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("KeyTyped"); //בדיקה אם מגיב


    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("KeyPressed"); //בדיקה אם מגיב
        if (e.getKeyCode()== KeyEvent.VK_RIGHT) { //הגדרת המקש
            this.manuPane.getCar1().moveRight();
            this.manuPane.repaint(); //חייב לעדכן אותו בכל תזוזה של הרכב

        } else if (e.getKeyCode()==KeyEvent.VK_LEFT) { //תזוזה שמאלה
            this.manuPane.getCar1().moveLeft();
            this.manuPane.repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("KeyReleased");// בדיקה אם מגיב
        this.manuPane.getCar1().explode(); // ברגע שעוזבים את הלחצן תזוזה המכונית נעלמת
        this.manuPane.repaint(); // כל פעם שיש שינוי הוא צריך להיות מודע

    }
}
