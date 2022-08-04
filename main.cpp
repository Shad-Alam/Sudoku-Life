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
	
	int part1[10], p = 0;
	bool visit1[10];
	
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit1[i[a][b]] = false;
		}
	}
	
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			if(visit1[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				for(int c=1; c<=9; c++){
					if(!visit1[c]){
						i[a][b] = c;
						
						bool port1 = false;
						for(int c1=b-1; c1>=0; c1--){
							if(i[a][c1]==c){
								port1 = true;
								break;
							}
						}
						
						for(int c1=a-1; c1>=0; c1--){
							if(i[c1][b]==c){
								port1 = true;
								break;
							}
						}
						
						if(port1==false){
							for(int d=b+1; d<9; d++){
								if(i[a][d]==c){
									i[a][d] = ssd;
									break;
								}
							}
							visit1[c] = true;
						}
						break;
					}
				}
			}
			visit1[i[a][b]] = true;
		}
	}
	
	// 2
	
	p = 0;
	bool visit2[10];
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit2[i[a][b]] = false;
		}
	}
	
	for(int a=3; a<=5; a++){
		// part - 1 
		// if any value match in circle(3*3) then swap
		for(int b=0; b<=2; b++){
			if(visit2[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				for(int c=1; c<=9; c++){
					if(!visit2[c]){
						i[a][b] = c;
						
						bool port1 = false;
						for(int c1=b-1; c1>=0; c1--){
							if(i[a][c1]==c){
								port1 = true;
								break;
							}
						}
						
						for(int c1=a-1; c1>=0; c1--){
							if(i[c1][b]==c){
								port1 = true;
								break;
							}
						}
						
						if(port1==false){
							for(int d=b+1; d<9; d++){
								if(i[a][d]==c){
									i[a][d] = ssd;
									break;
								}
							}
							visit2[c] = true;
						}
						break;
					}
				}
			}
			visit2[i[a][b]] = true;
		}
	}
	
	int memo[10], p1 = 0;
	for(int a=3; a<=5; a++){
		// part-2
		// in a straight line, if any value match then current value will be zero and store match value 
		for(int b=0; b<=2; b++){
			int ssd = i[a][b];
			bool port1 = false;
			for(int c1=b-1; c1>=0; c1--){
				if(i[a][c1]==ssd){
					port1 = true;
					break;
				}
			}
						
			for(int c1=a-1; c1>=0; c1--){
				if(i[c1][b]==ssd){
					port1 = true;
					break;
				}
			}
			
			if(port1){
				memo[p1] = ssd;
				p1++;
				cout << ssd << endl;
				i[a][b] = 0;
			}
		}
	}
		// part - 3
		// pass all storing value to original position
	sort(memo,memo+p1);
	bool visiting[10];
	for(int c=0; c<p1; c++){
		cout << memo[c] << " ";
		visiting[memo[c]] = false;
	}cout << endl << endl;
	
	
	
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			if(i[a][b]==0){
				int ssd = i[a][b];
				
				for(int c=0; c<p1; c++){
					if(!visiting[memo[c]]){						
						bool port1 = false;
						for(int c1=b-1; c1>=0; c1--){
							if(i[a][c1]==memo[c]){
								port1 = true;
								break;
							}
						}
						
						for(int c1=a-1; c1>=0; c1--){
							if(i[c1][b]==memo[c]){
								port1 = true;
								break;
							}
						}
						
						cout << "port" << endl;
						for(int c1=0; c1<9; c1++){
							if(i[a][c1]==memo[c]){
								port1 = true;
								break;
							}
						}cout << endl << endl;
						
						if(port1==false){
							i[a][b] = memo[c];
							visiting[memo[c]] = true;
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
