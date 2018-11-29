$(document).ready(function(){
$('.btn2').on('click',function(){
    $('.btn1').toggle();
})

$('.btn3').on('click',function(){

    $(this).remove();
    $('.a').text('price=3242')
})

});