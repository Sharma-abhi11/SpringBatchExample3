package com.mykong.exceptions;

@SuppressWarnings("serial")
public class SkipException extends Exception{
	String msg;
	

	
	public SkipException(String msg) {
		super();
		this.msg = msg;
	}



	@Override
	public String toString() {
		
		return "Exception occuredwhile readig";
	}
	

}
