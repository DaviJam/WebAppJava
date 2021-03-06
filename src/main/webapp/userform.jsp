<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
        <title>Title</title>
    </head>
    <body>
        <div class="container">
            <div class="cst-form">
                <form class="container-fluid" method="post" action="/HelloWebApp/accueil" id="userform">
                    <div class="row">
                        <h1 class="form-title">Connexion</h1>
                    </div>
                    <div class="row">
                        <input name="Ident" class="form-control" type="text" placeholder="Identifiant">
                    </div>
                    <div class="row">
                        <input name="Surname" class="form-control" type="text" placeholder="Nom">
                    </div>
                    <div class="row">
                        <input name="Name" class="form-control" type="text" placeholder="Prenom">
                    </div>
                    <div class="row">
                        <input name="Email" class="form-control" type="email" placeholder="Email">
                    </div>
                    <div class="row">
                        <input name="Password" class="form-control" type="password" placeholder="Mot de passe">
                    </div>
                </form>

                <div class="row">
                    <div class="col al-center">
                        <button formmethod="get" form="userform" type="submit" class="btn btn-primary">Annuler</button>
                    </div>
                    <div class="col al-center">
                        <button formmethod="post" form="userform" type="submit" class="btn btn-outline-primary">Valider</button>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
                crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
                crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
                crossorigin="anonymous"></script>
    </body>
</html>