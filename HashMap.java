class Pair
{
	int a;
	int b;
	Pair(int a ,int b)
	{
		this.a=a;  this.b=b;
	}
}

class Node
{
	Pair data;
	Node next;
	Node(Pair p)
	{
		data=p;
		next=null;
	}
}




class HashMap
{
	Node ar[] = new Node[10];
	
	
	int hashvalue(int x)
	{
		return x%10;
	}
	
	
	

	int size=0;
	
	public void put(int key ,int value)
	{
		
		
		int i=hashvalue(key);  
		
   
			if(ar[i]==null)
			{
				ar[i]=new Node(new Pair(key,value)); size++; return;
			}
			
			
			Node temp = ar[i]; Node prev=null;
			
			while(temp!=null)
			{
				if(temp.data.a==key)
				{
					temp.data.b=value; return;
				}
				prev=temp;
				temp=temp.next;
			}
			size++;
			prev.next=new Node(new Pair(key,value));
				
				
	}
	
	
	public int size(){ return size;}
	
	public boolean empty(){ return size==0 ; }

	public int get(int key)
	{
		int i=hashvalue(key);  
		
		Node temp= ar[i];
		
		while(temp!=null)
		{
			if(temp.data.a==key) return temp.data.b;
			temp=temp.next;
		}
				
		return -1;
	}
	
	
	
	public boolean containsKey(int key)
	{
		int i=hashvalue(key);  
		
		Node temp= ar[i];
		
		while(temp!=null)
		{
			if(temp.data.a==key) return true;
			temp=temp.next;
		}
				
		return false;
	}
	
}






public class ImpHashMap2
{
	
	public static void main(String[] args)
	{
		
		HashMap h=new HashMap();
	    	
		System.out.println(h.empty());//true
		h.put(1,10);
		System.out.println(h.get(1));//10
		System.out.println(h.size());//1
		h.put(1,20);
		System.out.println(h.get(1));//20
		System.out.println(h.size());//1
		h.put(11,110);
		System.out.println(h.get(11));//110
		System.out.println(h.containsKey(2));//false
		h.put(2,20);
		System.out.println(h.get(2));//20
		System.out.println(h.size());//3
		System.out.println(h.containsKey(2));//true
		System.out.println(h.empty());//false
		
	}
	
	
	
}










