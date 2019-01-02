node {
  stage('SCM') {
    git 'https://github.com/mirskiy/SpringMVC.git'
  }
  stage('SonarQube analysis') {
    def scannerHome = tool 'sonarscanner';
    withSonarQubeEnv('sonar') {
      sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=${env.JOB_NAME}"
    }
  }

  stage('Get SonarQube Results and send to Splunk') {
    configFileProvider(
        [configFile(fileId: 'sonarqube-to-splunk', variable: 'SONARSPLUNK_SCRIPT')]) {
        sh 'chmod +x "$SONARSPLUNK_SCRIPT"'
        sh '$SONARSPLUNK_SCRIPT'
    }
  }
}
