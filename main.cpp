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
		
	int i[10][10], n = 9, p = 0;
	bool visit[10][10];
	
	for(int a=0; a<n; a++){
		for(int b=0; b<n; b++){
			cin >> i[a][b];
			visit[a][b] = false;
			cout << i[a][b] << " ";
		}cout << endl;
	}cout << endl << endl;
	
	
	/*
	bool visit1[10];
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit1[i[a][b]] = false;
		}
	}
	
	int j1[10], p = 0;
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			if(visit1[i[a][b]]){
				j1[p] = i[a][b], p++;
				i[a][b] = 0;
			}else{
				visit1[i[a][b]] = true;	
			}
		}
	}
	/*
	p = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit1[a1]){
			for(int a=0; a<=2; a++){
				bool port = false;
				for(int b=0; b<=2; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
						if(!port1){
							////////////////////////
							for(int c=b; c<9; c++){
								if(i[a][c]==a1){
									i[a][b] = a1;
									i[a][c] = j1[p];
									p++;
									port = true;
									break;
								}
							}if(port){
								break;
							}
						}
					}
				}
				if(port){ 
					visit1[a1] = true;
					break; 
				}
			}
		}
	}cout << endl;
	*/
	
	// 2
	
	bool visit2[10]; int ssd = 0;
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit2[i[a][b]] = false;
			ssd++;
		}
	}
	
	int j2[10]; p = 0;
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			ssd++;
			if(visit2[i[a][b]]){
				j2[p] = i[a][b], p++;
				i[a][b] = 0;
			}else{
				visit2[i[a][b]] = true;	
			}
		}
	}
	
	p = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit2[a1]){
			for(int a=0; a<=2; a++){
				bool port = false;
				for(int b=0; b<=2; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							ssd++;
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							ssd++;
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
						if(!port1){
							for(int c=b; c<9; c++){
								ssd++;
								if(i[a][c]==a1){
									i[a][b] = a1;
									i[a][c] = j2[p];
									p++;
									port = true;
									break;
								}
							}if(port){
								break;
							}
						}
					}
				}
				if(port){ 
					visit2[a1] = true;
					break; 
				}
			}
		}
	}cout << endl;
	
	// 2
	
	bool visit3[10]; 
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			visit3[i[a][b]] = false;
			ssd++;
		}
	}
	
	int j3[10]; p = 0;
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			ssd++;
			if(visit3[i[a][b]]){
				j3[p] = i[a][b], p++;
				i[a][b] = 0;
			}else{
				visit3[i[a][b]] = true;	
			}
		}
	}
	
	p = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit3[a1]){
			for(int a=0; a<=2; a++){
				bool port = false;
				for(int b=3; b<=5; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							ssd++;
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							ssd++;
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
						if(!port1){
							for(int c=b; c<9; c++){
								ssd++;
								if(i[a][c]==a1){
									i[a][b] = a1;
									i[a][c] = j3[p];
									p++;
									port = true;
									break;
								}
							}if(port){
								break;
							}
						}
					}
				}
				if(port){ 
					visit3[a1] = true;
					break; 
				}
			}
		}
	}cout << endl;
	
	// 4
	
	bool visit4[10]; 
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit4[i[a][b]] = false;
			ssd++;
		}
	}
	
	int j4[10]; p = 0;
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			ssd++;
			if(visit4[i[a][b]]){
				j4[p] = i[a][b], p++;
				i[a][b] = 0;
			}else{
				visit4[i[a][b]] = true;	
			}
		}
	}
	
	p = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit4[a1]){
			for(int a=3; a<=5; a++){
				bool port = false;
				for(int b=0; b<=2; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							ssd++;
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							ssd++;
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
						if(!port1){
							for(int c=b; c<9; c++){
								ssd++;
								if(i[a][c]==a1){
									i[a][b] = a1;
									i[a][c] = j4[p];
									p++;
									port = true;
									break;
								}
							}if(port){
								break;
							}
						}
					}
				}
				if(port){ 
					visit4[a1] = true;
					break; 
				}
			}
		}
	}cout << endl;
	
	
	// 5
	
	bool visit5[10]; 
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			visit5[i[a][b]] = false;
			ssd++;
		}
	}
	
	int j5[10]; p = 0;
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			ssd++;
			if(visit5[i[a][b]]){
				j5[p] = i[a][b], p++;
				i[a][b] = 0;
			}else{
				visit5[i[a][b]] = true;	
			}
		}
	}
	
	p = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit5[a1]){
			for(int a=3; a<=5; a++){
				bool port = false;
				for(int b=3; b<=5; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							ssd++;
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							ssd++;
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
						if(!port1){
							for(int c=b; c<9; c++){
								ssd++;
								if(i[a][c]==a1){
									cout << a1 << " >> res" << endl;
									i[a][b] = a1;
									i[a][c] = j5[p];
									p++;
									port = true;
									break;
								}
							}if(port){
								break;
							}
						}
					}
				}
				if(port){ 
					visit5[a1] = true;
					break; 
				}
			}
		}
	}cout << endl;
	i[5][5] = j5[p];
	
	cout << ssd << endl;
	
	
	// 5
	
	/*
	bool visit5[10];
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			visit5[i[a][b]] = false;
		}
	}
	
	int j5[10]; p = 0;
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			if(visit5[i[a][b]]){
				j5[p] = i[a][b], p++;
				cout << j5[p-1] << "u" << endl;
				i[a][b] = 0;
			}else{
				visit5[i[a][b]] = true;	
			}
		}
	}
	
	/*
	
	p = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit5[a1]){
			// 2 4 7
			int sm = 0;
			for(int a=3; a<=5; a++){
				bool port = false;
				for(int b=3; b<=5; b++){
					if(i[a][b]==0 and !visit5[a1]){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
												
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
						
						cout << a1 << " " << port1 << endl;
						
						if(!port1){
							for(int c=0; c<9; c++){
								if(i[a][c]==a1){
									i[a][b] = a1;
									i[a][c] = j5[p];
									p++;
									sm = 1;
									break;
								}
							}if(sm==1){
								break;
							}else{
								cout << "null" << endl;
							}
						}
					}
				}
				
				if(sm==1){ 
					visit5[a1] = true;
					break; 
				}
			}
		}
	}cout << endl;
	
	
	/**
	int k[100], p = 0;
	int l[100], p2 = 0;
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			if(visit[i[a][b]]){
				l[p2] = i[a][b];
				p2++;
				i[a][b] = 0;
				continue;
			}visit[i[a][b]] = true;
		}
	}
	
	// down to left scan fixed
	
	for(int a=1; a<=9; a++){
		if(!visit[a]){
			k[p] = a;
			p++;
		}
	}
	
	//cout << endl << endl;
	
	int p1 = 0;
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			if(i[a][b]==0){
				int ssd = l[p1];
				i[a][b] = k[p1], p1++;
				visit[i[a][b]] = true;

				for(int c=0; c<9; c++){
					if(i[a][b]==i[a][c] and c!=b){
						i[a][c] = ssd;
						break;
					}
				}
			}
			cout << i[a][b] << " ";
		}cout << endl;
	}cout << endl;
	
	// -----------------------------------------------
	// ------------------ 2 --------------------------
	// -----------------------------------------------

	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit[i[a][b]] = false;
		}
	}
	
	p2 = 0;
	for(int a=0; a<=2; a++){
		for(int b=3; b<=5; b++){
			if(visit[i[a][b]]){
				l[p2] = i[a][b];
				p2++;
				i[a][b] = 0;
				continue;
			}visit[i[a][b]] = true;
		}
	}
	
	p = 0, p2 = 0, p1=0;
	for(int a1=1; a1<=9; a1++){
		if(!visit[a1]){
			k[p] = a1;
			bool port2 = false;
			for(int a=0; a<=2; a++){
				for(int b=3; b<=5; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==k[p]){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==k[p]){
								port1 = true;
								break;
							}
						}
						
						if(port1==false){
							i[a][b] = k[p];
							port2 = true;
							
							int ssd = l[p1];
							i[a][b] = k[p1], p1++;
							visit[i[a][b]] = true;

							for(int c=0; c<9; c++){
								if(i[a][b]==i[a][c] and c!=b){
									i[a][c] = ssd;
									break;
								}
							}
							break;
						}
					}
				}if(port2){
					break;
				}
			}p++;
		}
	}
	
	// -----------------------------------------------
	// ------------------ 3 --------------------------
	// -----------------------------------------------
	

	
	for(int a=0; a<=2; a++){
		for(int b=0; b<=2; b++){
			visit[i[a][b]] = false;
		}
	}
	
	p2 = 0;
	for(int a=0; a<=2; a++){
		for(int b=6; b<=8; b++){
			if(visit[i[a][b]]){
				l[p2] = i[a][b];
				p2++;
				i[a][b] = 0;
				continue;
			}visit[i[a][b]] = true;
			cout << i[a][b] << " ";
		}cout << endl;
	}cout << endl;
	
	p = 0, p2 = 0;
	for(int a1=1; a1<=9; a1++){
		if(!visit[a1]){
			k[p] = a1;
			bool port2 = false;
			for(int a=0; a<=2; a++){
				for(int b=6; b<=8; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==k[p]){
								port1 = true;
								break;
							}
						}
						
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==k[p]){
								port1 = true;
								break;
							}
						}
						
						if(port1==false){
							i[a][b] = k[p];
							port2 = true;
							
							int ssd = l[p1];
							i[a][b] = k[p1], p1++;
							visit[i[a][b]] = true;

							for(int c=0; c<9; c++){
								if(i[a][b]==i[a][c] and c!=b){
									i[a][c] = ssd;
									break;
								}
							}
							break;
						}
					}
				}if(port2){
					break;
				}
			}
			cout << k[p] << " ";
			p++;
		}
	}cout << endl << endl;
	
	// -----------------------------------------------
	// ------------------ 4 --------------------------
	// -----------------------------------------------
	
	bool visit3[10];
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit[i[a][b]] = false;
		}
	}
	
	p2 = 0;
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			if(visit[i[a][b]]){
				l[p2] = i[a][b];
				p2++;
				i[a][b] = 0;
				continue;
			}
			int ssd = i[a][b];
			bool port1 = false;
			for(int c=b-1; c>=0; c--){
				if(i[a][c]==i[a][b]){
					port1 = true;
					break;
				}
			}
						
			for(int c=a-1; c>=0; c--){
				if(i[c][b]==i[a][b]){
					port1 = true;
					break;
				}
			}
				
			if(port1){
				l[p2] = ssd;
				p2++;
				i[a][b] = 0;
				continue;
			}else{
				visit[i[a][b]] = true;
				cout << i[a][b] << "((";
			}
		}cout << endl;
	}cout << endl;

	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			if(i[a][b]!=0){
				visit3[i[a][b]] = true;
			}
		}
	}
	
	for(int a1=1; a1<=9; a1++){
		if(!visit3[a1]){
			for(int a=3; a<=5; a++){
				bool port4 = false;
				for(int b=0; b<=2; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
									
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
							
						if(!port1){
							i[a][b] = a1;
							port4 = true;
							break;
						}
					}
				}if(port4){
					break;
				}
			}
		}
	}
	
	// -----------------------------------------------
	// ------------------ 5 --------------------------
	// -----------------------------------------------
	

	bool visit4[10];
	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit[i[a][b]] = false;
		}
	}
	
	p2 = 0;
	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			if(visit[i[a][b]]){
				l[p2] = i[a][b];
				p2++;
				i[a][b] = 0;
				continue;
			}
			int ssd = i[a][b];
			bool port1 = false;
			for(int c=b-1; c>=0; c--){
				if(i[a][c]==i[a][b]){
					port1 = true;
					break;
				}
			}
						
			for(int c=a-1; c>=0; c--){
				if(i[c][b]==i[a][b]){
					port1 = true;
					break;
				}
			}
				
			if(port1){
				l[p2] = ssd;
				p2++;
				i[a][b] = 0;
				continue;
			}else{
				visit[i[a][b]] = true;
				cout << i[a][b] << "((";
			}
		}cout << endl;
	}cout << endl;

	for(int a=3; a<=5; a++){
		for(int b=3; b<=5; b++){
			if(i[a][b]!=0){
				visit4[i[a][b]] = true;
			}
		}
	}
	
	for(int a1=1; a1<=9; a1++){
		if(!visit4[a1]){
			for(int a=3; a<=5; a++){
				bool port4 = false;
				for(int b=3; b<=5; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
									
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
							
						if(!port1){
							i[a][b] = a1;
							visit3[a1] = true;
							port4 = true;
							break;
						}
					}
				}if(port4){
					break;
				}
			}
		}
	}
	
	// -----------------------------------------------
	// ------------------ 6 --------------------------
	// -----------------------------------------------
	
	/*

	for(int a=3; a<=5; a++){
		for(int b=0; b<=2; b++){
			visit[i[a][b]] = false;
		}
	}
	
	p2 = 0;
	for(int a=3; a<=5; a++){
		for(int b=6; b<=8; b++){
			if(visit[i[a][b]]){
				i[a][b] = 0;
				continue;
			}
			int ssd = i[a][b];
			bool port1 = false;
			for(int c=b-1; c>=0; c--){
				if(i[a][c]==i[a][b]){
					port1 = true;
					break;
				}
			}
						
			for(int c=a-1; c>=0; c--){
				if(i[c][b]==i[a][b]){
					port1 = true;
					break;
				}
			}
				
			if(port1){
				i[a][b] = 0;
				continue;
			}else{
				visit[i[a][b]] = true;
			}
		}
	}

	for(int a=3; a<=5; a++){
		for(int b=6; b<=8; b++){
			if(i[a][b]!=0){
				visit3[i[a][b]] = true;
			}
		}
	}
	
	for(int a1=1; a1<=9; a1++){
		if(!visit3[a1]){
			cout << a1 << "()" << endl;
			continue;
			for(int a=3; a<=5; a++){
				bool port4 = false;
				for(int b=6; b<=8; b++){
					if(i[a][b]==0){
						bool port1 = false;
						for(int c=b-1; c>=0; c--){
							if(i[a][c]==a1){
								port1 = true;
								break;
							}
						}
									
						for(int c=a-1; c>=0; c--){
							if(i[c][b]==a1){
								port1 = true;
								break;
							}
						}
							
						if(!port1){
							i[a][b] = a1;
							port4 = true;
							break;
						}
					}
				}if(port4){
					break;
				}
			}
		}
	}
	
	
	
	
	
	
	/**
	 cout << a << " " << b << endl;
	 * 	        // left to right
				for(int c=0; c<9; c++){
					cout << i[a][c] << " ";
				}cout << endl;
				
				// down to left
				for(int c=0; c<9; c++){
					cout << i[c][b] << " ";
				}cout << endl << endl;
				
	 */
	
	
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
