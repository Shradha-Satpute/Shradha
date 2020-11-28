package com.capgemini.trainingsession.Lab6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//MapInteger [] list= new Integer[4];
		  Integer [] list= new Integer[4];
        list[0]=205;
        list[1]=115;
        list[2]=501;
        list[3]=101;
        int status=getSorted(list);
        if(status==1) {
            for(Integer m: list) {
                System.out.println(m);
            }
        }else {
            System.out.println("Unable to sort");
        }
        
        
        Integer checkList[]= getSortedAgain();
        
        for(Integer m: checkList) {
            System.out.println(m);
        }

 

    }
    private static Integer[] getSortedAgain() {
        Integer [] list= new Integer[4];
        list[0]=205;
        list[1]=115;
        list[2]=501;
        list[3]=101;
        String [] reverseNumbers = new String[list.length];

 

        for(int i=0;i<list.length;i++) {
            reverseNumbers[i]= list[i].toString();
            StringBuffer sb= new StringBuffer(reverseNumbers[i]);
            reverseNumbers[i]=sb.reverse().toString();
            list[i]= Integer.parseInt(reverseNumbers[i]);

 

        }        

 

        Arrays.sort(list);
        return list;
    }
    
    
    private static int getSorted(Integer[] list) {

 

        String [] reverseNumbers = new String[list.length];

 

        for(int i=0;i<list.length;i++) {
            reverseNumbers[i]= list[i].toString();
            StringBuffer sb= new StringBuffer(reverseNumbers[i]);
            reverseNumbers[i]=sb.reverse().toString();
            list[i]= Integer.parseInt(reverseNumbers[i]);

 

        }        

 

        Arrays.sort(list);
        return 1;
    }

}
