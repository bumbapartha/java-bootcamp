package abcd.xyz;



	import java.util.*;
	class cuboid
	{

	    private final int l;
	    private final int b;
	    private final int h;
	    public  cuboid()
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter length");
	        l=scan.nextInt();
	        System.out.println("enter breadth");
	        b=scan.nextInt();
	        System.out.println("enter height");
	        h=scan.nextInt();

	    }
	    public int v;
	    public int s;



	    public void vol()
	    {
	        v=l*b*h;
	        System.out.println(v);
	    }
	    public void surface()
	    {
	        s= l*b+l*b +b*h +b*h+h*l+h*l ;
	        System.out.println(s);
	    }

	}