<?php 
//CONEXION A LA BASE DE DATOS

$user = "root";//nombre de usuario
$contrasena = "";  //contraseña
$servidor = "localhost";//nombre del host o direccion Ip
$basededatos = "loginphp";//nombre de la base de datos
$conexion=mysqli_connect($servidor, $user,$contrasena,$basededatos);

?>