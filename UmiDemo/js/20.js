let stu1 = {
    number:1,
    name:'Jack',
    age:18,
    class:'A7'
};

let stu2 = {
    number:2,
    name:'Tom',
    age:18,
    class:'A7'
};

let stu3 = {
    number:3,
    name:'Alex',
    age:16,
    class:'A6'
};

let arr = [stu1,stu2,stu3];

//initailiz web page by add some start data in table
let loadMethod = function(){        //something to do when the page is ready
    for(let stu of arr){
        console.log(stu);
        addOneStudent(stu);
    }
} 

//an operation to add a student object into table as a row
let addOneStudent = function(stu){
    let tr = document.createElement("tr");

    let tdnumberStr = document.createElement("td");
    let tdnameStr = document.createElement("td");
    let tdageStr = document.createElement("td");
    let tdclsStr = document.createElement("td");

    tdnumberStr.innerText = stu.number;
    tdnameStr.innerText = stu.name;
    tdageStr.innerText = stu.age;
    tdclsStr.innerText = stu.class;

    tr.appendChild(tdnumberStr);
    tr.appendChild(tdnameStr);
    tr.appendChild(tdageStr);
    tr.appendChild(tdclsStr);
    document.getElementById("stus").appendChild(tr);
}

let number = document.getElementById("number");
let name = document.getElementById("name");
let age = document.getElementById("age");
let cls = document.getElementById("class");

//for add buttom
let add = function () {
    let numberStr = number.value;
    let nameStr = name.value;
    let ageStr = age.value;
    let clsStr = cls.value;
    let student = {
        number:numberStr,
        name:nameStr,
        age:ageStr,
        class:clsStr
    }
    
    addOneStudent(student);
};

