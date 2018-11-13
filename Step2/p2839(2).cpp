#include <iostream>

using namespace std;
/*반복문을 이용하지 않고 규칙성을 찾아 해법을 찾은 소스이다.
4와 7을 제외한 나머지 5000까지의 수는 3과5로 모두 나눠 나머지가 없다.
따라서 4와 7은 if문으로 예외를 두었고 그 이후는 나머지에 따라 규칙이 생긴다. */
int main() {
	int n;
	cin >> n;
	if (n == 4 || n == 7) {
		cout << -1;
	}
	else {
		switch (n % 5) {
		case 0:
			cout << n / 5;
			break;
		case 1:
		case 3:
			cout << n / 5 + 1;
			break;
		case 2:
		case 4:
			cout << n / 5 + 2;
			break;
		}
	}
	return 0;
}
