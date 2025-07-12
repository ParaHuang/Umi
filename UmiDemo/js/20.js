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
    stusNode.appendChild(tr);
}

let numberNode = document.getElementById("number");
let nameNode = document.getElementById("name");
let ageNode = document.getElementById("age");
let clsNode = document.getElementById("class");
let stusNode = document.getElementById("stus");

//for add buttom
let add = function () {
    let number = numberNode.value;
    let name = nameNode.value;
    let age = ageNode.value;
    let clsStr = clsNode.value;
    let student = {
        number,name,age,
        class:clsStr
    }
    
    addOneStudent(student);
    arr.push(student);
    emptyBox();
};

let del = ()=>{
    let number = numberNode.value;
// parentNode.removeChild(childNode);
    // let trs = stusNode.getElementsByTagName("tr");
    // console.log(trs);
    // let tr = document.querySelector("tr");//returns the 1st node
    let trs = document.querySelectorAll("#stus tr");//returns all nodes
    for(let i = 0 ; i<trs.length ; i++){
        let tr = trs[i];
        let td = tr.querySelector("td");
        // console.log(td);
        if(td.innerText == number){
            stusNode.removeChild(tr);                   //remove row from tbody
            arr.splice(i,1);    //remove 1 element from index i  , remove student from arr
            emptyBox();
            return; //stop the rest program
        }
    }

    
};


let search = function(){
    
    //clean previous data
    stusNode.innerHTML = "";
    let number = numberNode.value;
    //1.no number, search all
    //2.with correct number, search only 1
    //3.with incorrect number, search nothing
    if(number==""){
        for(let stu of arr){
            addOneStudent(stu);
        }
        return; //stop the rest program
    }

    for(let stu of arr){
        //===   full equals(value + type)
        //==    value equals
        if( /*number == "" ||*/  number == stu.number){
            addOneStudent(stu);
        }
    }
    emptyBox();
};

let emptyBox = ()=>{
    numberNode.value = "";
    nameNode.value = "";
    ageNode.value = "";
    clsNode.value = "";
};


