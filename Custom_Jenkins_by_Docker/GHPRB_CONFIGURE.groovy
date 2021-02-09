import jenkins.model.*
import org.jenkinsci.plugins.ghprb.*

GhprbTrigger.DescriptorImpl descriptor = Jenkins.instance.getDescriptorByType(org.jenkinsci.plugins.ghprb.GhprbTrigger.DescriptorImpl.class)

List<GhprbGitHubAuth> githubAuths = descriptor.getGithubAuth()

String serverAPIUrl = 'https://api.github.com'
String jenkinsUrl = 'https:localhost:8080/'
String credentialsId = 'Github'
String description = 'Anonymous connection'
String id = 'github-auth-id'
String secret = null
githubAuths.add(new GhprbGitHubAuth(serverAPIUrl, jenkinsUrl, credentialsId, description, id, secret))

descriptor.save()