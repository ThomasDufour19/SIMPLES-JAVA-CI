# Étape 1 : Utiliser une image Java officielle
FROM openjdk:17-jdk-slim

# Étape 2 : Copier les fichiers compilés et sources dans le conteneur
WORKDIR /app
COPY bin/ ./bin
COPY src/ ./src

# Étape 3 : Exposer le port (adapte si besoin)
EXPOSE 8080

# Étape 4 : Commande de démarrage (adapte le nom de la classe principale si besoin)
CMD ["java", "-cp", "bin", "Calculator"]
