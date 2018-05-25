/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.querys;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class QueryView implements ActionListener{
    JLabel querycompnent;
    JTextField inputquerycar;
    JButton reparations, cars, carReparations, carsReparated, btnquery, lanzadorItem;
    JPanel frameQuery,panelex, paneliz, panelde, paneldeA, paneldeAa;
    TextArea result;
    CarQuery c;

    public QueryView(int x, int y) {
        frameQuery = new JPanel(new FlowLayout());
        frameQuery.setSize(x-30, y-120);
        
        panelex = new JPanel();
        panelde = new JPanel();
        paneliz = new JPanel();
        paneldeA = new JPanel();
        paneldeAa = new JPanel();
        querycompnent = new JLabel("Consultas");
        inputquerycar = new JTextField();
        reparations = new JButton("mecanicos"); // 1 vehiculos y persona que los reparo
        cars = new JButton("Vehiculos"); // 2 vehiculos y su dueño
        carReparations = new JButton("reparacion vehiculo"); // 3 historial de reparaciones de un vehiculo
        carsReparated = new JButton("reparaciones"); // 4 todas las reparaciones
        btnquery = new JButton("buscar");
        result = new TextArea(50,70);
        
        reparations.addActionListener(this);
        cars.addActionListener(this);
        carReparations.addActionListener(this);
        carsReparated.addActionListener(this);
        btnquery.addActionListener(this);
        reparations.setActionCommand("1");
        cars.setActionCommand("2");
        carReparations.setActionCommand("3");
        carsReparated.setActionCommand("4");
        btnquery.setActionCommand("buscarCar");
        
        paneliz.setLayout(new GridLayout(6, 3,100,20));
        paneliz.setBackground(Color.red);
        paneliz.add(querycompnent);
        paneliz.add(reparations);
        paneliz.add(cars);
        paneliz.add(carReparations);
        paneliz.add(carsReparated);
        
        panelde.setLayout(new GridLayout(1, 0, 0, 10));
        panelde.add(result);
        panelde.setBackground(Color.BLUE);
        
        paneldeAa.add(inputquerycar);
        paneldeAa.add(btnquery);
        paneldeA.setLayout(new GridLayout(2, 0, 0, 10));
        paneldeA.add(paneldeAa);
        //paneldeA.add(result);
        paneldeA.setVisible(false);
        
        panelex.setLayout(new java.awt.GridLayout(1, 1));
        panelex.setPreferredSize(new Dimension(x-30, y-120));
        panelex.add(paneliz);
        panelex.add(panelde);
        //panelex.add(paneldeA);
        panelex.setBackground(Color.GREEN);
        
        frameQuery.add(panelex);
        frameQuery.setVisible(false);
        
        c = new CarQuery();
    }
    
    public void setLocationG(int x, int y) {
       frameQuery.setLocation(10, 5);
    }
    
     public void setLanzadorItem() {
        lanzadorItem = new JButton("consultas");
        lanzadorItem.setActionCommand("actionLaunch");
        lanzadorItem.addActionListener(this);
    }

    public JButton getLanzadorItem() {
        return lanzadorItem;
    }

    public JPanel getFrameQuery() {
        return frameQuery;
    }
     
    
      @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "actionLaunch":
                frameQuery.setVisible(!frameQuery.isVisible());
                break;
            case "1":
                //saveReparation();
                break;
            case "2":
                //cacelReparation();
                break;
            case "3":
                break;
            case "4":
                result.setText(c.CarReparationAll());
                break;
            default:
                break;
        }
    }
    
    
    
}
