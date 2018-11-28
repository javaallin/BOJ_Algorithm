#include <iostream>
#include <string>

using namespace std;

/*11718 / 11719 문제를 모두 해결 할 수 있는 소스이다.
11718문제는 공백으로 시작하지 않고 끝나지 않는 입력을 받아 출력하는 문제이고
11719문제는 앞 뒤에 공백이 있을 수도 있는 입력을 받아 출력하는 문제이다.
cin은 공백을 받으면 입력이 끝나기 때문에 공백 포함 문자를 한 글자씩 받는 getchar를 사용했다.
EOF(ctrl+z)일 때까지 getchar로 입력을 받고 puchar를 이용하여 출력을 한다.*/
int main(){
  char a;
  a = getchar();

  while( a!= -1){
    putchar(a);
    a = getchar(0);
  }
  return 0;
}
