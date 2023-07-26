public class c.n.t$a implements android.app.Application$ActivityLifecycleCallbacks {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/n/t; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # direct methods */
public c.n.t$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static void registerIn ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/n/t$a; */
/* invoke-direct {v0}, Lc/n/t$a;-><init>()V */
(( android.app.Activity ) p0 ).registerActivityLifecycleCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
return;
} // .end method
/* # virtual methods */
public void onActivityCreated ( android.app.Activity p0, android.os.Bundle p1 ) {
/* .locals 0 */
return;
} // .end method
public void onActivityDestroyed ( android.app.Activity p0 ) {
/* .locals 0 */
return;
} // .end method
public void onActivityPaused ( android.app.Activity p0 ) {
/* .locals 0 */
return;
} // .end method
public void onActivityPostCreated ( android.app.Activity p0, android.os.Bundle p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = c.n.g$a.ON_CREATE;
c.n.t .a ( p1,p2 );
return;
} // .end method
public void onActivityPostResumed ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.n.g$a.ON_RESUME;
c.n.t .a ( p1,v0 );
return;
} // .end method
public void onActivityPostStarted ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.n.g$a.ON_START;
c.n.t .a ( p1,v0 );
return;
} // .end method
public void onActivityPreDestroyed ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.n.g$a.ON_DESTROY;
c.n.t .a ( p1,v0 );
return;
} // .end method
public void onActivityPrePaused ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.n.g$a.ON_PAUSE;
c.n.t .a ( p1,v0 );
return;
} // .end method
public void onActivityPreStopped ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.n.g$a.ON_STOP;
c.n.t .a ( p1,v0 );
return;
} // .end method
public void onActivityResumed ( android.app.Activity p0 ) {
/* .locals 0 */
return;
} // .end method
public void onActivitySaveInstanceState ( android.app.Activity p0, android.os.Bundle p1 ) {
/* .locals 0 */
return;
} // .end method
public void onActivityStarted ( android.app.Activity p0 ) {
/* .locals 0 */
return;
} // .end method
public void onActivityStopped ( android.app.Activity p0 ) {
/* .locals 0 */
return;
} // .end method
