// birthday in profile

// add day
const daySelect = document.getElementById("date-day");
const temp = 1;
for (var i = 0; i < 31; i++) {
  var option = document.createElement("option");
  option.value = i + 1;
  option.text = i + 1;
  daySelect.appendChild(option);
  if(i == 0) {
    daySelect.selectedIndex = 1
  }
  
}
// add month
const monthSelect = document.getElementById("date-month");
for (var i = 0; i < 12; i++) {
  var option = document.createElement("option");
  option.value = i + 1;
  option.text = i + 1;
  monthSelect.appendChild(option);
  if(i == 0) {
    monthSelect.selectedIndex = 1
  }
}
// add year
var max = new Date().getFullYear(),
min = max -99,
yearSelect = document.getElementById("date-year");
for (var i = max; i >= min; i--) {
  var opt = document.createElement('option');
  opt.value = i;
  opt.text = i;
  yearSelect.appendChild(opt);
  if(i == max) {
    yearSelect.selectedIndex = 1
  }
}

// get day in month and year
function getDateInMonth(year,month){
  return new Date(year,month,0).getDate();
}

function changeMonth(){
  var month = document.getElementById("date-month");
  var vMonth = month.value;
  var year = document.getElementById("date-year");
  var vYear = year.value;
  var day = document.getElementById("date-day")
  var vDay = day.value;
  daySelect.replaceChildren();

  for (var i = 0; i < getDateInMonth(vYear,vMonth); i++) {
    var option = document.createElement("option");
    option.value = i + 1;
    option.text = i + 1;
    daySelect.appendChild(option);
    daySelect.selectedIndex = vDay -1;
    
  }
  console.log(vMonth)
  console.log(vYear)
  console.log(getDateInMonth(vYear,vMonth))
  
}

function changeYear(){
  var month = document.getElementById("date-month");
  var vMonth = month.value;
  var year = document.getElementById("date-year");
  var vYear = year.value;
  var day = document.getElementById("date-day")
  var vDay = day.value;
  daySelect.replaceChildren();
  for (var i = 0; i < getDateInMonth(vYear,vMonth); i++) {
    var option = document.createElement("option");
    option.value = i + 1;
    option.text = i + 1;
    daySelect.appendChild(option);
    daySelect.selectedIndex = vDay -1;

  }
  console.log(vMonth)
  console.log(vYear)
}