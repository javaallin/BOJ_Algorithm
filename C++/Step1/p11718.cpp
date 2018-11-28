#include <iostream>
#include <string>
using namespace std;
/*EOF일때까지 입력을 계속 받고 공백 또한 존재한다.
따라서 string class의 getline메소드를 사용하여 입력을 받음으로 해결할 수 있다.
getline 메소드는 행이 저장되는 문자열 객체이다.
*/
int main() {
	string str = "";
		while (true) {
			getline(cin, str);
			if(str==""||str.empty()||str=="\n")
				break;
			cout << str << endl;

	}
		return 0;
}
