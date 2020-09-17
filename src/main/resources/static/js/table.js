$(function() {
    const object = document.getElementById("tableBody");

    $('#covidTable').DataTable();

    // Format the numbers
    $.fn.digits = function () {
        return this.each(function () {
            $(this).text($(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,"));
        })
    }
});