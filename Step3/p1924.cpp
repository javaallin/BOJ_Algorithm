#include <iostream>
#include <string>
using namespace std;

int main() {
	int month,day;
	string days[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	int month_max_days[] = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	cin >> month >> day;
	int tmp = 0;
	for (int i = 0; i < month; i++)
		tmp += month_max_days[i];
	tmp += day;
	cout << days[tmp % 7];
}
