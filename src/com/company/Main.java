package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	    JFrame jf = new JFrame();
        jf.setSize(1200,600);

        jf.setLayout(new FlowLayout());


        JButton btn_login = new JButton("Inloggen");

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialoog d = new Dialoog(jf);
                if(!d.getNaam().isEmpty() && !d.getPW().isEmpty()) {
                    JOptionPane.showMessageDialog(d, "U bent ingelogd");
                }
                else JOptionPane.showMessageDialog(d, "Inloggen is mislukt");

                /*
                    if(d.isOK()){
                        System.out.println(d.getNaam());
                        System.out.println(d.getPW());
                    }
                    else System.out.println("inloggen geannuleerd");

                 */
            }
        });


        jf.add(btn_login);

        JButton btn_logout = new JButton("Log uit");

        btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int keuze = JOptionPane.showConfirmDialog(
                        jf, "Weet u het zeker?", "Vraag",
                        JOptionPane.YES_NO_OPTION);

                if (keuze == JOptionPane.YES_OPTION) {
                    jf.setVisible(false);
                }
            }
        });
        jf.add(btn_logout);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
