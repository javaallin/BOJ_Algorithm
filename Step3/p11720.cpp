#include <iostream>
using namespace std;
//문자 한개씩 받고 바로바로 sum에 저장해준다. 문자를 숫자로 변경해주어야한다.
int main() {
	int n;
	int sum = 0;
	char num;
	int temp;
	cin >> n;
	cin.get();
	for (int i = 0; i < n; i++) {
		cin.get(num);
		temp = num - '0'; //int 숫자 값으로 맞춰주기 위해 - 48 해도 같은 값이 나온다.
		sum += temp;
	}
	cout << sum;
	return 0;
}
