const sentence = "A GOOD BUSINESS ALWAYS FOCUSES ON CUSTOMER SATISFACTION";
let charCount = 0;

for (let i = 0; sentence[i] != undefined; i++) {
    charCount++;
}

let wordCount = 1;

for (let i = 0; sentence[i] != undefined; i++) {

    if (sentence[i] == ' ') {
        wordCount++;
    }
}

let lowerSentence = "";

for (let i = 0; sentence[i] != undefined; i++) {

    let ch = sentence[i];

    if (ch >= 'A' && ch <= 'Z') {

        lowerSentence =
            lowerSentence +
            String.fromCharCode(ch.charCodeAt(0) + 32);

    } else {

        lowerSentence = lowerSentence + ch;
    }
}

const result = {
    totalCharacters: charCount,
    totalWords: wordCount,
    lowercaseSentence: lowerSentence
};

console.log(result);