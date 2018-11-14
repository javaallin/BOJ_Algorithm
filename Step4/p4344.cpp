#include <iostream>

using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	cout.precision(3);
	int c,n;
	int total = 0;
	double avg;
	int cnt=0;
	cin >> c;
	for (int i = 0; i < c; i++) {
		cin >> n;
		int* score = new int[n];
		for (int j = 0; j < n; j++) {

			cin >> score[j];
			total += score[j];
		}
		avg = (double)total/n;
		for (int j = 0; j < n; j++) {
			if (avg < score[j]) {
				cnt++;
			}
		}
		cout << fixed;
		cout.precision(3);
		cout << cnt / (double)n * 100 << "%\n";
		cnt = 0;
		total = 0;
		delete score;
	}
	return 0;
}
