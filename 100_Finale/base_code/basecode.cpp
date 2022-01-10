// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

 cout << "what length do you want the square to be?" << endl;
    int t = getch();
    cin >> t;

	cout << "What height do you want the square to be" << endl;
	int e = getch();
	cin >> e; 
	cout << "would you like a generate a random number from 1-100? y or n" << endl;
	char h;
    cin >> h;
    if(h =='y')
cout << random(100) <<endl;
    if(h =='n')
    cout << ":C" <<endl;
cout << " ><" << endl;

     for(int a=1;a<=t;a++) {
            cout<<"*";}
            cout<<endl;
for(int b=1;b<e-1;b++){
    for(int c=1;c<=1;c++) {
                cout<<"*"; }
        for(int d=0;d<=e-3;d++){
                cout<<" "; }
                cout<<"*"<<endl;}
for(int e=1;e<=t;e++){
cout<<"*";}

	

	

for(int y = 0; y < 5; y++){
	    gotoxy(13,y+8);
		cout << "*" << endl;
		sleep(1);
		gotoxy (13,y+8);
		cout << ' ' << endl;
	}
}

