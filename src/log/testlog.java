package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class testlog {
	
	static Logger log=null;
     public static void main(String a[]){
    	 PropertyConfigurator.configure("log4j.properties");
    	 log=Logger.getLogger(testlog.class);
    	 hahah();
    	
     }
   public static void hahah(){
	   
	   log.error("fghggfhgfhfgh");
  	 log.debug("debug");
  	 log.info("information");
	   
   }  
}
