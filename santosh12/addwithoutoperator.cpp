#include<iostream>
using namespace std;
int x;
int main()
{
	int t; cin>>t;
	while(t--)
	{
	
int n,s,i,j,sum;
//cout<<"enter s and n value"<<"n="<<"s";
cin>>n>>s;
int arr[n]; 
for(int i=0; i<n; i++)

cin>>arr[i];
for(int i=0; i<n; i++)
{   sum=0;
	for(int j=i; j<n && sum<s; j++)
	sum +=arr[j];
	if(sum == s)
	break;
	
}
if(sum==s)
cout<<i+1<<" "<<j<<endl;
else 
cout<<-1<<endl;	
}
return 0;
}

