import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {

    private UI ui;
    private long number = 0;

    public Engine(UI ui) {
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            number = 0;
            number = Long.parseLong(ui.getText());
            ui.setText(String.valueOf((number * (number+1))/2));
        }
    }
}
