package tallerex.modules.settings;

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
 * SetGarage
 */
public class Garage implements ActionListener {
  int id;
  // String nombre; // name
  String direccion; // addres
  // String telefono; // telephone
  JPanel frame;
  JPanel paneliz, panelde, panelab, panelar, panelex;
  JLabel lbnombre, dirreccion, lbtelefono;
  JTextField text1, text2, text3;
  JButton guardar, cancelar;
  JButton lanzadorItem;
  RWFiles IOfiles;

  public Garage() {

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
    guardar = new JButton();
    cancelar = new JButton();

    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    frame.setSize(300, 170);

    lbnombre.setText("Nombre");
    dirreccion.setText("dirreccion");
    lbtelefono.setText("Telefono");

    guardar.setText("Aceptar");
    cancelar.setText("Cancelar");
    
    guardar.addActionListener(this);
    cancelar.addActionListener(this);
    guardar.setActionCommand("actionSave");
    cancelar.setActionCommand("actionCancel");

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
    panelab.add(guardar);
    panelab.add(cancelar);

    panelex.setLayout(new java.awt.GridLayout(2, 0));
    panelex.add(panelar);
    panelex.add(panelab);

    frame.add(panelex);
    frame.setVisible(false);
  }

  public void setLanzadorItem() {
    lanzadorItem = new JButton("Confiurar garaje");
    lanzadorItem.setActionCommand("actionLaunch");
    lanzadorItem.addActionListener(this);
  }

  public JButton getLangarge() {
    return lanzadorItem;
  }

  public JPanel getGaraje() {
    return frame;
  }

  public void setLocationG(int x, int y) {
    frame.setLocation((x - frame.getWidth()) / 2, (y - frame.getHeight()) / 3);
  }

  public void saveData() {
    IOfiles = new RWFiles();
    List<String> listGaraje = new ArrayList<>();
    listGaraje.add("id: "+ UUID.randomUUID());
    listGaraje.add("name: "+text1.getText());
    listGaraje.add("dirección: "+text2.getText());
    listGaraje.add("telefono: "+text3.getText());
    IOfiles.escribirArchivo(listGaraje,text1.getText());
    System.out.println("save data  ");
    cleanForm();   
  }

  public void cleanForm() {
    text1.setText("");
    text2.setText("");
    text3.setText("");
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    String comando = e.getActionCommand();
    if (comando.equals("actionSave"))
      saveData();
    else if (comando.equals("actionCancel"))
      cleanForm();
    else if (comando.equals("actionLaunch"))
    frame.setVisible(!frame.isVisible());
  }
}