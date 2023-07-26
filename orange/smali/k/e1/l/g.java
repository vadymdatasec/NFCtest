public class k.e1.l.g implements java.lang.reflect.InvocationHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean b;
public java.lang.String c;
/* # direct methods */
public k.e1.l.g ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public java.lang.Object invoke ( java.lang.Object p0, java.lang.reflect.Method p1, java.lang.Object[] p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .line 1 */
(( java.lang.reflect.Method ) p2 ).getName ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
/* .line 2 */
(( java.lang.reflect.Method ) p2 ).getReturnType ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
/* if-nez p3, :cond_0 */
/* .line 3 */
p3 = k.e1.e.b;
} // :cond_0
final String v1 = "supports"; // const-string v1, "supports"
/* .line 4 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = java.lang.Boolean.TYPE;
/* if-ne v1, v0, :cond_1 */
/* .line 5 */
java.lang.Boolean .valueOf ( v2 );
} // :cond_1
final String v1 = "unsupported"; // const-string v1, "unsupported"
/* .line 6 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v3 = 0; // const/4 v3, 0x0
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = java.lang.Void.TYPE;
/* if-ne v1, v0, :cond_2 */
/* .line 7 */
/* iput-boolean v2, p0, Lk/e1/l/g;->b:Z */
} // :cond_2
final String v1 = "protocols"; // const-string v1, "protocols"
/* .line 8 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* array-length v1, p3 */
/* if-nez v1, :cond_3 */
/* .line 9 */
p1 = this.a;
} // :cond_3
final String v1 = "selectProtocol"; // const-string v1, "selectProtocol"
/* .line 10 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v4 = 0; // const/4 v4, 0x0
/* if-nez v1, :cond_4 */
final String v1 = "select"; // const-string v1, "select"
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
} // :cond_4
/* const-class v1, Ljava/lang/String; */
/* if-ne v1, v0, :cond_7 */
/* array-length v0, p3 */
/* if-ne v0, v2, :cond_7 */
/* aget-object v0, p3, v4 */
/* instance-of v0, v0, Ljava/util/List; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 11 */
/* aget-object p1, p3, v4 */
/* check-cast p1, Ljava/util/List; */
p2 = /* .line 12 */
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
/* if-ge p3, p2, :cond_6 */
/* .line 13 */
v0 = v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 14 */
/* check-cast p1, Ljava/lang/String; */
this.c = p1;
} // :cond_5
/* add-int/lit8 p3, p3, 0x1 */
/* .line 15 */
} // :cond_6
p1 = this.a;
/* check-cast p1, Ljava/lang/String; */
this.c = p1;
} // :cond_7
final String v0 = "protocolSelected"; // const-string v0, "protocolSelected"
/* .line 16 */
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_8 */
final String v0 = "selected"; // const-string v0, "selected"
p1 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_9
} // :cond_8
/* array-length p1, p3 */
/* if-ne p1, v2, :cond_9 */
/* .line 17 */
/* aget-object p1, p3, v4 */
/* check-cast p1, Ljava/lang/String; */
this.c = p1;
/* .line 18 */
} // :cond_9
(( java.lang.reflect.Method ) p2 ).invoke ( p0, p3 ); // invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
