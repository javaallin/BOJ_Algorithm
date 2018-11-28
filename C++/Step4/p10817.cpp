#include <iostream>

using namespace std;

int main(){
  int num1,num2,num3;
  int second=0;
  cin >> num1 >> num2 >> num3;
  if(num1>num2){
    second=num1;
  }else{
    second=num2;
  }
  if(second<num3){
    cout << second;
  }else
    cout << num3;
  return 0;
}
