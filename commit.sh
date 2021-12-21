CURRENTDATEONLY=`date +"%b %d, %Y"`
git add .
git commit -s -m "Update ${CURRENTDATEONLY}"
git push origin head