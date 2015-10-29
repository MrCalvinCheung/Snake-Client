package UI;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Calvin on 29/10/2015.
 */


public class ContainerPanel extends JPanel {

    public static final String LOGINPANEL = "LOGINPANEL";

    private LoginPanel loginPanel;

    private ContainerPanel container;
    private CardLayout layout;

    public ContainerPanel() {
        this.setLayout(new CardLayout());
        container = this;

        loginPanel = new LoginPanel();
        add(loginPanel, LOGINPANEL);

        // foerste panel der koeres
        changePanel(LOGINPANEL);
    }


    public void changePanel(String panel) {
        layout = (CardLayout) this.getLayout();
        layout.show(container, panel);
    }

    public LoginPanel getLoginPanel() {
        return loginPanel;
    }


}
