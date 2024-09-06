package recurssion;

public class MazePathProblem {

	public static void path(int cr, int cc, int destr, int destc, String path)
	{
		if(cr > destr || cc > destc)
			return;
		
		if(cr == destr && cc == destc)
		{
			System.out.println(path);
			return;
		}
		
		path(cr+1,cc,destr,destc,path + ' ' +'V');
		path(cr,cc+1,destr,destc,path + ' ' +'H');
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		path(0,0,2,2,"");

	}

}
