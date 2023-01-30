package com.mycompany.timely;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;

public class Timely extends JFrame{
    public static void main(String[] args) {
        FlatLightLaf.setup();
        Splash splash = new Splash();
        splash.run();
    }
    
    void run() {
        setTitle("Timely");
        setSize(360, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        AlarmApp timely = new AlarmApp();
        add(timely);
        setVisible(true);
    }
    
}
