<!DOCTYPE html>
<html>
<head></head>
<body bgcolor="skyblue" font-color="red">
<form action="check" method="post">

	<table border='0' width='480px' cellpadding='0' cellspacing='0'
		align='center'>
		<center>
			<tr>
				<td><h1><center>Health Insurance Quote Page</center></h1></td>
			</tr>
			<center>

				<table border='0' width='480px' cellpadding='0' cellspacing='0'
					align='center'>
					<tr>
						<td align='center'>Name:</td>
						<td><input type='text' name='user_name'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Gender:</td>
						<td><input type='radio' name='user_gender' value='male' checked>Male
						<input type='radio' name='user_gender'  value='female'>Female</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Age:</td>
						<td><input type='text' name='user_age'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					
					<tr>
						 <td align='center'>Current Helth</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					
					
						<td align='center'>Hypertension:</td>
						<td><input type='text' name='hypertension_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Blood Pressure:</td>
						<td><input type='text' name='blood_pressure_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Blood Suger:</td>
						<td><input type='text' name='blood_suger_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>OverWeight:</td>
						<td><input type='text' name='overweight_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					
				   <tr>
						 <td align='center'>Hebits:</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					
					<tr>
						<td align='center'>Smoking:</td>
						<td><input type='text' name='smoking_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Alcohol:</td>
						<td><input type='text' name='alcohol_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Daily Excersice:</td>
						<td><input type='text' name='dailly_exersize_type'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Drugs:</td>
						<td><input type='text' name='drugs_tye'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					
					
					<table border='0' cellpadding='0' cellspacing='0' width='480px'
						align='center'>
						<tr>
							<td align='center'><input type='submit' name='REGISTER'
								value="submit"></td>
						</tr>
					</table>
				</table>
	</table>
	
	</form>
	
	<br>
	 <div style="text-align: center;"> ${result} </div>
</body>
</html>