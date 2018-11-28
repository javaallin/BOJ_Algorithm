#include <iostream>

using namespace std;
void printReverseNumber(int num);
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int num1, num2;
	cin >> num1 >> num2;
	int i,j;
	for (i = num1, j = num2; i != 0 ; i /= 10, j /= 10) {
		if (i % 10 > j %10) {
			printReverseNumber(num1);
			return 0;
		}
		else if (i % 10 < j % 10) {
			printReverseNumber(num2);
			return 0;
		}
	}

}

void printReverseNumber(int num) {
	while (num != 0) {
		cout << num % 10;
		num /= 10;
	}
}
