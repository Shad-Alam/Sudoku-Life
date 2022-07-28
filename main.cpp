#include <bits/stdc++.h>

using namespace std;

vector<int> j;
void reset(){
	for(int a=0; a<9; a++){
		int value = (rand()%9)+1;
		j.push_back(a+1);
		
	}
}

int main(){
	#ifndef ONLINE_JUDGE
		freopen("in.txt", "r", stdin);
	#endif
		
	int i[10][10];
	
	int n = 9; 
	
	for(int a=0; a<n; a++){
		reset();
		for(int b=0; b<n; b++){
			int p = rand()%j.size();
			i[a][b] = j[p];
			j.erase(j.begin()+p);
		}j.clear();
	}
	
	for(int a=0; a<n; a++){
		for(int b=0; b<n; b++){
			cout << i[a][b] << " ";
		}cout << endl;
	}cout << endl;
    
    return 0;
}
