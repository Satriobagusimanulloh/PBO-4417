/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldexample;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldExample extends Frame implements ActionListener{

    String s1;        
    String s2;     
    double a; 
    double b;
    double hasil;
    String idealisme;

    Label l2;
    TextField t1;
    Label l3;
    TextField t2;
    Label l4;
    TextField t3;
    Label l5;
    TextField t4;
    Button b1;
    Label l1;
    
    TextFieldExample() {
        l2 = new Label("NAMA            :");
        l2.setBounds(50, 50, 150, 20);
        t1 = new TextField();
        t1.setBounds(200, 50, 150, 20);

        l3 = new Label("UMUR            :");
        l3.setBounds(50, 100, 150, 20);
        t2 = new TextField();
        t2.setBounds(200, 100, 150, 20);

        l4 = new Label("BERAT BADAN     :");
        l4.setBounds(50, 150, 150, 20);
        t3 = new TextField();
        t3.setBounds(200, 150, 150, 20);

        l5 = new Label("TINGGI BADAN    :");
        l5.setBounds(50, 200, 150, 20);
        t4 = new TextField();
        t4.setBounds(200, 200, 150, 20);

        b1 = new Button("Hitung");
        b1.setBounds(50, 250, 75, 20);
        b1.addActionListener(this);

        l1 = new Label();
        l1.setBounds(50, 300, 150, 20);

        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l5);
        add(t4);

        add(b1);
        add(l1);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        s1 = t3.getText();        
        s2 = t4.getText();     
        a = Double.parseDouble(s1); 
        b = Double.parseDouble(s2);
        hasil = 0;
        
        if(event.getSource()==b1){
            hasil=a/(b*b);
        }

        if (hasil < 18.5){
            idealisme = "Tidak Ideal";
        }
        else if (hasil < 24.9) {
            idealisme = "Normal";
        }
        else if (hasil < 29.9) {
            idealisme = "Tidak Ideal";
        }
        else if (hasil >= 30){
            idealisme = "Tidak Ideal";
        }

        l1.setText("Berat Badan Anda " + idealisme);
    }
    
    public static void main(String[] args) {
        TextFieldExample tf = new TextFieldExample();
    }
    
}
