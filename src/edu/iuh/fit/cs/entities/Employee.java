/*
 * @ (#) Employee.java       1.0     27/10/2024
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

import java.sql.Date;

public class Employee {
    private String id;
    private String name;
    private String phone;
    private String address;
    private String email;
    private Date hiredDate;
    private boolean isManager;

    public Employee() {
    }

    public Employee(String id , String name, String phone, String address, String email, Date hiredDate, boolean isManager) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.hiredDate = hiredDate;
        this.isManager = isManager;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setStatus(boolean isManager) {
        this.isManager = isManager;
    }
}
