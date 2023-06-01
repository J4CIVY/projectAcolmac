
import Presentacion.HomeInterface;
import javax.swing.JFrame;
import org.apache.log4j.*;

public class ProjectEnd {

    private static final Logger LogJava = Logger.getLogger(ProjectEnd.class);

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HomeInterface homeInterface = new HomeInterface();
        frame.setContentPane(homeInterface.getPanelView());
        homeInterface.pack();
        homeInterface.setSize(616, 800);
        homeInterface.setVisible(true);

        LogJava.debug("Log Debug");
        LogJava.info("Log Info");
        LogJava.error("Log Error");
        LogJava.warn("Log Warn");
        LogJava.fatal("Log Fatal");
    }
}
