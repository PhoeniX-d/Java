package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CustomizedRequest extends HttpServletRequestWrapper {
    public CustomizedRequest(HttpServletRequest request) {
        super(request);
    }    
    public String getParameter(String word) {
    	String word1 = super.getParameter(word);
    	System.out.println("Inside CustomizedRequest");
    	if(word1.equals("JAVA") || word1.equals("SCJP") || word1.equals("SCWCD") || word1.equals("SAT"))
    		return "SLEEP";
    	else
    		return word;
    }
}
