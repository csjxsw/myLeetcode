package com._389;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindtheDifference {
	public static void main(String args[]){
		String s = "abcd";
		String t = "abcde";
		char res = findTheDifference(s,t);
		System.out.println(res);
		System.out.println("end");
	}
	
	
    public static char findTheDifference(String s, String t) {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Map<Character,Integer> sMap = new HashMap<Character,Integer>();
        Map<Character,Integer> tMap = new HashMap<Character,Integer>();
        int i;
        char res = 0;
        for(i=0;i<sArray.length;i++){
        	if(sMap.containsKey(sArray[i])){
        		sMap.put(sArray[i], sMap.get(sArray[i])+1);
        	}else{
        		sMap.put(sArray[i], 1);
        	}
        }
        for(i=0;i<tArray.length;i++){
        	if(tMap.containsKey(tArray[i])){
        		tMap.put(tArray[i], tMap.get(tArray[i])+1);
        	}else{
        		tMap.put(tArray[i], 1);
        	}
        }
        for(i=0;i<tArray.length;i++){
        	if(sMap.get(tArray[i])==null || tMap.get(tArray[i])>sMap.get(tArray[i])){
        		res = tArray[i];
        		break;
        	}
        }
        return res;
    }
}
