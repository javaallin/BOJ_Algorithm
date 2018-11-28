#include <iostream>
#include <string>
#include <cstring>
using namespace std;
int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	string str;
	getline(cin, str);
	int len = str.length();
	int count = 1;
	for (int i = 1; i < len; i++) {
		if (str[i] == ' ' && i!=len-1)
			count++;
	}
	if (len == 1 && str[0] == ' ')
		count = 0;
	cout << count;
}
