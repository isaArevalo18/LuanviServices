<?php 
include("../conexion.php");

    $id="";
    $nombre="";
    $precio="";
    $numeroexistencias="";
    $categoria="";

     if (isset($_GET["id"])) {
        $id=$_GET["id"];
        $query="SELECT * FROM producto WHERE idproducto=$id";
        $result = mysqli_query($conexion,$query);
        if (mysqli_num_rows($result) == 1) {
            $row = mysqli_fetch_array($result);
        
            $nombre=$row["nombre"];
            $precio=$row["precio"];
            $numeroexistencias=$row["nroexistencias"];
            $categoria=$row["categoria"];
        }
     }


     if (isset($_POST["update"])) {
        $id=$_GET["id"];
        $nombre=$_POST["nombre"];
        $precio=$_POST["precio"];
        $numeroexistencias=$_POST["nroexistencias"];
        $categoria=$_POST["categoria"];


        $query="UPDATE producto SET nombre='$nombre',precio=$precio,nroexistencias=$numeroexistencias,categoria='$categoria' WHERE idproducto=$id";
        $result = mysqli_query($conexion,$query);
            if(!$result) {
                die("Query Failed.");
                mysqli_close($conexion);//cerramos la conexion
            }else{
                $_SESSION['mensaje'] = 'Producto Actualizado con exito';
                $_SESSION['mensajetipo'] = 'warning';
                header("Location: ../Productos.php");
                mysqli_close($conexion);//cerramos la conexion
            }
     }
?>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Productos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
</head>

<body style="background-image: url('../img/producto.jpg');width: 100%;
  height:100%;
  background-size: cover;">
		<main class="container p-5">
       <div class="row">
        <div class="col-md-10" style="margin-left:70px;">
          <div class="card">
      <h5 class="card-header bg bg-dark" style="color: white;">Formulario Productos</h5>
      <div class="card-body" style="background-color:#B4CDCC">
      
   <form action="actualizarproducto.php?id=<?php echo $_GET["id"]; ?>" method="POST">

      <div class="form-row">
       
          <div class="form-group col-md-6">
          <label for="nombre">Nombre Producto:</label>
          <input type="text" class="form-control" name="nombre" value="<?php echo $nombre; ?>"   required>
          </div> 
         
        <div class="form-group col-md-3">
          <label for="precio">Precio por Unidad:</label>
          <input type="text" class="form-control" name="precio" value="<?php echo $precio; ?>"  placeholder="Precio Unidad *" required>
        </div>
        
           <div class="form-group col-md-2">
          <label for="nroexistencias">Nº de existencias:</label>
          <input type="text" class="form-control" name="nroexistencias" value="<?php echo $numeroexistencias; ?>"  placeholder="Nºexistencias" maxlength="5" required>
          </div>

         <div class="form-group col-md-4">
          <label for="categoria">Categoria:</label>
          <input type="text" class="form-control" name="categoria" value="<?php echo $categoria; ?>"  placeholder="Categoria" >
          </div>
      
      </div>
     
      <button type="submit"name="update" value="Actualizar" class="btn btn-warning">Actualizar</button>
    </div>
      
    </form>
       
      </div>
    </div>
    </div>
    </div>
    
    </main>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
