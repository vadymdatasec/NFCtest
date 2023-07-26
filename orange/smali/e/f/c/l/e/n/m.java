public class e.f.c.l.e.n.m implements e.f.c.l.e.n.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.nio.charset.Charset c;
	 /* # instance fields */
	 public final java.io.File a;
	 public e.f.c.l.e.n.j b;
	 /* # direct methods */
	 public static e.f.c.l.e.n.m ( ) {
		 /* .locals 1 */
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 /* .line 1 */
		 java.nio.charset.Charset .forName ( v0 );
		 return;
	 } // .end method
	 public e.f.c.l.e.n.m ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 final String v1 = "There was a problem closing the Crashlytics log file."; // const-string v1, "There was a problem closing the Crashlytics log file."
		 e.f.c.l.e.m.j .a ( v0,v1 );
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.b = v0;
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( e.f.c.l.e.n.m ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/n/m;->a()V
		 /* .line 2 */
		 v0 = this.a;
		 (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
		 return;
	 } // .end method
	 public java.lang.String c ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( e.f.c.l.e.n.m ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/l/e/n/m;->d()[B
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* new-instance v1, Ljava/lang/String; */
			 v2 = e.f.c.l.e.n.m.c;
			 /* invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
} // .end method
public d ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 (( e.f.c.l.e.n.m ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/n/m;->e()Le/f/c/l/e/n/l;
	 /* if-nez v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
} // :cond_0
/* iget v1, v0, Le/f/c/l/e/n/l;->b:I */
/* new-array v2, v1, [B */
/* .line 3 */
v0 = this.a;
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
public final e.f.c.l.e.n.l e ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.a;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( e.f.c.l.e.n.m ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/l/e/n/m;->f()V
/* .line 3 */
v0 = this.b;
/* if-nez v0, :cond_1 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v1, v2 */
/* .line 4 */
v0 = (( e.f.c.l.e.n.j ) v0 ).l ( ); // invoke-virtual {v0}, Le/f/c/l/e/n/j;->l()I
/* new-array v0, v0, [B */
/* .line 5 */
try { // :try_start_0
v3 = this.b;
/* new-instance v4, Le/f/c/l/e/n/k; */
/* invoke-direct {v4, p0, v0, v1}, Le/f/c/l/e/n/k;-><init>(Le/f/c/l/e/n/m;[B[I)V */
(( e.f.c.l.e.n.j ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/l/e/n/j;->a(Le/f/c/l/e/n/i;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
/* .line 6 */
e.f.c.l.e.b .a ( );
final String v5 = "A problem occurred while reading the Crashlytics log file."; // const-string v5, "A problem occurred while reading the Crashlytics log file."
(( e.f.c.l.e.b ) v4 ).b ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 7 */
} // :goto_0
/* new-instance v3, Le/f/c/l/e/n/l; */
/* aget v1, v1, v2 */
/* invoke-direct {v3, p0, v0, v1}, Le/f/c/l/e/n/l;-><init>(Le/f/c/l/e/n/m;[BI)V */
} // .end method
public final void f ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 2 */
try { // :try_start_0
/* new-instance v0, Le/f/c/l/e/n/j; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/f/c/l/e/n/j;-><init>(Ljava/io/File;)V */
this.b = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Could not open log file: "; // const-string v3, "Could not open log file: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.a;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).b ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_0
} // :goto_0
return;
} // .end method
