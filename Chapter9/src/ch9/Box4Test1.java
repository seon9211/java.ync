package ch9;

class Box4{
	int width;
	int height;
	int depth;
	public Box4(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
}
public class Box4Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1505082-권병선");
		
		Box4 mybox1 = new Box4(10,20,30);
		//Box4 mybox2 = new Box4(); <= 오류발생
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 : " + vol);
		

	}

}
