let drop = document.getElementById("dropdwn")
function sho() {
    drop.classList.toggle("show")
}
window.onclick = function(event) {
    if (!event.target.matches('.dropbtn')) {
        let down = document.getElementsByClassName("content");
        for ( let i = 0; i < down.length; i++) {
            let drop = down[i];
            if (drop.classList.contains('show')) {
                drop.classList.remove('show');
            }
        }
    }
}