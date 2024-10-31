/*
 * @ (#) MainGui.java       1.0     30/10/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package edu.iuh.fit.cs.gui.workplaces;
/*
 * @decription:
 * @author: Hoang Vu
 * @date:   30/10/2024
 * @version: 1.0
 */

import edu.iuh.fit.cs.gui.Gui;
import edu.iuh.fit.cs.gui.GuiController;

public abstract class WorkplaceGui extends Gui {
    public WorkplaceGui(Gui upperGui, GuiController guiController) {
        super(upperGui, guiController);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750,500);
        setLocationRelativeTo(null);
    }
}
