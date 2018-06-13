package TestMybatis;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestThrd {
	public static void main(String[] args) {
		// List<String> myList = new CopyOnWriteArrayList<String>();
		// myList.add( "1");
		// myList.add( "2");
		// myList.add( "3");
		// myList.add( "4");
		// myList.add( "5");
		//
		// Iterator<String> it = myList.iterator();
		//
		// while (it.hasNext()) {
		// String value = it.next();
		// if (value.equals( "3")) {
		// myList.remove( "4");
		// myList.add( "6");
		// myList.add( "7");
		// }
		// }
		// System. out.println( "List Value:" + myList.toString());
		int i, j, x = 0;
		for (i = 0; i < 2; i++) {
			x++;
			for (j = 0; j <= 3; j++) {
				if(j%2==0)continue;
				x++;
				System.out.println(x);
			}
//			System.out.println(j);
			x++;
		}
		System.out.println(0%2);

	}
}
