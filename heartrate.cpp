#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int n;
    double b, p,bp,ambp,min;
    cin>>n;
     for(int i=0; i<n;i++){
       cin>>b>>p;
        bp = (60*b/p);     
        ambp = 60/p;       
        min = bp+ambp;      
        cout << fixed << setprecision(4);
        cout<<bp-ambp<<" "<<bp<<" "<<min<<endl; 
     }    
}
