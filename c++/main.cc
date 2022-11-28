class A{};
class B: public A{};
class C: public B{};

class X{
    public:
        virtual B foo1(B b){return b;}
        virtual B foo2(B b){return b;}
};

class Y: public X{
    public:
        B foo1(C c){return c;}
        B foo2(A a){return B();}
};

int main(){
    X* x = new X;
    x->foo1(B());
    x->foo2(B());
    x = new Y;
    x->foo1(C());
    x->foo2(A());
    return 0;
}