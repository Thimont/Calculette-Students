package sphere.view;

import sphere.controller.SphereController;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by flthiebl on 12/11/2015.
 */
public class SphereWindow extends JFrame {
    JPanel panneau = new JPanel(new GridLayout(3,2,10,10));
    JLabel lRadius = new JLabel("Radius = ");
    JLabel lVolume = new JLabel("Volume = ");
    JLabel lSurface = new JLabel("Surface area = ");
    TextField champsRadius;
    public JTextField champsVolume;
    public JTextField champsSurface;

    public SphereWindow(){
        Dimension dim = new Dimension(100, 20);
        champsRadius = new TextField("0");
        champsRadius.setBackground(Color.YELLOW);
        champsRadius.setPreferredSize(dim);
        champsVolume = new JTextField();
        champsVolume.setPreferredSize(dim);
        champsSurface = new JTextField();
        champsSurface.setPreferredSize(dim);
        panneau.add(lRadius);
        panneau.add(champsRadius);
        champsRadius.addTextListener(new SphereController(this));
        panneau.add(lVolume);
        panneau.add(champsVolume);
        champsVolume.setEnabled(false);
        panneau.add(lSurface);
        panneau.add(champsSurface);
        champsSurface.setEnabled(false);

        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panneau);
        this.setVisible(true);
    }

    public double getRayon(){
        try {
            return Double.valueOf(champsRadius.getText());
        }catch (NumberFormatException e){
            System.err.println("Entrez un nombre");
        }
        return 0;
    }

}
