package com.fs.test;

public class ArrayDemo {
	//声明数组
		public void m1(){
			int a[];
			int b[];
			
			
			int c[]=new int[2];
			boolean d[]=new boolean[3];
			char e[]=new char[2];
			float f[]=new float[3];
			String g[]=new String[2];
			
			System.out.println(c[0]);
			System.out.println(d[0]);
			System.out.println(e[0]);
			System.out.println(f[0]);
			System.out.println(g[0]);
		}
		//数组的创建
		public void m2(){
			int a[]=new int[4];
			int b[]=a;
			int c[]=new int[10];
			c=a;
			System.out.println(a.length);
			System.out.println(b.length);
			System.out.println(c.length);
		}
		//数组的赋值
		public void m3(){
			int a[]=new int[3];
			a[0]=100;
			a[2]=100;
			a[2]=200;
			
			int b[]=new int[10];
			for(int i=0;i<=b.length;i++){
				b[i]=100+i;
			}
		}
		//数组的动态初始化
		public void m4(){
			//声明数组并创建大小
			int a[]=new int[3];
			//为数组赋值
			a[0]=100;
			a[2]=100;
			a[2]=200;
		}
		//数组静态初始化
		public void m5(){
			int a[]={1,2,3,4,5};
			int b[]=new int[]{1,2,3};//[]不能指定数组大小
			
		}
		public static void main(String[] args) {

			ArrayDemo ad=new ArrayDemo();
			ad.m1();
			ad.m2();

		}

	}