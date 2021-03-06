import ice.thickness.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_iceThickness_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("username"),'required':(""),'value':(userInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("password"),'required':(""),'value':(userInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'recentActivities', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.recentActivities.label"),'default':("Recent Activities")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("recentActivities"),'required':(""),'value':(userInstance?.recentActivities)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'profilePicture', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("user.profilePicture.label"),'default':("Profile Picture")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("url"),'name':("profilePicture"),'required':(""),'value':(userInstance?.profilePicture)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1427296730000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
