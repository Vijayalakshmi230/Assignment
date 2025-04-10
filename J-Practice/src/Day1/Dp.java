package Day1;

public class Dp {
	public static void main(String args[])
	{
		int a[] = {2, 5, 7, 7, 8, 23, 4, 5};
        int pos = 2;
        int val = 99;
 
        int[] newArr = new int[a.length + 1];
 
        for (int i = 0; i < pos; i++) {
            newArr[i] = a[i];
        }
 
        newArr[pos] = val;
 
        for (int i = pos; i < a.length; i++) {
            newArr[i + 1] = a[i];
        }
 
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
	}

}
