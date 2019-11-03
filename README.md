# societe-generale
Problem Statement KATA

Step 1 :
     Download and Install git software. After successfully installed clone the project by using
     below comment.
     # cmd - git clone https://github.com/anand-sakthivel/societe-generale.git
     
     Our Folder structure
       |
       |-- societe-generale(root)
       |          |
       |          |--- api (backend)
       |          |
                  |--- app (fontend)
                  |
     
Step 2 :
       Up and Running the api (Backend)
        
       Move to folder api(cd api :: Current directory is api). Run the below comment in command prompt.
       
       # cmd - mvn package  (It will the build the jar)
       # cmd - mvn java -jar target/soc-0.0.1-SNAPSHOT.jar (It will up and run the spring boot application).
       
Step 3 :
        Up and Running the app (Front End).
        
        Move to folder app(cd app :: Current directory is app). Run the below comment in command prompt.
        
        # cmd - npm install (It will download and install angular project and its dependencies).
        # cmd - ng serve -o (It opens browser with localhost:4200)
        
       
