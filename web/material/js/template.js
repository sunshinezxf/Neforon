/**
 * Created by sunshine on 5/12/15.
 */
var index = 1;

$(document).ready(function () {
    for (var i = 2; i <= 15; i++) {
        var index = "#premiseIndex" + i;
        $(index).attr("style", "display:none;");
    }
});

$('#add-line').click(function () {
    index++;
    var temp = "#premiseIndex" + index;
    $(temp).attr("style", "");
    $('#del-line').show();
    if (index == 15) {
        $('#add-line').hide();
    }
});

$('#del-line').click(function () {
    var temp = "#premiseIndex" + index;
    $(temp).attr("style", "display:none;");
    var content = "#premiseAdvantage" + index;
    $(content).val("");
    index--;
    $('#add-line').show();
    if (index == 1) {
        $('#del-line').hide();
    }
});