package com.fs.test;

public class ArrayDemo {
	//��������
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
		//����Ĵ���
		public void m2(){
			int a[]=new int[4];
			int b[]=a;
			int c[]=new int[10];
			c=a;
			System.out.println(a.length);
			System.out.println(b.length);
			System.out.println(c.length);
		}
		//����ĸ�ֵ
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
		//����Ķ�̬��ʼ��
		public void m4(){
			//�������鲢������С
			int a[]=new int[3];
			//Ϊ���鸳ֵ
			a[0]=100;
			a[2]=100;
			a[2]=200;
		}
		//���龲̬��ʼ��
		public void m5(){
			int a[]={1,2,3,4,5};
			int b[]=new int[]{1,2,3};//[]����ָ�������С
			
		}
		public static void main(String[] args) {

			ArrayDemo ad=new ArrayDemo();
			ad.m1();
			ad.m2();

		}

	}