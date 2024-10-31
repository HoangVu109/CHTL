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

import javax.swing.*;

public abstract class Gui extends JFrame {
    protected Gui upperGui;
    protected GuiController guiController;
    public Gui(Gui upperGui, GuiController guiController) {
        this.upperGui = upperGui;
        this.guiController = guiController;
    }
}
