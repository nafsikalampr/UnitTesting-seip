package dmst.seip.nafsikalampr.unit_testing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MyFileUtilities {
    public int[] readFile(String filepath) throws IllegalArgumentException {

    	    //initializing list
    	    ArrayList<Integer> integers = new ArrayList<Integer>();
    	    
    	    try {
    	       BufferedReader br = new BufferedReader(new FileReader(filepath));
    	       while(br.readLine()!= null){
    	    	   //reading and adding elements to list as long as the file hasn't ended
    	          integers.add(Integer.parseInt(br.readLine()));
    	       }
               //closing our reader
    	       br.close();

            //exception in case class can't read our file
    	    }catch(Exception ex){
    		   throw new IllegalArgumentException("error reading filepath" +ex.getMessage());
    	    }
    	    //converting from list to array named "result"
    	    int[] result = new int[integers.size()];
    	    for (int i=0; i<integers.size(); i++) {
    	    	   result[i] = integers.get(i);
    	    }
    	    return result;
    }
}
