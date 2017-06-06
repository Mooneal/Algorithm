package dataStruct;

import java.util.LinkedList;

public class LinkList {
	private int size;
	private Node first;
	private Node last;
	
	public LinkList(){
		first=new Node();
		last=first;
		size=1;
	}
	
	//在链表尾部插入元素。
	public void addLast(int data){
		LinkedList n=new LinkedList();
		Node pNew=new Node();
		pNew.setData(data);
		last.setNext(pNew);
		last=pNew;
		size++;
	}
	//链表的头插入
	public void addFirst(int data){
		Node pNew=new Node();
		pNew.setData(data);
		pNew.setNext(first.getNext());
		first.setNext(pNew);
		size++;
	}
	
	//链表指定位置插入。
	public void insetList(int index,int data){
		if(index<0 || index>size)
		
		while(index>1){
			last=last.getNext();
			index--;
		}
		Node pNew=new Node();
		pNew.setData(data);
		pNew.setNext(last.getNext());
		last.setNext(pNew);
	}
	
}
