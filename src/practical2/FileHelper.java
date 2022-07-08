package practical2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class FileHelper {

	public static void main(String[] args){
		File file = null;
		try {			
			file = new File("C:/Users/Vishwanath/eclipse-workspace/TakeHomeExam2/src/Data/Object.properties");		
						
			boolean fExists = file.exists();
			
			if(!fExists) 
			{
				throw new FileNotFoundException();
			} else {
				System.out.println("File Exists");				
				Properties p = new Properties();  
			    p.load(new FileReader(file));  
			    
			   Set sKeys = p.keySet();
			   Iterator<String> i = sKeys.iterator();		       
		        while (i.hasNext()) 
		        {
		        	String sKey = i.next();		        	
		        	System.out.println(sKey);
		        	
		        	String sValues = (String)p.get(sKey);	
		        	
		        	String[] myArray = sValues.split(",");
		        	for(int j=0; j<myArray.length;j++) 
		        	{
		        		System.out.println(myArray[j]);
		        	}        	
		        	System.out.println();
		        }		            
		    }
		} 
		catch (FileNotFoundException ex)
		{
			System.out.println("File does not exists, please check the file name and/or path !!!" + ex.getMessage());
			ex.printStackTrace();
		} 
		catch(Exception e) 
		{
			System.out.println("Exception !!!" + e.getMessage());
			e.printStackTrace();
		}		
	}
}
