/* global BootstrapDialog, eval */

var jw = {};
jw.siteAddress = 'http://gedmarc.ddns.net:8080/DanceCultureStudios/';

/**
 * Processes the response received from the ajax handler
 * @param {type} result
 *@param {type} status
 * @param {type} xhr
 * @returns {undefined}
 */
processResponse = function (result, status, xhr) {
    var head = result.components[0].html;
    var body = result.components[1].html;
    document.write(head + body);

    //document.write('<html></html>');
    //$('head').append('<base href="' + jw.siteAddress + '"/>');
    //processHtml(result);
    //processCss(result);
    //processCssReferences(result);
    //processJSReferences(result);
    //loadData(result);
    //processReactions(result);
    //processJsScripts(result)
};

var xhr = new XMLHttpRequest();
xhr.open('GET', jw.siteAddress + 'jwcordova');
xhr.onload = function () {
    if (xhr.status === 200) {
        // alert('User\'s name is ' + xhr.responseText);
        var result = JSON.parse(xhr.responseText);
        //alert('result');
        processResponse(result);

    } else {
        alert('Request failed.  Returned status of ' + xhr.status);
    }
};
xhr.send();


