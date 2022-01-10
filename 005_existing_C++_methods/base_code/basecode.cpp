// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	cout << "what symbol do you want to use for the line?" << endl;
    char rr;
    cin >> rr;
    
    cout << "what length do you want the line to be?" << endl;
    int tt;
    cin >> tt;
    cout << "Do you want the line to be vertical or horizontal type  h or v or d" << endl;
    char yy;
    cin >> yy;
    if(yy == 'v'){
        for(int i = 0; i < tt; i++){
            cout << rr << endl;
        }
    
    }
    if(yy == 'h'){
        for(int i = 0; i < tt; i++){
            cout << rr;
        }
    }
	if(yy == 'd'){
        for(int i = 0; i < tt; i++){
        	gotoxy(i+4,i+7);
            cout << rr;
    
        }
    }
}
