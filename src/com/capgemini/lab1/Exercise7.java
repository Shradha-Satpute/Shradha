package com.capgemini.lab1;

class Exercise7 {

static boolean checkNumber (int num){
    
    boolean flag = false;
    int currentDigit = num % 10;
    num = num/10;
    
     
    //5
    while(num>0){
        //6
        if(currentDigit <= num % 10){
            flag = true;
            break;
        }

        currentDigit = num % 10;
        num = num/10;
    }
     
    //7
    if(flag){
        System.out.println(" is an increasing number.");
    }else{
        System.out.println(" is not an increasing number..");
    }
    return true;
}
}



