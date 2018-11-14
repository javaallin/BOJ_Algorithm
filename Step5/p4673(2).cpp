#include <iostream>

using namespace std;
bool isSelfNumber(int num);
int sum(int num);

int main() {
	for (int i = 1; i < 10000; i++) {
		if (isSelfNumber(i)) {
			cout << i << "\n";
		}
	}
	return 0;
}

bool isSelfNumber(int num) {
	for (int i = 0; i < num; i++) {
		if (num == sum(i)) {
			return false;
		}
	}
	return true;
}

int sum(int num) {
	int sum=num;
	while (num>0) {
		sum += num % 10;
		num /= 10;
	}
	return sum;
}
