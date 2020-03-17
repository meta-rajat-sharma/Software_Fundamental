// variables used for saving details of employee and vehicles
let name = "";
let email = "";
let password = "";
let confirmPassword = "";
let contactNumber = "";
let employeeID = "";
let vehicleNumber = "";
let vehicleName = "";
let pass = "";
let vehicleIdentification = "";
// let passAmountDaily = 1.0;
// let passAmountMonthly = 1.0;
// let passAmountYearly = 1.0;

// regex needed fot he programme
let regexName = /^[a-zA-Z]{2,}/;
let regexName1 = /^[a-zA-Z]+ [a-zA-Z]+$/;
let regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
let regexPassword = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})/;
let regexContactNumber = /^\d{10}$/;
let regexVehicleName = /[a-zA-Z]/;
let regexForVehicleNumber = /^[A-Za-z]{2}\s[0-9]{2}\s[A-Za-z]{2}\s[0-9]{4}$/;

var price = {
    "Cycle": {
        "daily": 5,
        "monthly": 100,
        "yearly": 500
    },
    "TwoWheeler": {
        "daily": 10,
        "monthly": 200,
        "yearly": 1000
    },
    "FourWheeler": {
        "daily": 20,
        "monthly": 500,
        "yearly": 3500
    }
}

// This method will enable the functionality of enter
function pressEnter(e, a) {
    var code = (e.keyCode ? e.keyCode : e.which);
    if (code == 13) {
        var caseValue = document.getElementById("input").name;
        switch (caseValue) {
            case "name":
                nameCheck();
                break;
            case "email":
                emailCheck();
                break;
            case "confirmPassword":
                passwordCheck();
                break;
            case "contactNumber":
                contactnumberCheck();
                break;
            case "empID":
                employeeIDCheck();
                break;
            case "vehName":
                vehicleNameCheck();
                break;
            case "vehNumber":
                vehicleNumberCheck();
                break;
        }
    }
}

// This method will check the validation of name and will show next input
nameCheck = () => {
    name = document.getElementById("input").value;
    if (name != "") {
        if (regexName.test(name) || regexName1.test(name)) {
            document.getElementById("genderIdLabel").innerHTML = "Hi " + name + " ! Please Enter your Gender : ";
            document.getElementById("formGender").style.display = "block";
            document.getElementById("formForAllInput").style.display = "none";
        } else {
            alert("Name should contain only letter and minimum 2 letters.");
        }
    } else {
        alert("Name can't be empty.");
    }
}

// This method will check the validation of gender and will show next input
genderCheck = () => {
    if (document.getElementById("maleGender").checked == true || document.getElementById("femaleGender").checked == true) {
        document.getElementById("formGender").style.display = "none";
        document.getElementById("formForAllInput").style.display = "block";
        document.getElementById("idLabel").innerHTML = "Hi " + name + "!" + " Enter Your Email ";
        document.getElementById("input").type = "email";
        document.getElementById("input").name = "email";
        document.getElementById("input").value = "";
        document.getElementById("referenceLink").onclick = emailCheck;
    } else {
        alert("please select your gender");
    }
}

// This method will check the validation of Email and will show next input
emailCheck = () => {
    email = document.getElementById("input").value;
    if (email != "") {
        if (regexEmail.test(email)) {
            // document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please Enter your password : ";
            document.getElementById("passwordInput").style.display = "block";
            document.getElementById("input").type = 'password';
            document.getElementById("input").value = "";
            document.getElementById("input").name = "confirmPassword";
            document.getElementById("referenceLink").onclick = passwordCheck;
            document.getElementById("inputPassword").onkeyup = boundaryColor;
            document.getElementById("input").onkeyup = confirmBoundaryColor;
            document.getElementById("headingAllInput").style.display = "none";
        } else {
            alert("Enter email in proper format. Format : abc@abc.com");
        }
    } else {
        alert("Email can't be empty.");
    }
}

// This method will check the validation of coinfirm password and will show next input
passwordCheck = () => {
    password = document.getElementById("inputPassword").value;
    confirmPassword = document.getElementById("input").value;
    if (confirmPassword == password) {
        document.getElementById("passwordInput").style.display = "none";
        document.getElementById("headingAllInput").style.display = "block";
        document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please enter your Contact Number : ";
        document.getElementById("input").type = "text";
        document.getElementById("input").name = "contactNumber";
        document.getElementById("input").style.borderColor = "";
        document.getElementById("input").value = "";
        document.getElementById("referenceLink").onclick = contactnumberCheck;
        document.getElementById("input").onkeyup = "";
    } else {
        alert("Your password don't match!!!");
    }
}

// This method will check the validation of Contact Number and will show next input
contactnumberCheck = () => {
    contactNumber = document.getElementById("input").value;
    if (document.getElementById("input").value != "") {
        if (regexContactNumber.test(contactNumber)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your Employee ID : ";
            document.getElementById("input").value = "";
            document.getElementById("input").name = "empID";
            document.getElementById("referenceLink").onclick = employeeIDCheck;
            document.getElementById("input").style.borderColor = "";
        } else {
            alert("Contact number should only contain 10 numbers.");
        }
    } else {
        alert("Looks Like Your Contact Number is Empty!!");
    }
}

// This method will check the validation of Employee ID and will show next input
employeeIDCheck = () => {
    employeeID = document.getElementById("input").value;
    if (employeeID != "") {
        document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle name : ";
        document.getElementById("input").value = "";
        document.getElementById("input").name = "vehName";
        document.getElementById("referenceLink").onclick = vehicleNameCheck;
        document.getElementById("input").style.borderColor = "";
    } else {
        alert("Employee ID can't be empty!!!");
    }
}

// This method will check the validation of Vehicle name and will show next input
vehicleNameCheck = () => {
    vehicleName = document.getElementById("input").value;
    if (document.getElementById("input").value != "") {
        if (regexVehicleName.test(vehicleName)) {
            document.getElementById("input").style.borderColor = "";
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle number!";
            document.getElementById("input").value = "";
            document.getElementById("input").name = "vehNumber";
            document.getElementById("referenceLink").onclick = vehicleNumberCheck;
        } else {
            alert("Only letters are allowed!!!");
        }
    } else {
        alert("Vehicle number can't be empty!!");
    }
}

// This method will check the validation of Vehicle Number and will show next input
vehicleNumberCheck = () => {
    vehicleNumber = document.getElementById("input").value;
    if (vehicleNumber != "") {
        if (regexForVehicleNumber.test(vehicleNumber)) {
            document.getElementById("input").style.borderColor = "";
            document.getElementById("selectVehicleType").style.display = "block";
            document.getElementById("vehicleTypeLabel").innerHTML = "Which vehicle do you have?";
            document.getElementById("formForAllInput").style.display = "none";
            document.getElementById("referenceLink").onclick = vehicleTypeCheck;
        } else {
            alert("Please Enter Vehicle Number in form like RJ XX CA XXXX!");
        }
    } else {
        alert("Please Enter Vehicle Number!!");
    }
}

// This method will check the validation of Vehicle Type and will show next input
vehicleTypeCheck = () => {
    vehicleType = document.getElementById("vehicleType").value;
    if (vehicleType != "") {
        document.getElementById("boxSpanInput").style.display = "none";
        document.getElementById("formForAllInput").style.display = "block";
        document.getElementById("boxSpanTextarea").style.display = "block";
        document.getElementById("selectVehicleType").style.display = "none";
        document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please Enter your vehicle Identification : ";

        document.getElementById("referenceLink").onclick = showPass;
    } else {
        alert("Please select your vehicle type!!");
    }
}

// This method will show the pass of vehicle
showPass = () => {
    document.getElementById("idLabel").style.display = "none";
    document.getElementById("boxSpanInput").style.display = "none";
    document.getElementById("formForAllInput").style.display = "none";
    document.getElementById("selectVehicleType").style.display = "none";
    document.getElementById("referenceLink").style.display = "none";

    document.getElementById("selectPassType").style.display = "block";
    document.getElementById("idLabelPassType").innerHTML = "Choose Your Pass!";
    if ("Cycle" == vehicleType) {
        document.getElementById("dailyPrice").innerHTML = "5";
        document.getElementById("monthlyPrice").innerHTML = "100";
        document.getElementById("yearlyPrice").innerHTML = "500";
        document.getElementById("inputDaily").value = "5";
        document.getElementById("inputMonthly").value = "100";
        document.getElementById("inputYearly").value = "500";
    } else if ("TwoWheeler" == vehicleType) {
        document.getElementById("dailyPrice").innerHTML = "10";
        document.getElementById("monthlyPrice").innerHTML = "200";
        document.getElementById("yearlyPrice").innerHTML = "1000";
        document.getElementById("inputDaily").value = "10";
        document.getElementById("inputMonthly").value = "200";
        document.getElementById("inputYearly").value = "1000";
    } else if ("FourWheeler" == vehicleType) {
        document.getElementById("dailyPrice").innerHTML = "20";
        document.getElementById("monthlyPrice").innerHTML = "500";
        document.getElementById("yearlyPrice").innerHTML = "3500";
        document.getElementById("inputDaily").value = "20";
        document.getElementById("inputMonthly").value = "500";
        document.getElementById("inputYearly").value = "3500";
    }
}

// This method will show the pass price
passCheck = () => {
    document.getElementById("formForAllInput").style.display = "none";
    var pass = document.querySelector('input[name = passPrice]:checked').value;
    if (pass != "") {
        document.getElementById("selectPassType").style.display = "none";
        document.getElementById("finalMessage").innerHTML = " Your pass price is Rs." + pass + "  !!!!!";
    } else {
        alert("Please Select Pass!!!");
    }
}

// This method will change the color of boundary according to the password length
boundaryColor = () => {
    password = document.getElementById("inputPassword").value;
    if (regexPassword.test(password)) {
        document.getElementById("inputPassword").style.borderColor = "green";
    } else if (password.length < 2) {
        document.getElementById("inputPassword").style.borderColor = "red";
    } else if (password.length > 2) {
        document.getElementById("inputPassword").style.borderColor = "yellow";
    }
}

// This method will change the color of boundary according to the confirmation if the password and confirm password input match
confirmBoundaryColor = () => {
    confirmPassword = document.getElementById("input").value;
    if ((confirmPassword == password) && regexPassword.test(password)) {
        document.getElementById("input").style.borderColor = "green";
    } else {
        document.getElementById("input").style.borderColor = "red";
    }
}

// This method is use to convert the currency
currencyConverter = () => {

    passAmountDaily = parseFloat(document.getElementById("inputDaily").value);
    passAmountMonthly = parseFloat(document.getElementById("inputMonthly").value);
    passAmountYearly = parseFloat(document.getElementById("inputYearly").value);

    if (document.getElementById("currency").value == "rupees") {
        document.getElementById("dailyPrice").innerHTML = (1 * passAmountDaily);
        document.getElementById("monthlyPrice").innerHTML = (1 * passAmountMonthly);
        document.getElementById("yearlyPrice").innerHTML = (1 * passAmountYearly);
    } else if (document.getElementById("currency").value == "dollar") {
        document.getElementById("dailyPrice").innerHTML = (passAmountDaily / 71.38).toFixed(2);
        document.getElementById("monthlyPrice").innerHTML = (passAmountMonthly / 71.38).toFixed(2);
        document.getElementById("yearlyPrice").innerHTML = (passAmountYearly / 71.38).toFixed(2);
    } else if (document.getElementById("currency").value == "yen") {
        document.getElementById("dailyPrice").innerHTML = (passAmountDaily * 1.53).toFixed(2);
        document.getElementById("monthlyPrice").innerHTML = (passAmountMonthly * 1.53).toFixed(2);
        document.getElementById("yearlyPrice").innerHTML = (passAmountYearly * 1.53).toFixed(2);
    }
}