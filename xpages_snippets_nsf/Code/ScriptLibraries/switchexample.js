/**
 * Created by mac on 02/08/16.
 */
function initSwitches() {
    var inpList = document.getElementsByClassName("checkboxInputBox");
    var i = inpList.length;
    while (i > 0) {
        i--;
        var checkboxId = inpList[i].getAttribute("checkboxId");
        var checkbox = document.getElementById(checkboxId);
        checkbox.idInput = inpList[i].id;
        console.log(inpList[i].id + " "  + inpList[i].value);
        if (inpList[i].value == '1') {
            checkbox.checked = true;
        } else {
            checkbox.checked = false;
        }
        checkbox.onchange = function() {
            if (this.checked) {
                document.getElementById(this.idInput).value = '1';
            } else {
                document.getElementById(this.idInput).value = '0';
            }
        }
    }
}

dojo.addOnLoad(initSwitches);