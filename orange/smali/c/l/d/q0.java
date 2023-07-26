public abstract class c.l.d.q0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c.e.i a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/i<", */
	 /* "Ljava/lang/ClassLoader;", */
	 /* "Lc/e/i<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;>;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.l.d.q0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
return;
} // .end method
public c.l.d.q0 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static Boolean b ( java.lang.ClassLoader p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 1 */
try { // :try_start_0
	 c.l.d.q0 .c ( p0,p1 );
	 /* .line 2 */
	 /* const-class p1, Landroidx/fragment/app/Fragment; */
	 p0 = 	 (( java.lang.Class ) p1 ).isAssignableFrom ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
	 /* :try_end_0 */
	 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Class c ( java.lang.ClassLoader p0, java.lang.String p1 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/ClassLoader;", */
	 /* "Ljava/lang/String;", */
	 /* ")", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = c.l.d.q0.a;
(( c.e.i ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/e/i; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
/* .line 3 */
v1 = c.l.d.q0.a;
(( c.e.i ) v1 ).put ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 4 */
} // :cond_0
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Class; */
/* if-nez v1, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
java.lang.Class .forName ( p1,v1,p0 );
/* .line 6 */
(( c.e.i ) v0 ).put ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
} // .end method
public static java.lang.Class d ( java.lang.ClassLoader p0, java.lang.String p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/ClassLoader;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/lang/Class<", */
/* "+", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "Unable to instantiate fragment "; // const-string v0, "Unable to instantiate fragment "
/* .line 1 */
try { // :try_start_0
c.l.d.q0 .c ( p0,p1 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 2 */
/* new-instance v1, Landroidx/fragment/app/Fragment$InstantiationException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": make sure class is a valid subclass of Fragment"; // const-string p1, ": make sure class is a valid subclass of Fragment"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, p0}, Landroidx/fragment/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v1 */
/* :catch_1 */
/* move-exception p0 */
/* .line 3 */
/* new-instance v1, Landroidx/fragment/app/Fragment$InstantiationException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": make sure class name exists"; // const-string p1, ": make sure class name exists"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, p0}, Landroidx/fragment/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v1 */
} // .end method
/* # virtual methods */
public abstract androidx.fragment.app.Fragment a ( java.lang.ClassLoader p0, java.lang.String p1 ) {
} // .end method
