package Day2;

public class abc {

	int a;
	static int b;

	abc() {
		a = 0;

	}

	static void show2() // use only static data // call this method with class name
	{
		System.out.println(b);

	}

	void show() {
		a++;
		b++;
		System.out.println(a + "    " + b);
	}

}
