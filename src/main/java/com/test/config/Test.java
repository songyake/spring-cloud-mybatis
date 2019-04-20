package com.test.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.LinkedList.Node;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		List l = new LinkedList<>();
		Map map = new HashMap<String,String>();
		map.put("a", 5);
		map.put("a",4);
		Object v = map.put("a", 6);
		System.out.println(v);
		Test t = new Test();
		String s = new String("s");
		System.out.println(s);
		System.out.println(t.c(4));
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);   
	}
	void a(){
	}
	void b(String s){
	}
	int c(int a){
		if(a == 1){
			return 1;
		}
		return a*c(a-1);
	}
	
	static class Node<E>{
		E e;
		Node<E> prev;
		Node<E> next;
		Node(Node<E> prev, E element, Node<E> next) {
            this.e = element;
            this.next = next;
            this.prev = prev;
        }
	}
}