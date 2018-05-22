package tallerex.modules;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tallerex.modules.settings.Garage;

/**
 * ApplicationModule Es la ventana que contiene todos los componentes.
 */
public class ApplicationModule extends JFrame {

  JPanel contentPane;
  Toolkit t = Toolkit.getDefaultToolkit();
  int[] dimension;
  Garage tallerconf;
  
  public ApplicationModule() {
    contentPane = new JPanel();
    contentPane.setBackground(Color.YELLOW);
    contentPane.setLayout(null);
    setTitle("Tallerex");
    this.screenDimension();
    setBounds(getScreDimension()[0],getScreDimension()[1],getScreDimension()[2],getScreDimension()[3]);
    this.setgarage();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(contentPane);
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

  public void setgarage() {
    tallerconf = new Garage();
    tallerconf.setLocationG(dimension[2],dimension[3]);
    tallerconf.setLanzadorItem();
    tallerconf.getLangarge().setBounds(30,dimension[3] - 100 ,150,50);
    contentPane.add(tallerconf.getLangarge());
    contentPane.add(tallerconf.getGaraje());
  }

  public int[] getScreDimension() {
    return dimension;
  }

}