<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AJAX JsonArray Example</title>
        <link href='http://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
        <style type="text/css">
            table, td, th{
                border:1px solid green;
                font-family: 'Oxygen', sans-serif;}
            th{
                background-color:green;
                color:white;}
            body{
                text-align: center;}
            .container{
                margin-left: auto;
                margin-right: auto;
                width: 40em;}
            h4{
                font-family: 'Oxygen', sans-serif;
                color:#1E90FF;}
        </style>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#tablediv").hide();
                $("#showTable").click(function (event) {
                    $.get('ServletCargarTabla', function (responseJson) {
                        if (responseJson != null) {
                            $("#countrytable").find("tr:gt(0)").remove();
                            var table1 = $("#countrytable");
                            $.each(responseJson, function (key, value) {
                                var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>");
                                rowNew.children().eq(0).text(value['codigo']);
                                rowNew.children().eq(1).text(value['nombre']);
                                rowNew.children().eq(2).text(value['continente']);
                                rowNew.children().eq(3).text(value['region']);
                                rowNew.children().eq(4).text(value['poblacion']);
                                rowNew.children().eq(5).text(value['capital']);
                                rowNew.appendTo(table1);
                            });
                        }
                    });
                    $("#tablediv").show();
                });
            });
        </script>
    </head>
    <body class="container">
        <h1>AJAX Retrieve Data from Database in Servlet and JSP using JSONArray</h1>
        <h4>Demo by Priya Darshini, Tutorial at www.programming-free.com</h4>
        <input type="button" value="Show Table" id="showTable"/>
        <br/>
        <br/>
        <div id="tablediv">
            <table cellspacing="0" id="countrytable"> 
                <tr> 
                    <th scope="col">Code</th> 
                    <th scope="col">Name</th> 
                    <th scope="col">Continent</th> 
                    <th scope="col">Region</th> 
                    <th scope="col">Population</th> 
                    <th scope="col">Capital</th>             
                </tr> 
            </table>
        </div>
    </body>
</html>
