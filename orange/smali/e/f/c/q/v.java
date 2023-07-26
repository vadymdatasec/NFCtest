public class e.f.c.q.v {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/f/c/q/v$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.concurrent.Executor a;
public final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Landroid/util/Pair<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/q/p;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.q.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final e.f.a.b.h.g a ( android.util.Pair p0, Object p1 ) { //synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 12 */
/* monitor-enter p0 */
/* .line 13 */
try { // :try_start_0
v0 = this.b;
/* .line 14 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public synchronized e.f.a.b.h.g a ( java.lang.String p0, java.lang.String p1, e.f.c.q.v$a p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Le/f/c/q/v$a;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/q/p;", */
/* ">;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Landroid/util/Pair; */
/* invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V */
/* .line 2 */
p1 = this.b;
/* check-cast p1, Le/f/a/b/h/g; */
int p2 = 3; // const/4 p2, 0x3
if ( p1 != null) { // if-eqz p1, :cond_1
final String p3 = "FirebaseInstanceId"; // const-string p3, "FirebaseInstanceId"
/* .line 3 */
p2 = android.util.Log .isLoggable ( p3,p2 );
if ( p2 != null) { // if-eqz p2, :cond_0
	 final String p2 = "FirebaseInstanceId"; // const-string p2, "FirebaseInstanceId"
	 /* .line 4 */
	 java.lang.String .valueOf ( v0 );
	 java.lang.String .valueOf ( p3 );
	 v0 = 	 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v0, v0, 0x1d */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
	 final String v0 = "Joining ongoing request for: "; // const-string v0, "Joining ongoing request for: "
	 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( p2,p3 );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 5 */
} // :cond_0
/* monitor-exit p0 */
} // :cond_1
try { // :try_start_1
final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
/* .line 6 */
p1 = android.util.Log .isLoggable ( p1,p2 );
if ( p1 != null) { // if-eqz p1, :cond_2
	 final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
	 /* .line 7 */
	 java.lang.String .valueOf ( v0 );
	 java.lang.String .valueOf ( p2 );
	 v1 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v1, v1, 0x18 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
	 final String v1 = "Making new request for: "; // const-string v1, "Making new request for: "
	 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( p1,p2 );
	 /* .line 8 */
} // :cond_2
p2 = this.a;
/* new-instance p3, Le/f/c/q/u; */
/* invoke-direct {p3, p0, v0}, Le/f/c/q/u;-><init>(Le/f/c/q/v;Landroid/util/Pair;)V */
/* .line 9 */
(( e.f.a.b.h.g ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 10 */
p2 = this.b;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 11 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
