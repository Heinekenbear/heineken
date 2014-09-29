import java.util.HashMap;

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) 
     { 
    	 this.label = x; 
    }
}
public class CopyRandomList {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
        	return head;
        RandomListNode originTag = new RandomListNode(0);
        originTag.next = head;
        RandomListNode headCopy = new RandomListNode(head.label);
        RandomListNode copyTag = new RandomListNode(0);
        copyTag.next = headCopy;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        map.put(head, headCopy);
        head = head.next;
        while(head != null){
        	RandomListNode temp = new RandomListNode(head.label);
        	headCopy.next = temp;
        	map.put(head, temp);
        	head = head.next;
        }
        head = originTag.next;
        headCopy = copyTag.next;
        while(head != null){
        	if(head.random == null){
        		headCopy.random = null;
        		head = head.next;
        		headCopy = headCopy.next;
        	}
        	else{
        		headCopy.random = map.get(head.random);
        		head = head.next;
        		headCopy = headCopy.next;
        	}
        }
        return copyTag.next;
    }
}