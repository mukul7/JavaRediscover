public class commandline
{
	public static void main(String[] args)
	{
		if(args.length==0)
			return;
		for(int i = 0;i<args.length;i++)
			System.out.println("args: "+i +" is ->"+args[i]);
		System.out.println(args[0] + args[1]);
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}


}
