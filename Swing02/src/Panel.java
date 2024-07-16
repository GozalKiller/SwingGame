import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel(int x, int y, int width, int height){
        this.setBounds(x,y,width, height); //הגדרת הפנאל על כל החלון!
        this.setBackground(Color.black);
        this.setLayout(null);
    }

}
