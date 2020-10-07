<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Productos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
</head>

<body style="background-image: url('img/producto.jpg');width: 100%;
  height:100%;
  background-size: cover;">
		<main class="container p-5">
       <div class="row">
        <div class="col-md-10">
          <div class="card">
      <h5 class="card-header bg bg-dark" style="color: white;">Formulario Productos</h5>
      <div class="card-body" style="background-color:#B4CDCC">
          <form>

      <div class="form-row">
          <div class="form-group col-md-2">
            <label for="idproducto">Id Producto:</label>
            <input type="text" class="form-control" name="idproducto" placeholder="ID Producto *" required>
          </div>

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
		</thead>
    	</tr>

    <?php  ?>

      <?php 
       include("conexion.php");

       $query="SELECT idproducto, nombre, precio, nroexistencias, categoria FROM producto";

       $result = mysqli_query($conexion,$query);

       while ($row=mysqli_fetch_assoc($result)) { ?>
      <tr style="background-color: #B4CDCC">

      <td><?php echo $row["idproducto"]; ?></td>
       <td><?php echo $row["nombre"]; ?></td>
       <td><?php echo  $row["precio"]; ?></td>
       <td><?php echo $row["nroexistencias"]; ?></td>
       <td><?php echo $row["categoria"]; ?></td>
       <td>
        <a href="productosbd.php?id=<?php echo $row['idproducto']?>&accion=editar" class="btn btn-secondary"><i class="fas fa-marker"></i></a>
        <a href="productosbd.php?id=<?php echo $row['idproducto']?>&accion=eliminar" class="btn btn-danger"><i class="far fa-trash-alt"></i></a></td>
      </tr>
       <?php } ?>
      </table>      
    </main>
</body>
</html>
