let array2;
let count = 0;
let count3 = 0;
let div;
let a;
let field = document.getElementById("field");
let field2 = document.getElementById("box");
let fin;
let fin2
let infield = [];
let cover = [];
let save = [];
let save2 = [];
let canclick = true;

let onload = function () {

    let array = ["😊", "😍", "😂", "🤣", "❤", "💋", "😒", "😘"];
    array2 = array.concat(array);
    fin = shuffle(array2);
    fin2 = display(fin);


    function shuffle(array) {
        for (let i = 0; i < array2.length; i++) {
            let random = Math.floor(Math.random() * 16)
            let temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }

        return array;
    }


    function display(fin) {
        for (let i = 0; i < fin.length; i++) {
            count++;
            div = document.createElement("div")
            div.className = "box"
            div.id = "box";
            div.id = div.id + count;
            div.setAttribute("data-emoji", array2[i])
            div.innerText = array2[i];

            a = document.createElement("div")
            a.id = ""
            a.className = "underBox"
            a.id = a.id + count
            cover[i] = a;
            infield[i] = div.innerText;


            a.addEventListener("click", flipcard)

            let emoudzi = document.createTextNode(fin[i]);
            div.appendChild(a)
            field.appendChild(div);

        }
        document.body.appendChild(field);

    }

    function flipcard(e) {
        if (canclick == true) {
            e.target.className = "underBox displayed";
            for (let i = 0; i < 16; i++) {
                if (e.target === cover[i]) {
                    save.push(infield[i])
                    count3++;
                }
            }
            console.log(count3)
            if (count3 === 2) {
                if (save[0] === save[1]) {
                    let displayed = document.querySelectorAll(".displayed");
                    for (let i = 0; i < displayed.length; i++) {
                        displayed.item(i).className = "underBox displayed done";
                    }
                    save2.push(save[0], save[1])

                } else {
                    let reset = function () {
                        let displayed = document.querySelectorAll(".displayed")
                        for (let i = 0; i < displayed.length; i++) {
                            if (displayed.item(i).className != "underBox displayed done") {
                                displayed.item(i).className = "underBox";
                            }
                        }
                        canclick = true;
                    }
                    canclick = false;
                    setTimeout(reset, 2000);
                }

                count3 = 0;
                save = [];

            }

        }
    }
}
window.onload = onload();















