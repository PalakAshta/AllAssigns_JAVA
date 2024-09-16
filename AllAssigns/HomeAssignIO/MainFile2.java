package HomeAssignIO;

import java.io.File;

public class MainFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String fname="eg.txt";
    File f1=new File(fname);
    if(f1.exists()) {
    	System.out.println(fname+" File exits in ");
    	if(f1.canExecute())
    		System.out.println("Execute Mode");
    	if(f1.canRead())
    		System.out.println("Read Mode");
    	if(f1.canWrite())
    		System.out.println("Write Mode");
    	
    	System.out.println(f1.length());
    	
        int lastIndexOfDot = fname.lastIndexOf('.');
        if (lastIndexOfDot == -1) {
            System.out.println("Unknown type"); // No extension found
        }
        System.out.println(fname.substring(lastIndexOfDot + 1)); 
    	
    }
    else
    	System.out.println(fname+" File Does not exist");
    
	}

}
