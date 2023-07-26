public abstract class androidx.activity.ComponentActivity extends c.h.e.p implements c.n.j implements c.n.y implements c.s.c implements c.a.i implements c.a.k.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.a.j.a c;
	 public final c.n.l d;
	 public final c.s.b e;
	 public c.n.x f;
	 public final androidx.activity.OnBackPressedDispatcher g;
	 public Integer h;
	 public final c.a.k.f i;
	 /* # direct methods */
	 public androidx.activity.ComponentActivity ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/e/p;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/a/j/a; */
		 /* invoke-direct {v0}, Lc/a/j/a;-><init>()V */
		 this.c = v0;
		 /* .line 3 */
		 /* new-instance v0, Lc/n/l; */
		 /* invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V */
		 this.d = v0;
		 /* .line 4 */
		 c.s.b .a ( p0 );
		 this.e = v0;
		 /* .line 5 */
		 /* new-instance v0, Landroidx/activity/OnBackPressedDispatcher; */
		 /* new-instance v1, Lc/a/b; */
		 /* invoke-direct {v1, p0}, Lc/a/b;-><init>(Landroidx/activity/ComponentActivity;)V */
		 /* invoke-direct {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V */
		 this.g = v0;
		 /* .line 6 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
		 /* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V */
		 /* .line 7 */
		 /* new-instance v0, Lc/a/c; */
		 /* invoke-direct {v0, p0}, Lc/a/c;-><init>(Landroidx/activity/ComponentActivity;)V */
		 this.i = v0;
		 /* .line 8 */
		 (( androidx.activity.ComponentActivity ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 9 */
			 /* const/16 v1, 0x13 */
			 /* if-lt v0, v1, :cond_0 */
			 /* .line 10 */
			 (( androidx.activity.ComponentActivity ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
			 /* new-instance v2, Landroidx/activity/ComponentActivity$3; */
			 /* invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$3;-><init>(Landroidx/activity/ComponentActivity;)V */
			 (( c.n.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/n/g;->a(Lc/n/i;)V
			 /* .line 11 */
		 } // :cond_0
		 (( androidx.activity.ComponentActivity ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
		 /* new-instance v2, Landroidx/activity/ComponentActivity$4; */
		 /* invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$4;-><init>(Landroidx/activity/ComponentActivity;)V */
		 (( c.n.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/n/g;->a(Lc/n/i;)V
		 /* .line 12 */
		 (( androidx.activity.ComponentActivity ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
		 /* new-instance v2, Landroidx/activity/ComponentActivity$5; */
		 /* invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$5;-><init>(Landroidx/activity/ComponentActivity;)V */
		 (( c.n.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/n/g;->a(Lc/n/i;)V
		 /* .line 13 */
		 /* if-gt v1, v0, :cond_1 */
		 /* const/16 v1, 0x17 */
		 /* if-gt v0, v1, :cond_1 */
		 /* .line 14 */
		 (( androidx.activity.ComponentActivity ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
		 /* new-instance v1, Landroidx/activity/ImmLeaksCleaner; */
		 /* invoke-direct {v1, p0}, Landroidx/activity/ImmLeaksCleaner;-><init>(Landroid/app/Activity;)V */
		 (( c.n.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/g;->a(Lc/n/i;)V
		 /* .line 15 */
	 } // :cond_1
	 (( androidx.activity.ComponentActivity ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;
	 /* new-instance v1, Lc/a/d; */
	 /* invoke-direct {v1, p0}, Lc/a/d;-><init>(Landroidx/activity/ComponentActivity;)V */
	 final String v2 = "android:support:activity-result"; // const-string v2, "android:support:activity-result"
	 (( androidx.savedstate.SavedStateRegistry ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V
	 /* .line 16 */
	 /* new-instance v0, Lc/a/e; */
	 /* invoke-direct {v0, p0}, Lc/a/e;-><init>(Landroidx/activity/ComponentActivity;)V */
	 (( androidx.activity.ComponentActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->a(Lc/a/j/b;)V
	 return;
	 /* .line 17 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "getLifecycle() returned null in ComponentActivity\'s constructor.Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."; // const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor.Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void a ( androidx.activity.ComponentActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V */
return;
} // .end method
public static c.a.k.f b ( androidx.activity.ComponentActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.i;
} // .end method
/* # virtual methods */
public final void a ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.c;
(( c.a.j.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/a/j/a;->a(Lc/a/j/b;)V
return;
} // .end method
public final androidx.activity.OnBackPressedDispatcher b ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.g;
} // .end method
public final androidx.savedstate.SavedStateRegistry c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( c.s.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/s/b;->a()Landroidx/savedstate/SavedStateRegistry;
} // .end method
public final c.a.k.f d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public c.n.x f ( ) {
/* .locals 2 */
/* .line 1 */
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( androidx.activity.ComponentActivity ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->h()V
	 /* .line 3 */
	 v0 = this.f;
	 /* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Your activity is not yet attached to the Application instance.You can\'t request ViewModel before onCreate call."; // const-string v1, "Your activity is not yet attached to the Application instance.You can\'t request ViewModel before onCreate call."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public c.n.g g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public void h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* if-nez v0, :cond_1 */
/* .line 2 */
(( android.app.Activity ) p0 ).getLastNonConfigurationInstance ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;
/* check-cast v0, Lc/a/f; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 v0 = this.b;
	 this.f = v0;
	 /* .line 4 */
} // :cond_0
v0 = this.f;
/* if-nez v0, :cond_1 */
/* .line 5 */
/* new-instance v0, Lc/n/x; */
/* invoke-direct {v0}, Lc/n/x;-><init>()V */
this.f = v0;
} // :cond_1
return;
} // .end method
public java.lang.Object i ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.i;
v0 = (( c.a.k.f ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/a/k/f;->a(IILandroid/content/Intent;)Z
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V */
} // :cond_0
return;
} // .end method
public void onBackPressed ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( androidx.activity.OnBackPressedDispatcher ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->a()V
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( c.s.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/s/b;->a(Landroid/os/Bundle;)V
/* .line 2 */
v0 = this.c;
(( c.a.j.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/a/j/a;->a(Landroid/content/Context;)V
/* .line 3 */
/* invoke-super {p0, p1}, Lc/h/e/p;->onCreate(Landroid/os/Bundle;)V */
/* .line 4 */
c.n.t .a ( p0 );
/* .line 5 */
/* iget p1, p0, Landroidx/activity/ComponentActivity;->h:I */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
(( androidx.activity.ComponentActivity ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V
} // :cond_0
return;
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.i;
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
final String v2 = "androidx.activity.result.contract.extra.PERMISSIONS"; // const-string v2, "androidx.activity.result.contract.extra.PERMISSIONS"
/* .line 2 */
(( android.content.Intent ) v1 ).putExtra ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
final String v2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"; // const-string v2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
/* .line 3 */
(( android.content.Intent ) v1 ).putExtra ( v2, p3 ); // invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;
int v2 = -1; // const/4 v2, -0x1
/* .line 4 */
v0 = (( c.a.k.f ) v0 ).a ( p1, v2, v1 ); // invoke-virtual {v0, p1, v2, v1}, Lc/a/k/f;->a(IILandroid/content/Intent;)Z
/* if-nez v0, :cond_0 */
/* .line 5 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 6 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V */
} // :cond_0
return;
} // .end method
public final java.lang.Object onRetainNonConfigurationInstance ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.activity.ComponentActivity ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->i()Ljava/lang/Object;
/* .line 2 */
v1 = this.f;
/* if-nez v1, :cond_0 */
/* .line 3 */
(( android.app.Activity ) p0 ).getLastNonConfigurationInstance ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;
/* check-cast v2, Lc/a/f; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
v1 = this.b;
} // :cond_0
/* if-nez v1, :cond_1 */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
} // :cond_1
/* new-instance v2, Lc/a/f; */
/* invoke-direct {v2}, Lc/a/f;-><init>()V */
/* .line 6 */
this.a = v0;
/* .line 7 */
this.b = v1;
} // .end method
public void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .line 1 */
(( androidx.activity.ComponentActivity ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
/* .line 2 */
/* instance-of v1, v0, Lc/n/l; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* check-cast v0, Lc/n/l; */
v1 = c.n.g$b.d;
(( c.n.l ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->d(Lc/n/g$b;)V
/* .line 4 */
} // :cond_0
/* invoke-super {p0, p1}, Lc/h/e/p;->onSaveInstanceState(Landroid/os/Bundle;)V */
/* .line 5 */
v0 = this.e;
(( c.s.b ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/s/b;->b(Landroid/os/Bundle;)V
return;
} // .end method
public void reportFullyDrawn ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
v0 = c.u.a .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "reportFullyDrawn() for "; // const-string v1, "reportFullyDrawn() for "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.app.Activity ) p0 ).getComponentName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
c.u.a .a ( v0 );
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x13 */
/* if-le v0, v1, :cond_1 */
/* .line 4 */
/* invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V */
/* .line 5 */
} // :cond_1
/* if-ne v0, v1, :cond_2 */
final String v0 = "android.permission.UPDATE_DEVICE_STATS"; // const-string v0, "android.permission.UPDATE_DEVICE_STATS"
v0 = c.h.f.f .a ( p0,v0 );
/* if-nez v0, :cond_2 */
/* .line 6 */
/* invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
} // :cond_2
} // :goto_0
c.u.a .a ( );
return;
/* :catchall_0 */
/* move-exception v0 */
c.u.a .a ( );
/* .line 8 */
/* throw v0 */
} // .end method
public abstract void setContentView ( Integer p0 ) {
} // .end method
public abstract void setContentView ( android.view.View p0 ) {
/* .param p1 # Landroid/view/View; */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness", */
/* "MissingNullability" */
/* } */
} // .end annotation
} // .end param
} // .end method
public void startActivityForResult ( android.content.Intent p0, Integer p1 ) {
/* .locals 0 */
/* .param p1 # Landroid/content/Intent; */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness" */
/* } */
} // .end annotation
} // .end param
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V */
return;
} // .end method
public void startActivityForResult ( android.content.Intent p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 0 */
/* .param p1 # Landroid/content/Intent; */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness" */
/* } */
} // .end annotation
} // .end param
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 2 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V */
return;
} // .end method
public void startIntentSenderForResult ( android.content.IntentSender p0, Integer p1, android.content.Intent p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 0 */
/* .param p1 # Landroid/content/IntentSender; */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness" */
/* } */
} // .end annotation
} // .end param
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/IntentSender$SendIntentException; */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* invoke-super/range {p0 ..p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V */
return;
} // .end method
public void startIntentSenderForResult ( android.content.IntentSender p0, Integer p1, android.content.Intent p2, Integer p3, Integer p4, Integer p5, android.os.Bundle p6 ) {
/* .locals 0 */
/* .param p1 # Landroid/content/IntentSender; */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness" */
/* } */
} // .end annotation
} // .end param
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/IntentSender$SendIntentException; */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 2 */
/* invoke-super/range {p0 ..p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V */
return;
} // .end method
