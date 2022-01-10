 // base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

int number;
    cout << "Enter your number: "; 
    cin >> number; 
    

int number2;
    cout << "Enter in your second number: ";
    cin >> number2;

while(true){
cout << "what symbol do you want to use?  +,-,*,%";
char y = 'm';

char joe = '+';

cin >> joe;
char oe = '-';

cin >> oe;
char e = '*';

cin >> e;
char ooOoOOoo = '%';

cin >>ooOoOOoo;


if(joe == '+')
    cout << number << "+" << number2 << "=" << number + number2 << endl;
if(joe == '-')
    cout << number << "-" << number2 << "=" << number - number2 << endl;
if(joe == '*')
    cout << number << "*" << number2 << "=" << number * number2 << endl;
if(joe == '/')
    cout << number << "/" << number2 << "=" << number / number2 << endl;
    cout << "Would you like to continue?" << endl;
    cout << "Type in y or n" << endl;
    cin >> y;
if(y == 'n'){
    cout << "see you next time";
    break;
}
}
}

