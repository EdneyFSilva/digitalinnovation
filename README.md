# Digital Innovation One

### Trilha Kotlin

## Dicas para refazer login e modificar repositorio remoto
You don't have to "logout" or "login": regarding git, who you are is determined by:

git config user.name
git config user.email
Change those two settings while being in a repo, if you are someone else, when it comes to creating commits.

If you want to change it in your local machine for all repos, add --global like

git config --global user.name [your username]
As suggested by the Deepak swain's answer, you can also change credentials in Windows using the Credentials Manager by typing in the console:

rundll32.exe keymgr.dll, KRShowKeyMgr

**git remote remove origin** - remove apontamento do repositorio local para repositorio remoto
**git checkcout main** - **acessa** repositorio local **main**