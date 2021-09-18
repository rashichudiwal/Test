package hashmapImplementation;
public class HashMapImp 
{
	Node[] m=new Node[5];
	void add(int key, String value)
	{
		if(m[key%5]==null)
		{
			m[key%5]=new Node(key, value);
		}
		else
		{
			Node q=m[key%5];
			while(q.next!=null)
				q=q.next;
			q.next=new Node(key, value);
		}
	}
	void print()
	{
		for(int i=0; i< m.length; i++)
		{
			Node root=m[i];
			Node q=root;
			while(q!=null)
			{
				System.out.println(q.key+" "+q.value);
				q=q.next;
			}
		}
	}

}
