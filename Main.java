import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(350, 250);
        frame.setTitle("testing");

        URL iconURL = main.class.getResource("/high-angle-shot-banana-isolated-white-surface.jpg");
        if (iconURL != null){
            ImageIcon icon = new ImageIcon(iconURL);
            frame.setIconImage(icon.getImage());
        }
        testingShapeComponent component = new testingShapeComponent();
        frame.add(component);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}
