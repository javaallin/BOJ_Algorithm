#include <iostream>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int score;
	int total=0;
	int avg;
	for (int i = 0; i < 5; i++) {
		cin >> score;
		if (score < 40) {
			total += 40;
		}
		else {
			total += score;
		}
	}
	avg = total / 5;
	cout << avg;
	return 0;
}
