#include <iostream>

using namespace std;
/*cout.precision(int)는 출력할 숫자의 개수를 정해줄 수 있다.
유효숫자를 설정한다고 생각하면 된다.*/
int  main(){
	double num1=0,num2=0;
	cin >> num1;
	cin >> num2;
    cout.precision(10);
	cout << num1/num2;
	return 0;
}
