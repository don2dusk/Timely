/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.timely;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author otega
 */
public class Splash extends JFrame {
    static int x = 0;
    static Timer timer;
    
    public Splash() {
        initComponents();
        timer = new Timer(7, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timely.setForeground(new Color(0, 153, 153, x++));
                
                if (x == 255) {
                    timer.stop();
                }
            }
        });
        timer.start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timely = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        timely.setFont(new java.awt.Font("Futura", 0, 72)); // NOI18N
        timely.setForeground(new java.awt.Color(0, 153, 153));
        timely.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timely.setText("Timely.");

        cp.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        cp.setForeground(new java.awt.Color(153, 153, 153));
        cp.setText("©2023 don2dusk.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(timely, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(timely, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(cp)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    void run() {
        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setVisible(false);
        Timely timely = new Timely();
        timely.getRootPane().putClientProperty( "apple.awt.fullscreenable", false );
        timely.run();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timely;
    // End of variables declaration//GEN-END:variables
}
