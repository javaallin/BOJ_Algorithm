#include <iostream>

using namespace std;
/*endl을 '\n'로 개행을 표시해주었더니 cin cout 사용해도 같은 시간이 걸린다.*/
int main(){
    int i;
    cin >> i;
    for(int n = 0; n<i; n++){
        cout << n+1 << '\n';
    }
}
