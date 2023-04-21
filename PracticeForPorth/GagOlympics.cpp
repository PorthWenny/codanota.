#include <iostream>
#include <string>
using namespace std;

int main () {
    
    int T;
    cin >> T;
    
    string words[T];
    
    for (int test = 0; test < T; test++) {
        cin >> words[test];
    }
    return 0;

    string G[] = {".###.", "#...#", "#....", "#.###", "#...#", "#...#", ".###."};

    for (int letters = 0; letters < 7; letters++) {
        cout << G[letters];
        cout << endl;
    }
}
