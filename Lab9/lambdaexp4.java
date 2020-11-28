package comcapgemini.trainingsession.Lab9;

	@FunctionalInterface 
	interface MyInterface{  
	    void display();  
	}  
	public class lambdaexp4 { 
		
	    public void myMethod()
	    {  
	    	
		System.out.println("Instance Method");  
		
	    }  
	   
	    public static void main(String[] args) { 
	    	
		lambdaexp4 obj = new lambdaexp4(); 
		
	
		MyInterface ref = obj::myMethod;  
       
		ref.display();  
		
	    }  
	}
