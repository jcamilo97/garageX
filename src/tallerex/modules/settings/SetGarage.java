package tallerex.modules.settings;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * SetGarage
 */
public class SetGarage implements ActionListener {
  int id;
  // String nombre; // name
  String direccion; // addres
  // String telefono; // telephone
  JPanel frame;
  JPanel paneliz, panelde, panelab, panelar, panelex;
  JLabel lbnombre, dirreccion, lbtelefono;
  JTextField text1, text2, text3;
  JButton boton1, boton2;
  JButton lanzadorItem;

  public SetGarage() {

    frame = new JPanel();
    paneliz = new JPanel();
    panelde = new JPanel();
    panelab = new JPanel();
    panelar = new JPanel();
    panelex = new JPanel();
    lbnombre = new JLabel();
    dirreccion = new JLabel();
    lbtelefono = new JLabel();

    text1 = new JTextField();
    text2 = new JTextField();
    text3 = new JTextField();
    boton1 = new JButton();
    boton2 = new JButton();

    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    frame.setSize(300, 170);

    lbnombre.setText("Nombre");
    dirreccion.setText("dirreccion");
    lbtelefono.setText("Telefono");

    boton1.setText("Aceptar");
    boton2.setText("Cancelar");

    paneliz.setLayout(new GridLayout(4, 0));
    paneliz.add(lbnombre);
    paneliz.add(dirreccion);
    paneliz.add(lbtelefono);

    panelde.setLayout(new GridLayout(4, 0));
    panelde.add(text1);
    panelde.add(text2);
    panelde.add(text3);

    panelar.setLayout(new GridLayout(1, 1));
    panelar.setPreferredSize(new Dimension(250, 100));
    panelar.add(paneliz);
    panelar.add(panelde);

    panelab.setLayout(new FlowLayout());
    panelab.setPreferredSize(new Dimension(200, 50));
    panelab.add(boton1);
    panelab.add(boton2);

    panelex.setLayout(new java.awt.GridLayout(2,0));
    panelex.add(panelar);
    panelex.add(panelab);

    frame.add(panelex);
    frame.setVisible(false);
  }

  public void setLanzadorItem(){
    lanzadorItem = new JButton("Confiurar garaje");
    lanzadorItem.addActionListener(this);
  }
  
  public JButton getLangarge(){
    return lanzadorItem;
  }
  public JPanel getGaraje() {
    return frame;
  }

  public void setLocationG(int x, int y){
    frame.setLocation((x -frame.getWidth())/2, (y - frame.getHeight())/3);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    frame.setVisible(!frame.isVisible());
 

  }
}