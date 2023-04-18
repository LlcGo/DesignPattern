package com.lc.framework.utils;

/**
 * @Author Lc
 * @Date 2023/4/18
 * @Description
 */
public class StringUtils {
    private StringUtils(){

    }
    //userDao ==> setUserDao
  public static String getSetterMethodByFieldName(String fieldName){
      String methodName = "set" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
      return methodName;
  }
}
