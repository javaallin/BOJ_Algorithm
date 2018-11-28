#include <iostream>
using namespace std;

int main() {
	char str[101];
	cin >> str;
	for (int i = 0; i < 101; i++) {
		if (str[i] == '\0')
			break;
		else if(i%10==0 && i > 9){
			cout << "\n";
		}
		cout << str[i];
	}
	return 0;
}
