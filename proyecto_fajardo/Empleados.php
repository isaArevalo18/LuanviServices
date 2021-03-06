<?php  include("conexion.php"); ?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Empleados</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
</head>

<style>
  input{
  margin: auto;
  margin-top: 9px;
  font-size: 15px;
  font-family: century gothic;
  }
</style>


<body style="background-image: url('img/empleados.jpg');width: 100%;
  height:100%;
  background-size: cover;">
    <main class="container p-4">
       <div class="row">

        <div class="col-md-12">


        <?php if (isset($_SESSION["mensaje"])) { ?>
          <div class="alert alert-<?php echo $_SESSION["mensajetipo"]; ?> alert-dismissible fade show" role="alert">
               <?php echo $_SESSION["mensaje"]; ?>
               <button type="button" class="close" data-dismiss="alert" aria-label="Close">
               <span aria-hidden="true">&times;</span>
              </button>
          </div>
          <?php session_unset(); } ?>
          <div class="card">
      <h5 class="card-header bg bg-dark" style="color: white;">Formulario Empleados</h5>
      <div class="card-body" style="background-color:#B4CDCC">
      
  <form method="POST" action="empleadobd/insertarempleado.php">

      <div class="form-row">
          <div class="form-group col-md-6">
            <label for="nombre">Nombre:</label>
            <input type="nombre" class="form-control" name="nombre" placeholder="Nombre *" attern="^[^0-9]+$" size="30" maxlength="245" required>
          </div>

          <div class="form-group">
          <label for="cedula">Cédula:</label>
          <input type="text" class="form-control" name="cedula" placeholder="Cédula" maxlength="10" required>
          </div> 
         
        <div class="form-group col-md-6">
          <label for="direccion">Dirección:</label>
          <input type="text" class="form-control" name="direccion" placeholder="Direccién *" required>
        </div>
        
           <div class="form-group col-md-2">
          <label for="celular">Celular:</label>
          <input type="text" class="form-control" name="celular" placeholder="Celular" maxlength="10">
          </div>

         <div class="form-group">
          <label for="telefono">Teléfono:</label>
          <input type="text" class="form-control" name="telefono" placeholder="Teléfono" maxlength="10">
          </div>
      
      </div>
      <div class="form-row">
             <div class="form-group col-md-6">
              <label for="email">Email:</label>
              <input type="email" class="form-control" name="email" pattern=".+\.com" title="Ingrese un correo valido"placeholder="Email *" required>
            </div>
            <div class="form-group col-md-6">
              <label for="sitioweb">Sitio Web:</label>
              <input type="text" class="form-control" name="sitioweb" placeholder="Sitio Web">
            </div>

            <div class="form-group col-md-6">
             <p>Género:</p>
          <div>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="genero" value="Femenino" checked> Femenino
            </label>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="genero" value="Masculino"> Masculino
            </label>
            <label class="radio-inline">
              <input type="radio" name="genero" value="Otros"> Otros
            </label>
          </div>

          <p>Sexo:</p>
          <div>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="sexo" value="Mujer" checked>  Mujer
            </label>
            <label class="radio-inline">
              <input type="radio" name="sexo" value="Hombre">  Hombre
            </label>
          </div>
          </div>

           <div class="form-group col-md-6">
              <label for="comentario">Comentario</label>
              <textarea class="form-control" name="comentario" rows="3"></textarea>
            </div>
      </div>
     
      <input type="submit" class="btn btn-primary" value="Guardar">

      <input type="submit" class="btn btn-primary" value="Imprimir">
  </form>
    </div> 
    </div>
    </div>
    </div>
    </div>

    <br>
    <br>
    <h3 style="color: white" align="center">Tabla Empleados</h3>
    <div class="table-responsive">
    <table class="table table-striped">
    <thead class="thead-dark">
    <tr>
    <th>ID</th>
    <th>Cedula</th>
    <th>Nombre</th>
    <th>Direccion</th>
    <th>Celular</th>
    <th>Telefono</th>
    <th>Email</th>
    <th>SitioWeb</th>
    <th>Comentario</th>
    <th>Genero</th>
    <th>Sexo</th>
    <th>Accion</ht>
    </thead>
    </tr>

    <?php  ?>

      <?php 
       $query="SELECT id,cedula,nombre,direccion,celular,telefono,email,sitioweb,comentario,genero,sexo,tipo FROM usuario WHERE tipo='empleado'";

       $result = mysqli_query($conexion,$query);

       while ($row=mysqli_fetch_assoc($result)) { ?>
      <tr style="background-color: #B4CDCC">

      <td><?php echo $row["id"]; ?></td>
       <td><?php echo $row["cedula"]; ?></td>
       <td><?php echo $row["nombre"]; ?></td>
       <td><?php echo  $row["direccion"]; ?></td>
       <td><?php echo $row["celular"]; ?></td>
       <td><?php echo $row["telefono"]; ?></td>
       <td><?php echo $row["email"]; ?></td>
       <td><?php echo $row["sitioweb"]; ?></td>
       <td><?php echo $row["comentario"]; ?></td>
       <td><?php echo $row["genero"]; ?></td>
       <td><?php echo $row["sexo"]; ?></td>
       <td>
        <a href="empleadobd/actualizarempleado.php?id=<?php echo $row['id']?>&accion=editar" class="btn btn-secondary"><i class="fas fa-marker"></i></a>
        <a href="empleadobd/eliminarempleado.php?id=<?php echo $row['id']?>&accion=eliminar" class="btn btn-danger"><i class="far fa-trash-alt"></i></a></td>
      </tr>
       <?php } ?>
      </table>
    </div>
      <a href="home.php"><input type="submit" class="btn btn-primary" value="Regresar"></a>
      
    </main>
  </body>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>

