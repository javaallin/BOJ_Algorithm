#include <iostream>
#include <cstring>
#include <string>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	string word;
	int a[26];
	for (int i = 0; i < 26; i++) {
		a[i] = -1;
	}
	getline(cin, word);
	int len = word.length();
	for (int i = len; i >= 0; i--) {
		for (int j = 97; j <=122 ; j++) {
			if ((int)word[i] == j){
				a[j-97] = i;
				break;
			}
		}
	}
	for (int i = 0; i < 26; i++) {
		cout << a[i] << ' ';
	}
	return 0;
}
