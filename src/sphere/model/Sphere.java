package sphere.model;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.Math;
/**
 * Created by flthiebl on 12/11/2015.
 */
public class Sphere {
    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getSurface(){
        return 4*Math.PI*(rayon*rayon);
    }

    public double getVolume(){
        return (4*Math.PI*Math.pow(rayon, 3))/3;
    }
}
