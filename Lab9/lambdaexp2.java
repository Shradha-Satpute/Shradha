package comcapgemini.trainingsession.Lab9;


interface StringFunction {
	  String run(String str);
	}

	public class lambdaexp2 {
	  public static void main(String[] args) {
	    StringFunction exclaim = (s) -> s ;
	   
	    printFormatted("CG",exclaim);
	
	  }
	  public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str.replaceAll("\\B" , " "));
	    System.out.println(result);
	  }
	}

