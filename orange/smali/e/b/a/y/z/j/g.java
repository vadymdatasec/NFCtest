public class e.b.a.y.z.j.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/b/a/y/z/j/f<", */
	 /* "**>;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.z.j.g ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public synchronized e.b.a.y.z.j.e a ( java.lang.Class p0, java.lang.Class p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Z:", */
/* "Ljava/lang/Object;", */
/* "R:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TZ;>;", */
/* "Ljava/lang/Class<", */
/* "TR;>;)", */
/* "Le/b/a/y/z/j/e<", */
/* "TZ;TR;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
v0 = (( java.lang.Class ) p2 ).isAssignableFrom ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 4 */
	 e.b.a.y.z.j.h .a ( );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* .line 5 */
} // :cond_0
try { // :try_start_1
	 v0 = this.a;
v1 = } // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* check-cast v1, Le/b/a/y/z/j/f; */
	 /* .line 6 */
	 v2 = 	 (( e.b.a.y.z.j.f ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Le/b/a/y/z/j/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 7 */
		 p1 = this.c;
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* monitor-exit p0 */
		 /* .line 8 */
	 } // :cond_2
	 try { // :try_start_2
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "No transcoder registered to transcode from "; // const-string v2, "No transcoder registered to transcode from "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String p1 = " to "; // const-string p1, " to "
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* throw p1 */
	 } // .end method
	 public synchronized void a ( java.lang.Class p0, java.lang.Class p1, Object p2 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<Z:", */
		 /* "Ljava/lang/Object;", */
		 /* "R:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Ljava/lang/Class<", */
		 /* "TZ;>;", */
		 /* "Ljava/lang/Class<", */
		 /* "TR;>;", */
		 /* "Le/b/a/y/z/j/e<", */
		 /* "TZ;TR;>;)V" */
		 /* } */
	 } // .end annotation
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
		 /* new-instance v1, Le/b/a/y/z/j/f; */
		 /* invoke-direct {v1, p1, p2, p3}, Le/b/a/y/z/j/f;-><init>(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)V */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 2 */
		 /* monitor-exit p0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* throw p1 */
	 } // .end method
	 public synchronized java.util.List b ( java.lang.Class p0, java.lang.Class p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<Z:", */
		 /* "Ljava/lang/Object;", */
		 /* "R:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Ljava/lang/Class<", */
		 /* "TZ;>;", */
		 /* "Ljava/lang/Class<", */
		 /* "TR;>;)", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/Class<", */
		 /* "TR;>;>;" */
		 /* } */
	 } // .end annotation
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* .line 2 */
		 v1 = 		 (( java.lang.Class ) p2 ).isAssignableFrom ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 3 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 4 */
			 /* monitor-exit p0 */
			 /* .line 5 */
		 } // :cond_0
		 try { // :try_start_1
			 v1 = this.a;
		 } // :cond_1
	 v2 = 	 } // :goto_0
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 /* check-cast v2, Le/b/a/y/z/j/f; */
		 /* .line 6 */
		 v3 = 		 (( e.b.a.y.z.j.f ) v2 ).a ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Le/b/a/y/z/j/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Z
		 if ( v3 != null) { // if-eqz v3, :cond_1
			 v3 = this.b;
			 v3 = 			 /* .line 7 */
			 /* if-nez v3, :cond_1 */
			 /* .line 8 */
			 v2 = this.b;
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 9 */
		 } // :cond_2
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* throw p1 */
	 } // .end method
