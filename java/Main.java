interface A{}
interface B extends A{}
interface C extends B{}


class n1 implements A{}
class n2 implements B{}
class n3 implements C{}

class X{
    public B foo1 (B b){
        return null;
    }

    public B foo2 (B b){
        return null;
    }
}

class Y extends X{
    public B foo1 (C c){
        return null;
    }
    public B foo2 (A a){
        return null;
    }
}

public class Main{
	public static void main(String[] args){
		A a = new n1();
		B b = new n2();
		C c = new n3();

		X x = new X();
		x.foo1(b);
		x.foo2(b);
		x = new Y();
		x.foo1(c);
		x.foo2(a);
	}
}
