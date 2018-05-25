/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.person.owner;

import com.ubosque.garagexd.car.CarPojo;
import com.ubosque.garagexd.utils.RWFiles;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class OwnerView implements ActionListener {
    JPanel frameOwner, paneliz, panelde, panelab, panelar, panelex;
    JLabel lbname, lbapellido, lbdireccion,lbcars;
    JTextField txfname, txfapellido, txfdireccion,txfcars;
    JButton lanzadorItem;
    JButton guardar, cancelar;
    
    public OwnerView(){
    frameOwner = new JPanel();
    paneliz = new JPanel();
    panelde = new JPanel();
    panelab = new JPanel();
    panelar = new JPanel();
    panelex = new JPanel();
    lbname = new JLabel();
    lbapellido = new JLabel();
    lbdireccion = new JLabel();
    lbcars = new JLabel();
    
    txfname = new JTextField();
    txfapellido = new JTextField();
    txfdireccion = new JTextField();
    txfcars = new JTextField();
   

    guardar = new JButton();
    cancelar = new JButton();

    frameOwner.setLayout(new FlowLayout());
    frameOwner.setVisible(true);
    frameOwner.setSize(400, 300);

    lbname.setText("nombre");
    lbapellido.setText("apellido");
    lbdireccion.setText("direccion");
    lbcars.setText("car matricula");
  

    guardar.setText("Aceptar");
    cancelar.setText("Cancelar");

    guardar.addActionListener(this);
    cancelar.addActionListener(this);
    guardar.setActionCommand("actionSaveOwner");
    cancelar.setActionCommand("actionCancelOwner");

    paneliz.setLayout(new GridLayout(5, 0));
    paneliz.add(lbname);
    paneliz.add(lbapellido);
    paneliz.add(lbdireccion);
    paneliz.add(lbcars);

    panelde.setLayout(new GridLayout(5, 0));
    panelde.add(txfname);
    panelde.add(txfapellido);
    panelde.add(txfdireccion);
    panelde.add(txfcars);


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

    frameOwner.add(panelex);
    frameOwner.setVisible(false);
    }
    
    public void setLocationG(int x, int y) {
        frameOwner.setLocation((x - frameOwner.getWidth()) / 2, (y - frameOwner.getHeight()) / 3);
    }

    public void setLanzadorItem() {
        lanzadorItem = new JButton("agregar propietario");
        lanzadorItem.setActionCommand("actionLaunch");
        lanzadorItem.addActionListener(this);
    }

      public JPanel getOwner() {
        return frameOwner;
    }

    public void saveOwner() {
        RWFiles c = new RWFiles();
        CarPojo[] d = {new CarPojo(txfcars.getText())};
        c.escribirArchivos(new OwnerPojo(txfname.getText(), txfapellido.getText(), txfdireccion.getText(), d), "owners");
        System.out.println("owner save");
    }

    public JButton getLanOw() {
        return lanzadorItem;
    }
      @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("actionLaunch")) {
            frameOwner.setVisible(!frameOwner.isVisible());
        } else if (comando.equals("actionSaveOwner")) {
            saveOwner();
        }
    }
}
