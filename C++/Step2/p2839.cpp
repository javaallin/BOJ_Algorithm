#include <iostream>

using namespace std;

int main() {
	int n , cnt, i = 0; // 순서대로 배달해야하는 무게, 봉지 개수, 반복문을 위한 변수
	cin >> n;
	int min=5000; // 최솟값을 저장하기 위한 변수
	int tmp = 0; // 임시저장 변수로 5kg봉지에 따른 남은 무게가 저장됨
	for (i = 0; i <= n / 5; i++) { //5kg봉지로 담을 수 있는 개수가 반복횟수
		tmp = n - i * 5; // 5kg봉지에 넣은 그램을 제외한 남은 무게
		if (tmp%3==0) { // 남은 무게를 3kg봉지에 다 담아지는지 확인
			cnt = tmp / 3 + i; //봉지 갯수 확인
			if (min > cnt) // 봉지 갯수 최소값 찾기
				min = cnt;
		}
	}
	if (min == 5000) { // 최소값이 초기값이라면 봉지에 넣고 남은 무게가 있으므로 -1 출력
		cout << -1;
	}
	else { // 최소 봉지 개수 출력
		cout << min;
	}
	return 0;
}
