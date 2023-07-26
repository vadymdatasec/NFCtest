public abstract class androidx.core.app.JobIntentService extends android.app.Service {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/core/app/JobIntentService$a;, */
	 /* Landroidx/core/app/JobIntentService$d;, */
	 /* Landroidx/core/app/JobIntentService$e;, */
	 /* Landroidx/core/app/JobIntentService$g;, */
	 /* Landroidx/core/app/JobIntentService$f;, */
	 /* Landroidx/core/app/JobIntentService$c;, */
	 /* Landroidx/core/app/JobIntentService$b;, */
	 /* Landroidx/core/app/JobIntentService$h; */
	 /* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # static fields */
public static final Boolean DEBUG;
public static final java.lang.String TAG;
public static final java.util.HashMap sClassWorkEnqueuer;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "Landroid/content/ComponentName;", */
/* "Landroidx/core/app/JobIntentService$h;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final java.lang.Object sLock;
/* # instance fields */
public final java.util.ArrayList mCompatQueue;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroidx/core/app/JobIntentService$d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public androidx.core.app.JobIntentService$h mCompatWorkEnqueuer;
public androidx.core.app.JobIntentService$a mCurProcessor;
public Boolean mDestroyed;
public Boolean mInterruptIfStopped;
public androidx.core.app.JobIntentService$b mJobImpl;
public Boolean mStopped;
/* # direct methods */
public static androidx.core.app.JobIntentService ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public androidx.core.app.JobIntentService ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/core/app/JobIntentService;->mInterruptIfStopped:Z */
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/core/app/JobIntentService;->mStopped:Z */
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/core/app/JobIntentService;->mDestroyed:Z */
/* .line 5 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
this.mCompatQueue = v0;
/* .line 7 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mCompatQueue = v0;
} // :goto_0
return;
} // .end method
public static void enqueueWork ( android.content.Context p0, android.content.ComponentName p1, Integer p2, android.content.Intent p3 ) {
/* .locals 2 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 2 */
v0 = androidx.core.app.JobIntentService.sLock;
/* monitor-enter v0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
try { // :try_start_0
androidx.core.app.JobIntentService .getWorkEnqueuer ( p0,p1,v1,p2 );
/* .line 4 */
(( androidx.core.app.JobIntentService$h ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/core/app/JobIntentService$h;->a(I)V
/* .line 5 */
(( androidx.core.app.JobIntentService$h ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Landroidx/core/app/JobIntentService$h;->a(Landroid/content/Intent;)V
/* .line 6 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
/* .line 7 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "work must not be null"; // const-string p1, "work must not be null"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void enqueueWork ( android.content.Context p0, java.lang.Class p1, Integer p2, android.content.Intent p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/lang/Class<", */
/* "*>;I", */
/* "Landroid/content/Intent;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Landroid/content/ComponentName; */
/* invoke-direct {v0, p0, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
androidx.core.app.JobIntentService .enqueueWork ( p0,v0,p2,p3 );
return;
} // .end method
public static androidx.core.app.JobIntentService$h getWorkEnqueuer ( android.content.Context p0, android.content.ComponentName p1, Boolean p2, Integer p3 ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.core.app.JobIntentService.sClassWorkEnqueuer;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroidx/core/app/JobIntentService$h; */
/* if-nez v0, :cond_2 */
/* .line 2 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
/* new-instance p2, Landroidx/core/app/JobIntentService$g; */
/* invoke-direct {p2, p0, p1, p3}, Landroidx/core/app/JobIntentService$g;-><init>(Landroid/content/Context;Landroid/content/ComponentName;I)V */
/* .line 4 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Can\'t be here without a job id"; // const-string p1, "Can\'t be here without a job id"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 5 */
} // :cond_1
/* new-instance p2, Landroidx/core/app/JobIntentService$c; */
/* invoke-direct {p2, p0, p1}, Landroidx/core/app/JobIntentService$c;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V */
} // :goto_0
/* move-object v0, p2 */
/* .line 6 */
p0 = androidx.core.app.JobIntentService.sClassWorkEnqueuer;
(( java.util.HashMap ) p0 ).put ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
} // .end method
/* # virtual methods */
public androidx.core.app.JobIntentService$e dequeueWork ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.mJobImpl;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
v0 = this.mCompatQueue;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
v1 = this.mCompatQueue;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lez v1, :cond_1 */
/* .line 5 */
v1 = this.mCompatQueue;
int v2 = 0; // const/4 v2, 0x0
(( java.util.ArrayList ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/core/app/JobIntentService$e; */
/* monitor-exit v0 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 7 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public Boolean doStopCurrentWork ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.mCurProcessor;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget-boolean v1, p0, Landroidx/core/app/JobIntentService;->mInterruptIfStopped:Z */
(( android.os.AsyncTask ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/core/app/JobIntentService;->mStopped:Z */
/* .line 4 */
v0 = (( androidx.core.app.JobIntentService ) p0 ).onStopCurrentWork ( ); // invoke-virtual {p0}, Landroidx/core/app/JobIntentService;->onStopCurrentWork()Z
} // .end method
public void ensureProcessorRunningLocked ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.mCurProcessor;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* new-instance v0, Landroidx/core/app/JobIntentService$a; */
/* invoke-direct {v0, p0}, Landroidx/core/app/JobIntentService$a;-><init>(Landroidx/core/app/JobIntentService;)V */
this.mCurProcessor = v0;
/* .line 3 */
v0 = this.mCompatWorkEnqueuer;
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
(( androidx.core.app.JobIntentService$h ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/core/app/JobIntentService$h;->b()V
/* .line 5 */
} // :cond_0
p1 = this.mCurProcessor;
v0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Void; */
(( android.os.AsyncTask ) p1 ).executeOnExecutor ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
} // :cond_1
return;
} // .end method
public Boolean isStopped ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/core/app/JobIntentService;->mStopped:Z */
} // .end method
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.mJobImpl;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onCreate ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Service;->onCreate()V */
/* .line 2 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x1a */
/* if-lt v0, v2, :cond_0 */
/* .line 3 */
/* new-instance v0, Landroidx/core/app/JobIntentService$f; */
/* invoke-direct {v0, p0}, Landroidx/core/app/JobIntentService$f;-><init>(Landroidx/core/app/JobIntentService;)V */
this.mJobImpl = v0;
/* .line 4 */
this.mCompatWorkEnqueuer = v1;
/* .line 5 */
} // :cond_0
this.mJobImpl = v1;
/* .line 6 */
/* new-instance v0, Landroid/content/ComponentName; */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
androidx.core.app.JobIntentService .getWorkEnqueuer ( p0,v0,v1,v1 );
this.mCompatWorkEnqueuer = v0;
} // :goto_0
return;
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Service;->onDestroy()V */
/* .line 2 */
v0 = this.mCompatQueue;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* monitor-enter v0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
try { // :try_start_0
/* iput-boolean v1, p0, Landroidx/core/app/JobIntentService;->mDestroyed:Z */
/* .line 5 */
v1 = this.mCompatWorkEnqueuer;
(( androidx.core.app.JobIntentService$h ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/core/app/JobIntentService$h;->a()V
/* .line 6 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // :cond_0
} // :goto_0
return;
} // .end method
public abstract void onHandleWork ( android.content.Intent p0 ) {
} // .end method
public Integer onStartCommand ( android.content.Intent p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 1 */
p2 = this.mCompatQueue;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 2 */
p2 = this.mCompatWorkEnqueuer;
(( androidx.core.app.JobIntentService$h ) p2 ).c ( ); // invoke-virtual {p2}, Landroidx/core/app/JobIntentService$h;->c()V
/* .line 3 */
p2 = this.mCompatQueue;
/* monitor-enter p2 */
/* .line 4 */
try { // :try_start_0
v0 = this.mCompatQueue;
/* new-instance v1, Landroidx/core/app/JobIntentService$d; */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
/* new-instance p1, Landroid/content/Intent; */
/* invoke-direct {p1}, Landroid/content/Intent;-><init>()V */
} // :goto_0
/* invoke-direct {v1, p0, p1, p3}, Landroidx/core/app/JobIntentService$d;-><init>(Landroidx/core/app/JobIntentService;Landroid/content/Intent;I)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
(( androidx.core.app.JobIntentService ) p0 ).ensureProcessorRunningLocked ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/app/JobIntentService;->ensureProcessorRunningLocked(Z)V
/* .line 6 */
/* monitor-exit p2 */
int p1 = 3; // const/4 p1, 0x3
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_1
int p1 = 2; // const/4 p1, 0x2
} // .end method
public Boolean onStopCurrentWork ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void processorFinished ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.mCompatQueue;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
/* monitor-enter v0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
try { // :try_start_0
this.mCurProcessor = v1;
/* .line 4 */
v1 = this.mCompatQueue;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mCompatQueue;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lez v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
(( androidx.core.app.JobIntentService ) p0 ).ensureProcessorRunningLocked ( v1 ); // invoke-virtual {p0, v1}, Landroidx/core/app/JobIntentService;->ensureProcessorRunningLocked(Z)V
/* .line 6 */
} // :cond_0
/* iget-boolean v1, p0, Landroidx/core/app/JobIntentService;->mDestroyed:Z */
/* if-nez v1, :cond_1 */
/* .line 7 */
v1 = this.mCompatWorkEnqueuer;
(( androidx.core.app.JobIntentService$h ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/core/app/JobIntentService$h;->a()V
/* .line 8 */
} // :cond_1
} // :goto_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // :cond_2
} // :goto_1
return;
} // .end method
public void setInterruptIfStopped ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/core/app/JobIntentService;->mInterruptIfStopped:Z */
return;
} // .end method
