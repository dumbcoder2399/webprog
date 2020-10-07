
function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}


function validateForm() {
    var name = document.contactForm.name.value;
    var email = document.contactForm.email.value;
    var password = document.contactForm.password.value;
    var gender = document.contactForm.gender.value;
   
    
    var nameErr = emailErr = passwordErr =genderErr= true;
    

    if(name == "") {
        printError("nameErr", "Please enter your name");
    } else {
        var regex = /^[a-zA-Z\s]+$/;                
        if(regex.test(name) === false) {
            printError("nameErr", "Please enter a valid name");
        } else {
            printError("nameErr", "");
            nameErr = false;
        }
    }
    

    if(email == "") {
        printError("emailErr", "Please enter your email address");
    } else {

        var regex = /^\S+@\S+\.\S+$/;
        if(regex.test(email) === false) {
            printError("emailErr", "Please enter a valid email address");
        } else{
            printError("emailErr", "");
            emailErr = false;
        }
    }
    

    if(password == "") {
        printError("passwordErr", "Please enter your password");
    } else {
        var regex = /^[A-Za-z]\w{7,14}$/;
        if(regex.test(password) === false) {
            printError("passwordErr", "Please enter a valid password");
        } else{
            printError("passwordErr", "");
            passwordErr = false;
        }
    }
    

    if(gender == "") {
        printError("genderErr", "Please select your gender");
    } else {
        printError("genderErr", "");
        genderErr = false;
    }

    if((nameErr || emailErr || passwordErr || genderErr) == true) {
       return false;
    } else {
      
        var dataPreview = "You've entered the following details: \n" +
                          "Full Name: " + name + "\n" +
                          "Email Address: " + email + "\n" +
                          "Password: " + "************" + "\n" +
                          "Gender: " + gender + "\n";
       
      
        alert(dataPreview);
    }
};

function login() {
    var uname = document.getElementById("email").value;
    var pwd = document.getElementById("password").value;
    if(uname == '') {
        alert("please enter user name.");
    } else if(pwd == '') {
        alert("enter the password");
    } else if(pwd == 'admin123') {
        alert('Login Succesful ! Press OK');
    } else {
        alert('Incorrect Password');
    }
}

function techquiz(){
    window.location = "tech.html";
}

function musicquiz(){
    window.location = "tech.html";
}

function cinemaquiz(){
    window.location = "tech.html";
}

function brainquiz(){
    window.location = "tech.html";
}