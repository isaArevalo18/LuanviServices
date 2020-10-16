<?php 

include("../conexion.php");

if (isset($_POST)) {
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
VALUES('$cedula','$nombre','$direccion','$celular','$telefono','$email','$sitioWeb','$comentario','$genero','$sexo','cliente')";
$result = mysqli_query($conexion,$query);
    if(!$result) {
        die("Query Failed.");
        mysqli_close($conexion);//cerramos la conexion
    }else{
        $_SESSION['mensaje'] = 'Cliente Guardado con exito';
        $_SESSION['mensajetipo'] = 'success';
        header("Location: ../Clientes.php");
        mysqli_close($conexion);//cerramos la conexion
    }
}


?>

