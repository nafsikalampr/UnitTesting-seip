package dmst.seip.nafsikalampr.unit_testing;

import org.mockito.InjectMocks;

public class MyArrayOperations {
	
    /**
    * In this class we create a array from the txt elements in the file
    * We use the readFile method in the MyFileUtilities to do that
    */
	
	@InjectMocks
    private MyFileUtilities utils;
	public Object gradeFrequencies;

    /**
    * Method counts how many time the grade appears in the txt and add it to frequency array
    * @param filepath	the txt path 
    * @param utils	the MyFileUtilities object we use to read the txt
    */
	
    public int[] gradeFrequencies(String filepath,MyFileUtilities utils) {
    	    
    	    int[] array = utils.readFile(filepath);

    	    int[] frequency =new int[array.length];

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
