  /*
	 * Given an of only 0,1,2 element values where
	 * 0-Red, 1-Blue, 2-Green. Find how many possible RBGs are 
	 * adjacent to each other in any order. It is a O(n) solution
	 * with O(1) Space Complexity.
	 */
	public int getNumberOfRBGInAnyOrder(int[] a)
	{
		if(a==null || a.length<3)
			return 0;
		
		int prevProd=(a[0]+1)*(a[1]+1)*(a[2]+1);
		int res= (prevProd==6)? 1:0;
		int currentProduct;
		
		for(int i=1;i<a.length-2;i++)
		{
			currentProduct= (a[i+2]+1)*(prevProd/(a[i-1]+1));
			if(currentProduct==6)
				res++;
			prevProd=currentProduct;
		}
		
		return res;
	}
