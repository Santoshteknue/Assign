#include <iostream>
#include<cstring>

using namespace std;
int i,j;
char m[12][12];
void charArray()
{
	int count=0;
	cout<<"\n enter the 4 strings";
	char s1[10],s2[10],s3[10],s4[10];
	cin>>s1;
	cin>>s2;
	cin>>s3;
	cin>>s4;
		int l1=strlen(s1);
		int l2=strlen(s2);
		int l3=strlen(s3);
		int l4=strlen(s4);
		int mid1=l1/2;
		int mid2=l2/2;
		int mid3=l3/2;
		int mid4=l4/2;
	
	for(int i=0;i<l1;i++)
	{
		for(int j=0;j<1;j++)
		{
			m[i][j]=s1[i];
		}
	} 
	for(int i=mid1;i<=mid1;i++)
	{
		for(int k=0;k<=l2;k++)
		{
			if(k==0)
			{
			m[i][1]=s2[k];
			}
			else
			  {
			m[i][k+1]=s2[k];
		}
		
		}
	}
	int k=0;
	for(int i=mid1+1;i<l3+3;i++)
	{                                                  
		int f=mid2+1;
		int T=0;
		
		while(T==0)
		{
		  m[i][f]=s3[k];
		  k++;
		  T=1;	
		}
		T=0;
		}
		int y=0;
		for(int j=l2-1;j<12;j++)
		{
		int T=0;
		
		while(T==0)
		{
		  m[l1][j]=s4[y];
		  y++;
		  T=1;	
		}
		T=0;
		}
	
	 for(int i=0;i<12;i++)
	{
		for(int j=0;j<12;j++)
		{
			cout<<m[i][j];
		}
		cout<<endl;
	}
	
	  
}


int main()
{
	charArray();
}
