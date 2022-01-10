// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));


for(int i = 1; i < 11; i++){
gotoxy(i,i+4);
cout << '%' << endl;
}
}