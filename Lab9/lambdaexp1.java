package comcapgemini.trainingsession.Lab9;


interface powerfinder{  
     double power(int a,int b);  
} 
public class lambdaexp1{  
    public static void main(String[] args) {  


	  powerfinder p1=( x, y) -> Math.pow(x,y); //Expression for finding x power of y 
	  System.out.println(p1.power(2,2));  
    }
}
