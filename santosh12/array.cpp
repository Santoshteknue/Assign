#include<iostream>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,i,j;
		cin>>n;
		int arr[n], key,count=0;
		for(i=0;i<n;i++)
		cin>>arr[i];
		sort(arr,arr+n);
		for(i=n-1; i>0; i--)
		{
			key=arr[i];
			for(j=0; j<i; j++)
   			if(key-arr[j]>key/2 && binary_search(arr+j+i, arr+i, key-arr[j]))
            {
            	count++;
            	
			}
		}
	}
	if(count>0)
	cout<<cout<<endl;
	else
	cout<<-1<<endl;
	
}
return 0;
}
