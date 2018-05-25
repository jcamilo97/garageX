package com.ubosque.garagexd;

import com.ubosque.garagexd.garage.Garage;
import com.ubosque.garagexd.car.CarView;
import com.ubosque.garagexd.person.owner.OwnerView;
import com.ubosque.garagexd.person.repairman.RepairManView;
import com.ubosque.garagexd.querys.QueryView;
import com.ubosque.garagexd.reparation.ReparationView;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;


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

  public void setCar() {
    CarView car = new CarView();
    car.setLocationG(dimension[2],dimension[3]);
    car.setLanzadorItem();
    car.getLanCar().setBounds(190,dimension[3] - 100 ,150,50);
    contentPane.add(car.getLanCar());
    contentPane.add(car.getCar());
  }
  
  
  public void setOwner() {
    OwnerView owner = new OwnerView();
    owner.setLocationG(dimension[2],dimension[3]);
    owner.setLanzadorItem();
    owner.getLanOw().setBounds(350,dimension[3] - 100 ,150,50);
    contentPane.add(owner.getLanOw());
    contentPane.add(owner.getOwner());
  }
  
  public void setRepairMan(){
      RepairManView owner = new RepairManView();
    owner.setLocationG(dimension[2],dimension[3]);
    owner.setLanzadorItem();
    owner.getLanOw().setBounds(510,dimension[3] - 100 ,150,50);
    contentPane.add(owner.getLanOw());
    contentPane.add(owner.getRepairMan());
  }
  public void setReparation(){
    ReparationView owner = new ReparationView();
    owner.setLocationG(dimension[2],dimension[3]);
    owner.setLanzadorItem();
    owner.getLanOw().setBounds(680,dimension[3] - 100 ,150,50);
    contentPane.add(owner.getLanOw());
    contentPane.add(owner.getReparation());
  }
  
  public void setQueryComponent(){
    QueryView query = new QueryView(dimension[2],dimension[3]);
    query.setLocationG(dimension[2],dimension[3]);
    query.setLanzadorItem();
    query.getLanzadorItem().setBounds(680+170, dimension[3] - 100 ,150,50);
    contentPane.add(query.getLanzadorItem());
    contentPane.add(query.getFrameQuery());
  }

  public int[] getScreDimension() {
    return dimension;
  }

}