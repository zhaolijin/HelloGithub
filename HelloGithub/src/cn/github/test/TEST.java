package cn.github.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello GitHub.");
//		Set<String> set = new HashSet<String>();//无序
		Set<String> set = new LinkedHashSet<String>();//有序(输入顺序)
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("11");
		set.add("22");
		set.add("#");
		set.add("##");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.hashCode()+":"+it.next());
		}
	}

}
