package Lab;

abstract class AA 
{ 
	abstract void callme(); 
	void callmetoo() 
	{ 
		System.out.println ("This is a concrete method ."); 
	} 
} 
class BB extends AA
{ 
	void callme() 
	{ 
		System.out.println ("B’s implementation of callme."); 
	} 
} 
class AbstractDemo 
{ 
	public static void main (String args[]) 
	{ 
		BB b = new BB(); 
		b.callme(); 
		b.callmetoo(); 
	} 
} 
