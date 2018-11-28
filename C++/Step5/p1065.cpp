#include <iostream>
#include <vector>
using namespace std;
bool isCheck(int num);
int main() {
	int cnt = 0;
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		if (isCheck(i))
			cnt++;
	}
	cout << cnt;
	return 0;
}

bool isCheck(int num) {
	int minur = 0;
	int temp = 0;
	bool isCheck = true;
	vector<int> number;
	while (num>0) {
		number.push_back(num%10);
		num /= 10;
	}
	for (int i = 1; i < number.size(); i++) {
		if (number.size() != 0) {

			temp = number.at(i - 1) - number.at(i);
			if (i != 1)
				if (minur == temp) {
					isCheck = true;
				}
				else {
					isCheck = false;
				}
			else
				minur = temp;
		}
	}
	return isCheck;
}
