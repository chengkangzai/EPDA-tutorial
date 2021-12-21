CURRENTDATEONLY=`date +"%b %d, %Y"`
git status
git add .
git commit -s -m "Update ${CURRENTDATEONLY}"
git push origin head