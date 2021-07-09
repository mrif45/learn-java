import java.awt.*;
import java.awt.event.*;

class ImplementsDemo extends Frame implements WindowListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Label label;

    ImplementsDemo(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(this);
    }
    void launchFrame(){
        setSize(300,300);
        setVisible(true);
    }

    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public static void main(String[] args) {
        ImplementsDemo cf = new ImplementsDemo("Close Window example");
        cf.launchFrame();
    }
}