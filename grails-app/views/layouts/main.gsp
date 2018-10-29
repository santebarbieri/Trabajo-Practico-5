<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src="application.css"/>
    <title>Hospital virtual</title>

    <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../css/AMEstyle.css">-->
    <g:layoutHead/>
</head>
<body>
    <header>
        <div class="jumbotron jumbotron-fluid">
            <div class="container">
                <h1 class="display-1">Hospital San Algo</h1>
                <p class="lead">El primer Hospital 100% Virtual. Realice Consultas en tiempo real con los mejores medicos del pais.</p>
            </div>
        </div>
         <div class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a class="navbar-brand" href="/#">
		            <%-- <asset:image src="medico_icon.jpg" alt="Grails Logo"/> --%>
                </a>
            </div>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
                <ul class="nav navbar-nav navbar-right">
                <li class="nav-item active">
                    <g:link controller="paciente" action="index">Pacientes</g:link>
                    <%-- <a class="nav-link" href="#">Pacientes <span class="sr-only">(current)</span></a> --%>
                </li>
                <li class="nav-item">
                  <g:link controller="consulta" action="index">Consulta</g:link>
                  <%--   <a class="nav-link" href="#">Consultas</a> --%>
                </li>
                <li class="nav-item active">
                  <g:link controller="practica" action="index">Practicas Realizadas</g:link>
                    <%-- <a class="nav-link" href="#">Practicas Realizadas</a> --%>
                </li>
                <li class="nav-item">
                 <g:link controller="tipoPractica" action="index">Tipos de Practicas</g:link>
                   <%--  <a class="nav-link" href="#">Tipos de Practicas</a> --%>
                </li>
                    <%-- <g:pageProperty name="page.nav" /> --%>
                </ul>
                
            </div>
        </div>
    </div>
    </header>
    <g:layoutBody/>
    <!--Acá está el footer, solo hay que rellenar en medio del div-->
    <div class="footer" role="contentinfo">
        Hospital San Algo - Direccion: En algun lugar - Telefono: 3834123123
    </div>
    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>
    <asset:javascript src="application.js"/>
</body>
</html>