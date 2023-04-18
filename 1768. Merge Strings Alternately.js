function mergeAlternately(word1, word2) {
    let result = '';
    let len = Math.min(word1.length, word2.length);
    for(let i = 0; i < len; i++) {
        result += word1[i] + word2[i];
    }
    result += word1.slice(len) + word2.slice(len);
    return result;
}
