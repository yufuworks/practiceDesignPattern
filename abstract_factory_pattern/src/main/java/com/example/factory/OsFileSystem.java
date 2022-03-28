package com.example.factory;

public abstract class OsFileSystem {
  
  public OsFileSystem() {

  }

  public abstract String getFileSeparetor();

  public abstract String getRootPath();

  public abstract void saveFile(String fileName);

}
