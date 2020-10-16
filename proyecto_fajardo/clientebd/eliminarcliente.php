<?php 
include("../conexion.php");

if (isset($_GET["id"])) {
    $id=$_GET["id"];
    $query="DELETE FROM usuario WHERE id=$id";
    $result = mysqli_query($conexion,$query);
    if(!$result) {
       die("Query Failed.");
       mysqli_close($conexion);//cerramos la conexion
    }else{
       $_SESSION['mensaje'] = 'Cliente Eliminado con exito';
       $_SESSION['mensajetipo'] = 'danger';
       header("Location: ../Clientes.php");
       mysqli_close($conexion);//cerramos la conexion
    }
}



?>
