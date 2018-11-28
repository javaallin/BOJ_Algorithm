#include <iostream>

using namespace std;
//2중포문 사용으로 시간초과 코드
// 정답으 맞음 
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	char word[1000001];
	cin >> word;
	int cnt = 0;
	char alpa;
	int cntTmp = 0;
	int flag = 0;
	for (int i = 0; word[i] != '\0'; i++) {
		if (word[i] > 91)
			word[i] = word[i] - 32;
	}
	alpa = word[0];
	for (int i = 0; word[i] != '\0'; i++) {
		for (int j = 0; word[j] != '\0'; j++) {
			if (i == j) {

				continue;
			}
			if (word[i] == word[j])
				cntTmp++;
		}
		if (cnt < cntTmp) {
			alpa = word[i];
			cnt = cntTmp;
			flag = 0;
		}
		else if (cnt == cntTmp && alpa != word[i]) {
			flag = 1;
		}
		cntTmp = 0;
	}
	if (flag == 1 ) {
		cout << '?';
	}
	else {
		cout << alpa;
	}


	return 0;
}
