<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="shortcut icon" type="image/png" href="${assetPath(src: 'favicon.png')}"/>
    <asset:stylesheet src="player/player.css"/>
    <asset:stylesheet src="player/bootstrap.css"/>
    <asset:javascript src="player/player.js"/>
    <title>PuzzleHunt</title>
</head>

<body>
<g:form useToken="true" style="visibility: hidden">
</g:form>
<div class="root-div">
    <div id="rootPane">
        <div class="header-div">
            <div id="linksPane" class="greeting greeting-links"></div>
            <div id="titlePane" class='greeting greeting-title' style="display: none"></div>
            <div id="statusPane" class="greeting greeting-status" style="display: none"></div>
        </div>

        <div class="notifiers">
            <div class="hint-notifier"><label></label></div>

            <div class="alert"><label></label><div class="alert-window" style="display: none"></div></div>
        </div>
    </div>
</div>

<div id="modal" style="visibility: hidden">
    <div id="modal-shade"></div>
    <div id="modal-root"></div>
</div>
</body>

</html>