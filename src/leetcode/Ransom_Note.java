package leetcode;

import java.util.HashSet;

/**
 * Given  an  arbitrary  ransom  note  string  and  another  string  containing
 *  letters from  all  the  magazines,  write  a  function  that  will  return
 *  true  if  the  ransom   note  can  be  constructed  from  the  magazines;  
 * otherwise,  it  will  return  false.    Each  letter  in  the  magazine
 *  string  can  only  be  used  once  in  your  ransom  note.
 * 
 * @author zyd
 * 
 */

public class Ransom_Note {

	public static void main(String[] args) {

		System.out.println(canConstruct("aasd", "asjjbjasdjasdhnk"));

	}

	private static boolean canConstruct(String ransomNote, String magazine) {

		if (ransomNote.length() == 0)
			return true;

		HashSet<Integer> index = new HashSet<>();

		int len = ransomNote.length();

		for (int i = 0; i < len; i++) {

			for (int j = 0; j < magazine.length(); j++) {

				if (magazine.charAt(j) == ransomNote.charAt(i)) {

					if (index.contains(j))
						continue;
					else {
						index.add(j);
						break;
					}

				}

			}

		}

		if (index.size() == len)
			return true;
		else
			return false;

	}

}
