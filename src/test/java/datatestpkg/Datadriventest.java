package datatestpkg;
import org.testng.annotations.Test;
import basepkg.Basecls;
import datapagepkg.Datadrivnpage;
import utilitypkg.Excelutil;

public class Datadriventest extends Basecls

{
   @Test
   public void verifyLoginWithValidcred() throws Exception
   {
	  Datadrivnpage p1= new Datadrivnpage(driver);
	  
	  String xl= "C:\\Users\\deepe\\Documents\\seleniumfldr\\dtinput.xlsx";
	  String sheet="sheet1";
	   int rowCount= Excelutil.getRowcount(xl,sheet);
	   System.out.println(rowCount);
	   for (int i=1;i<=rowCount;i++)
	   {
		    String username= Excelutil.getCellValue(xl,sheet,i,0);
      	    System.out.println("Username= "+username);
      	    String password= Excelutil.getCellValue(xl,sheet,i,1);
   	        System.out.println("Password= "+password); 
   	        p1.setValues(username,password);
   	        p1.login();
   	        
   	         String expectedurl= "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjIwMzg4MTQ0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
			 String actualurl= driver.getCurrentUrl();
  			  
			     if(actualurl.equals(expectedurl))
			     {
			    	System.out.println("pass");
			     }else
			     {
			    	System.out.println("fail");
			     }
		     p1.clearemail();


	  
   }
	
	
   }
}
