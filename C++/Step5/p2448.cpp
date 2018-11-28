#include <iostream>

using namespace std;

void drawStar(int n, int x, int y);
char map[3072][6143] = { ' ', };;
int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 2*n-1; j++) {
			map[i][j] = ' ';
		}
	}
	drawStar(n, n-1, 0);
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 2 * n-1; j++) {
			if (map[i][j]=='\0') {
				cout << ' ';
			}else{
				cout << map[i][j];
			}
		}
		cout << '\n';
	}
	return 0;
}
void drawStar(int n, int x, int y) {
	if (n == 3) {
		map[y][x] = '*';
		map[y + 1][x -1] = '*';
		map[y + 1][x + 1] = '*';
		map[y + 2][x - 2] = '*';
		map[y + 2][x - 1] = '*';
		map[y + 2][x] = '*';
		map[y + 2][x + 1] = '*';
		map[y + 2][x + 2] = '*';
		return;
	}
	drawStar(n / 2, x, y);
	drawStar(n / 2, x - n / 2, y + n / 2);
	drawStar(n / 2, x + n / 2, y + n / 2);
}
