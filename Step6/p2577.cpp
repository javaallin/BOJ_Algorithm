#include <iostream>
#include <string>
#include <cstring>
#include <sstream> //stringstream을 사용하기 위해 int to string 변환
using namespace std;
void countNum(int num);
void printArray();
int cnt[10] = { 0, };
int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	int a, b, c;
	cin >> a >> b >> c;
	stringstream s;
	s << a * b*c;
	string str =s.str();
	int len = str.length();
	for (int i = 0; i < len; i++) {
		countNum(str[i]-48);
	}
	printArray();
	return 0;
}

void countNum(int num) {
	cnt[num]++;
}
void printArray() {
	for (int i = 0; i < 10; i++) {
		cout << cnt[i] << "\n";
	}
}
