#include <iostream>
using namespace std;
int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	int n, x;
	cin >> n >> x;
	int num;
	for (int i = 0; i < n; i++) {
		cin >> num;
		if (num < x)
			cout << num<< " ";
	}
	return 0;
}
