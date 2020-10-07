<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Clientes</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
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


<body style="background-image: url('empleado.jpeg');width: 100%;
  height:100%;
  background-size: cover;">
    <main class="container p-5">
       <div class="row">
        <div class="col-md-12">
          <div class="card">
      <h5 class="card-header bg bg-dark" style="color: white;">Formulario Clientes</h5>
      <div class="card-body" style="background-color:#B4CDCC">
          <form>

      <div class="form-row">
          <div class="form-group col-md-6">
            <label for="nombre">Nombre:</label>
            <input type="nombre" class="form-control" id="nombre" placeholder="Nombre *" attern="^[^0-9]+$" size="30" maxlength="245" required>
          </div>

          <div class="form-group">
          <label for="cedula">Cédula:</label>
          <input type="text" class="form-control" id="cedula" placeholder="Cédula" maxlength="10" required>
          </div> 
         
        <div class="form-group col-md-6">
          <label for="direccion">Dirección:</label>
          <input type="text" class="form-control" id="direccion" placeholder="Direccién *" required>
        </div>
        
           <div class="form-group col-md-2">
          <label for="celular">Celular:</label>
          <input type="text" class="form-control" id="celular" placeholder="Celular" maxlength="10">
          </div>

         <div class="form-group">
          <label for="telefono">Teléfono:</label>
          <input type="text" class="form-control" id="telefono" placeholder="Teléfono" maxlength="10">
          </div>
      
      </div>
      <div class="form-row">
             <div class="form-group col-md-6">
              <label for="email">Email:</label>
              <input type="email" class="form-control" id="email" pattern=".+\.com" title="Ingrese un correo valido"placeholder="Email *" required>
            </div>
            <div class="form-group col-md-6">
              <label for="sitioweb">Sitio Web:</label>
              <input type="text" class="form-control" id="sitioweb" placeholder="Sitio Web">
            </div>

            <div class="form-group col-md-6">
             <p>Género:</p>
          <form>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="genero" checked> Femenino
            </label>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="genero"> Masculino
            </label>
            <label class="radio-inline">
              <input type="radio" name="genero"> Otros
            </label>
          </form>

          <p>Sexo:</p>
          <form>
            <label class="radio-inline" style="padding:5px">
              <input type="radio" name="sexo" checked>  Mujer
            </label>
            <label class="radio-inline">
              <input type="radio" name="sexo">  Hombre
            </label>
          </form>
          </div>

           <div class="form-group col-md-6">
              <label for="comentario">Comentario</label>
              <textarea class="form-control" id="comentario" rows="3"></textarea>
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
			Nombre:<input type="" name="nombre" value="<?php echo $nombre;?>">
			<br><br>
			Cedula:<input type="" name="cedula" value="<?php echo $cedula;?>">
			<br><br>
			Direccion:<input type="" name="direccion" value="<?php echo $direccion;?>">
			<br><br>
			Celular:<input type="" name="celular" value="<?php echo $celular;?>">
			<br><br>
			Telefono:<input type="" name="telefono" value="<?php echo $telefono;?>">
			<br><br>
			E-mail:<input type="" name="email" value="<?php echo $email;?>">
			<br><br>
			Sitio Web:<input type="" name="sitioweb" value="<?php echo $sitioweb;?>">
			<br><br>
			Comentario:<input type="" name="comentario" value="<?php echo $comentario;?>">
			<br><br>
			Genero:
			<input type="radio" name="genero" <?php if(isset($genero) && $genero=="femenino") echo "checked";?> value="femenino">Femenino
			<input type="radio" name="genero" <?php if(isset($genero) && $genero=="masculino") echo "checked";?> value="femenino">Masculino
			<input type="radio" name="genero" <?php if(isset($genero) && $genero=="otro") echo "checked";?> value="femenino">Otro
			<br><br>
			Sexo:
			<input type="radio" name="sexo" <?php if(isset($sexo) && $genero=="hombre") echo "checked";?> value="hombre">Hombre
			<input type="radio" name="sexo" <?php if(isset($sexo) && $genero=="mujer") echo "checked";?> value="mujer">Mujer

			<br><br>
			<input type="submit" name="update" value="Actualizar">

      
    </main>
  </body>

</html>