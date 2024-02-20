#include <iostream>
#include <list>
#include <bits/stdc++.h>
using namespace std;

int main () {
    list <int> x_map;
    list <int> y_map;
    int N;

    cout << "Enter number of attacks: ";
    cin >> N;
    
    for (int attack = 0; attack < N; attack++) {
        int xa, ya, xb, yb;

        cout << "Enter coordinates #" << attack+1 << ": ";
        cin >> xa;
        cin >> ya;
        cin >> xb;
        cin >> yb;
        
        x_map.push_back(xa);
        x_map.push_back(xb);
        y_map.push_back(ya);
        y_map.push_back(yb);
    }

    list<int>::iterator next_x = x_map.begin();
    list<int>::iterator next_y = y_map.begin();
    
    for (int attack = 0; attack < N; attack++) {
        for (int first_size = 0; first_size < N; first_size++) {
            
        }
        advance(next_x, 1);
    }


    return 0;
}