package collectionprac;

import java.util.*;

public class EX1_2_3_4 {
	
	public static void colors(String str) {
		
		ArrayList colorList = new ArrayList();
		colorList.add("red");
		colorList.add("blue");
		colorList.add("yellow");
		colorList.add(str);
		
		System.out.println("Colors: " + colorList);
		
		//iterate arraylist
		Iterator itr = colorList.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterations: " + itr.next());
		}
		
		//arraylist for reverse of original
		ArrayList<String> newColors = reverse(colorList);		
		System.out.println("Reverse Colors" + newColors);
				
		//comparing arraylists
		ArrayList<String> colorList2 = new ArrayList<String>(Arrays.asList("black", "grey", "white", "blue"));
		
		//sort arraylists
		Collections.sort(colorList);
		Collections.sort(colorList2);
		
		colorList.retainAll(colorList2);

		
		System.out.println("Common colors: " + colorList);
	}
	
	//reverse arraylist
	public static ArrayList<String> reverse(ArrayList<String> colorList) {
		ArrayList<String> revColor = new ArrayList<String>();
		
		for(int i = colorList.size() - 1; i >= 0; i--) {
			revColor.add(colorList.get(i));
		}
		
		return revColor;
	}

}
