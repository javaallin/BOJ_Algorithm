
#include <iostream>
#include <cstring>
using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	char str[1000000];
	cin.getline(str, 1000000);
	int len = strlen(str);
	int count = 1;
	for (int i = 1; i < len; i++) {
    //문자열 마지막 공백도 체크하지 않음
		if (str[i] == ' ' && i != len-1 ) {
			count++;
		}
	}
  //공백하나만 입력되었을 경우
	if (len == 1 && str[0] == ' ')
		count = 0;
	cout << count << endl;
	return 0;
}
