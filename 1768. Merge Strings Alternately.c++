#include <iostream>
#include <string>
using namespace std;

string mergeAlternately(string word1, string word2) {
    string result = "";
    int len = min(word1.length(), word2.length());
    for(int i = 0; i < len; i++) {
        result += word1[i];
        result += word2[i];
    }
    result += word1.substr(len) + word2.substr(len);
    return result;
}

int main() {
    string word1 = "abc";
    string word2 = "def";
    cout << mergeAlternately(word1, word2) << endl;
    return 0;
}
