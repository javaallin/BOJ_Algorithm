#include <iostream>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	char word[101];
	int alpa[26];
	int cnt = 0;
	bool isGroupWord = true;

	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int i = 0; i < 26; i++) {
			alpa[i] = 0;
		}
		cin >> word;
		for (int j = 0; word[j] != '\0'; j++) {
			if(j==0){
				alpa[word[j] - 97]++;
				continue;
			}
			if (word[j] == word[j - 1]) {
				alpa[word[j] - 97]++;
			}
			else if (alpa[word[j] - 97] != 0) {
				isGroupWord = false;
				break;
			}
			else {
				alpa[word[j] - 97]++;
			}

		}
		if (isGroupWord) {
			cnt++;
		}
		else {
			isGroupWord = true;
		}
	}
	cout << cnt;

}
