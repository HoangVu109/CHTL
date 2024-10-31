/*
 * @ (#) Bill.java       1.0     27/10/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package edu.iuh.fit.cs.entities;
/*
 * @decription:
 * @author: Hoang Vu
 * @date:   27/10/2024
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private String billId;
    private String customerId;
    private String employeeId;
    private String date;
    private double total;
    private String status;
    private ArrayList<BillDetail> billDetails;
}
