package com.example.tuan1.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Log {
    private Account account;
    private LocalDate dateLogin;
    private LocalTime timeLogin;

    private LocalDate dateLogout;
    private LocalTime timeLogout;
    private String note;

    public Log(Account account, LocalDate dateLogin, LocalTime timeLogin, LocalDate dateLogout, LocalTime timeLogout, String note) {
        this.account = account;
        this.dateLogin = dateLogin;
        this.timeLogin = timeLogin;
        this.dateLogout = dateLogout;
        this.timeLogout = timeLogout;
        this.note = note;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDate getDateLogin() {
        return dateLogin;
    }

    public void setDateLogin(LocalDate dateLogin) {
        this.dateLogin = dateLogin;
    }

    public LocalTime getTimeLogin() {
        return timeLogin;
    }

    public void setTimeLogin(LocalTime timeLogin) {
        this.timeLogin = timeLogin;
    }

    public LocalDate getDateLogout() {
        return dateLogout;
    }

    public void setDateLogout(LocalDate dateLogout) {
        this.dateLogout = dateLogout;
    }

    public LocalTime getTimeLogout() {
        return timeLogout;
    }

    public void setTimeLogout(LocalTime timeLogout) {
        this.timeLogout = timeLogout;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
