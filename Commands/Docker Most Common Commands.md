🐳 Docker Most Common Commands

1. Check Docker Version
   docker --version

👉 Shows installed Docker version.

--------------------------------------------------

2. View Docker Information
   docker info

👉 Displays Docker system details.

---------------------------------------------------

3. Hello World Test
   docker run hello-world

👉 Verifies Docker installation.

--------------------------------------------------

4. List Downloaded Images
   docker images

👉 Shows all images available on your machine.

--------------------------------------------------

5. Download an Image
   docker pull nginx

👉 Downloads an image from Docker Hub.

-----------------------------------------------------

6. Run a Container
   docker run nginx

👉 Creates and starts a container.

-----------------------------------------------------

7. View Running Containers
   docker ps

👉 Shows currently running containers.

--------------------------------------------------

8. View All Containers
   docker ps -a

👉 Shows running and stopped containers.

--------------------------------------------------

9. Stop a Container
   docker stop <container_id>

Example:
docker stop abc123

👉 Stops a running container.

--------------------------------------------------

10. Start a Container
    docker start <container_id>

👉 Starts a stopped container.

--------------------------------------------------

11. Restart a Container
    docker restart <container_id>

👉 Restarts a container.

--------------------------------------------------

12. Remove a Container
    docker rm <container_id>

👉 Deletes a stopped container.

--------------------------------------------------

13. Remove an Image
    docker rmi <image_id>

👉 Deletes an image.

--------------------------------------------------

14. View Container Logs
    docker logs <container_id>

👉 Shows container output and errors.

--------------------------------------------------

15. Pull Image from Docker Hub
    docker pull mysql

👉 Downloads image from Docker Hub.

--------------------------------------------------

16. Search Images on Docker Hub
    docker search nginx

👉 Searches for images available on Docker Hub.
