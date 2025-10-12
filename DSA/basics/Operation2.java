class Operation2{
public static void main(String[]args){
int a=10;
int b=20;
boolean case1=a>b;
boolean case2=a<b;
System.out.println(case1&&case2);
System.out.println(case2&&case1);
System.out.println(case1||case2);
System.out.println(case2||case1);
System.out.println(!case1);
System.out.println(!case2);
}

}