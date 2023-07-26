public class e.f.c.q.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object c;
	 public static e.f.c.q.h0 d;
	 /* # instance fields */
	 public final android.content.Context a;
	 public final java.util.concurrent.Executor b;
	 /* # direct methods */
	 public static e.f.c.q.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public e.f.c.q.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 p1 = e.f.c.q.a.a;
		 this.b = p1;
		 return;
	 } // .end method
	 public e.f.c.q.f ( ) {
		 /* .locals 0 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 5 */
		 this.a = p1;
		 /* .line 6 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static final e.f.a.b.h.g a ( android.content.Context p0, android.content.Intent p1, Object p2 ) { //synthethic
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .line 18 */
	 v0 = 	 e.f.a.b.c.p.h .h ( );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 19 */
		 (( e.f.a.b.h.g ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/Integer; */
		 v0 = 		 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
		 /* const/16 v1, 0x192 */
		 /* if-eq v0, v1, :cond_0 */
		 /* .line 20 */
	 } // :cond_0
	 e.f.c.q.f .b ( p0,p1 );
	 /* .line 21 */
	 e.f.c.q.h .a ( );
	 p2 = e.f.c.q.e.a;
	 /* .line 22 */
	 (( e.f.a.b.h.g ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // :cond_1
} // :goto_0
} // .end method
public static e.f.c.q.h0 a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 12 */
v0 = e.f.c.q.f.c;
/* monitor-enter v0 */
/* .line 13 */
try { // :try_start_0
v1 = e.f.c.q.f.d;
/* if-nez v1, :cond_0 */
/* .line 14 */
/* new-instance v1, Le/f/c/q/h0; */
/* invoke-direct {v1, p0, p1}, Le/f/c/q/h0;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
/* .line 15 */
} // :cond_0
p0 = e.f.c.q.f.d;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 16 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static final java.lang.Integer a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
int p0 = -1; // const/4 p0, -0x1
/* .line 17 */
java.lang.Integer .valueOf ( p0 );
} // .end method
public static e.f.a.b.h.g b ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Landroid/content/Intent;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "Binding to service"; // const-string v1, "Binding to service"
/* .line 2 */
android.util.Log .d ( v0,v1 );
} // :cond_0
final String v0 = "com.google.firebase.MESSAGING_EVENT"; // const-string v0, "com.google.firebase.MESSAGING_EVENT"
/* .line 3 */
e.f.c.q.f .a ( p0,v0 );
/* .line 4 */
(( e.f.c.q.h0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/h0;->a(Landroid/content/Intent;)Le/f/a/b/h/g;
/* .line 5 */
e.f.c.q.h .a ( );
v0 = e.f.c.q.d.a;
(( e.f.a.b.h.g ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public static final java.lang.Integer b ( Object p0 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* const/16 p0, 0x193 */
/* .line 6 */
java.lang.Integer .valueOf ( p0 );
} // .end method
public static final java.lang.Integer c ( android.content.Context p0, android.content.Intent p1 ) { //synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.q.w .b ( );
p0 = (( e.f.c.q.w ) v0 ).c ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Le/f/c/q/w;->c(Landroid/content/Context;Landroid/content/Intent;)I
java.lang.Integer .valueOf ( p0 );
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "InlinedApi" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Landroid/content/Intent;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 5 */
v0 = e.f.a.b.c.p.h .h ( );
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
/* const/16 v3, 0x1a */
/* if-lt v0, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
} // :goto_0
v3 = (( android.content.Intent ) p2 ).getFlags ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getFlags()I
/* const/high16 v4, 0x10000000 */
/* and-int/2addr v3, v4 */
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-nez v1, :cond_2 */
/* .line 8 */
e.f.c.q.f .b ( p1,p2 );
/* .line 9 */
} // :cond_2
v0 = this.b;
/* new-instance v1, Le/f/c/q/b; */
/* invoke-direct {v1, p1, p2}, Le/f/c/q/b;-><init>(Landroid/content/Context;Landroid/content/Intent;)V */
/* .line 10 */
e.f.a.b.h.n .a ( v0,v1 );
/* .line 11 */
v1 = this.b;
/* new-instance v2, Le/f/c/q/c; */
/* invoke-direct {v2, p1, p2}, Le/f/c/q/c;-><init>(Landroid/content/Context;Landroid/content/Intent;)V */
(( e.f.a.b.h.g ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g a ( android.content.Intent p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Intent;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "gcm.rawData64"; // const-string v0, "gcm.rawData64"
/* .line 1 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
android.util.Base64 .decode ( v1,v2 );
final String v2 = "rawData"; // const-string v2, "rawData"
(( android.content.Intent ) p1 ).putExtra ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;
/* .line 3 */
(( android.content.Intent ) p1 ).removeExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
/* .line 4 */
} // :cond_0
v0 = this.a;
(( e.f.c.q.f ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/c/q/f;->a(Landroid/content/Context;Landroid/content/Intent;)Le/f/a/b/h/g;
} // .end method
