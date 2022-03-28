package com.example.factory;

public abstract class OsFactory {

  /**
   * コンストラクタ
   */
  public OsFactory() {

  }

  public static final OsFactory getFactory() {
    OsFactory osFactory = new WindowsFactory();
    return osFactory;
  }
  
  public abstract OsFileSystem createFileSystem();
  
  public abstract OsDisplaySystem createDisplaySystem();
}
