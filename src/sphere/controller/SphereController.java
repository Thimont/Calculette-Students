package sphere.controller;

import sphere.model.Sphere;
import sphere.view.SphereWindow;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.text.DecimalFormat;


/**
 * Created by flthiebl on 12/11/2015.
 */
public class SphereController implements TextListener {

    SphereWindow sphereWindow;
    Sphere sphere;
    String s_surface;
    String s_volume;

    public SphereController(SphereWindow sphereWindow) {
        this.sphereWindow = sphereWindow;

    }


    @Override
    public void textValueChanged(TextEvent e) {
        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2);
        sphere = new Sphere(sphereWindow.getRayon());
        s_volume = f.format(sphere.getVolume());
        s_surface = f.format(sphere.getSurface());

        sphereWindow.champsVolume.setText(s_volume);
        sphereWindow.champsSurface.setText(s_surface);
    }
}
