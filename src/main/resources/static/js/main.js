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