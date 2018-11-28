#include <iostream>
#include <algorithm>
#define N 3

using namespace std;
int main() {
	int num[N];
	for (int i = 0; i < N; i++) {
		cin >> num[i];
	}
	sort(num, num + 3);
	cout << num[1];
	return 0;
}
