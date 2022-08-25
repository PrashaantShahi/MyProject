package assignment.java;

 class Area {
	 
	int l,b;
	int area;
	
	void setDim(int x,int y)
	{
		
		area=x*y;
		System.out.println("Area:"+area);
	}
	
	int getArea()
	{
		area=l*b;
		return area;
	}
}

