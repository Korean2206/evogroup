let mybutton = document.getElementById("back-to-top");



window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.classList.add("show");
  } else {
    mybutton.classList.remove("show");
  }
}

var backToTopEvent = function() {
    document.body.scrollTop = 0; // for safari
    document.documentElement.scrollTop = 0; // for chrome
}


// quantity 

const plusBtn = document.getElementById("plus");
const minusBtn = document.getElementById("minus");
const inputQuantity = document.getElementById("inputQuantity");

plusBtn.addEventListener("click", evt => {
  evt.preventDefault();
  const currentValue = Number(inputQuantity.value) || 0;
  inputQuantity.value = currentValue + 1;
})
minusBtn.addEventListener("click", evt => {
  evt.preventDefault();
  if(inputQuantity.value > 1){
    const currentValue = Number(inputQuantity.value) || 0;
    inputQuantity.value = currentValue - 1;
  }
})