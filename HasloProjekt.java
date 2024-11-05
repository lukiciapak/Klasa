package Desktopowka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HasloProjekt {
    JRadioButton buttonLitery,buttonliteryCyfry,buttonZnakiSpecjalne;
    JLabel etykietaInformacyjna,etykietaHaslo;
    JButton check;
    JTextField textHaslo;
    private static JRadioButton createButton(String text,int y){
        JRadioButton radioButton=new JRadioButton();
        radioButton.setBounds(20,y,200,50);
        radioButton.setText(text);
        radioButton.setFont(new Font("Arial",Font.PLAIN,18));
        radioButton.setForeground(Color.white);
        radioButton.setBackground(new Color(75,75,75));
        radioButton.setVisible(true);
        return radioButton;
    }

    public void action(ActionEvent e){
        Object source = e.getSource();
        if(source.equals(check) && source.equals(buttonLitery)){

        }
    }

    public JPanel createContentPane(){
        JPanel myPanel = new JPanel();
        myPanel.setBackground(new Color(75,75,75));

        buttonLitery=createButton("tylko litery",10);
        buttonliteryCyfry=createButton("litery + cyfry",70);
        buttonZnakiSpecjalne=createButton("+ znaki specjalne",130);
        buttonLitery.setSelected(true);
        ButtonGroup buttons=new ButtonGroup();
        buttons.add(buttonLitery);
        buttons.add(buttonliteryCyfry);
        buttons.add(buttonZnakiSpecjalne);

        etykietaInformacyjna=new JLabel();
        etykietaInformacyjna.setBounds(20,200,200,50);
        etykietaInformacyjna.setText("Podaj dlugosc hasla");
        etykietaInformacyjna.setFont(new Font("Arial",Font.PLAIN,18));
        etykietaInformacyjna.setForeground(Color.white);

        etykietaHaslo=new JLabel();
        etykietaHaslo.setBounds(20,400,300,50);
        etykietaHaslo.setFont(new Font("Arial",Font.PLAIN,18));
        etykietaHaslo.setForeground(Color.white);
        etykietaHaslo.setVisible(false);


        textHaslo=new JTextField();
        textHaslo.setBounds(20,250,200,50);
        textHaslo.setFont(new Font("Arial",Font.PLAIN,18));
        textHaslo.setForeground(Color.black);

        check=new JButton();
        check.setBounds(20,320,200,50);
        check.setText("Generuj haslo");
        check.setFont(new Font("Arial",Font.PLAIN,18));
        check.setForeground(Color.white);
        check.setBackground(new Color(56,56,56));




        myPanel.add(check);
        myPanel.add(textHaslo);
        myPanel.add(etykietaHaslo);
        myPanel.add(etykietaInformacyjna);
        myPanel.add(buttonLitery);
        myPanel.add(buttonliteryCyfry);
        myPanel.add(buttonZnakiSpecjalne);
        return myPanel;
    }





    public HasloProjekt(){
        JFrame okno = new JFrame("Lukasz Kacprzak");
        okno.setContentPane(createContentPane());
        okno.setSize(500,600);
        okno.setLocation(500,100);
        okno.setLayout(null);
        okno.setResizable(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

    public static void main(String[] args) {
        new HasloProjekt();
    }
}
