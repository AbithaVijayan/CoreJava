package Session;
//Task 11
import java.util.*;
public class MapInterface {
    public static void main(String[] args) {

    	
    	Map<String,employees> firstMap=new HashMap<String,employees>();
    	firstMap.put("N00", new employees("101","Abitha",14000));
    	firstMap.put("N01", new employees("102","Arun",500000));
    	firstMap.put("N02", new employees("103","Nancy",700000));
    	firstMap.put("N03",new employees( "104","Saritha",13000));
    	firstMap.put("N07",new employees( "105","Yashu",300000));
    	firstMap.put("N04",new employees( "106","Dia",400000));
    	firstMap.put("N09",new employees("107","Kavitha",600000));
    	firstMap.put("N05",new employees( "108","Ammu",12000));
    	firstMap.put("N06",new employees( "109","Sachin",50000));
    	firstMap.put("N08",new employees( "110","Virat",90000));
    	
    	
    	
    	TreeMap<String,employees> sorted=new TreeMap<String,employees>(firstMap);
    	
    	Iterator<String> it=sorted.keySet().iterator();
    	System.out.println("Sorted value of map");
    	while(it.hasNext()) {
    		String key=(String)it.next();
    		System.out.println(key+" "+firstMap.get(key));
    		}
    			
   
    	Iterator<String> itr=firstMap.keySet().iterator();
    	
    	while(itr.hasNext()) {
    		String key=(String)itr.next();
    		
    		employees sal=firstMap.get(key);
    	
    		
    			
					if (sal.esal<15000.0) {
						itr.remove();
						
					}
    	}
    	
    	Map<String,employees> finalMap=new HashMap<String,employees>();
    	for(Map.Entry<String, employees> entry:firstMap.entrySet()) {
    		finalMap.put(entry.getKey(), entry.getValue());
    	}
    	
    	System.out.println("================");
    	System.out.println("Value of new Map after removing the employees having salary less than 15000");
    	Iterator<String> itr1=finalMap.keySet().iterator();
    	while(itr1.hasNext()) {
    		String key=(String)itr1.next();
    		System.out.println(key+" "+firstMap.get(key));
    		}
    	firstMap.clear();
    	sorted.clear();
    	finalMap.clear();
    }
	
	
}

class employees {
	String eid;
	String ename;
	double esal;
	public employees(String eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee ID : " + eid + "\tEmployee Name : " + ename + "\tSalary : " + esal;
	}
	 
	
}
