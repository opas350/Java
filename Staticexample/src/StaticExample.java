
class Counter {
	public static int COUNT=0;
	Counter() {
		COUNT++;
	}
}
public class StaticExample {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		System.out.println(Counter.COUNT);
	}

}

// Result 2

/*
The output is 2, because the COUNT variable is static and gets incremented by one each time
a new object of the Counter class is created. In the code above, we created 2 objects.
You can also access the static variable using any object of that class, such as c1.COUNT.
*/