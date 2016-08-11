package leetcode;

import java.util.HashSet;

public class Ransom_Note {

	public static void main(String[] args) {
		
		System.out.println(canConstruct("aasd", "asjjbjasdjasdhnk"));
		
	}
	
	
	private static boolean canConstruct(String ransomNote, String magazine) {
		
		if(ransomNote.length()==0) return true;
        
        HashSet<Integer> index = new HashSet<>();
        
        int len = ransomNote.length();
        
        for(int i=0;i<len;i++){
            
            for(int j = 0;j<magazine.length();j++){
                
                if(magazine.charAt(j)==ransomNote.charAt(i)){
                    
                    if(index.contains(j))    continue;
                    else{
                        index.add(j);
                        break;
                    }    
                    
                }
                
            }
            
        }
        
        if(index.size()==len)   return true;
        else return false;
        
	}
	

}
