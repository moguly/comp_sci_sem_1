// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	

int x = 5;
while(true){
	cout <<  x << endl;
	if(x == 25){
		break;
	}
	x = x + 1;
}

cout << endl;

for(int i = 15; i >= 5; i = i-1){
  cout << i << endl;
}
}