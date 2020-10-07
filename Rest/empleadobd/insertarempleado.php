<?php 
include("../conexion.php");

$cedula=$_POST["cedula"];
$nombre=$_POST["nombre"];
$direccion=$_POST["direccion"];
$celular=$_POST["celular"];
$telefono=$_POST["telefono"];
$email=$_POST["email"];
$sitioWeb=$_POST["sitioweb"];
$comentario=$_POST["comentario"];
$genero=$_POST["genero"];
$sexo=$_POST["sexo"];
$parametros='$cedula';

$query="INSERT INTO usuario (cedula,nombre,direccion,celular,telefono,email,sitioweb,comentario,genero,sexo,tipo)
VALUES('$cedula','$nombre','$direccion','$celular','$telefono','$email','$sitioWeb','$comentario','$genero','$sexo','empleado')";
$result = mysqli_query($conexion,$query);
    if(!$result) {
        die("Query Failed.");
        mysqli_close($conexion);//cerramos la conexion
    }else{
        $_SESSION['mensaje'] = 'Empleado Guardado con exito';
        $_SESSION['mensajetipo'] = 'success';
        header("Location: ../Empleados.php");
        mysqli_close($conexion);//cerramos la conexion
    }

?>

