<!DOCTYPE HTML>  
<html>
<head>
<style>
 * {
  box-sizing: border-box;
}
.error {color:color #454545;}
body {
  font-family: Arial;
  padding: 10px;
  background: #FA8072;
} 
.head {
  padding: 30px;
  text-align: center;
  background: white;
}
p {
    color: #454545;
}
h2 {
    color:#070;
}
</style>
</style>
</head>
<body>

<h2>Somos MCDONALDS:</h2>

<img src="https://starteq.net/wp-content/uploads/2019/11/mcdonalds-png-logo-picture-3-1024x1001.png" width="70" height="70" >
<?php
// define variables y establece valores vacíos
$nombreErr= $direccionErr= $cedulaErr = $celularErr = $telefonoErr = $sexoErr = $emailErr = $generoErr = $sitioWebErr = "";
$nombre= $direccion= $cedula = $celular= $telefono = $sexo = $email = $genero = $comentario = $sitioWeb = "" ;
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  //nombre
  if (empty($_POST["nombre"])) {
    $nombreErr = "El nombre es obligatorio";
  } else {
    $nombre = test_input($_POST["nombre"]);
    // check if name only contains letters and whitespace
    if (!preg_match("/^[a-zA-Z áéíóúÁÉÍÓÚñÑ]*$/",$nombre)) {
      $nombreErr = "Solo se permiten letras y espacios en blanco";
    }
  }
  //email
  if (empty($_POST["email"])) {
    $emailErr = "se requiere correo electronico";
  } else {
    $email = test_input($_POST["email"]);
    // check if e-mail address is well-formed
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
      $emailErr = "Formato de E-mail invalido";
    }
  }
  //sitio web  
  if (empty($_POST["sitioWeb"])) {
    $sitioWeb = "";
  } else {
    $sitioWeb = test_input($_POST["sitioWeb"]);
    // check if URL address syntax is valid (this regular expression also allows dashes in the URL)
    if (!preg_match("/\b(?:(?:https?|ftp):\/\/|www\.)[-a-z0-9+&@#\/%?=~_|!:,.;]*[-a-z0-9+&@#\/%=~_|]/i",$sitioWeb)) {
      $sitioWebErr = "URL invalido";
    }
  }
  //comentario
  if (empty($_POST["comentario"])) {
    $comentario = "";
  } else {
    $comentario = test_input($_POST["comentario"]);
  }
  //genero
  if (empty($_POST["genero"])) {
    $generoErr = "se require seleccion";
  } else {
    $genero = test_input($_POST["genero"]);
  }

  //sexo
  if (empty($_POST["sexo"])) {
    $sexoErr = "se require seleccion";
  } else {
    $sexo = test_input($_POST["sexo"]);
  }

  //direccion
  if (empty($_POST["direccion"])) {
    $direccionErr = "campo obligatorio";
  } else {
    $direccion = test_input($_POST["direccion"]);
    // check if name only contains letters, whitespace and numbers
    if (!preg_match("/^[a-zA-Z0-9 áéíóúÁÉÍÓÚñÑ]*$/",$direccion)) {
      $direccionErr = "Solo se permiten letras y numeros ";
    }
  }
//cedula
   //
    if (empty($_POST["cedula"])) {
    $cedulaErr = "la cedula es obligatorio";
  } else {
    $cedula = test_input($_POST["cedula"]);
    // check if name only contains letters and whitespace
    if (!preg_match("/^([0]+([0-9]){9})$/",$cedula)) {
      $cedulaErr = "Verifique que el primer numero sea cero, y que contenga 10 numeros,no se acepta letras o caracteres especiales";
    }
  }

//celular
     if (empty($_POST["celular"])) {
    $celular = "";
  } else {
    $celular = test_input($_POST["celular"]);
    // verifica que el numero  de celular movil sea correcto
    if (!preg_match_all("/^([0]+([0-9]){9})$/",$celular)) {
      $celularErr = "celular incorrecto verifique comienze con cero y que tenga 10 digitos numericos";
    }
  }

//telefono
     if (empty($_POST["telefono"])) {
    $telefono = "";
  } else {
    $telefono = test_input($_POST["telefono"]);
    // verifica que el numero  de telefono fijo sea correcto
    if (!preg_match_all("/^([4]+([0-9]){6})$/",$telefono)) {
      $telefonoErr = "telefono incorrecto: debe comenzar con [ 4 ] o verifique que contenga 7 digitos  ";
    }
  }
}//


function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>

<h2>FORMULARIO DE ASPIRANTE: </h2>
<p><span class="error">* Campos obligatorios</span></p>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">  
  Nombre: <input type="text" name="nombre" value="<?php echo $nombre;?>">
  <span class="error">* <?php echo $nombreErr;?></span>
  <br><br>
  Cedula: <input type="text" name="cedula" value="<?php echo $cedula;?>">
  <span class="error">* <?php echo $cedulaErr;?></span>
  <br><br>
  Direccion: <input type="text" name="direccion" value="<?php echo $direccion;?>"><span class="error">* <?php echo $direccionErr;?></span>
  <br><br>
  Celular: <input type="text" name="celular" value="<?php echo $celular;?>">
  <span class="error">* <?php echo $celularErr;?></span>
  <br><br>
  Telefono: <input type="text" name="telefono" value="<?php echo $telefono;?>">
  <span class="error">* <?php echo $telefonoErr;?></span>
  <br><br>
  E-mail: <input type="text" name="email" value="<?php echo $email;?>">
  <span class="error">* <?php echo $emailErr;?></span>
  <br><br>
  Sitio web: <input type="text" name="sitioWeb" value="<?php echo $sitioWeb;?>">
  <span class="error"><?php echo $sitioWebErr;?></span>
  <br><br>
  Comentario: <textarea name="comentario" rows="5" cols="40"><?php echo $comentario;?></textarea>
  <br><br>
  Genero:
  <input type="radio" name="genero" <?php if (isset($genero) && $genero=="femenino") echo "checked";?> value="femenino">Femenino
  <input type="radio" name="genero" <?php if (isset($genero) && $genero=="masculino") echo "checked";?> value="masculino">Masculino
    <input type="radio" name="genero" <?php if (isset($genero) && $genero=="otro") echo "checked";?> value="otro">Otro 
  <span class="error">* <?php echo $generoErr;?></span>
  <br><br>
  Sexo:
  <input type="radio" name="sexo" <?php if (isset($sexo) && $sexo=="Hombre") echo "checked";?> value="hombre">Hombre
  <input type="radio" name="sexo" <?php if (isset($sexo) && $sexo=="Mujer") echo "checked";?> value="Mujer">Mujer
   <span class="error">* <?php echo $sexoErr;?></span>
    <br><br>
  <input type="submit" name="enviar" value="Enviar">  
</form>

<?php
echo "<h2>Su informacion es:</h2>";
echo "<br>";
echo "<img src='https://starteq.net/wp-content/uploads/2019/11/mcdonalds-png-logo-picture-3-1024x1001.png' alt='img-formulario' width='150px'>";
echo "<br>";
echo  "<table border=1>";
echo  "<tr>";
echo  "<td>";
echo $nombre;
echo "<br>";
echo $cedula;
echo "<br>";
echo $direccion;
echo "<br>";
echo $celular;
echo "<br>";
echo $telefono;
echo "<br>";
echo $email;
echo "<br>";
echo $sitioWeb;
echo "<br>";
echo $comentario;
echo "<br>";
echo $genero;
echo "<br>";
echo $sexo;
echo"</tr>";//
echo"</td>";
echo"</table>";//
//////////////
?>
</body>
</html>