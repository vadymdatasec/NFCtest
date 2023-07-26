public class e.f.c.l.e.n.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.c.l.e.n.d d;
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.c.l.e.n.c b;
	 public e.f.c.l.e.n.a c;
	 /* # direct methods */
	 public static e.f.c.l.e.n.e ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/c/l/e/n/d; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Le/f/c/l/e/n/d;-><init>(Le/f/c/l/e/n/b;)V */
		 return;
	 } // .end method
	 public e.f.c.l.e.n.e ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Le/f/c/l/e/n/e;-><init>(Landroid/content/Context;Le/f/c/l/e/n/c;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public e.f.c.l.e.n.e ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 this.b = p2;
		 /* .line 5 */
		 p1 = e.f.c.l.e.n.e.d;
		 this.c = p1;
		 /* .line 6 */
		 (( e.f.c.l.e.n.e ) p0 ).b ( p3 ); // invoke-virtual {p0, p3}, Le/f/c/l/e/n/e;->b(Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.io.File a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 7 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "crashlytics-userlog-"; // const-string v1, "crashlytics-userlog-"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String p1 = ".temp"; // const-string p1, ".temp"
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 8 */
		 /* new-instance v0, Ljava/io/File; */
		 v1 = this.b;
		 /* invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 } // .end method
	 public final java.lang.String a ( java.io.File p0 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 (( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v0 = ".temp"; // const-string v0, ".temp"
		 /* .line 10 */
		 v0 = 		 (( java.lang.String ) p1 ).lastIndexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne v0, v1, :cond_0 */
	 } // :cond_0
	 /* const/16 v1, 0x14 */
	 /* .line 11 */
	 (( java.lang.String ) p1 ).substring ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public void a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 return;
} // .end method
public void a ( java.io.File p0, Integer p1 ) {
	 /* .locals 1 */
	 /* .line 6 */
	 /* new-instance v0, Le/f/c/l/e/n/m; */
	 /* invoke-direct {v0, p1, p2}, Le/f/c/l/e/n/m;-><init>(Ljava/io/File;I)V */
	 this.c = v0;
	 return;
} // .end method
public void a ( java.util.Set p0 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/Set<", */
	 /* "Ljava/lang/String;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
(( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 /* array-length v1, v0 */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 4 */
v4 = (( e.f.c.l.e.n.e ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/f/c/l/e/n/e;->a(Ljava/io/File;)Ljava/lang/String;
/* if-nez v4, :cond_0 */
/* .line 5 */
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
/* .line 2 */
v0 = e.f.c.l.e.n.e.d;
this.c = v0;
/* if-nez p1, :cond_0 */
return;
/* .line 3 */
} // :cond_0
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
final String v2 = "com.crashlytics.CollectCustomLogs"; // const-string v2, "com.crashlytics.CollectCustomLogs"
/* .line 4 */
v0 = e.f.c.l.e.m.j .a ( v0,v2,v1 );
/* if-nez v0, :cond_1 */
/* .line 5 */
e.f.c.l.e.b .a ( );
final String v0 = "Preferences requested no custom logs.Aborting log file creation."; // const-string v0, "Preferences requested no custom logs.Aborting log file creation."
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
/* .line 6 */
} // :cond_1
(( e.f.c.l.e.n.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/n/e;->a(Ljava/lang/String;)Ljava/io/File;
/* const/high16 v0, 0x10000 */
(( e.f.c.l.e.n.e ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/n/e;->a(Ljava/io/File;I)V
return;
} // .end method
public b ( ) {
/* .locals 1 */
/* .line 7 */
v0 = this.c;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
