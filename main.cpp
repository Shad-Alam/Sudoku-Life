#include <bits/stdc++.h>

using namespace std;

/**
vector<int> j;
void reset(){
	for(int a=0; a<9; a++){
		int value = (rand()%9)+1;
		j.push_back(a+1);
		
	}
}*/

int main(){
	#ifndef ONLINE_JUDGE
		freopen("in.txt", "r", stdin);
	#endif
		
	int i[10][10], n = 9;
	bool visit[10][10];
	
	for(int a=0; a<n; a++){
		for(int b=0; b<n; b++){
			cin >> i[a][b];
			visit[a][b] = false;
			cout << i[a][b] << " ";
		}cout << endl;
	}cout << endl << endl;
	
	
	// part 1
	bool visit1[10];
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit1[i[a][b]] = false;	
		}
	}
	// remove value in circle is found
	int j1[10]; int p1 = 0;
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			if(visit1[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				j1[p1] = ssd;
				p1++;
				
			}visit1[i[a][b]] = true;
		}
	}
	
	// add all necessary value
	p1 = 0;
	// 1 6 7 9
	for(int c=1; c<=n; c++){
		if(!visit1[c]){
			for(int a=0; a<=2; a++){
				bool port1 = false;
				for(int b=0; b<=2; b++){
					if(i[a][b]==0){
						int ssd = j1[p1]; // 4, 8, 5 8
						for(int d=b+1; d<9; d++){
							if(i[a][d]==c){
								i[a][b] = c;
								i[a][d] = ssd;
								p1++;
								visit1[c] = true;
								port1 = true;
								break;
							}
						}
						
						if(port1){
							break;
						}
					}
				}
				
				if(port1){
					break;
				}
			}
		}
	}
	
	// swap value if match
	for(int a=0; a<=2; a++){
		bool visiting[10];
		for(int b=1; b<=9; b++){
			visiting[b] = false;
		}
		for(int b=0; b<=2; b++){
			visiting[i[b][a]] = true;
		}
		for(int b=0; b<=2; b++){
			int ssd = i[b][a];
			visit[a][b] = true;
			for(int c=3; c<9; c++){
				if(i[c][a]==ssd){
					i[c][a] = 0;
					for(int d=0; d<9; d++){
						if(visit[c][d]){
							continue;
						}
						if(!visiting[i[c][d]] and d!=a){
							i[c][a] = i[c][d];
							i[c][d] = ssd;
							visiting[i[c][d]] = true;
							break;
						}
					}
				}
			}
		}
	}
	
	


	
	for(int a=0; a<n; a++){
		for(int b=0; b<n; b++){
			cout << i[a][b] << " ";
		}cout << endl;
	}cout << endl << endl;
	

	for(int a=0; a<n; a++){
		for(int b=0; b<n; b++){
			cout << a << b << " ";
		}cout << endl;
	}cout << endl << endl;
		
	/**
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
	*/
    
    return 0;
}
