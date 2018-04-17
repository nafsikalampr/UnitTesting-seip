package dmst.seip.nafsikalampr.unit_testing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
* This class reads txt file and creates the array of its elements 
*/

public class MyFileUtilities {
    
    /**
    * method reads txt from path
    * @param filepath
    * @exception is thrown in case method can not read file from path
    * reads the elements and adds them to list and converts list to array
    */
    
    public int[] readFile(String filepath) throws IllegalArgumentException {

    	    ArrayList<Integer> integers = new ArrayList<Integer>();
    	    
    	    try {
    	       BufferedReader br = new BufferedReader(new FileReader(filepath));
    	       while(br.readLine()!= null){
    	    	   //reading and adding elements to list as long as the file hasn't ended
    	          integers.add(Integer.parseInt(br.readLine()));
    	       }
    	       br.close();

    	    }catch(Exception ex){
    		   throw new IllegalArgumentException("error reading filepath" +ex.getMessage());
    	    }
        
    	    int[] result = new int[integers.size()];
    	    for (int i=0; i<integers.size(); i++) {
    	    	   result[i] = integers.get(i);
    	    }
    	    return result;
    }
}
