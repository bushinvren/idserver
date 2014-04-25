package com.idserver.server.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base = "NPMH";
		String data;
		for(int i=16;i<31;i++)
		{
			data = base + i;
			for(int j=1;j<4;j++)
			{
				data = data + "F" + j;
				System.out.println(data);
				data = data.substring(0, 6);
			}
			data = data.substring(0, 4);
		}

	}

}
