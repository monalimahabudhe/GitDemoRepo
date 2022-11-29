package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListIterator {

	public static void main(String[] args) {
		ArrayList <String> SL = new ArrayList<String>();
		
		SL.add("Monali");
		SL.add("Aveer");
		SL.add("Agatsya");
		SL.add("Reyansh");
		SL.add("Rishaan");
		SL.add("Nihit");
		
		//for Each Loop
		for(String s : SL)
		{
			System.out.println(s);
		}
		
		Iterator<String> It = SL.iterator();
		
		while(It.hasNext())
		{
		System.out.println(It.next());
		}
		
	}
	
}

