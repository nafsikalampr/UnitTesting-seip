package dmst.seip.nafsikalampr.unit_testing;

import org.mockito.InjectMocks;

public class MyArrayOperations {
	
    //getting ready for mocking
	@InjectMocks
    private MyFileUtilities utils;
	public Object gradeFrequencies;
	
    public int[] gradeFrequencies(String filepath,MyFileUtilities utils) {
    	    
            //using utils to call the readFile method for the specific filepath
    	    int[] array = utils.readFile(filepath);

            //initializing return array
    	    int[] frequency =new int[array.length];

            //loop to add elements
    	    for (int i=0; i< array.length ; i++) {
        	    if (array[i]==0) {
        	    	   frequency[0]++;
        	    }else if(array[i]==1){
                    ++frequency[1];
                }else if(array[i]==2){
                    ++frequency[2];
                }else if(array[i]==3){
                    ++frequency[3];
                }else if(array[i]==4){
                    ++frequency[4];
                }else if(array[i]==5){
                    ++frequency[5];
                }else if(array[i]==6){
                    ++frequency[6];
                }else if(array[i]==7){
                    ++frequency[7];
                }else if(array[i]==8){
                    ++frequency[8];
                }else if(array[i]==9){
                    ++frequency[9];
                }else if(array[i]==10){
                    ++frequency[10];
                }
    	    }
        return frequency;
    }
}
