public class e.f.a.d.a.b.l extends e.f.a.d.a.e.n0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/f/a/d/a/e/n0;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.a.d.a.i.o a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/d/a/i/o<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final e.f.a.d.a.b.q b; //synthetic
/* # direct methods */
public e.f.a.d.a.b.l ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/d/a/i/o<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
this.b = p1;
/* invoke-direct {p0}, Le/f/a/d/a/e/n0;-><init>()V */
this.a = p2;
return;
} // .end method
public e.f.a.d.a.b.l ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V */
return;
} // .end method
public e.f.a.d.a.b.l ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V */
return;
} // .end method
public e.f.a.d.a.b.l ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "onRemoveModule()"; // const-string v2, "onRemoveModule()"
(( e.f.a.d.a.e.a ) v0 ).c ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 3 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
final String p1 = "onCancelDownload(%d)"; // const-string p1, "onCancelDownload(%d)"
(( e.f.a.d.a.e.a ) v0 ).c ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void a ( Integer p0, android.os.Bundle p1 ) {
/* .locals 2 */
p2 = this.b;
e.f.a.d.a.b.q .b ( p2 );
(( e.f.a.d.a.e.k ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p1 );
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, v0, v1 */
final String p1 = "onStartDownload(%d)"; // const-string p1, "onStartDownload(%d)"
(( e.f.a.d.a.e.a ) p2 ).c ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void a ( android.os.Bundle p0 ) {
/* .locals 4 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "module_name"; // const-string v2, "module_name"
(( android.os.Bundle ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
final String v2 = "slice_id"; // const-string v2, "slice_id"
(( android.os.Bundle ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
int v3 = 1; // const/4 v3, 0x1
/* aput-object v2, v1, v3 */
final String v2 = "chunk_number"; // const-string v2, "chunk_number"
v2 = (( android.os.Bundle ) p1 ).getInt ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v2 );
int v3 = 2; // const/4 v3, 0x2
/* aput-object v2, v1, v3 */
final String v2 = "session_id"; // const-string v2, "session_id"
p1 = (( android.os.Bundle ) p1 ).getInt ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( p1 );
int v2 = 3; // const/4 v2, 0x3
/* aput-object p1, v1, v2 */
final String p1 = "onNotifyChunkTransferred(%s, %s, %d, session=%d)"; // const-string p1, "onNotifyChunkTransferred(%s, %s, %d, session=%d)"
(( e.f.a.d.a.e.a ) v0 ).c ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void a ( android.os.Bundle p0, android.os.Bundle p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
p1 = this.b;
e.f.a.d.a.b.q .b ( p1 );
(( e.f.a.d.a.e.k ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int p2 = 0; // const/4 p2, 0x0
/* new-array p2, p2, [Ljava/lang/Object; */
final String v0 = "onGetChunkFileDescriptor"; // const-string v0, "onGetChunkFileDescriptor"
(( e.f.a.d.a.e.a ) p1 ).c ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void a ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/os/Bundle;", */
/* ">;)V" */
/* } */
} // .end annotation
p1 = this.b;
e.f.a.d.a.b.q .b ( p1 );
(( e.f.a.d.a.e.k ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "onGetSessionStates"; // const-string v1, "onGetSessionStates"
(( e.f.a.d.a.e.a ) p1 ).c ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 3 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
final String p1 = "onGetSession(%d)"; // const-string p1, "onGetSession(%d)"
(( e.f.a.d.a.e.a ) v0 ).c ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void b ( android.os.Bundle p0 ) {
/* .locals 3 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "session_id"; // const-string v2, "session_id"
p1 = (( android.os.Bundle ) p1 ).getInt ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( p1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
final String p1 = "onNotifySessionFailed(%d)"; // const-string p1, "onNotifySessionFailed(%d)"
(( e.f.a.d.a.e.a ) v0 ).c ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void c ( android.os.Bundle p0 ) {
/* .locals 4 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
final String v0 = "error_code"; // const-string v0, "error_code"
p1 = (( android.os.Bundle ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
e.f.a.d.a.b.q .c ( );
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p1 );
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
final String v2 = "onError(%d)"; // const-string v2, "onError(%d)"
(( e.f.a.d.a.e.a ) v0 ).b ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
v0 = this.a;
/* new-instance v1, Lcom/google/android/play/core/assetpacks/AssetPackException; */
/* invoke-direct {v1, p1}, Lcom/google/android/play/core/assetpacks/AssetPackException;-><init>(I)V */
(( e.f.a.d.a.i.o ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V
return;
} // .end method
public void c ( android.os.Bundle p0, android.os.Bundle p1 ) {
/* .locals 1 */
p1 = this.b;
e.f.a.d.a.b.q .b ( p1 );
(( e.f.a.d.a.e.k ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int p2 = 0; // const/4 p2, 0x0
/* new-array p2, p2, [Ljava/lang/Object; */
final String v0 = "onRequestDownloadInfo()"; // const-string v0, "onRequestDownloadInfo()"
(( e.f.a.d.a.e.a ) p1 ).c ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void d ( ) {
/* .locals 3 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "onCancelDownloads()"; // const-string v2, "onCancelDownloads()"
(( e.f.a.d.a.e.a ) v0 ).c ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void d ( android.os.Bundle p0, android.os.Bundle p1 ) {
/* .locals 2 */
p2 = this.b;
e.f.a.d.a.b.q .c ( p2 );
(( e.f.a.d.a.e.k ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "keep_alive"; // const-string v1, "keep_alive"
p1 = (( android.os.Bundle ) p1 ).getBoolean ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
java.lang.Boolean .valueOf ( p1 );
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, v0, v1 */
final String p1 = "onKeepAlive(%b)"; // const-string p1, "onKeepAlive(%b)"
(( e.f.a.d.a.e.a ) p2 ).c ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public void f ( android.os.Bundle p0 ) {
/* .locals 4 */
v0 = this.b;
e.f.a.d.a.b.q .b ( v0 );
(( e.f.a.d.a.e.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V
e.f.a.d.a.b.q .c ( );
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "module_name"; // const-string v2, "module_name"
(( android.os.Bundle ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
final String v2 = "session_id"; // const-string v2, "session_id"
p1 = (( android.os.Bundle ) p1 ).getInt ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( p1 );
int v2 = 1; // const/4 v2, 0x1
/* aput-object p1, v1, v2 */
final String p1 = "onNotifyModuleCompleted(%s, sessionId=%d)"; // const-string p1, "onNotifyModuleCompleted(%s, sessionId=%d)"
(( e.f.a.d.a.e.a ) v0 ).c ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
