package tallerex.modules;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * ApplicationModule Es la ventana que contiene todos los componentes.
 */
public class ApplicationModule extends JFrame {

  Toolkit t = Toolkit.getDefaultToolkit();
  int[] dimension;

  public ApplicationModule() {
    setTitle("Tallerex");
    this.screenDimension();
    setBounds(getScreDimension()[0],getScreDimension()[1],getScreDimension()[2],getScreDimension()[3]);
  }

  public void screenDimension(){
    dimension = new int[4];
    int width = (int) (t.getScreenSize().getWidth() * 0.90);
    int height = (int) (t.getScreenSize().getHeight() * 0.85);
    dimension[0] = ((int) t.getScreenSize().getWidth() - width) / 2;
    dimension[1] = ((int) t.getScreenSize().getHeight() - height) / 2;
    dimension[2] = width;
    dimension[3] = height;
  }

  public int[] getScreDimension() {
    return dimension;
  }

}