🐳 Run a Spring Boot Application Without Using a Dockerfile

1. Pull the OpenJDK Image

Command:
docker pull openjdk:22-jdk

Description:
Downloads the OpenJDK image from Docker Hub to your local machine.

--------------------------------------------------

2. Verify the Downloaded Image

Command:
docker images

Description:
Displays all Docker images available on your machine.

--------------------------------------------------

3. Create and Start an OpenJDK Container

Command:
docker run -dit openjdk:22-jdk

Description:
Creates and starts a new OpenJDK container in detached mode.

--------------------------------------------------

4. Check Running Containers

Command:
docker ps

Description:
Lists all running containers and displays the Container ID or Container Name.

--------------------------------------------------

5. Copy the Spring Boot JAR into the Container

Command:
docker cp target/rest-demo.jar <container_id>:/tmp

Example:
docker cp target/rest-demo.jar keen_dubinsky:/tmp

Description:
Copies the Spring Boot JAR file from the local machine into the /tmp directory inside the container.

--------------------------------------------------

6. Verify the JAR File

Command:
docker exec <container_id> ls /tmp

Example:
docker exec keen_dubinsky ls /tmp

Description:
Checks whether the JAR file has been copied successfully.

--------------------------------------------------

7. Execute the Spring Boot Application

Command:
docker exec <container_id> java -jar /tmp/rest-demo.jar

Example:
docker exec keen_dubinsky java -jar /tmp/rest-demo.jar

Description:
Starts the Spring Boot application inside the running container.

--------------------------------------------------

8. Create a Custom Docker Image

Command:
docker commit --change='CMD ["java","-jar","/tmp/rest-demo.jar"]' <container_id> my-rest-demo:v1

Example:
docker commit --change='CMD ["java","-jar","/tmp/rest-demo.jar"]' keen_dubinsky my-rest-demo:v1

Description:
Creates a reusable Docker image from the running container with a default startup command.

--------------------------------------------------

9. Verify the Custom Image

Command:
docker images

Description:
Displays the newly created Docker image.

--------------------------------------------------

10. Run the Spring Boot Application from the Custom Image

Command:
docker run -p 8080:8080 my-rest-demo:v1

Description:
Creates and starts a new container from the custom image and maps host port 8080 to container port 8080.

--------------------------------------------------

11. Check Running Containers

Command:
docker ps

Description:
Verifies that the Spring Boot container is running successfully.

--------------------------------------------------

12. View Application Logs

Command:
docker logs <container_id>

Description:
Displays the Spring Boot startup logs and runtime output.

--------------------------------------------------

13. Verify the JAR File Inside the Container

Command:
docker exec <container_id> ls /

Description:
Lists the files in the root directory to verify that the JAR file exists inside the container.

--------------------------------------------------

14. Stop the Container

Command:
docker stop <container_id>

Description:
Stops the running container.

--------------------------------------------------

15. Remove the Container

Command:
docker rm <container_id>

Description:
Deletes the stopped container.

--------------------------------------------------

📚 Workflow Summary

Pull Image
↓
Create Container
↓
Copy Spring Boot JAR
↓
Verify JAR
↓
Run JAR Inside Container
↓
Create Custom Image (docker commit)
↓
Run the Custom Image
↓
Access the Application
↓
View Logs
↓
Stop & Remove Container