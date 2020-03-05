package org.learning.me;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scan=new Scanner(System.in);
				System.out.println("enter the string");
				String st=scan.nextLine();
				char ch[]=st.toCharArray();//converts string into character array
				int n=ch.length;//returns length of the character array
				st="";
				
		        for (int i=0;i<n ;i++ )
				{
					st=st+ch[i];
					for (int j=i+1;j<n ;j++ )
					{
						if (ch[i]!=' '&&(ch[i]==ch[j]||ch[i]==ch[j]+32||ch[i]==ch[j]-32))
						{
							for (int k=j;k<n-1 ;k++ )
							{
								ch[k]=ch[k+1];
							}
							n--;
							j--;
						}
					}
				}
				System.out.println(st);
			}
		}