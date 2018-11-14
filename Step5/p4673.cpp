#include <iostream>

using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	bool isSelfNumber = true;
	int number;
	for (int i = 1; i <10000; i++) {
		for (int j = 1; j < 10000; j++) {
			if (j < 100) \
			{
				number = j + (j / 10 + j % 10);
				if (number == i) {
					isSelfNumber = false;
				}
			}
			else if (j < 1000)
			{
				number = j + (j / 100 + (j % 100)/10+j%10);
				if (number == i) {
					isSelfNumber = false;
				}
			}
			else if (j < 10000)
			{
				number = j + (j / 1000 + (j % 1000) / 100 + (j % 100) / 10 + j%10);
				if (number == i) {
					isSelfNumber = false;
				}
			}
		}
		if (isSelfNumber) {
			cout << i << endl;
		}
		isSelfNumber = true;
	}
	return 0;
}
