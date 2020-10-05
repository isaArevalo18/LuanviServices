<?php 
	$usuario=$_POST['usuario'];
	$clave=$_POST['clave'];
	session_start();
	$_SESSION['usuario']=$usuario;
	$conexion=mysqli_connect("localhost", "root","","login");
	
	$consulta="SELECT*FROM usuarios where usuario='$usuario' and clave='$clave'";
	$resultado=mysqli_query($conexion,$consulta);

	$filas=mysqli_num_rows($resultado);

	if($filas){
		header("location:home.php");
	}else{
		?>
		<?php
		include("index.php");
		?>
		<h1 class="bad"> ERROR EN LA AUTENTICACION</h1>
		<?php
	}
	mysqli_free_result($resultado);
	mysqli_close($conexion);
 ?>