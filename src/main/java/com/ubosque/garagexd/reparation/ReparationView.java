/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.reparation;

import com.ubosque.garagexd.car.CarPojo;
import com.ubosque.garagexd.person.GenericPojo;
import com.ubosque.garagexd.person.owner.OwnerPojo;
import com.ubosque.garagexd.querys.CarQuery;
import com.ubosque.garagexd.utils.RWFiles;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class ReparationView implements ActionListener {
    JPanel frameReparation, paneliz, panelde, panelab, panelar, panelex;
    JLabel lbmatriculaCar, lbOwnerCar, lbReparation, lbKilometros, lbRepairman;
    JTextField txfMatricula, txfOwnerCar, txfKilometros, txfRepairman;
    List<JTextField> fields = new ArrayList<>();
    TextArea txfReparation;
    JButton lanzadorItem;
    JButton guardar, cancelar;
    
    public ReparationView(){
    frameReparation = new JPanel();
    paneliz = new JPanel();
    panelde = new JPanel();
    panelab = new JPanel();
    panelar = new JPanel();
    panelex = new JPanel();
    lbmatriculaCar = new JLabel();
    lbOwnerCar = new JLabel();
    lbReparation = new JLabel();
    lbKilometros = new JLabel();
    lbRepairman = new JLabel();
    
    txfMatricula = new JTextField();
    txfOwnerCar = new JTextField();
    txfReparation = new TextArea(29, 10);
    txfKilometros = new JTextField();
    txfRepairman = new JTextField();
    fields.add(txfMatricula);
    fields.add(txfOwnerCar);
    fields.add(txfRepairman);
    fields.add(txfKilometros);
   

    guardar = new JButton();
    cancelar = new JButton();

    frameReparation.setLayout(new FlowLayout());
    frameReparation.setSize(450, 320);

    lbmatriculaCar.setText("Matricula Automovil");
    lbOwnerCar.setText("Propietario");
    lbReparation.setText("Reparacion");
    lbKilometros.setText("Kilometraje");
    lbRepairman.setText("Mecanico");
  

    guardar.setText("Aceptar");
    cancelar.setText("Cancelar");

    guardar.addActionListener(this);
    cancelar.addActionListener(this);
    guardar.setActionCommand("actionSaveReparation");
    cancelar.setActionCommand("actionCancelReparation");

    paneliz.setLayout(new GridLayout(5, 0));
    paneliz.add(lbmatriculaCar);
    paneliz.add(lbOwnerCar);
    paneliz.add(lbReparation);
    paneliz.add(lbKilometros);
    paneliz.add(lbRepairman);

    panelde.setLayout(new GridLayout(5, 0, 0, 10));
    panelde.add(txfMatricula);
    panelde.add(txfOwnerCar);
    panelde.add(txfReparation);
    panelde.add(txfKilometros);
    panelde.add(txfRepairman);

    panelar.setLayout(new GridLayout(1, 1));
    panelar.setPreferredSize(new Dimension(440, 220));
    panelar.add(paneliz);
    panelar.add(panelde);

    panelab.setLayout(new FlowLayout());
    panelab.setPreferredSize(new Dimension(300, 80));
    panelab.add(guardar);
    panelab.add(cancelar);

    panelex.setLayout(new java.awt.GridLayout(2, 0));
    panelex.add(panelar);
    panelex.add(panelab);

    frameReparation.add(panelex);
    frameReparation.setVisible(false);
    }
    
    public void setLocationG(int x, int y) {
       frameReparation.setLocation((x - frameReparation.getWidth()) / 2, (y - frameReparation.getHeight()) / 3);
    }

    public void setLanzadorItem() {
        lanzadorItem = new JButton("agregar reparacion");
        lanzadorItem.setActionCommand("actionLaunch");
        lanzadorItem.addActionListener(this);
    }

      public JPanel getReparation() {
        return frameReparation;
    }

    public void saveReparation() {
        RWFiles c = new RWFiles();
        GenericPojo repairman = new GenericPojo(txfMatricula.getText());
        OwnerPojo owner = new OwnerPojo(txfOwnerCar.getText());
        CarPojo car = new CarPojo(txfMatricula.getText());
        c.escribirArchivos(new ReparationPojo(repairman, owner, car ,"frenos",125), "reparations");
        cacelReparation();
        System.out.println("reparation save");
    }
    
    public void cacelReparation(){
        Iterator<JTextField> fielstxt = fields.iterator();
        while (fielstxt.hasNext()) {
            JTextField next = fielstxt.next();
            next.setText(" ");
        }
        CarQuery c = new CarQuery();
        c.CarReparationAll();
        txfReparation.setText(" ");
    }

    public JButton getLanOw() {
        return lanzadorItem;
    }
      @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "actionLaunch":
                frameReparation.setVisible(!frameReparation.isVisible());
                break;
            case "actionSaveReparation":
                saveReparation();
                break;
            case "actionCancelReparation":
                cacelReparation();
                break;
            default:
                break;
        }
    }
}
