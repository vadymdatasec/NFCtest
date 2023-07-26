public class e.f.a.b.c.o.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object a;
	 public static volatile e.f.a.b.c.o.a b;
	 /* # direct methods */
	 public static e.f.a.b.c.o.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public e.f.a.b.c.o.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 v0 = java.util.Collections.EMPTY_LIST;
		 return;
	 } // .end method
	 public static e.f.a.b.c.o.a a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = e.f.a.b.c.o.a.b;
		 /* if-nez v0, :cond_1 */
		 /* .line 2 */
		 v0 = e.f.a.b.c.o.a.a;
		 /* monitor-enter v0 */
		 /* .line 3 */
		 try { // :try_start_0
			 v1 = e.f.a.b.c.o.a.b;
			 /* if-nez v1, :cond_0 */
			 /* .line 4 */
			 /* new-instance v1, Le/f/a/b/c/o/a; */
			 /* invoke-direct {v1}, Le/f/a/b/c/o/a;-><init>()V */
			 /* .line 5 */
		 } // :cond_0
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v1 */
		 /* .line 6 */
	 } // :cond_1
} // :goto_0
v0 = e.f.a.b.c.o.a.b;
} // .end method
/* # virtual methods */
public void a ( android.content.Context p0, android.content.ServiceConnection p1 ) {
/* .locals 0 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UntrackedBindService" */
/* } */
} // .end annotation
/* .line 12 */
(( android.content.Context ) p1 ).unbindService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
return;
} // .end method
public Boolean a ( android.content.Context p0, android.content.Intent p1, android.content.ServiceConnection p2, Integer p3 ) {
/* .locals 7 */
/* .line 11 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* move v6, p4 */
p1 = /* invoke-virtual/range {v1 ..v6}, Le/f/a/b/c/o/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z */
} // .end method
public final Boolean a ( android.content.Context p0, java.lang.String p1, android.content.Intent p2, android.content.ServiceConnection p3, Integer p4 ) {
/* .locals 1 */
/* .line 7 */
(( android.content.Intent ) p3 ).getComponent ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p2, :cond_0 */
int p2 = 0; // const/4 p2, 0x0
/* .line 8 */
} // :cond_0
(( android.content.ComponentName ) p2 ).getPackageName ( ); // invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
p2 = e.f.a.b.c.p.d .a ( p1,p2 );
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
final String p1 = "ConnectionTracker"; // const-string p1, "ConnectionTracker"
final String p2 = "Attempted to bind to a service in a STOPPED package."; // const-string p2, "Attempted to bind to a service in a STOPPED package."
/* .line 9 */
android.util.Log .w ( p1,p2 );
/* .line 10 */
} // :cond_1
p1 = (( android.content.Context ) p1 ).bindService ( p3, p4, p5 ); // invoke-virtual {p1, p3, p4, p5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
} // .end method
