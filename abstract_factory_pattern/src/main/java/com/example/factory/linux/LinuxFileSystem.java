package com.example.factory.linux;

import com.example.factory.OsFileSystem;

public class LinuxFileSystem extends OsFileSystem {

	@Override
	public String getFileSeparetor() {
		return "/";
	}

	@Override
	public String getRootPath() {
		return "/";
	}

	@Override
	public void saveFile(String fileName) {
		String directory = getRootPath() + "usr" + getFileSeparetor() + fileName;
    System.out.println("saved: " + directory);
	}
  
}
