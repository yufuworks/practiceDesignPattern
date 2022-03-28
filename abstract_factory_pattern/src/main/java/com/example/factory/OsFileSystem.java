package com.example.factory;

public abstract class OsFileSystem {
  
  /**
   * ファイルセパレーターを取得
   */
  public abstract String getFileSeparetor();

  /**
   * ルートパスを取得
   */
  public abstract String getRootPath();

  /**
   * ファイルを保存
   */
  public abstract void saveFile(String fileName);

}
