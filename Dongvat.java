/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.inheritance;

/**
 *
 * @author vovan
 */
public class Dongvat {
    private boolean anchay;
    private String an;
    private int khongcochan;
    public Dongvat(){}
    public Dongvat(boolean chay, String thucan, int khongchan){
    this.anchay= chay;
    this.khongcochan= khongchan;
    this.an= thucan;
    }
    public boolean isAnchay(){
        return anchay;
    }
    public void setAnchay(boolean anchay){
    this.anchay = anchay;
    }
    public String getAn(){
        return an;
    }
    public void setAn(String an){
    this.an= an;
    }
    public int getKhongcochan(){
     return khongcochan;
    }
    public void setKhongcochan(int khongcochan){
    this.khongcochan = khongcochan;
    }
    }
