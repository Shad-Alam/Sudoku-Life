#include <bits/stdc++.h>

using namespace std;

/*
vector<int> j;
void reset(){
	for(int a=0; a<9; a++){
		int value = (rand()%9)+1;
		j.push_back(a+1);
		
	}
}
*/

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
	
	// par1 - 1
	bool visit1[10];
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit1[i[a][b]] = false;	
		}
	}
	
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			if(visit1[i[a][b]]){
				i[a][b] = 0;
			}visit1[i[a][b]] = true;
		}
	}
	
	// part - 2
	
	bool visit2[10];
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			visit2[i[a][b]] = false;	
		}
	}
	
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			if(visit2[i[a][b]]){
				i[a][b] = 0;
			}visit2[i[a][b]] = true;
		}
	}
	
	
	// part - 3
	
	bool visit3[10];
	for(int a=0; a<=2; a++){
		for(int b=6; b<=8; b++){
			visit3[i[a][b]] = false;	
		}
	}
	
	for(int a=0; a<=2; a++){
		for(int b=6; b<=8; b++){
			if(visit3[i[a][b]]){
				i[a][b] = 0;
			}visit3[i[a][b]] = true;
		}
	}
	
	
	// par1 - 4
	
	bool visit4[10];
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit4[i[a][b]] = false;	
		}
	}
	
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			if(visit4[i[a][b]]){
				i[a][b] = 0;
			}visit4[i[a][b]] = true;
		}
	}
	
	// part - 5
	
	bool visit5[10];
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			visit5[i[a][b]] = false;	
		}
	}
	
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			if(visit5[i[a][b]]){
				i[a][b] = 0;
			}visit5[i[a][b]] = true;
		}
	}
	
	
	// part - 6
	bool visit6[10];
	for(int a=3; a<=5; a++){
		for(int b=6; b<=8; b++){
			visit6[i[a][b]] = false;	
		}
	}
	
	for(int a=3; a<=5; a++){
		for(int b=6; b<=8; b++){
			if(visit6[i[a][b]]){
				i[a][b] = 0;
			}visit6[i[a][b]] = true;
		}
	}
	
	// par1 - 7
	
	bool visit7[10];
	for(int a=6; a<=8; a++){
		for(int b=0; b<=2; b++){
			visit7[i[a][b]] = false;	
		}
	}
	
	for(int a=6; a<=8; a++){
		for(int b=0; b<=2; b++){
			if(visit7[i[a][b]]){
				i[a][b] = 0;
			}visit7[i[a][b]] = true;
		}
	}
	
	// part - 8
	
	bool visit8[10];
	for(int a=6; a<=8; a++){
		for(int b=3; b<=5; b++){
			visit8[i[a][b]] = false;	
		}
	}
	
	for(int a=6; a<=8; a++){
		for(int b=3; b<=5; b++){
			if(visit8[i[a][b]]){
				i[a][b] = 0;
			}visit8[i[a][b]] = true;
		}
	}
	
	
	// part - 9
	
	bool visit9[10];
	for(int a=6; a<=8; a++){
		for(int b=6; b<=8; b++){
			visit9[i[a][b]] = false;	
		}
	}
	
	for(int a=6; a<=8; a++){
		for(int b=6; b<=8; b++){
			if(visit9[i[a][b]]){
				i[a][b] = 0;
			}visit9[i[a][b]] = true;
		}
	}
	/*
	// part - 2;
	bool visit2[10];
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			visit2[i[a][b]] = false;	
		}
	}
	
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			if(visit2[i[a][b]]){
				int ssd = i[a][b];
				for(int c=b+1; c<9; c++){
					
					if(i[a][c]>0 and !visit2[i[a][c]]){
						i[a][b] = i[a][c];
						i[a][c] = ssd;
						visit2[ssd] = true;
						break;
					}
				}cout << endl;
			}visit2[i[a][b]] = true;
		}
	}cout << endl << endl;
	
	/**
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
	
	
	/*
	// part 2
	bool visit2[10];
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			visit2[i[a][b]] = false;	
		}
	}
	// remove value in circle is found
	int j2[10]; p1 = 0;
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			if(visit2[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				j2[p1] = ssd;
				p1++;
				
			}visit2[i[a][b]] = true;
		}
	}
	
	// add all necessary value
	p1 = 0;
	// 1 6 7 9
	for(int c=1; c<=n; c++){
		if(!visit2[c]){
			for(int a=0; a<=2; a++){
				bool port1 = false;
				for(int b=3; b<=5; b++){
					if(i[a][b]==0){
						int ssd = j2[p1]; // 4, 8, 5 8
						for(int d=b+1; d<9; d++){
							if(i[a][d]==c){
								i[a][b] = c;
								i[a][d] = ssd;
								p1++;
								visit2[c] = true;
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
	for(int a=3; a<=5; a++){
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
	
	// part 3
	bool visit3[10];
	for(int a=0; a<=2; a++){
		for(int b=6; b<=8; b++){
			visit3[i[a][b]] = false;	
		}
	}
	// remove value in circle is found
	int j3[10]; p1 = 0;
	for(int a=0; a<=2; a++){
		for(int b=6; b<=8; b++){
			if(visit3[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				j3[p1] = ssd;
				p1++;
				
			}visit3[i[a][b]] = true;
		}
	}
	
	// add all necessary value
	p1 = 0;
	// 1 6 7 9
	for(int c=1; c<=n; c++){
		if(!visit3[c]){
			for(int a=0; a<=2; a++){
				bool port1 = false;
				for(int b=6; b<=8; b++){
					if(i[a][b]==0){
						int ssd = j2[p1]; // 4, 8, 5 8
						for(int d=b+1; d<9; d++){
							if(i[a][d]==c){
								i[a][b] = c;
								i[a][d] = ssd;
								p1++;
								visit3[c] = true;
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
	for(int a=6; a<=8; a++){
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
	
	// ---------------------------------------
	// --------------- Part-4 ----------------
	// ---------------------------------------
	/**
	bool checker[10];
	for(int a=1; a<=9; a++){
		checker[a] = false;
	}*/
	/*
	for(int a=0; a<=2; a++){
		bool visiting[10];
		for(int b=1; b<=9; b++){
			visiting[b] = false;
		}
		
		for(int b=0; b<=2; b++){
			visiting[i[b][a]] = true;
		}
		
		for(int b=3; b<=5; b++){
			if(visiting[i[b][a]]){
				int ssd = i[b][a];
				for(int c=a+1; c<n; c++){
					if(!visiting[i[b][c]]){
						i[b][a] = i[b][c];
						i[b][c] = ssd;
						visiting[ssd] = true;
						break;
					}
				}
			}else{
				visiting[i[b][a]] = true;
			}
		}
	}
	   ///////////////////////////////////
	  ////// Visiting Checker End ///////
	 ///////////////////////////////////
	
	// part 4
	bool visit4[10];
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit4[i[a][b]] = false;	
		}
	}
	// remove value in circle is found
	int j4[10]; p1 = 0;
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			if(visit4[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				j4[p1] = ssd;
				p1++;
				
			}visit4[i[a][b]] = true;
		}
	}


	// add all necessary value
	p1 = 0;
	// 1 6 7 9
	for(int c=1; c<=n; c++){
		if(!visit4[c]){
			
			for(int a=3; a<=5; a++){
				bool port1 = false;
				for(int b=0; b<=2; b++){
					if(i[a][b]==0){
						// 2
						bool checker[10];
						for(int a=1; a<=9; a++){
							checker[a] = false;
						}
						for(int c=0; c<a; c++){
							if(!checker[i[c][b]]){
								checker[i[c][b]] = true;
							}
						}
						
						int ssd = j4[p1]; // 4, 8, 5 8
						for(int d=b+1; d<9; d++){
							if(i[a][d]==c and !checker[i[a][d]]){
								i[a][b] = c;
								i[a][d] = ssd;
								p1++;
								visit4[c] = true;
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
	
	// ---------------------------------------
	// --------------- Part-5 ----------------
	// ---------------------------------------
	
	for(int a=3; a<=5; a++){
		bool visiting[10];
		for(int b=1; b<=9; b++){
			visiting[b] = false;
		}
		
		for(int b=0; b<=5; b++){
			visiting[i[b][a]] = true;
		}
		
		for(int b=3; b<=5; b++){
			if(visiting[i[b][a]]){
				int ssd = i[b][a];
				for(int c=a+1; c<n; c++){
					if(!visiting[i[b][c]]){
						i[b][a] = i[b][c];
						i[b][c] = ssd;
						visiting[ssd] = true;
						break;
					}
				}
			}else{
				visiting[i[b][a]] = true;
			}
		}
	}
	   ///////////////////////////////////
	  ////// Visiting Checker End ///////
	 ///////////////////////////////////
	 
	// code part - 5
	

	// part 5
	bool visit5[10];
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			visit5[i[a][b]] = false;	
		}
	}
	

	// remove value in circle is found
	int j5[10]; p1 = 0;
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			if(visit5[i[a][b]]){
				int ssd = i[a][b];
				i[a][b] = 0;
				
				j5[p1] = ssd;
				p1++;
				
			}visit5[i[a][b]] = true;
		}
	}
	
	// add all necessary value
	p1 = 0;
	// 1 6 7 9
	for(int c=1; c<=n; c++){
		if(!visit5[c]){
			for(int a=3; a<=5; a++){
				bool port1 = false;
				for(int b=3; b<=5; b++){
					if(i[a][b]==0){
						// 2
						bool checker[10];
						for(int a=1; a<=9; a++){
							checker[a] = false;
						}
						for(int c=0; c<a; c++){
							if(!checker[i[c][b]]){
								checker[i[c][b]] = true;
							}
						}
						
						int ssd = j5[p1]; // 4, 8, 5 8
						for(int d=b+1; d<9; d++){
							if(i[a][d]==c and !checker[i[a][d]]){
								i[a][b] = c;
								i[a][d] = ssd;
								p1++;
								visit5[c] = true;
								port1 = true;
								checker[i[a][d]] = true;
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
	}cout << endl;
	
	
	 
	 // ---------------------------------------
	// --------------- Part-6 ----------------
	// ---------------------------------------
	
	for(int a=6; a<=8; a++){
		bool visiting[10];
		for(int b=1; b<=9; b++){
			visiting[b] = false;
		}
		
		for(int b=0; b<=8; b++){
			visiting[i[b][a]] = true;
		}
		
		for(int b=3; b<=5; b++){
			if(visiting[i[b][a]]){
				int ssd = i[b][a];
				for(int c=a+1; c<n; c++){
					if(!visiting[i[b][c]]){
						i[b][a] = i[b][c];
						i[b][c] = ssd;
						visiting[ssd] = true;
						break;
					}
				}
			}else{
				visiting[i[b][a]] = true;
			}
		}
	}
	   ///////////////////////////////////
	  ////// Visiting Checker End ///////
	 ///////////////////////////////////


	/*
	// swap value if match
	for(int a=0; a<=2; a++){
		bool visiting[10];
		for(int b=1; b<=9; b++){
			visiting[b] = false;
		}
		for(int b=0; b<=5; b++){
			visiting[i[b][a]] = true;
		}
		for(int b=0; b<=5; b++){
			int ssd = i[b][a];
			visit[a][b] = true;
			for(int c=b; c<9; c++){
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
	*/
	/////////////////

	
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
