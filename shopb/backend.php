<?php
$connect =mysqli_connect("localhost","root","","stu_curd");
if($connect === false){
    die("ERROR: Could not connect." .mysqli_connect_error());

}
if(isset($_REQUEST["term"])){
    $spl ="SELECT * FROM student WHERE name LIKE ?";
    if($stmt = mysqli_prepare($connect,$sql)){
        mysqli_stmt_bind_param($stml,"s",$param_term);
        $param_term = $_REQUEST["term"].'%';
        if(mysqli_stmt_get_result($stmt)){
            $result = mysqli_stmt_get_result($stmt);
            if(mysqli_num_rows($result)>0){
                while($row - mysqli_fetch_array($result, MYSQLI_ASSOC)){
                    echo "<P>" . $row["name"]."<p>";
                }
            } else{
                echo "<p>No matches found<p>";
            }
        } else{
            echo"ERROR:Could not able to execute $sql." .mysqli_error($link);
        }
    }
    mysqli_stmt_close($stmt);
}
mysqli_close($connect);
?>