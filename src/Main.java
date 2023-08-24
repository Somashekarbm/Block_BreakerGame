import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BLOCK BREAKER");//creating a java frame with the title of the window/frame
        BlockBreakerPanel panel= new BlockBreakerPanel();//creating a panel inside the frame
        frame.getContentPane().add(panel);//add the panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//code for close the jframe
        frame.setVisible(true);//setting the frame as visible(true)
        frame.setSize(490, 600);//set ht and wd

        frame.setResizable(false);
    }
}
