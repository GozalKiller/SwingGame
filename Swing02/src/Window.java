import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public static final int WINDOW_WIDTH= 1920;
    public static final int WINDOW_HEIGHT = 1080;


    public Window() {
        // this.setSize(1920,1080); //נעשה בדרך אחרת
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Panel panel = new Panel(WINDOW_WIDTH /4 ,0,WINDOW_WIDTH ,WINDOW_HEIGHT); //גודל הפאנל בחלון!
        this.add(panel); //אות קטנה של המחלקה של הפאנל
        this.setTitle("Title");
        ManuPane manuPane = new ManuPane(0,0,WINDOW_WIDTH /4, WINDOW_HEIGHT);
        this.add(manuPane);
        this.setVisible(true);

    }
}
