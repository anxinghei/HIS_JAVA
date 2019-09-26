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

}
