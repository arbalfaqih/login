package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialoog extends JDialog implements ActionListener {
    JButton btn_ok, btn_cancel;
    JLabel lbl_naam, lbl_pw;
    JTextField tf_naam, tf_pw;
    boolean isOK;

    public Dialoog(JFrame jf) {
        super(jf, true);
        this.isOK = false;

      setTitle("login");
      setSize(300,100);
      setLayout(new GridLayout(3,2));

      lbl_naam = new JLabel("Gebruikersnaam");
      add(lbl_naam);

      tf_naam = new JTextField();
      add(tf_naam);

      lbl_pw = new JLabel("Paswoord");
      add(lbl_pw);

      tf_pw = new JTextField();
      add(tf_pw);

      btn_ok = new JButton("Login");
      btn_ok.addActionListener(this);
      add(btn_ok);

      btn_cancel = new JButton("Cancel");
      btn_cancel.addActionListener(this);
      add(btn_cancel);

      setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_ok)
        {
            isOK = true;
        }
        else
        {
            isOK = false;
        }
        setVisible(false);
    }

    public boolean isOK() {
        return isOK;
    }

    public String getNaam() {
        return tf_naam.getText();
    }

    public String getPW()
    {
        return tf_pw.getText();
    }


}
