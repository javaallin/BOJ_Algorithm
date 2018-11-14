#include <iostream>

using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	int n;
	int cycleCnt = 0;
	int newNum = -1;
	int temp;
	cin >> n;
	temp = n;
	while (true) {
		cycleCnt++;
		newNum = (temp % 10) * 10 + ((temp % 10) + (temp / 10))%10;

		if (newNum == n) {
			break;
		}
		else {
			temp = newNum;
		}
	}
	cout << cycleCnt;
	return 0;
}
