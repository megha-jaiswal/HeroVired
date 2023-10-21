var items=document.querySelector("#add");
var btn=document.querySelector("#click");

btn.addEventListener("click",additems);
let ulitem=document.createElement("ul");
var count=0;
var completed=0;
function additems(){
    let inputValue=items.value;
   
    let liItem=document.createElement("li");
    liItem.textContent=inputValue;
    ulitem.appendChild(liItem);
    document.body.appendChild(ulitem);
    let removebtn=document.createElement("button");
    removebtn.textContent="Remove";
    ulitem.appendChild(removebtn);

    removebtn.addEventListener("click",function (){
       ulitem.removeChild(liItem);
       ulitem.removeChild(removebtn);
       let countR=document.querySelector("#complete");
       completed++;
       countR.textContent=completed;
    });
    count++;
    let count1=document.querySelector("#count");
    count1.textContent=count;
}

