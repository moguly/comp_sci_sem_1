// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

	while(kbhit()==0){
		gotoxy(5,5);
		//char x = getch();
		cout << random(727);
		
	}
}