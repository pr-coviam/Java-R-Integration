

import org.rosuda.REngine.Rserve.RConnection;

public class Rserve {

	public static void main(String args[]){
		RConnection connection=null;
		try{
			connection=new RConnection();
			
			connection.eval("source('/Users/partha/Desktop/R/Rtest.R')");
			int num1=12;
			int num2=23;
			int sum=connection.eval("myadd("+num1+","+num2+")").asInteger();
			System.out.println("The Sum is -> "+sum);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
