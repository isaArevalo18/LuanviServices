<?php 
include("../conexion.php");

$id="";
$cedula="";
$nombre="";
$direccion="";
$celular="";
$telefono="";
$email="";
$sitioWeb="";
$comentario="";
$genero="";
$sexo="";


if (isset($_GET["id"])) {
    $id=$_GET["id"];
    $query="SELECT * FROM usuario WHERE id=$id";
    $result = mysqli_query($conexion,$query);
    if (mysqli_num_rows($result) == 1) {
        $row = mysqli_fetch_array($result);
        $cedula=$row["cedula"];
        $nombre=$row["nombre"];
        $direccion=$row["direccion"];
        $celular=$row["celular"];
        $telefono=$row["telefono"];
        $email=$row["email"];
        $sitioWeb=$row["sitioweb"];
        $comentario=$row["comentario"];
        $genero=$row["genero"];
        $sexo=$row["sexo"]; 
    }
}


if(isset($_POST["update"])){
   
    $id=$_GET["id"];
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
    
     $query="UPDATE usuario SET cedula='$cedula',nombre='$nombre',direccion='$direccion',celular='$celular',
     telefono='$telefono',email='$email',sitioweb='$sitioWeb',comentario='$comentario',genero='$genero',sexo='$sexo',tipo='empleado'
     WHERE id=$id";
     echo $query;
     $result = mysqli_query($conexion,$query);
        if(!$result) {
            die("Query Failed.");
            mysqli_close($conexion);//cerramos la conexion
        }else{
            $_SESSION['mensaje'] = 'Empleado Actualizado con exito';
            $_SESSION['mensajetipo'] = 'warning';
            header("Location: ../Empleados.php");
            mysqli_close($conexion);//cerramos la conexion
        }
}
?>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Editar Empleado</title>

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


<body style="background-image: url('../img/cliente.jpeg');width: 100%;
  height:100%;
  background-size: cover;">
    <main class="container p-4">
       <div class="row">

        <div class="col-md-12">
          <div class="card">
      <h5 class="card-header bg bg-dark" style="color: white;">Formulario de Edicion de Empleados</h5>
      <div class="card-body" style="background-color:#B4CDCC">
      
  <form method="POST" action="actualizarempleado.php?id=<?php echo $_GET['id']; ?>">

      <div class="form-row">
          <div class="form-group col-md-6">
            <label for="nombre">Nombre:</label>
            <input type="nombre" class="form-control" name="nombre" value=<?php echo $nombre ?> placeholder="Nombre *" attern="^[^0-9]+$" size="30" maxlength="245" required>
          </div>

          <div class="form-group">
          <label for="cedula">Cédula:</label>
          <input type="text" class="form-control" name="cedula" value=<?php echo $cedula ?> placeholder="Cédula" maxlength="10" required>
          </div> 
         
        <div class="form-group col-md-6">
          <label for="direccion">Dirección:</label>
          <input type="text" class="form-control" name="direccion" value=<?php echo $direccion ?> placeholder="Direccién *" required>
        </div>
        
           <div class="form-group col-md-2">
          <label for="celular">Celular:</label>
          <input type="text" class="form-control" name="celular" value=<?php echo $celular ?> placeholder="Celular" maxlength="10">
          </div>

         <div class="form-group">
          <label for="telefono">Teléfono:</label>
          <input type="text" class="form-control" name="telefono" value=<?php echo $telefono ?>  placeholder="Teléfono" maxlength="10">
          </div>
      
      </div>
      <div class="form-row">
             <div class="form-group col-md-6">
              <label for="email">Email:</label>
              <input type="email" class="form-control" name="email"  value=<?php echo $email ?> pattern=".+\.com" title="Ingrese un correo valido"placeholder="Email *" required>
            </div>
            <div class="form-group col-md-6">
              <label for="sitioweb">Sitio Web:</label>
              <input type="text" class="form-control" name="sitioweb" value=<?php echo $sitioWeb ?> placeholder="Sitio Web">
            </div>

            <div class="form-group col-md-6">
             <p>Género:</p>
          <div>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" <?php if(isset($genero) && $genero=="Femenino") echo "checked";?> value="Femenino" name="genero"> Femenino
            </label>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" <?php if(isset($genero) && $genero=="Masculino") echo "checked";?>  value="Masculino" name="genero"> Masculino
            </label>
            <label class="radio-inline">
              <input type="radio" <?php if(isset($genero) && $genero=="Otros") echo "checked";?> value="Otros" name="genero"> Otros
            </label>
          </div>

          <p>Sexo:</p>
          <div>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="sexo" <?php if(isset($sexo) && $sexo=="Mujer") echo "checked";?> value="Mujer">  Mujer
            </label>
            <label class="radio-inline">
              <input type="radio" name="sexo" <?php if(isset($sexo) && $sexo=="Hombre") echo "checked";?> value="Hombre" >  Hombre
            </label>
          </div>
          </div>

           <div class="form-group col-md-6">
              <label for="comentario">Comentario</label>
              <textarea class="form-control" name="comentario" rows="3"><?php echo $comentario ?></textarea>
            </div>
      </div>
     
      <input type="submit" name="update" class="btn btn-warning" value="Actualizar">


  </form>
    </div> 
    </div>
    </div>
    </div>
    </div>   
    </main>
  </body>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>