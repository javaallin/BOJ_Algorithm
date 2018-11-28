#include <iostream>
#include <cstring>
#include <string>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	string word;
	int T;
	cin >> T;
	cin.ignore(1000, '\n');
	for (int i = 0; i < T; i++) {
		getline(cin, word);
		for (int j = 2; j < word.length(); j++) {
			for (int k = 0; k < word[0]-48; k++) {
				if (word[j] == ' ') {
					break;
				}
				cout << word[j];
			}
		}
			cout << '\n';
	}
	return 0;
}
