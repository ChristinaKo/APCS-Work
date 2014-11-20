public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	
	for (int i=0;i<5;i++) {
	    L.add(i*10);
	}
	System.out.println(L);

	for (int i=0;i<12;i++) {
	    L.add(i*10);
	}
	System.out.println("-----------");
	System.out.println(L);
	L.insert(0,123456);
	System.out.println(L);
	L.insert(1,654321);
	System.out.println(L);
	System.out.println("-----------");
	System.out.println(L.remove(1));
	System.out.println(L);



    }


}
