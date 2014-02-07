package com.relvar.mysqldumpsplitter;

/**
 *
 * @author linehanp
 */
public class SQLFormatHelper
{
  
  public String RemoveMySQLQuotes(String inputLine)
  {
    inputLine = inputLine.replace("`", "");
   
    return inputLine;
  }

}
