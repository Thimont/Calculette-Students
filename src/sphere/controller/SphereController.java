package sphere.controller;

import sphere.model.Sphere;
import sphere.view.SphereWindow;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


/**
 * Created by flthiebl on 12/11/2015.
 */
public class SphereController implements TextListener {

    SphereWindow sphereWindow;
    Sphere sphere;
    double surface;
    double volume;

    public SphereController(SphereWindow sphereWindow) {
        this.sphereWindow = sphereWindow;

    }


    @Override
    public void textValueChanged(TextEvent e) {
        sphere = new Sphere(sphereWindow.getRayon());
        volume = sphere.getVolume();
        surface = sphere.getSurface();

        sphereWindow.champsVolume.setText(String.valueOf(volume));
        sphereWindow.champsSurface.setText(String.valueOf(surface));
    }
}
