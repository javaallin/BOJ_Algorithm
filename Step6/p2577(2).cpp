#include <iostream>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int num1, num2, num3;
	int count[10] = { 0 };
	cin >> num1 >> num2 >> num3;
	int a;
	for (int i = num1 * num2*num3;i;count[a]++, i/= 10)
		a = i % 10;
	for (int i = 0; i < 10;)
		cout << count[i++] <<\n;
	return 0;
}
