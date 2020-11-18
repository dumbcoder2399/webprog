<!DOCTYPE html>
<head>
<title>Quiz Results</title>
<style>
body{
	background-color:yellow;
}
</style>
<script>
function quiz()
{
	window.location.href = "quiz.html";
}
</script>
</head>
<body>
<?php
	if(isset($_POST))
	{
		$totalcorrect=0;
		$ans1=(isset($_POST['ans1'])?$_POST['ans1']:"");
		$ans2=(isset($_POST['ans2'])?$_POST['ans2']:"");
		$ans3=(isset($_POST['ans3'])?$_POST['ans3']:"");
		$ans4=(isset($_POST['ans4'])?$_POST['ans4']:"");
		$ans5=(isset($_POST['ans5'])?$_POST['ans5']:"");
		$ans6=(isset($_POST['ans6'])?$_POST['ans6']:"");
		$ans7=(isset($_POST['ans7'])?$_POST['ans7']:"");
		$ans8=(isset($_POST['ans8'])?$_POST['ans8']:"");
		$ans9=(isset($_POST['ans9'])?$_POST['ans9']:"");
		$ans10=(isset($_POST['ans10'])?$_POST['ans10']:"");
		if($ans1=="h1")
			$totalcorrect++;
		if($ans2=="em")
			$totalcorrect++;
		if($ans3=="footer")
			$totalcorrect++;
		if($ans4=="header")
			$totalcorrect++;
		if($ans5=="b")
			$totalcorrect++;
		if($ans6=="ul")
			$totalcorrect++;
		if($ans7=="title")
			$totalcorrect++;
		if($ans8=="strong")
			$totalcorrect++;
		if($ans9=="br")
			$totalcorrect++;
		if($ans10=="ol")
			$totalcorrect++;
	}
echo"<h1 style='font-size:50px;position: absolute;top:40%;left:28%;'>You have answered ",$totalcorrect,"/10 questions correctly.</h1>";
?>
<input type="button" style="bottom:30%;position:absolute;font-size:30px;left:40%;background-color:turquoise;height:50px;" onClick="quiz()" value='Click here to reattempt the quiz'>
</body>
</html>