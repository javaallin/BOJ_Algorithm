#include <iostream>

using namespace std;
//flag 변수는 같은 최대값이 존재할 경우는 1 최대값이 오직 한 알파벳이라면 0
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	char word[1000001];
	cin >> word;
	int max = 0;
	char ch = ' ';
	int flag=0;
	int alpa[26];
	for (int i = 0; i < 26; i++) {
		alpa[i] = 0;
	}
	for (int i = 0; word[i] != '\0'; i++) {

		if (word[i] > 91)
			word[i] = word[i] - 32;
		alpa[word[i] - 65]++;
	}
	for (int i = 0; i < 26; i++) {
		if (max < alpa[i]) {
			max = alpa[i];
			ch = i+65;
			flag = 0;
		}
		else if (max == alpa[i]) {
			flag = 1;
		}
	}
	if (flag == 0)
		cout << ch;
	else
		cout << '?';



	return 0;
}
