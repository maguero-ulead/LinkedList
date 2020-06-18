package cr.ac.ulead.linkedlist.estructures;

public class Link {
	public int iData;
	public double dData; 
	public Link next; 
	

	public Link(int id, double dd) 
	{
		iData = id;
		dData = dd;
	}

	public void displayLink() // display ourself
	{
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}
