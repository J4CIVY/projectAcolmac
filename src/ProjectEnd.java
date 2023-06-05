
import Presentacion.HomeInterface;
import javax.swing.JFrame;
import org.apache.logging.log4j.*;

public class ProjectEnd {

    public static final Logger LOGGER = LogManager.getLogger(ProjectEnd.class);

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HomeInterface homeInterface = new HomeInterface();
        frame.setContentPane(homeInterface.getPanelView());
        homeInterface.pack();
        homeInterface.setSize(616, 800);
        homeInterface.setVisible(true);

        LOGGER.debug("");
        LOGGER.info("");
        LOGGER.warn("");
        LOGGER.error("");
        LOGGER.fatal("");

    }
}
