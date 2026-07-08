import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(350, 250);
        frame.setTitle("testing");

        testingShapeComponent component = new testingShapeComponent();
        frame.add(component);

        frame.setVisible(true);
        
    }
}
