package tallerex.modules.cars;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import tallerex.modules.utils.RWFiles;
import javax.swing.JButton;
import java.util.UUID;

/**
 * Car register
 */
public class CarView implements ActionListener {
  JPanel frameCar, paneliz, panelde, panelab, panelar, panelex;
  JLabel lbmatricula, lbpropietario, lbrepador, lbreparacion, lbKilometraje;
  JTextField txfmatricula, txfpropietario, txfrepador, txfreparacion, txfKilometraje;
  JButton lanzadorItem;
  JButton guardar, cancelar;

  public CarView() {
    frameCar = new JPanel();
    paneliz = new JPanel();
    panelde = new JPanel();
    panelab = new JPanel();
    panelar = new JPanel();
    panelex = new JPanel();
    lbmatricula = new JLabel();
    lbpropietario = new JLabel();
    lbrepador = new JLabel();
    lbreparacion = new JLabel();
    lbKilometraje = new JLabel();

    txfmatricula = new JTextField();
    txfpropietario = new JTextField();
    txfrepador = new JTextField();
    txfreparacion = new JTextField();
    txfKilometraje = new JTextField();

    guardar = new JButton();
    cancelar = new JButton();

    frameCar.setLayout(new FlowLayout());
    frameCar.setVisible(true);
    frameCar.setSize(400, 300);

    lbmatricula.setText("matricula");
    lbpropietario.setText("dueño");
    lbrepador.setText("reparador");
    lbreparacion.setText("reparacion");
    lbKilometraje.setText("kilometraje");

    guardar.setText("Aceptar");
    cancelar.setText("Cancelar");

    guardar.addActionListener(this);
    cancelar.addActionListener(this);
    guardar.setActionCommand("actionSave");
    cancelar.setActionCommand("actionCancel");

    paneliz.setLayout(new GridLayout(5, 0));
    paneliz.add(lbmatricula);
    paneliz.add(lbpropietario);
    paneliz.add(lbrepador);
    paneliz.add(lbreparacion);
    paneliz.add(lbKilometraje);

    panelde.setLayout(new GridLayout(5, 0));
    panelde.add(txfmatricula);
    panelde.add(txfpropietario);
    panelde.add(txfrepador);
    panelde.add(txfreparacion);
    panelde.add(txfKilometraje);

    panelar.setLayout(new GridLayout(1, 1));
    panelar.setPreferredSize(new Dimension(300, 150));
    panelar.add(paneliz);
    panelar.add(panelde);

    panelab.setLayout(new FlowLayout());
    panelab.setPreferredSize(new Dimension(200, 80));
    panelab.add(guardar);
    panelab.add(cancelar);

    panelex.setLayout(new java.awt.GridLayout(2, 0));
    panelex.add(panelar);
    panelex.add(panelab);

    frameCar.add(panelex);
    frameCar.setVisible(false);
  }

  public void setLocationG(int x, int y) {
    frameCar.setLocation((x - frameCar.getWidth()) / 2, (y - frameCar.getHeight()) / 3);
  }

  public void setLanzadorItem() {
    lanzadorItem = new JButton("agregar automovil");
    lanzadorItem.setActionCommand("actionLaunch");
    lanzadorItem.addActionListener(this);
  }

  public JPanel getCar() {
    return frameCar;
  }

  public JButton getLanCar() {
    return lanzadorItem;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String comando = e.getActionCommand();
    if (comando.equals("actionLaunch"))
      frameCar.setVisible(!frameCar.isVisible());
    

  }
}