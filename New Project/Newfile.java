//program to calcutate total of each student in class and find their rank in class and whether they are pass or fail,comparision


class Newfile
{
int m1,m2,m3,m4,m5;

int total;

Newfile()
{
}
Newfile(int m,int n,int o,int p,int f)
{
m1=m;m2=n;m3=o;m4=p;m5=f;
}

void total()
{
int t;
t=m1+m2+m3+m4+m5;
System.out.println(t);
}



public static void main(String args[])
{
Newfile v=new Newfile(90,80,70,77,66);
Newfile s=new Newfile(66,55,66,78,45);
v.total();
s.total();
}
}






