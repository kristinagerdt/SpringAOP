package org.example.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount() {
        System.out.println("[" + getClass() + "] doing work in DB... adding an Membership Account");
    }
}