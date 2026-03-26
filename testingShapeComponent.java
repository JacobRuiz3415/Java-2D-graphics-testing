
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class testingShapeComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D) g;
        g2d.setPaint(Color.BLUE);
        Rectangle r = new Rectangle(10, 10, 100, 100);
        g2d.draw(r);

    }
}
