/*
 * @ (#) LoginGUI.java       1.0     30/10/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package edu.iuh.fit.cs.gui;
/*
 * @decription:
 * @author: Hoang Vu
 * @date:   30/10/2024
 * @version: 1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGui extends Gui implements ActionListener {
    JLabel accountLabel = new JLabel("Tài khoản: ");
    JTextField accountField = new JTextField();
    JLabel passwordLabel = new JLabel("Mật khẩu: ");
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Đăng nhập");

    public LoginGui(Gui upperGui, GuiController guiController) {
        super(upperGui,guiController);
        setLayout(new BorderLayout());
        accountLabel.setPreferredSize(new Dimension(100, 30));
        passwordLabel.setPreferredSize(new Dimension(100, 30));
        accountField.setPreferredSize(new Dimension(200, 30));
        passwordField.setPreferredSize(new Dimension(200, 30));
        loginButton.setPreferredSize(new Dimension(100, 30));

        passwordField.setEchoChar('*');
        Box formBox = Box.createVerticalBox();
        Box accountBox = Box.createHorizontalBox();
        Box passwordBox = Box.createHorizontalBox();
        JPanel formPanel = new JPanel();
        formPanel.add(formBox);
        Box buttonBox = Box.createHorizontalBox();
        accountBox.add(accountLabel);
        accountBox.add(accountField);
        passwordBox.add(passwordLabel);
        passwordBox.add(passwordField);
        buttonBox.add(loginButton);
        formBox.add(Box.createVerticalStrut(20));
        formBox.add(accountBox);
        formBox.add(passwordBox);
        add(loginButton, BorderLayout.SOUTH);
        add(formPanel);

        loginButton.addActionListener(this);
        setTitle("CỬA HÀNG TIỆN LỢI - ĐĂNG NHẬP");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String account = accountField.getText();
            String password = new String(passwordField.getPassword());
            if (account.equals("admin") && password.equals("admin")) {
                guiController.showWorkplace(0);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
            }
        }
    }
}