import java.util.logging.Logger
import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletRequestWrapper
import java.lang.reflect.Field

import jenkins.*
import jenkins.model.*
import hudson.model.*
import hudson.util.Secret
import org.kohsuke.github.GHCommitState;
import org.kohsuke.stapler.*;
import org.jenkinsci.plugins.ghprb.*;
import org.jenkinsci.plugins.ghprb.GhprbGitHubAuth;
import org.jenkinsci.plugins.ghprb.extensions.*;
import org.jenkinsci.plugins.ghprb.extensions.build.*;
import org.jenkinsci.plugins.ghprb.extensions.comments.*;
import org.jenkinsci.plugins.ghprb.extensions.status.*;

def SERVER_API_URL = "https://api.github.com/"
def CREDENTIALS_ID = "naveen"
def SHARED_SECRET = "13566"

Field githubAuth = descriptor.class.getDeclaredField("githubAuth")
githubAuth.setAccessible(true)
githubAuthArray = new ArrayList<GhprbGitHubAuth>()
Secret sharedSecret = new Secret(ghprbConfig.SHARED_SECRET)
githubAuthArray.add(new GhprbGitHubAuth(
    ghprbConfig.SERVER_API_URL,
    null,
    ghprbConfig.CREDENTIALS_ID,
    null,
    null,
    sharedSecret)
)
githubAuth.set(descriptor, githubAuthArray)
