// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
 


int number;
    cout << "Enter your number: "; 
    cin >> number; 
    

int number2;
    cout << "Enter in your second number: ";
    cin >> number2;

int number3;



char joe = '+';

cin >> joe;
char oe = '-';

cin >> oe;
char e = '*';

cin >> e;
char ooOoOOoo = '%';

cin >>ooOoOOoo;


if(joe == '+')
    cout << number << "+" << number2 << "=" << number + number2;
if(joe == '-')
    cout << number << "-" << number2 << "=" << number - number2;
if(joe == '*')
    cout << number << "*" << number2 << "=" << number * number2;
if(joe == '/')
    cout << number << "/" << number2 << "=" << number / number2;

}
