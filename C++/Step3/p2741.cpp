#include <stdio.h>

using namespace std;
/*cin cout은 속도차이로 인해서 시간초과로 오류가 나게된다
대체할 수 있는 것으로 scanf 와 printf가 있다.*/
int main() {
	int n, i = 0;
	scanf_s("%d", &n);
	for (i = 1; i <= n; i++)
		printf("%d\n", i);
	return 0;
}
