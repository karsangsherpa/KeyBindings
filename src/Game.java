import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game {

JFrame frame;
JLabel label;
Action upAction;
Action downAction;
Action lefAction;
Action righAction;


Game() {
frame = new JFrame("Key Binding Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420,420);
frame.setLayout(null);

label = new JLabel();
label.setBackground(Color.red);
label.setBounds(100, 100, 100, 100);
label.setOpaque(true);

frame.add(label);
frame.setVisible(true);




class UpAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    
}
class DownAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    
        
    }
    class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    
        
    }
    
}
}
}
