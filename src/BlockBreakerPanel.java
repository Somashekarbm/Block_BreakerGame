import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class BlockBreakerPanel extends JPanel implements KeyListener {
    ArrayList<Block> blocks = new ArrayList<Block>();//creating a arraylist of blocks with name blocks
    BlockBreakerPanel(){
        for(int i=0;i<8;i++)
        {
            blocks.add(new Block((i*60+2),0,60,25,"blue.png"));
        }
        for(int i=0;i<8;i++)
        {
            blocks.add(new Block((i*60+2),25,60,25,"red.png"));
        }
        for(int i=0;i<8;i++)
        {
            blocks.add(new Block((i*60+2),50,60,25,"green.png"));
        }
        for(int i=0;i<8;i++)
        {
            blocks.add(new Block((i*60+2),75,60,25,"yellow.png"));
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Block b : blocks){
            b.draw(g,this);
        }
        public void update(){
            repaint();
        }

    }


}
