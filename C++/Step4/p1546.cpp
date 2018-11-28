#include <iostream>

using namespace std;
int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	int n;
	cin >> n;
	double* score = new double[n];
	double max = 0.0;
	double total = 0.0;
	for (int i = 0; i < n; i++) {
        cin >> score[i];
		if (max < score[i])
			max = score[i];
	}
	for (int i = 0; i < n; i++) {
		score[i]= score[i] / max * 100;
        total += score[i];
	}

	cout << total / (double)n;
	return 0;
}
