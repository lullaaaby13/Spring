package example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CollectionExample {
	
	public static void main(String[] args) {
		listExample();
		stackExample();
		
		
	}
	
	public static void listExample() {
		/*
		 * List �������̽��� ��ӹ��� ArrayList Ŭ���� ����.
		 */
		List<Integer> list = new ArrayList();
		
		// ����Ʈ�� �� �߰�.
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		
		System.out.print("List : ");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		
		System.out.println();
		
		list.sort(null);
		System.out.println(list.toString());
		
	}
	
	public static void stackExample() {
		System.out.println("--------------------------------------------------------");
		/* ���� ���� */
		Stack<Integer> stack = new Stack();
		
		stack.push(3);
		stack.push(1);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		
		System.out.println("Stack - POP : " + stack.pop());
		System.out.println("Stack - POP : " + stack.pop());
		System.out.println("Stack - POP : " + stack.pop());
		
		System.out.println("Stack - Value At Position 1 : " + stack.get(1));
		System.out.println("Stack - Value At Position 0 : " + stack.get(0));
		
	}

}
