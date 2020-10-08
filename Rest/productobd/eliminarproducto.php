<?php 
include("../conexion.php");

if (isset($_GET["id"])) {
    $id=$_GET["id"];
    $query="DELETE FROM producto WHERE idproducto=$id";
    $result = mysqli_query($conexion,$query);
    if(!$result) {
       die("Query Failed.");
       mysqli_close($conexion);//cerramos la conexion
    }else{
       $_SESSION['mensaje'] = 'Producto Eliminado con exito';
       $_SESSION['mensajetipo'] = 'danger';
       header("Location: ../Productos.php");
       mysqli_close($conexion);//cerramos la conexion
    }
}



?>