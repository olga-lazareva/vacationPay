$(function()
{
    $('#calculate').click(function(){
        var data = $('#salary-form').serialize();
        alert(data);
        $.ajax({
            method: "GET",
            url: '/calculate',
            data: data,
            success: alert("Success")
        })

        return false;
    })
}