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
public class Dongvatkiemtrakethua {
    public static void main(String[] args) {
    Meo meo=new Meo( false, "ca", 4, "den");
            System.out.println("meo co an chay? " + meo.isAnchay());
		System.out.println("meo an " + meo.getAn());
		System.out.println("meo co " + meo.getKhongcochan() + " chan.");
		System.out.println("meo co mau " + meo.getMau());
    }
}
