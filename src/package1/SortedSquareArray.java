package package1;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedSquareArray {

	private String sortSquaredArrayElements(int[] n) {
		//		List<Integer> al = new ArrayList<>();
		//		for(int n1 : n)
		//		{
		//			al.add(n1);
		//		}
				
		//		for(int i=0;i<al.size();i++)
		//		{
		//			al.set(i, (al.get(i)*al.get(i)));
		//		}
		//		Collections.sort(al);
		//		System.out.println(al);
				for(int i=0;i<n.length;i++)
				{
					n[i] = n[i]*n[i];
					
				}
				Arrays.sort(n);
				String s = Arrays.toString(n);
		return s;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {5,2,3,-6,8};
		Assert.assertEquals(sortSquaredArrayElements(n), "[4, 9, 25, 36, 64]");
	}

}
