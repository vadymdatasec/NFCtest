public abstract class c.n.m {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/reflect/Constructor<", */
/* "+", */
/* "Lc/n/d;", */
/* ">;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.n.m ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public static c.n.d a ( java.lang.reflect.Constructor p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Constructor<", */
/* "+", */
/* "Lc/n/d;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Lc/n/d;" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, v0, v1 */
/* .line 16 */
(( java.lang.reflect.Constructor ) p0 ).newInstance ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Lc/n/d; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 17 */
/* new-instance p1, Ljava/lang/RuntimeException; */
/* invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p1 */
/* :catch_1 */
/* move-exception p0 */
/* .line 18 */
/* new-instance p1, Ljava/lang/RuntimeException; */
/* invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p1 */
/* :catch_2 */
/* move-exception p0 */
/* .line 19 */
/* new-instance p1, Ljava/lang/RuntimeException; */
/* invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p1 */
} // .end method
public static c.n.h a ( java.lang.Object p0 ) {
/* .locals 4 */
/* .line 1 */
/* instance-of v0, p0, Lc/n/h; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p0, Lc/n/h; */
/* .line 3 */
} // :cond_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 4 */
v1 = c.n.m .b ( v0 );
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_3 */
/* .line 5 */
v1 = c.n.m.b;
/* .line 6 */
/* check-cast v0, Ljava/util/List; */
v1 = /* .line 7 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-ne v1, v3, :cond_1 */
/* .line 8 */
/* check-cast v0, Ljava/lang/reflect/Constructor; */
/* .line 9 */
c.n.m .a ( v0,p0 );
/* .line 10 */
/* new-instance v0, Landroidx/lifecycle/SingleGeneratedAdapterObserver; */
/* invoke-direct {v0, p0}, Landroidx/lifecycle/SingleGeneratedAdapterObserver;-><init>(Lc/n/d;)V */
/* .line 11 */
v1 = } // :cond_1
/* new-array v1, v1, [Lc/n/d; */
/* .line 12 */
v3 = } // :goto_0
/* if-ge v2, v3, :cond_2 */
/* .line 13 */
/* check-cast v3, Ljava/lang/reflect/Constructor; */
c.n.m .a ( v3,p0 );
/* aput-object v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 14 */
} // :cond_2
/* new-instance p0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver; */
/* invoke-direct {p0, v1}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Lc/n/d;)V */
/* .line 15 */
} // :cond_3
/* new-instance v0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver; */
/* invoke-direct {v0, p0}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Ljava/lang/Object;)V */
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 32 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "."; // const-string v1, "."
final String v2 = "_"; // const-string v2, "_"
(( java.lang.String ) p0 ).replace ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "_LifecycleAdapter"; // const-string p0, "_LifecycleAdapter"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.reflect.Constructor a ( java.lang.Class p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Constructor<", */
/* "+", */
/* "Lc/n/d;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 20 */
try { // :try_start_0
(( java.lang.Class ) p0 ).getPackage ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
/* .line 21 */
(( java.lang.Class ) p0 ).getCanonicalName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
(( java.lang.Package ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;
} // :cond_0
final String v0 = ""; // const-string v0, ""
/* .line 23 */
} // :goto_0
v2 = (( java.lang.String ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 24 */
} // :cond_1
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/2addr v2, v3 */
(( java.lang.String ) v1 ).substring ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 25 */
} // :goto_1
c.n.m .a ( v1 );
/* .line 26 */
v2 = (( java.lang.String ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_2
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "."; // const-string v0, "."
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 27 */
} // :goto_2
java.lang.Class .forName ( v1 );
/* new-array v1, v3, [Ljava/lang/Class; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p0, v1, v2 */
/* .line 28 */
(( java.lang.Class ) v0 ).getDeclaredConstructor ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* .line 29 */
v0 = (( java.lang.reflect.Constructor ) p0 ).isAccessible ( ); // invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->isAccessible()Z
/* if-nez v0, :cond_3 */
/* .line 30 */
(( java.lang.reflect.Constructor ) p0 ).setAccessible ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_3
/* :catch_0 */
/* move-exception p0 */
/* .line 31 */
/* new-instance v0, Ljava/lang/RuntimeException; */
/* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_1 */
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer b ( java.lang.Class p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)I" */
/* } */
} // .end annotation
/* .line 1 */
v0 = c.n.m.a;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 3 */
} // :cond_0
v0 = c.n.m .d ( p0 );
/* .line 4 */
v1 = c.n.m.a;
java.lang.Integer .valueOf ( v0 );
} // .end method
public static Boolean c ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)Z" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
/* const-class v0, Lc/n/i; */
p0 = (( java.lang.Class ) v0 ).isAssignableFrom ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Integer d ( java.lang.Class p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)I" */
/* } */
} // .end annotation
/* .line 1 */
(( java.lang.Class ) p0 ).getCanonicalName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
c.n.m .a ( p0 );
int v2 = 2; // const/4 v2, 0x2
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v1 = c.n.m.b;
/* .line 4 */
java.util.Collections .singletonList ( v0 );
/* .line 5 */
/* .line 6 */
} // :cond_1
v0 = c.n.a.c;
v0 = (( c.n.a ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lc/n/a;->c(Ljava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
} // :cond_2
(( java.lang.Class ) p0 ).getSuperclass ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
int v3 = 0; // const/4 v3, 0x0
/* .line 8 */
v4 = c.n.m .c ( v0 );
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 9 */
v3 = c.n.m .b ( v0 );
/* if-ne v3, v1, :cond_3 */
/* .line 10 */
} // :cond_3
/* new-instance v3, Ljava/util/ArrayList; */
v4 = c.n.m.b;
/* check-cast v0, Ljava/util/Collection; */
/* invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 11 */
} // :cond_4
(( java.lang.Class ) p0 ).getInterfaces ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;
/* array-length v4, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v4, :cond_8 */
/* aget-object v6, v0, v5 */
/* .line 12 */
v7 = c.n.m .c ( v6 );
/* if-nez v7, :cond_5 */
/* .line 13 */
} // :cond_5
v7 = c.n.m .b ( v6 );
/* if-ne v7, v1, :cond_6 */
} // :cond_6
/* if-nez v3, :cond_7 */
/* .line 14 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* .line 15 */
} // :cond_7
v7 = c.n.m.b;
/* check-cast v6, Ljava/util/Collection; */
} // :goto_1
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_8
if ( v3 != null) { // if-eqz v3, :cond_9
/* .line 16 */
v0 = c.n.m.b;
} // :cond_9
} // .end method
