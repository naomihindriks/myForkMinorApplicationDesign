$(document).ready(() => {
    //Get dom elements
    const $header = $("#header");
    const $homeMainContentRow = $("#home-main-content-row");

    // Set min height of the homeMainContentRow
    $homeMainContentRow.css({
        "min-height": "calc(938px - " + $header.outerHeight() + "px)"
    });

});