package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		Parse.initialize(this,"i4UDNMhEjuivWz2mwUmedKKJuxj07NaJ2TSBUDhc","5Td2PR6T8X2JHqRdOGhESN5aqhi6UFSwuw6c3ub0");
	}
}
