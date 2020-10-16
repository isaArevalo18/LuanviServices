<?php 
include("../conexion.php");


$nombre=$_POST["nombre"];
$precio=$_POST["precio"];
$numeroexistencias=$_POST["nroexistencias"];
$categoria=$_POST["categoria"];


$query="INSERT INTO producto (nombre,precio,nroexistencias,categoria)VALUES('$nombre',$precio,$numeroexistencias,'$categoria')";
echo $query;
$result = mysqli_query($conexion,$query);
    if(!$result) {
        die("Query Failed.");
        mysqli_close($conexion);//cerramos la conexion
    }else{
        $_SESSION['mensaje'] = 'Producto Guardado con exito';
        $_SESSION['mensajetipo'] = 'success';
        header("Location: ../Productos.php");
        mysqli_close($conexion);//cerramos la conexion
    }

?>

