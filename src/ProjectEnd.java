import Presentacion.HomeInterface;
import javax.swing.JFrame;


public class ProjectEnd {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HomeInterface homeInterface = new HomeInterface();
        frame.setContentPane(homeInterface.getPanelView());
        homeInterface.pack();
        homeInterface.setSize(616, 1000);
        homeInterface.setVisible(true);

    }
    
}
