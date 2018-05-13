<?php 

	//  esto es para la direccion de la ejecucion del programa de python
	$state1 = $_GET['comer'];
	//$state2 = $_POST['comer2'];
	//$state3 = $_POST['comer3'];

echo $_GET['comer'];
/*echo $_POST['comer2'];
echo $_POST['comer3'];
*/
	if ($state1 == 'Desayuno') {
		//exec('sudo python /direccionDelProyecto/www/gpio/comedero.py');
		echo "<h1> Desayuno </h1>";
	}
	if ($state1 == 'Almuerzo') {
		echo "<h1> Desayuno 2</h1>";
		//exec('sudo python /direccionDelProyecto/www/gpio/comedero.py');
	}
	if ($state1 == 'Cena') {
		echo "<h1> Desayuno 3</h1>";
		//exec('sudo python /direccionDelProyecto/www/gpio/comedero.py');
	}

?>