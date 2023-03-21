#include <iostream>
#include <fstream>
using namespace std;

int main() {
    // Opens the file to be read
    ofstream file;
    file.open("numbers.html");
    // Writes these two lines to the file
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n";
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    
    // For loop to rows and columns to the table in the file
    for (int i = 1; i <= 50; i++) {
        if (i % 2 == 0) {
            file << "<tr><td>" << i << "</td><td></td></tr>\n";
        }
        else {
            file << "<tr><td></td><td>" << i << "</td></tr>\n";
        }
    }
    
    // Close the table, close the body, and close the html file
    file << "</table>\n</body>\n</html>";
    file.close();
    
    // Print to console
    ifstream input("numbers.html");
    cout << input.rdbuf();
    input.close();
    return 0;
}
