/*
 * @ (#) Gui.java       1.0     30/10/2024
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

import edu.iuh.fit.cs.gui.workplaces.AdminGui;
import edu.iuh.fit.cs.gui.workplaces.EmployeeGui;
import edu.iuh.fit.cs.gui.workplaces.ManagerGui;

public class GuiController {
    private String account;
    private int role;
    public GuiController() {
    }
    public void init() {
        new LoginGui(null, this);
    }
    protected void showWorkplace(int role) {
        switch (role) {
            case 0 -> new AdminGui(null, this);
            case 1 -> new ManagerGui(null, this);
            case 2 -> new EmployeeGui(null, this);
        }
    }
}


