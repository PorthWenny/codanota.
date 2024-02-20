#include <iostream>
using namespace std;

int RightTriangle()
{
    int a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    
    int longest = 0, shortest = 0;
    
    if (a > b && a > c) {
        cout << "Hypothenuse: " << a << "\n";
        longest = a*a;
        shortest = (b*b) + (c*c);
    }
    else if (b > a && b > c) {
        cout << "Hypothenuse: " << b << "\n";
        longest = b*b;
        shortest = (a*a) + (c*c);
    }
    else {
        cout << "Hypothenuse: " << c << "\n";
        longest = (c*c); 
        shortest = (a*a) + (b*b);
    }
    
    if (longest == shortest) {
        cout << "It is a right triangle.";
    }
    else {
        cout << "It is not a right triangle.";
    }
    
    return 0;
}