<?php 
	$usuario=$_POST['usuario'];// datos ingresados por teclado de usuario
	$clave=$_POST['clave'];//datos ingresados por teclado contraseña
	session_start();//creamos un inicio de sesion
	$_SESSION['usuario']=$usuario;//iniciamos 

	//CONEXION A LA BASE DE DATOS
	include("conexion.php");
	
	//llamamos a la base de datos en una consulta
	$consulta="SELECT*FROM login where usuario='$usuario' and clave='$clave'";
	$resultado=mysqli_query($conexion,$consulta);//nos devuelve la consulta
	//nos va dar los datos
	$filas=mysqli_num_rows($resultado);//nos almacena los resultado

	if($filas){
		header("location:home.php");// nos dirije a la siguiente ventana
	}else{
		?>
		<?php
		include("index.php");//nos vuelve a la misma
		?>
		<h1 class="bad"> ERROR EN LA AUTENTICACION</h1>
		<?php
	}
	mysqli_free_result($resultado);//nos manda el resultado
	mysqli_close($conexion);//cerramos la conexion
 ?>