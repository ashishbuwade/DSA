#include<iostream>
using namespace std;

int main(){
	int n=5;
	for(int i=1;i<=n;i++){
		char ch='A';
		for(int j=1;j<=i;j++){
			cout<<ch<<" ";
			ch++;
		}
		
		ch--;
		for(int k=1;k<i;k++){
			ch--;
			cout<<ch<<" ";
		}
		cout<<endl;
	}
	return 0;
}