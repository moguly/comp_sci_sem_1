// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here

	cout << "what symbol do you want to use for the square?" << endl;
    char r;
    cin >> r;
    
    cout << "what length do you want the square to be?" << endl;
    int t;
    cin >> t;

	cout << "What height do you want the square to be" << endl;
	int e;
	cin >> e;
	
	for(int y = 0; y < e; y++){
		for(int x = 0; x < t; x++){
		gotoxy(x+3,y+8);
		cout << "*";
	}
	
}

}
