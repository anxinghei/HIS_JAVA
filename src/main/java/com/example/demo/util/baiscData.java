package com.example.demo.util;

public class baiscData {
	
// 判断数字是否在数字数字内
	public static boolean in_array(int id,int[] ids) {
		int i = 0;
		for (; i < ids.length; i++) {
			if (id==ids[i]) {
				return true;
			}
		}
		if (i<ids.length) {
			return true;
		}else {
			return false;
		}
	}
// 切分权限集
	public static int[] splitString(String authString) {
		authString=authString.substring(1);
		String[] ruleStrings=authString.split(",");
		int[] rulesInt=new int[ruleStrings.length];
		for (int i = 0; i < ruleStrings.length; i++) {
			rulesInt[i]=Integer.parseInt(ruleStrings[i]);
		}
		return rulesInt;
	}
}
