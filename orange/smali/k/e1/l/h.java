public class k.e1.l.h extends k.e1.l.j {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.reflect.Method c;
	 public final java.lang.reflect.Method d;
	 public final java.lang.reflect.Method e;
	 public final java.lang.Class f;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public final java.lang.Class g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public k.e1.l.h ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Method;", */
/* "Ljava/lang/reflect/Method;", */
/* "Ljava/lang/reflect/Method;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Lk/e1/l/j;-><init>()V */
/* .line 2 */
this.c = p1;
/* .line 3 */
this.d = p2;
/* .line 4 */
this.e = p3;
/* .line 5 */
this.f = p4;
/* .line 6 */
this.g = p5;
return;
} // .end method
public static k.e1.l.j e ( ) {
/* .locals 10 */
try { // :try_start_0
final String v0 = "org.eclipse.jetty.alpn.ALPN"; // const-string v0, "org.eclipse.jetty.alpn.ALPN"
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
final String v1 = "org.eclipse.jetty.alpn.ALPN"; // const-string v1, "org.eclipse.jetty.alpn.ALPN"
/* .line 1 */
try { // :try_start_1
java.lang.Class .forName ( v1 );
/* .line 2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "$Provider"; // const-string v3, "$Provider"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.lang.Class .forName ( v2 );
/* .line 3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "$ClientProvider"; // const-string v4, "$ClientProvider"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.lang.Class .forName ( v3 );
/* .line 4 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "$ServerProvider"; // const-string v0, "$ServerProvider"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.lang.Class .forName ( v0 );
final String v0 = "put"; // const-string v0, "put"
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/Class; */
/* .line 5 */
/* const-class v4, Ljavax/net/ssl/SSLSocket; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v4, v3, v5 */
int v4 = 1; // const/4 v4, 0x1
/* aput-object v2, v3, v4 */
(( java.lang.Class ) v1 ).getMethod ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
final String v2 = "get"; // const-string v2, "get"
/* new-array v3, v4, [Ljava/lang/Class; */
/* .line 6 */
/* const-class v6, Ljavax/net/ssl/SSLSocket; */
/* aput-object v6, v3, v5 */
(( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
final String v2 = "remove"; // const-string v2, "remove"
/* new-array v3, v4, [Ljava/lang/Class; */
/* .line 7 */
/* const-class v4, Ljavax/net/ssl/SSLSocket; */
/* aput-object v4, v3, v5 */
(( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 8 */
/* new-instance v1, Lk/e1/l/h; */
/* move-object v4, v1 */
/* move-object v5, v0 */
/* invoke-direct/range {v4 ..v9}, Lk/e1/l/h;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V */
/* :try_end_1 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public void a ( javax.net.ssl.SSLSocket p0 ) {
/* .locals 4 */
/* .line 5 */
try { // :try_start_0
v0 = this.e;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
} // :goto_0
final String v0 = "unable to remove alpn"; // const-string v0, "unable to remove alpn"
/* .line 6 */
k.e1.e .a ( v0,p1 );
/* throw p1 */
} // .end method
public void a ( javax.net.ssl.SSLSocket p0, java.lang.String p1, java.util.List p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljavax/net/ssl/SSLSocket;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List<", */
/* "Lk/p0;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
k.e1.l.j .a ( p3 );
/* .line 2 */
try { // :try_start_0
/* const-class p3, Lk/e1/l/j; */
(( java.lang.Class ) p3 ).getClassLoader ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
int v0 = 2; // const/4 v0, 0x2
/* new-array v1, v0, [Ljava/lang/Class; */
v2 = this.f;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
v2 = this.g;
int v4 = 1; // const/4 v4, 0x1
/* aput-object v2, v1, v4 */
/* new-instance v2, Lk/e1/l/g; */
/* invoke-direct {v2, p2}, Lk/e1/l/g;-><init>(Ljava/util/List;)V */
java.lang.reflect.Proxy .newProxyInstance ( p3,v1,v2 );
/* .line 3 */
p3 = this.c;
int v1 = 0; // const/4 v1, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
/* aput-object p1, v0, v3 */
/* aput-object p2, v0, v4 */
(( java.lang.reflect.Method ) p3 ).invoke ( v1, v0 ); // invoke-virtual {p3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
} // :goto_0
final String p2 = "unable to set alpn"; // const-string p2, "unable to set alpn"
/* .line 4 */
k.e1.e .a ( p2,p1 );
/* throw p1 */
} // .end method
public java.lang.String b ( javax.net.ssl.SSLSocket p0 ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
v0 = this.d;
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
(( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
java.lang.reflect.Proxy .getInvocationHandler ( v0 );
/* check-cast v0, Lk/e1/l/g; */
/* .line 3 */
/* iget-boolean v1, v0, Lk/e1/l/g;->b:Z */
/* if-nez v1, :cond_0 */
v1 = this.c;
/* if-nez v1, :cond_0 */
/* .line 4 */
k.e1.l.j .c ( );
int v1 = 4; // const/4 v1, 0x4
final String v2 = "ALPN callback dropped: HTTP/2 is disabled.Is alpn-boot on the boot class path?"; // const-string v2, "ALPN callback dropped: HTTP/2 is disabled.Is alpn-boot on the boot class path?"
(( k.e1.l.j ) v0 ).a ( v1, v2, p1 ); // invoke-virtual {v0, v1, v2, p1}, Lk/e1/l/j;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
/* .line 5 */
} // :cond_0
/* iget-boolean v1, v0, Lk/e1/l/g;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
p1 = this.c;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
} // :goto_1
final String v0 = "unable to get selected protocol"; // const-string v0, "unable to get selected protocol"
/* .line 6 */
k.e1.e .a ( v0,p1 );
/* throw p1 */
} // .end method
