/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.querys;

import com.ubosque.garagexd.car.CarServices;
import com.ubosque.garagexd.reparation.ReparationServices;
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
    JLabel querycompnent, lblSearchCar;
    JTextField inputquerycar;
    JButton reparations, cars, carsReparated, btnSearchCar, lanzadorItem;
    JPanel frameQuery,panelex, paneliz, panelde, paneldeA, pnlSearchCar;
    TextArea result;
    CarQuery c;
    CarServices carservice;
    ReparationServices reparationsercive;

    public QueryView(int x, int y) {
        frameQuery = new JPanel();
        frameQuery.setLayout(null);
        frameQuery.setSize(x-16, y-120);
        
        panelex = new JPanel();
        panelde = new JPanel();
        paneliz = new JPanel();
        paneldeA = new JPanel();
        pnlSearchCar = new JPanel();
        
        querycompnent = new JLabel("Consultas");
        lblSearchCar = new JLabel("Buscar Auto por matricula");
        inputquerycar = new JTextField(10);
        reparations = new JButton("mecanicos"); // 1 vehiculos y persona que los reparo
        cars = new JButton("Vehiculos"); // 2 vehiculos y su dueño
        carsReparated = new JButton("reparaciones"); // 4 todas las reparaciones
        btnSearchCar = new JButton("buscar");
        result = new TextArea();
        
        reparations.addActionListener(this);
        cars.addActionListener(this);
        carsReparated.addActionListener(this);
        btnSearchCar.addActionListener(this);
        reparations.setActionCommand("1");
        cars.setActionCommand("2");
        carsReparated.setActionCommand("4");
        btnSearchCar.setActionCommand("3");

        paneliz.setLayout(null);
        int wpaneliz =  x*20/100;
        paneliz.setSize(wpaneliz,y);
        paneliz.setLocation(0, 0);
        paneliz.setBackground(Color.red);
        paneliz.add(querycompnent);
        paneliz.add(reparations);
        paneliz.add(cars);
        paneliz.add(carsReparated);
        
        querycompnent.setBounds(20,20,paneliz.getWidth()-20, 50);
        reparations.setBounds(20,querycompnent.getY()+60,paneliz.getWidth()-40, 50);    
        cars.setBounds(20,(reparations.getY()+60),paneliz.getWidth()-40, 50);   
        carsReparated.setBounds(20,cars.getY()+60,paneliz.getWidth()-40, 50);
        
        panelde.setLayout(null);
        System.out.println(paneliz.getWidth());
        panelde.setSize(x-paneliz.getWidth(), y);
        panelde.setLocation(paneliz.getWidth(), 0);
        panelde.setBackground(Color.BLUE);
        
        pnlSearchCar.setLocation(0, 0);
        pnlSearchCar.setSize(x-paneliz.getWidth(), 40);
        pnlSearchCar.add(lblSearchCar);
        pnlSearchCar.add(inputquerycar);
        pnlSearchCar.add(btnSearchCar);

        result.setBounds(0, 40, panelde.getWidth(),panelde.getHeight()-40);
        panelde.add(result);
        panelde.add(pnlSearchCar);
        
        panelex.setLayout(null);
        panelex.setSize(x,y);
        panelex.setLocation(0, 0);
        panelex.setBackground(Color.GREEN);
       
        panelex.add(paneliz);
        panelex.add(panelde);
               
        frameQuery.add(panelex);
        frameQuery.setVisible(false);
        frameQuery.setBackground(Color.PINK);
        carservice = new CarServices();
        reparationsercive = new ReparationServices();
    }
     
    public void setLocationG(int x, int y) {
       frameQuery.setLocation(0, 5);
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
     
    public void searchCar(){
     result.setText(reparationsercive.ReparationByCar(inputquerycar.getText()));
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "actionLaunch":
                frameQuery.setVisible(!frameQuery.isVisible());
                break;
            case "1":
                result.setText(reparationsercive.ReparationAllbyRepairman());
                break;
            case "2":
                result.setText(carservice.CarAll());
                break;
            case "3":
                searchCar();
                break;
            case "4":
                result.setText(reparationsercive.ReparationAll());
                break;
            default:
                break;
        }
    }
    
    
    
}
