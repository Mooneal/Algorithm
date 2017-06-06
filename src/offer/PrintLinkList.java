package offer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintLinkList {
	/*
	 * 需求：给定一个头结点引用，把链表从尾到头输出。
	 * */
	public static void main(String[] args){
		ListNode pHead=new ListNode();
		Solution3 s=new Solution3();
		LinkList list=new LinkList(pHead);
		list.add(1);
		list.add(2);
		list.add(3);
		pHead=pHead.next;
		ArrayList<Integer> arr=s.printListFromTailToHead(pHead);
		System.out.println(arr);
	}
	
	
}
class Solution {                                              //通过递归逆序输出。
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            arrayList.add(listNode.data);
        }
        return arrayList;
    }
}     
class Solution1{                               //通过递归逆序输出
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        
	        ListNode pNode=listNode;
	        if(pNode!=null){
	            if(pNode.next!=null){
	                list=printListFromTailToHead(pNode.next);
	            }
	            list.add(pNode.data);
	        }
	        
	        return list;
	    }
	
}
class Solution2{                                 //通过栈逆序输出。
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> s=new Stack<Integer>();
		while(listNode!=null){
			s.push(listNode.data);
			listNode=listNode.next;
		}
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(!s.isEmpty()){
			arr.add(s.pop());
		}
		return arr;
	}
}

class Solution3{                                 //通过ArrayList中的add(int index,int ele);
							//这个方法，是指把指定元素放在指定的位置，我们只有一只指定index=0，
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(listNode!=null){
			arr.add(0, listNode.data);
			listNode=listNode.next;
		}
		
		return arr;
	}
}
class Solution4{
	
}



