// base code file
#include "./hfiles/poole.h"
#include <thread>

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

char sym;
cout << "input a snowflake: ";
cin >> sym;

for(int y = 0; y < 5; y++){
	    gotoxy(4,y+5);
		cout << sym << endl;
		sleep(1);
		gotoxy (4,y+5);
		cout << ' ' << endl;
	
		}
	}



