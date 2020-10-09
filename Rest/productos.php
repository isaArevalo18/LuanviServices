<?php  include("conexion.php"); ?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Productos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
</head>

<body style="background-image: url('img/producto.jpg');width: 100%;
  height:100%;
  background-size: cover;">
		<main class="container p-5">
       <div class="row">
        <div class="col-md-12 col-md-offset-5">
        <?php if (isset($_SESSION["mensaje"])) { ?>
          <div class="alert alert-<?php echo $_SESSION["mensajetipo"]; ?> alert-dismissible fade show" role="alert">
               <?php echo $_SESSION["mensaje"]; ?>
               <button type="button" class="close" data-dismiss="alert" aria-label="Close">
               <span aria-hidden="true">&times;</span>
              </button>
          </div>
          <?php session_unset(); } ?>
          <div class="card">
      <h5 class="card-header bg bg-dark" style="color: white;">Formulario Productos</h5>
      <div class="card-body" style="background-color:#B4CDCC">
      
   <form action="productobd/insertarproducto.php" method="POST">

      <div class="form-row">
      
          <div class="form-group col-md-6">
          <label for="nombre">Nombre Producto:</label>
          <input type="text" class="form-control" name="nombre" placeholder="Nombre Producto"  required>
          </div> 
         
        <div class="form-group col-md-3">
          <label for="precio">Precio por Unidad:</label>
          <input type="text" class="form-control" name="precio" placeholder="Precio Unidad *" required>
        </div>
        
           <div class="form-group col-md-2">
          <label for="nroexistencias">Nº de existencias:</label>
          <input type="text" class="form-control" name="nroexistencias" placeholder="Nºexistencias" maxlength="5" required>
          </div>

         <div class="form-group col-md-4">
          <label for="categoria">Categoria:</label>
          <input type="text" class="form-control" name="categoria" placeholder="Categoria" >
          </div>
      
      </div>
     
      <button type="submit" class="btn btn-primary">Guardar</button>

      <button type="submit" class="btn btn-primary">Imprimir</button>

    </div>
      
    </form>
       
      </div>
    </div>
    </div>
    </div>

    <br>
    <br>

    <div class="table-responsive">
      <h3 style="color: black" align="center">Tabla Productos</h3>
      <table class="table table-striped">
  	    <thead class="thead-dark">
    	    <tr>
    		    <th>IdProducto</th>
    		    <th>Nombre</th>
    		    <th>Precio</th>
    		    <th>Nro existencias</th>
    		    <th>Categoria</th>
    		    <th>Acciones</th>
          </tr>
  		</thead>
      	

      <?php  ?>

        <?php 

         $query="SELECT * FROM producto";

         $result = mysqli_query($conexion,$query);

         while ($row=mysqli_fetch_assoc($result)) { ?>
        <tr style="background-color: #B4CDCC">

          <td><?php echo $row["idproducto"]; ?></td>
           <td><?php echo $row["nombre"]; ?></td>
           <td><?php echo  $row["precio"]; ?></td>
           <td><?php echo $row["nroexistencias"]; ?></td>
           <td><?php echo $row["categoria"]; ?></td>
           <td>
            <a href="productobd/actualizarproducto.php?id=<?php echo $row['idproducto']?>&accion=editar" class="btn btn-secondary"><i class="fas fa-marker"></i></a>
            <a href="productobd/eliminarproducto.php?id=<?php echo $row['idproducto']?>&accion=eliminar" class="btn btn-danger"><i class="far fa-trash-alt"></i></a></td>
        </tr>
         <?php } ?>
        </table>  
      </div>
       <a href="home.php"><input type="submit" class="btn btn-primary" value="Regresar"></a>   
    </main>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
