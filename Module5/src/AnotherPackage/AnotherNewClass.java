/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnotherPackage;

import SourcePackage.SourceJava;

/**
 *
 * @author testuser
 */
public class AnotherNewClass {
    
    public static void main(String args[]){
        SourceJava obj = new SourceJava();
        System.out.println(obj.publicInt);
        //System.out.println(obj.privateInt);
        //System.out.println(obj.protectedInt);
        //System.out.println(obj.defaultInt);
    }

}
