<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario Productos</title>
<link rel="stylesheet" type="text/css" href="css/table.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<body>
		<div>
			<h1>Formulario Productos</h1>
			<table>
					<form action="" name="datospersonales">
						<tr>
							<td>
								<label for="id">Id Producto:</label>
								<input type="text" name="id" id="id" placeholder="Id Producto *" maxlength="5" required>
							</td>
							<td>
								<label for="nombre">Nombre Producto:</label>
								<input type="text" name="nombre" id="nombre"  placeholder="Nombre Producto *"maxlength="100" required>
							</td>
							<td>
								<label for="precio">Precio por Unidad:</label>
								<input type="text" name="precio" id="precio" placeholder="Precio Unidad *"required="">
							</td>
							<tr>
								<td>
									<br>
								</td>
							</tr>
						</tr>
						
						<tr>
							<td>
								<label for="existencias">Nº de Existencias</label>
								<input type="text" name="existencias" id="existencias" placeholder="Nº de Existencias *" maxlength="5">
							</td>

							<td>
								<label for="categoria">Categoria:</label>
								<input type="text" name="categoria" id="categoria" placeholder="Categoria" maxlength="10">
							</td>

							
						</tr>
						<tr>
							<td>
								<br>
							</td>
						</tr>
						
						<table border="1">
						<tr>							
						    <td>Id Producto</td>
						    <td>Nombre Producto</td>
						    <td>Precio por unidad</td>
						    <td>Nº de existencias</td>
						    <td>Categoria</td>
						    <td>Descuento</td>
  						</tr>							
						<tr>
								
							</tr>
						<tr>
						<td colspan="3">

						<input type="submit" name="imprimir" id="imprimir" value="Imprimr">
						</td>
						</tr>
						</table>
					</form>
			</table>
		</div>
</body>
</html>
