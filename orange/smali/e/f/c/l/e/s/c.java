public class e.f.c.l.e.s.c extends java.io.FileOutputStream {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.io.FilenameFilter e;
	 /* # instance fields */
	 public final java.lang.String b;
	 public java.io.File c;
	 public Boolean d;
	 /* # direct methods */
	 public static e.f.c.l.e.s.c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/c/l/e/s/b; */
		 /* invoke-direct {v0}, Le/f/c/l/e/s/b;-><init>()V */
		 return;
	 } // .end method
	 public e.f.c.l.e.s.c ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/FileNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Ljava/io/File; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = ".cls_temp"; // const-string v2, ".cls_temp"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 /* invoke-direct {p0, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput-boolean v0, p0, Le/f/c/l/e/s/c;->d:Z */
	 /* .line 3 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 p1 = java.io.File.separator;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 this.b = p1;
	 /* .line 4 */
	 /* new-instance p1, Ljava/io/File; */
	 /* new-instance p2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
	 v0 = this.b;
	 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 this.c = p1;
	 return;
} // .end method
/* # virtual methods */
public void c ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Le/f/c/l/e/s/c;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Le/f/c/l/e/s/c;->d:Z */
/* .line 3 */
/* invoke-super {p0}, Ljava/io/FileOutputStream;->flush()V */
/* .line 4 */
/* invoke-super {p0}, Ljava/io/FileOutputStream;->close()V */
return;
} // .end method
public synchronized void close ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/f/c/l/e/s/c;->d:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 /* monitor-exit p0 */
	 return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
try { // :try_start_1
	 /* iput-boolean v0, p0, Le/f/c/l/e/s/c;->d:Z */
	 /* .line 4 */
	 /* invoke-super {p0}, Ljava/io/FileOutputStream;->flush()V */
	 /* .line 5 */
	 /* invoke-super {p0}, Ljava/io/FileOutputStream;->close()V */
	 /* .line 6 */
	 /* new-instance v0, Ljava/io/File; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 v2 = this.b;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = ".cls"; // const-string v2, ".cls"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 /* .line 7 */
	 v1 = this.c;
	 v1 = 	 (( java.io.File ) v1 ).renameTo ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 8 */
		 this.c = v0;
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* .line 9 */
		 /* monitor-exit p0 */
		 return;
	 } // :cond_1
	 try { // :try_start_2
		 final String v1 = ""; // const-string v1, ""
		 /* .line 10 */
		 v2 = 		 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
		 /* if-nez v2, :cond_2 */
		 /* .line 11 */
		 v2 = this.c;
		 v2 = 		 (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
		 /* if-nez v2, :cond_3 */
		 final String v1 = " (source does not exist)"; // const-string v1, " (source does not exist)"
	 } // :cond_2
	 final String v1 = " (target already exists)"; // const-string v1, " (target already exists)"
	 /* .line 12 */
} // :cond_3
} // :goto_0
/* new-instance v2, Ljava/io/IOException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Could not rename temp file: "; // const-string v4, "Could not rename temp file: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.c;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v4 = " -> "; // const-string v4, " -> "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
