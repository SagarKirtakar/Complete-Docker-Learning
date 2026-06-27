🐳 Run a Spring Boot Application Using a Dockerfile

--------------------------------------------------

1. Build the Spring Boot Project

Command:
mvn clean package

Description:
Builds the Spring Boot project and generates the executable JAR file inside the target folder.

--------------------------------------------------

2. Verify the Generated JAR File

Command:
dir target

Description:
Checks whether the JAR file has been generated successfully.

--------------------------------------------------

3. Create a Dockerfile

Dockerfile:

FROM openjdk:28-ea-trixie

ADD target/rest-demo.jar /rest-demo.jar

ENTRYPOINT ["java", "-jar", "/rest-demo.jar"]

Description:
Defines the Docker image configuration.
• FROM → Uses OpenJDK as the base image.
• ADD → Copies the Spring Boot JAR into the image.
• ENTRYPOINT → Runs the Spring Boot application when the container starts.

--------------------------------------------------

4. Build the Docker Image

Command:
docker build -t sagar/rest-demo:v3 .

Description:
Creates a Docker image from the Dockerfile.

--------------------------------------------------

5. Verify the Docker Image

Command:
docker images

Description:
Displays all Docker images available on your machine.

--------------------------------------------------

6. Run the Spring Boot Container

Command:
docker run -p 8080:8080 sagar/rest-demo:v3

Description:
Creates and starts a container from the Docker image and maps Host Port 8080 to Container Port 8080.

--------------------------------------------------

7. Run the Container in Detached Mode (Optional)

Command:
docker run -d -p 8080:8080 sagar/rest-demo:v3

Description:
Runs the Spring Boot container in the background.

--------------------------------------------------

8. Check Running Containers

Command:
docker ps

Description:
Displays all running Docker containers.

--------------------------------------------------

9. View Application Logs

Command:
docker logs <container_id>

Example:
docker logs fervent_knuth

Description:
Displays the Spring Boot startup logs and runtime output.

--------------------------------------------------

10. Verify the JAR File Inside the Container

Command:
docker exec <container_id> ls /

Example:
docker exec fervent_knuth ls /

Description:
Checks whether the JAR file exists inside the running container.

--------------------------------------------------

11. Check the JAR File Size (Optional)

Command:
docker exec <container_id> ls -lh /rest-demo.jar

Description:
Displays the size and details of the JAR file inside the container.

--------------------------------------------------

12. Open a Shell Inside the Container (Optional)

Command:
docker exec -it <container_id> sh

Description:
Opens an interactive terminal inside the running container.

--------------------------------------------------

13. Stop the Container

Command:
docker stop <container_id>

Description:
Stops the running container.

--------------------------------------------------

14. Start the Container Again

Command:
docker start <container_id>

Description:
Starts a previously stopped container.

--------------------------------------------------

15. Restart the Container

Command:
docker restart <container_id>

Description:
Restarts the running container.

--------------------------------------------------

16. Remove the Container

Command:
docker rm <container_id>

Description:
Deletes the stopped container.

--------------------------------------------------

17. Remove the Docker Image

Command:
docker rmi sagar/rest-demo:v3

Description:
Deletes the Docker image from your local machine.

--------------------------------------------------

📚 Workflow Summary

Build Spring Boot Project
↓
Verify JAR File
↓
Create Dockerfile
↓
Build Docker Image
↓
Verify Image
↓
Run Container
↓
Check Running Containers
↓
View Application Logs
↓
Verify JAR Inside Container
↓
Access Application (http://localhost:8080)
↓
Stop / Restart / Remove Container
↓
Remove Docker Image (Optional)
