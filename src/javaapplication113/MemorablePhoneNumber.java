/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication113;

import java.util.ArrayList;

/**
 *
 * @author CrJ
 */
public class MemorablePhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] sarray = {"ITSEASY", "888-4567", "F101010", "888-1200", "TUT-GLOP", "-4-8-7-3-2-7-9",
            "310-GINO", "967-11-11", "487-3279", "888-4567"}; 
        //array for strings
        for(String number : sarray){
        
            System.out.print(number+", ");
        
        
        }
        System.out.println();
        int n = 1;
        ArrayList<String> saved = new <String>ArrayList();
        //String[] saved = new String[sarray.length];//array for saving formatted strings
        String l = "";
       // String s = "ITSEASY";                        


                                                    //dialer keypad
        //String s1 = "";
        String forABC = "ABC";
        String forDEF = "DEF";
        String forGHI = "GHI";
        String forJKL = "JKL";
        String forMNO = "MNO";
        String forPQRS = "PQRS";
        String forTUV = "TUV";
        String forWXYZ = "WXYZ";

        for (int m = 0; m < sarray.length; m++) {//running the loop for number of strings
            l = sarray[m];                       //saving each string in sarray 
           // s1 = "";                             // storing the formatted letters in new string
            StringBuilder sb = new StringBuilder(9);

            for (int i = 0; i < l.length(); i++) {       //length of the string
                char c = l.charAt(i);                    //for each char if letter or digit

                if (Character.isDigit(c)) {

                    sb.append(c);

                }
                if (Character.isLetter(c)) {

                    for (int j = 0; j < forABC.length(); j++) {

                        if (l.charAt(i) == forABC.charAt(j)) {

                            sb.append('2');

                        } else if (l.charAt(i) == forDEF.charAt(j)) {

                            sb.append('3');

                        } else if (l.charAt(i) == forGHI.charAt(j)) {

                            sb.append('4');

                        } else if (l.charAt(i) == forJKL.charAt(j)) {

                            sb.append('5');

                        } else if (l.charAt(i) == forMNO.charAt(j)) {

                            sb.append('6');

                        } else if (l.charAt(i) == forTUV.charAt(j)) {

                            sb.append('8');

                        }

                    }

                }
                if (Character.isLetter(c)) { // dialer keypad number having more than three letters
                    for (int k = 0; k < forPQRS.length(); k++) {
                        if (l.charAt(i) == forPQRS.charAt(k)) {
                            sb.append('7');

                        } else if (l.charAt(i) == forWXYZ.charAt(k)) {

                            sb.append('9');

                        }
                    }
                }

                //   System.out.println(s1);
            }
            // System.out.println(s1);

            //saved[m] = sb.toString();//storing the formatted string in new array
            saved.add(sb.toString());
            //ar.contains(m)
            //  System.out.println(ar);

        }
        System.out.println(saved);
        for (int i = 0; i < saved.size(); i++) {
            n = 0;
            for (int j = i + 1; j < saved.size(); j++) {
                if (saved.get(i).equals(saved.get(j))) {

                    // System.out.println(ar.get(j));
                    saved.remove(j);
                    n++;

                }

            }
            System.out.println(saved.get(i) + " is repeated :" + n);
        }
        System.out.println(saved);
        //System.out.println(n);

    }
}
