package session4;

public class X {
int a;
X(int a){
this.a=a;
}
}
class Parent extends X{
	int b;
	Parent(int a,int b){
		super(a);
		this.b=b;
	}
	void show(){
		System.out.println("X a=" +a);
		System.out.println("Parent b="+b);
		
			
	}
}
class Child{
	public static void main(String[] args)
	{
		Parent object=new Parent(6,7);
		object.show();
		
	}
}