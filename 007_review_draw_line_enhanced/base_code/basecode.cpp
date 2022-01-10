// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	cout << "where do you want to line to start? (x value)" << endl;
	int g;
	cin >> g;
	
		cout << "where do you want to line to start? (y value)" << endl;
	int w;
	cin >> w;
	
	cout << "what symbol do you want to use for the line?" << endl;
    char rr;
    cin >> rr;
    
    cout << "what length do you want the line to be?" << endl ;
    int t;
    cin >> t;
    
    cout << "Do you want the line to be vertical or horizontal type  h or v or d" << endl;
    char yy;
    cin >> yy;
    
     if(yy == 'v'){
        for(int i = 0; i < t; i++){
            gotoxy(g,w);
            cout << rr << endl;
        }
    
    }
    if(yy == 'h'){
        for(int i = 0; i < t; i++){
             gotoxy(g,w);
            cout << rr;
        }
    }
	if(yy == 'd'){
        for(int i = 0; i < t; i++){
        	 gotoxy(g,w);
            cout << rr;
    
        }
    }
}
