package UI;

/**
 * Created by Calvin on 29/10/2015.
 */
public class TESTGUICONTROLLER {


    private MyFrame myFrame;
    private ContainerPanel containerPanel;


    public TESTGUICONTROLLER()
    {
        myFrame = new MyFrame();

    }


    public void injectListeners()
    {
        // Login, logout and forgot password actionlisteners
        //ContainerPanel.getLoginPanel().addActionListener(new LoginActionListener());

    }

    public MyFrame getMyframe()
    {
        return myFrame;
    }

}