String.prototype.repeatify = function(repetition) {

    string = "";
    for (let loopCount = 0; loopCount < repetition; loopCount++) {
        string = string + this;
    }
    return string;
};

function repeat() {
    var repetition = document.getElementById("repetitionCount").value;
    var string = document.getElementById("inputString").value;
    if (string == "") {
        alert("Input cannot be null !!!");
    } else if (repetition == "") {
        alert("Repetition should only be in number !!!")
    } else if (repetition < 2) {
        alert("Repetition must be greater then 1");
    } else {
        document.getElementById("repeatedString").innerHTML = string.repeatify(repetition);
    }
}