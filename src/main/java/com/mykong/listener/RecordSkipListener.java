package com.mykong.listener;

import org.springframework.batch.core.SkipListener;

public class RecordSkipListener implements SkipListener<Object, Object> {

	@Override
	public void onSkipInProcess(Object arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSkipInRead(Throwable arg0) {
		System.out.println("Skipping reading step");
		
	}

	@Override
	public void onSkipInWrite(Object arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

}
