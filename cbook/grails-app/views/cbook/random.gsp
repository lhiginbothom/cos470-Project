<html>
<head>
	<title>Random Book</title>
	<g:javascript library="jquery" />
	</head>
<body>
	
	<!--ajax code starts here-->
	<ul id="menu">
		<li>
			<g:remoteLink action="ajaxRandom" update="cbook">
				Next Cbook 
			</g:remoteLink>
		</li>
		<li>
			<g:link action="list">
			Admin
			</g:link>
		</li>
	</ul>
	
  <div id = "cbook">
	<p>${cbook.title}</p>
	<p>${cbook.author}</p>
	<p>${cbook.isbn}</p>
	<p>${cbook.description}</p>
	<p>${cbook.minLevel}</p>
	<p>${cbook.maxLevel}</p>
	<p>${cbook.lang}</p>
	<p>${cbook.cat}</p>
   </div>
	
	
</body>	
</html>