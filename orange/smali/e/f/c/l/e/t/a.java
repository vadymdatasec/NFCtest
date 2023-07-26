public class e.f.c.l.e.t.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.c.l.e.t.d a;
	 /* # direct methods */
	 public e.f.c.l.e.t.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 return;
	 } // .end method
	 public void a ( java.util.List p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Le/f/c/l/e/t/g/d;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* .line 6 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* check-cast v0, Le/f/c/l/e/t/g/d; */
	 /* .line 7 */
	 (( e.f.c.l.e.t.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/t/a;->a(Le/f/c/l/e/t/g/d;)V
} // :cond_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
/* .line 2 */
v1 = this.a;
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 /* array-length v0, v0 */
	 /* if-lez v0, :cond_0 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 4 */
	 /* array-length v0, v1 */
	 /* if-lez v0, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.util.List b ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/t/g/d;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.b .a ( );
final String v1 = "Checking for crash reports..."; // const-string v1, "Checking for crash reports..."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 2 */
v0 = this.a;
/* .line 3 */
v1 = this.a;
/* .line 4 */
/* new-instance v2, Ljava/util/LinkedList; */
/* invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* array-length v4, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v4, :cond_0 */
/* aget-object v6, v0, v5 */
/* .line 6 */
e.f.c.l.e.b .a ( );
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "Found crash report "; // const-string v9, "Found crash report "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v6 ).getPath ( ); // invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v7 ).a ( v8 ); // invoke-virtual {v7, v8}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 7 */
/* new-instance v7, Le/f/c/l/e/t/g/e; */
/* invoke-direct {v7, v6}, Le/f/c/l/e/t/g/e;-><init>(Ljava/io/File;)V */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
/* array-length v0, v1 */
} // :goto_1
/* if-ge v3, v0, :cond_1 */
/* aget-object v4, v1, v3 */
/* .line 9 */
/* new-instance v5, Le/f/c/l/e/t/g/b; */
/* invoke-direct {v5, v4}, Le/f/c/l/e/t/g/b;-><init>(Ljava/io/File;)V */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 10 */
v0 = } // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 11 */
e.f.c.l.e.b .a ( );
final String v1 = "No reports found."; // const-string v1, "No reports found."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
} // :cond_2
} // .end method
