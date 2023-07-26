public class e.f.c.l.e.m.i1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.SharedPreferences a;
	 public final e.f.c.h b;
	 public final java.lang.Object c;
	 public e.f.a.b.h.h d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/a/b/h/h<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean e;
public java.lang.Boolean f;
public e.f.a.b.h.h g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/h<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.l.e.m.i1 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
this.c = v0;
/* .line 3 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
this.d = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Le/f/c/l/e/m/i1;->e:Z */
/* .line 5 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
this.g = v0;
/* .line 6 */
(( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
/* .line 7 */
this.b = p1;
/* .line 8 */
e.f.c.l.e.m.j .h ( v0 );
this.a = p1;
/* .line 9 */
(( e.f.c.l.e.m.i1 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/i1;->a()Ljava/lang/Boolean;
/* if-nez p1, :cond_0 */
/* .line 10 */
(( e.f.c.l.e.m.i1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/i1;->a(Landroid/content/Context;)Ljava/lang/Boolean;
/* .line 11 */
} // :cond_0
this.f = p1;
/* .line 12 */
p1 = this.c;
/* monitor-enter p1 */
/* .line 13 */
try { // :try_start_0
v0 = (( e.f.c.l.e.m.i1 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/i1;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 14 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
(( e.f.a.b.h.h ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
/* .line 15 */
} // :cond_1
/* monitor-exit p1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static java.lang.Boolean b ( android.content.Context p0 ) {
/* .locals 3 */
final String v0 = "firebase_crashlytics_collection_enabled"; // const-string v0, "firebase_crashlytics_collection_enabled"
/* .line 11 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 12 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const/16 v2, 0x80 */
/* .line 13 */
(( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 14 */
	 v1 = this.metaData;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v1 = this.metaData;
		 /* .line 15 */
		 v1 = 		 (( android.os.Bundle ) v1 ).containsKey ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 16 */
			 p0 = this.metaData;
			 p0 = 			 (( android.os.Bundle ) p0 ).getBoolean ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
			 java.lang.Boolean .valueOf ( p0 );
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 /* .line 17 */
			 e.f.c.l.e.b .a ( );
			 final String v1 = "Unable to get PackageManager.Falling through"; // const-string v1, "Unable to get PackageManager.Falling through"
			 (( e.f.c.l.e.b ) v0 ).a ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.Boolean a ( ) {
		 /* .locals 3 */
		 /* .line 3 */
		 v0 = this.a;
		 v0 = 		 final String v1 = "firebase_crashlytics_collection_enabled"; // const-string v1, "firebase_crashlytics_collection_enabled"
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 4 */
			 /* iput-boolean v0, p0, Le/f/c/l/e/m/i1;->e:Z */
			 /* .line 5 */
			 v0 = this.a;
			 v0 = 			 int v2 = 1; // const/4 v2, 0x1
			 java.lang.Boolean .valueOf ( v0 );
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public final java.lang.Boolean a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .line 6 */
		 e.f.c.l.e.m.i1 .b ( p1 );
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 7 */
		 /* iput-boolean p1, p0, Le/f/c/l/e/m/i1;->e:Z */
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 8 */
	 /* iput-boolean v0, p0, Le/f/c/l/e/m/i1;->e:Z */
	 /* .line 9 */
	 v0 = java.lang.Boolean.TRUE;
	 p1 = 	 (( java.lang.Boolean ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z
	 java.lang.Boolean .valueOf ( p1 );
} // .end method
public void a ( Boolean p0 ) {
	 /* .locals 1 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 1 */
		 p1 = this.g;
		 int v0 = 0; // const/4 v0, 0x0
		 (( e.f.a.b.h.h ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
		 return;
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalStateException; */
	 final String v0 = "An invalid data collection token was used."; // const-string v0, "An invalid data collection token was used."
	 /* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public final void b ( Boolean p0 ) {
	 /* .locals 4 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 final String p1 = "ENABLED"; // const-string p1, "ENABLED"
	 } // :cond_0
	 final String p1 = "DISABLED"; // const-string p1, "DISABLED"
	 /* .line 6 */
} // :goto_0
v0 = this.f;
/* if-nez v0, :cond_1 */
final String v0 = "global Firebase setting"; // const-string v0, "global Firebase setting"
/* .line 7 */
} // :cond_1
/* iget-boolean v0, p0, Le/f/c/l/e/m/i1;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "firebase_crashlytics_collection_enabled manifest flag"; // const-string v0, "firebase_crashlytics_collection_enabled manifest flag"
} // :cond_2
final String v0 = "API"; // const-string v0, "API"
/* .line 8 */
} // :goto_1
e.f.c.l.e.b .a ( );
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
int p1 = 1; // const/4 p1, 0x1
/* aput-object v0, v2, p1 */
final String p1 = "Crashlytics automatic data collection %s by %s."; // const-string p1, "Crashlytics automatic data collection %s by %s."
/* .line 9 */
java.lang.String .format ( p1,v2 );
/* .line 10 */
(( e.f.c.l.e.b ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
} // .end method
public synchronized Boolean b ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.f;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 3 */
} // :cond_0
v0 = this.b;
v0 = (( e.f.c.h ) v0 ).g ( ); // invoke-virtual {v0}, Le/f/c/h;->g()Z
/* .line 4 */
} // :goto_0
(( e.f.c.l.e.m.i1 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/i1;->b(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 5 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public e.f.a.b.h.g c ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.d;
(( e.f.a.b.h.h ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 3 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public e.f.a.b.h.g d ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.g;
/* .line 2 */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
(( e.f.c.l.e.m.i1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/i1;->c()Le/f/a/b/h/g;
/* .line 3 */
e.f.c.l.e.m.h2 .a ( v0,v1 );
} // .end method
