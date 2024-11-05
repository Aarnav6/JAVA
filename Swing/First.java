
import javax.swing.JFrame;


class First {

    public static void frame () {
        JFrame f1 =  new JFrame("My Swing Application");  //creating jframe
        f1.setSize(1000,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        Explanation of setDefaultCloseOperation :-
        JFrame.EXIT_ON_CLOSE (Value = 3): This option will terminate the entire application when the window is closed. In other words, it stops the Java Virtual Machine (JVM) that is running the application. This is useful when the JFrame represents the main window of the application and you want to close the application entirely when it’s closed.
        JFrame.HIDE_ON_CLOSE (Value = 1): This option hides the JFrame when the user closes it but does not terminate the application. The JFrame will become invisible, but the application will continue running in the background. This can be helpful if you plan to reopen the same frame or if there are other windows open.
        JFrame.DISPOSE_ON_CLOSE (Value = 2): This option releases the resources used by the JFrame and hides the window when it is closed. However, it does not terminate the application. This is typically used for secondary windows that don’t need to remain in memory after they’re closed.
        JFrame.DO_NOTHING_ON_CLOSE (Value = 0): This option prevents any action from being taken when the close button is clicked. The frame stays open, and you would need to programmatically control its closure if needed. This option is useful if you want to display a confirmation dialog or perform some action before closing the window
        */
    }

    public static void main(String[] args) {
        First ob = new First();
    }
}