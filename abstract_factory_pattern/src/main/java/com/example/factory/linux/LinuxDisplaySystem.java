package com.example.factory.linux;

import com.example.factory.OsDisplaySystem;

public class LinuxDisplaySystem extends OsDisplaySystem {

	@Override
	public void displayOsName() {
		System.out.println("+++++++++++++");
    System.out.println("+++ Linux +++");
		System.out.println("+++++++++++++");
    System.out.println();
	}
  
	@Override
	public void displayStr(String str) {
    System.out.println("+++" + str + "+++");
		System.out.println();
	}
  
}
