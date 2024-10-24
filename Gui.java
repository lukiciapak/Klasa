package Desktopowka.Projekt_Aktorzy.Pliki;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gui {
        JLabel etykieta1,etykieta2,etykieta3,etykieta4,etykieta5,etykieta6,etykieta1b,etykieta2b,etykieta3b,etykieta4b,etykieta5b;
        BufferedImage myPicture;
        JButton check, clear;
        JTextArea text;
        Dane dane=new Dane();
    private JLabel etykieta(int x, int y, String textLabel) {

        JLabel etykieta = new JLabel();
        etykieta.setBounds(x, y, 150, 50);
        etykieta.setText(textLabel);
        etykieta.setBackground(Color.white);
        etykieta.setFont(new Font("Arial",Font.PLAIN,12));
        return etykieta;
    }
    private JLabel etykietab(int x, int y) {

        JLabel etykietab = new JLabel();
        etykietab.setBounds(x, y, 150, 50);
//        etykietaboczna.setBackground(Color.white);
        etykietab.setFont(new Font("Arial",Font.PLAIN,12));
        etykietab.setVisible(true);
        etykietab.setBackground(Color.blue);
        return etykietab;

        }
    public void actionPerfomed(ActionEvent e){
        Object source = e.getSource();
        if(source.equals(check)){
            String pom=text.getText();
            for(int i=0;i<aktorzy[i];i++){
                if(pom.equals(aktorzy[i].getNazwisko())){
                    etykieta1b.aktorzy[i].getImie();
                    etykieta2b.aktorzy[i].getNazwisko();
                    etykieta3b.aktorzy[i].getNarodowsc();
                    etykieta4b.aktorzy[i].getFilm1();
                    etykieta5b.aktorzy[i].getFilm2();
                    zdjecie.
                }
            }
        }
    }
    public JPanel createContentPane(){
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.white);
        myPanel.setBounds(50,50,500,250);
        JLabel etykieta=new JLabel();
        etykieta.setBounds(50,50,300,200);
        etykieta.setText("Brak danych");
        etykieta.setVisible(false);
        etykieta.setFont(new Font("Arial", Font.BOLD,36));
        myPanel.setVisible(true);

        JLabel etykietaglowna=new JLabel();
        etykietaglowna.setBounds(300,10,200,20);
        etykietaglowna.setFont(new Font("Arial",Font.BOLD,24));
        etykietaglowna.setText("Baza aktorow");
        etykietaglowna.setVisible(true);

        JTextArea text=new JTextArea();
        text.setBounds(260,100,200,50);
        text.setFont(new Font("Arial",Font.PLAIN,12));

        JButton check=new JButton();
        check.setBounds(300,50,100,50);
        check.setText("Check");

        JLabel zdjecie=new JLabel();
//        try{
//            myPicture= ImageIO.read(new File(" "));
//        }catch (IOException e){
//            System.out.println("Nie moza wczytac pliku");
//        }
//        Image resizedPicture = myPicture.getScaledInstance(200,350,Image.SCALE_SMOOTH);
//        zdjecie.setBounds(20,100,200,350);
//        zdjecie.setIcon(new ImageIcon(resizedPicture));

        etykieta1=etykieta(300,200,"Imie: ");
        etykieta2=etykieta(300,250,"Nazwisko: ");
        etykieta3=etykieta(300,300,"Narodowosc: ");
        etykieta4=etykieta(300,350,"Film1: ");
        etykieta5=etykieta(300,400,"Film4: ");
        etykieta6=etykieta(50,100,"Podaj nazwisko aktora");

        etykieta1b=etykietab(460,200);
        etykieta2b=etykietab(460,250);
        etykieta3b=etykietab(460,300);
        etykieta4b=etykietab(460,350);
        etykieta5b=etykietab(460,400);

        myPanel.add(zdjecie);
        myPanel.add(text);
        myPanel.add(etykieta6);
        myPanel.add(etykieta1);
        myPanel.add(etykieta2);
        myPanel.add(etykieta3);
        myPanel.add(etykieta4);
        myPanel.add(etykieta5);
        myPanel.add(etykieta1b);
        myPanel.add(etykieta2b);
        myPanel.add(etykieta3b);
        myPanel.add(etykieta4b);
        myPanel.add(etykieta5b);
        myPanel.add(etykietaglowna);
        myPanel.add(etykieta);
        return myPanel;
    }



    public Gui(){
        JFrame okno = new JFrame("Lukasz Kacprzak");
        okno.setContentPane(createContentPane());
        okno.setSize(1090,800);
        okno.setLocation(100,100);
        okno.setLayout(null);
        okno.setResizable(true);
//        okno.setLocationRelativeTo(null);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
//        okno.setSize(new Dimension(700,245));
    }
}
