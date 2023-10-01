// quantity 

const plusBtn = document.getElementById("plus");
const minusBtn = document.getElementById("minus");
const inputQuantity = document.getElementById("inputQuantity");

   

if (plusBtn) {
  plusBtn.addEventListener("click", evt => {
    evt.preventDefault();
    const currentValue = Number(inputQuantity.value) || 0;
    inputQuantity.value = currentValue + 1;
    minusBtn.disabled = false;
    minusBtn.style.cursor = "pointer";
  })
}
minusBtn.addEventListener("focus",evt => {
evt.preventDefault();
if(inputQuantity.value <= 1){
        minusBtn.disabled = true;
        minusBtn.style.cursor = "no-drop";
    
}
})
if (minusBtn) {
  minusBtn.addEventListener("click", evt => {
    evt.preventDefault();
    if (inputQuantity.value > 1) {
      const currentValue = Number(inputQuantity.value) || 0;
      inputQuantity.value = currentValue - 1;
    }
  })
}
// select thumbnail of product

const mainIMG = document.getElementById("product-img-main")

const thumbnail = document.getElementById("product-thumbnail-main").children
    
function test(o) {
    const img = document.getElementById(o)
    mainIMG.src = img.getAttribute("src");
    img.style.opacity = 0.3;
    for(var i = 0; i < thumbnail.length; i++) {
        if(thumbnail[i].src != mainIMG.src) {
            thumbnail[i].style.opacity = 1;
        }
    }
}

window.onload = function() {
    var img = document.getElementById("img1")
    mainIMG.src = img.getAttribute("src");
    img.style.opacity = 0.3

}

