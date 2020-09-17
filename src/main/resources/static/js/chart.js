var htmldata = [[${barChart}]];
var chart = document.getElementById('bar-chart');
Chart.defaults.global.animation.duration = 2000; // Animation duration
Chart.defaults.global.title.display = false; // Remove title
Chart.defaults.global.title.text = "Chart"; // Title
Chart.defaults.global.title.position = 'bottom'; // Title position
Chart.defaults.global.defaultFontColor = '#999'; // Font color
Chart.defaults.global.defaultFontSize = 10; // Font size for every label

// Chart.defaults.global.tooltips.backgroundColor = '#FFF'; // Tooltips background color
Chart.defaults.global.tooltips.borderColor = 'white'; // Tooltips border color
Chart.defaults.global.legend.labels.padding = 0;
Chart.defaults.scale.ticks.beginAtZero = true;
Chart.defaults.scale.gridLines.zeroLineColor = 'rgba(255, 255, 255, 0.1)';
Chart.defaults.scale.gridLines.color = 'rgba(255, 255, 255, 0.02)';
Chart.defaults.global.legend.display = false;
new Chart(chart, {
  type: 'bar',
  data: {
    labels: Object.keys(htmldata),
    datasets: [
      {
        label: "Total Confirmed Cases",
        backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850", "#0000FF"
        ,"#DC143C","#556B2F","#FF69B4","#4682B4"],
        borderWidth: 2,
        showLine: true,
        data: Object.keys(htmldata).map(function(key) {return htmldata[key];}),
      }
    ]
  },
  options: {
    legend: { display: true },
    title: {
      display: true,
      text: 'Top 10 States by Confirmed Cases'
    }
  }
});

//  Pie Chart
var pieData = [[${pieChart}]]
new Chart(document.getElementById("pie-chart"), {
  type: 'pie',
  data: {
    labels: Object.keys(pieData),
    datasets: [{
      label: "StateWise Active Cases",
      backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"],
      data: Object.keys(pieData).map(function(key) {return pieData[key];}),
    }]
  },
  options: {
    title: {
      display: true,
      text: 'State with Zero Death and their Active cases'
    }
  }
});

// Horizontal Bar Chart
var pieData = [[${horChart}]]
new Chart(document.getElementById("bar-chart-horizontal"), {
  type: 'horizontalBar',
  data: {
    labels: Object.keys(pieData),
    datasets: [
      {
        label:"Recovered Cases",
        backgroundColor: ["#D2B48C", "#EE82EE","#9ACD32","#FFA07A","#FFD700"],
        data: Object.keys(horChart).map(function(key) {return horChart[key];}),
      }
    ]
  },
  options: {
    legend: { display: true },
    title: {
      display: true,
      text: 'Top 5 States based on Recovery Rate'
    }
  }
});