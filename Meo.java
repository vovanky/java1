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
public class Meo extends Dongvat {
    private String mau;
    
    public Meo(boolean chay, String thucan, int khongchan){
    super(chay, thucan, khongchan);
    this.mau="white";
    }
    public Meo(boolean chay, String thucan, int khongchan, String mau){
    super(chay, thucan, khongchan);
    this.mau=mau;
    }
    public String getMau(){
    return mau;
    }
    public void setMau(String mau){
    this.mau=mau;
    }
}
