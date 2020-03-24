package com.Junit.TDDTask;

public class RemovefirstAat01inString {
	String 	removeAFromStringinfirstTwoindex(String string) {
    	int stringlength=string.length();
    	if(stringlength==1 && string.charAt(0)=='A') {
    		string="";
    	}
    	else if(stringlength==2 && string.charAt(0)=='A'&& string.charAt(1)=='A') {
    		string ="";
    	}
    	else if(stringlength==2 && string.charAt(0)=='A'&& string.charAt(1)!='A') {
    		string=""+string.charAt(1);
    	}
    	else if(stringlength==2 && string.charAt(0)!='A'&& string.charAt(1)=='A') {
    		string=""+string.charAt(0);
    	}
    	else if(stringlength>2 && string.charAt(0)=='A'&& string.charAt(1)=='A') {
    		string=string.substring(2);
    	}
    	else if(stringlength>2 && string.charAt(0)!='A'&& string.charAt(1)=='A') {
    		string=""+string.charAt(0)+string.substring(2);
    	}
    	else if(stringlength>2 && string.charAt(0)=='A'&& string.charAt(1)!='A') {
    		string = string.substring(1);
    	}
    	return string;
    }
}
