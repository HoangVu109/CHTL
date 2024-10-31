/*
 * @ (#) Account.java       1.0     27/10/2024
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

public class Account {
    private String username;
    private String password;
    private String role;
    private Employee employee;

    public Account() {
    }

    public Account(String username, String password, String role, Employee employee) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.employee = employee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployeeId(Employee employee) {
        this.employee = employee;
    }
}
