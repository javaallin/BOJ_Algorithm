#include <iostream>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	const int size = 8;
	int number[size];
	int check,tmp;
	for(int i =0 ; i < size ; i++){
		cin >> number[i];
	}
	for (int i = 1; i < size; i++) {
		tmp = number[i] - number[i - 1];
		if (i == 1) {
			check = tmp;

		}
		else {
			if (tmp != check) {
				cout << "mixed";
				return 0;
			}
		}
	}
	if (check > 0) {
		cout << "ascending";
	}
	else {
		cout << "descending";
	}
	return 0;
}
