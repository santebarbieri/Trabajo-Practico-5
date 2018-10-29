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

    <g:layoutHead/>
</head>
<body>
    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <%--<div class="container">
            <div class="navbar-header">
                
                <!--esto es la hamburguesa que se hace cuando se achica la pantalla-->
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!--Acá está el logo de grails que sale arriba a la izaquierda-->
                <a class="navbar-brand" href="/#">
		            <asset:image src="grails.svg" alt="Grails Logo"/>
                </a>
            </div>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
                <ul class="nav navbar-nav navbar-right">
                    <g:pageProperty name="page.nav" />
                </ul>                
            </div>
        </div>--%>
        <a class="navbar-brand" href="#">Hospital San Algo</a>
    </div>

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
