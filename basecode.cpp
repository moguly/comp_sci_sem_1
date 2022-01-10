// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

    cout << "what symbol do you want to use for the line?" << endl;
    char e = 'y';
    cin >> e;
    
    cout << "what length do you want the line to be?";
    char t = 't';
    cin >> t;
    cout << "Do you want the line to be vertical or horizontal type  h or v" ;
    char y = 'y';
    cin >> y;
    if(y == 'v'){
        for(int i = 1; i < t; i++){
            cout << e << endl;
        }
    
    }
    if(y == 'h'){
        for(int i = 1; i < t; i++){
            cout << e;
        }
    }
}