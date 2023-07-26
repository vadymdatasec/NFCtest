public abstract class androidx.versionedparcelable.VersionedParcel {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/versionedparcelable/VersionedParcel$ParcelException; */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.e.b a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Method;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final c.e.b b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Method;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final c.e.b c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public androidx.versionedparcelable.VersionedParcel ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Method;", */
/* ">;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Method;", */
/* ">;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
/* .line 4 */
this.c = p3;
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 3 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 4 */
} // :cond_0
p1 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->g()I
} // .end method
public android.os.Parcelable a ( android.os.Parcelable p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Landroid/os/Parcelable;", */
/* ">(TT;I)TT;" */
/* } */
} // .end annotation
/* .line 9 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 10 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->h()Landroid/os/Parcelable;
} // .end method
public c.x.b a ( Object p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Lc/x/b;", */
/* ">(TT;I)TT;" */
/* } */
} // .end annotation
/* .line 18 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 19 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->j()Lc/x/b;
} // .end method
public c.x.b a ( java.lang.String p0, androidx.versionedparcelable.VersionedParcel p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Lc/x/b;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "Landroidx/versionedparcelable/VersionedParcel;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .line 20 */
try { // :try_start_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/String;)Ljava/lang/reflect/Method;
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p2, v1, v2 */
/* .line 21 */
(( java.lang.reflect.Method ) p1 ).invoke ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/x/b; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 22 */
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered ClassNotFoundException"; // const-string v0, "VersionedParcel encountered ClassNotFoundException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p1 */
/* .line 23 */
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered NoSuchMethodException"; // const-string v0, "VersionedParcel encountered NoSuchMethodException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_2 */
/* move-exception p1 */
/* .line 24 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* instance-of p2, p2, Ljava/lang/RuntimeException; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 25 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* check-cast p1, Ljava/lang/RuntimeException; */
/* throw p1 */
/* .line 26 */
} // :cond_0
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered InvocationTargetException"; // const-string v0, "VersionedParcel encountered InvocationTargetException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_3 */
/* move-exception p1 */
/* .line 27 */
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered IllegalAccessException"; // const-string v0, "VersionedParcel encountered IllegalAccessException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
public java.lang.CharSequence a ( java.lang.CharSequence p0, Integer p1 ) {
/* .locals 0 */
/* .line 11 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 12 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->f()Ljava/lang/CharSequence;
} // .end method
public final java.lang.Class a ( java.lang.Class p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "+", */
/* "Lc/x/b;", */
/* ">;)", */
/* "Ljava/lang/Class;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
/* .line 41 */
v0 = this.c;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( c.e.i ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Class; */
/* if-nez v0, :cond_0 */
/* .line 42 */
(( java.lang.Class ) p1 ).getPackage ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
(( java.lang.Package ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object v0, v1, v2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 43 */
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
/* aput-object v3, v1, v0 */
final String v0 = "%s.%sParcelizer"; // const-string v0, "%s.%sParcelizer"
java.lang.String .format ( v0,v1 );
/* .line 44 */
(( java.lang.Class ) p1 ).getClassLoader ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
java.lang.Class .forName ( v0,v2,v1 );
/* .line 45 */
v1 = this.c;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // .end method
public java.lang.String a ( java.lang.String p0, Integer p1 ) {
/* .locals 0 */
/* .line 5 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 6 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->i()Ljava/lang/String;
} // .end method
public final java.lang.reflect.Method a ( java.lang.String p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalAccessException;, */
/* Ljava/lang/NoSuchMethodException;, */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
/* .line 36 */
/* const-class v0, Landroidx/versionedparcelable/VersionedParcel; */
v1 = this.a;
(( c.e.i ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/reflect/Method; */
/* if-nez v1, :cond_0 */
/* .line 37 */
java.lang.System .currentTimeMillis ( );
/* .line 38 */
(( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
int v2 = 1; // const/4 v2, 0x1
java.lang.Class .forName ( p1,v2,v1 );
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v0, v2, v3 */
final String v0 = "read"; // const-string v0, "read"
/* .line 39 */
(( java.lang.Class ) v1 ).getDeclaredMethod ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 40 */
v0 = this.a;
(( c.e.i ) v0 ).put ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // .end method
public abstract void a ( ) {
} // .end method
public abstract void a ( android.os.Parcelable p0 ) {
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/String;)V
return;
/* .line 14 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->b(Lc/x/b;)V
/* .line 15 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->b()Landroidx/versionedparcelable/VersionedParcel;
/* .line 16 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/versionedparcelable/VersionedParcel;->a(Lc/x/b;Landroidx/versionedparcelable/VersionedParcel;)V
/* .line 17 */
(( androidx.versionedparcelable.VersionedParcel ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/versionedparcelable/VersionedParcel;->a()V
return;
} // .end method
public void a ( Object p0, androidx.versionedparcelable.VersionedParcel p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Lc/x/b;", */
/* ">(TT;", */
/* "Landroidx/versionedparcelable/VersionedParcel;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 28 */
try { // :try_start_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
int p1 = 1; // const/4 p1, 0x1
/* aput-object p2, v2, p1 */
/* .line 29 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 30 */
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered ClassNotFoundException"; // const-string v0, "VersionedParcel encountered ClassNotFoundException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p1 */
/* .line 31 */
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered NoSuchMethodException"; // const-string v0, "VersionedParcel encountered NoSuchMethodException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_2 */
/* move-exception p1 */
/* .line 32 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* instance-of p2, p2, Ljava/lang/RuntimeException; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 33 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* check-cast p1, Ljava/lang/RuntimeException; */
/* throw p1 */
/* .line 34 */
} // :cond_0
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered InvocationTargetException"; // const-string v0, "VersionedParcel encountered InvocationTargetException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_3 */
/* move-exception p1 */
/* .line 35 */
/* new-instance p2, Ljava/lang/RuntimeException; */
final String v0 = "VersionedParcel encountered IllegalAccessException"; // const-string v0, "VersionedParcel encountered IllegalAccessException"
/* invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
public abstract void a ( java.lang.CharSequence p0 ) {
} // .end method
public abstract void a ( Boolean p0 ) {
} // .end method
public void a ( Boolean p0, Boolean p1 ) {
/* .locals 0 */
return;
} // .end method
public abstract void a ( Object[] p0 ) {
} // .end method
public abstract Boolean a ( Integer p0 ) {
} // .end method
public Boolean a ( Boolean p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 2 */
} // :cond_0
p1 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->d()Z
} // .end method
public a ( Object[] p0, Integer p1 ) {
/* .locals 0 */
/* .line 7 */
p2 = (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->a(I)Z
/* if-nez p2, :cond_0 */
/* .line 8 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->e()[B
} // .end method
public abstract androidx.versionedparcelable.VersionedParcel b ( ) {
} // .end method
public final java.lang.reflect.Method b ( java.lang.Class p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalAccessException;, */
/* Ljava/lang/NoSuchMethodException;, */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
/* .line 18 */
v0 = this.b;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( c.e.i ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/reflect/Method; */
/* if-nez v0, :cond_0 */
/* .line 19 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/Class;)Ljava/lang/Class;
/* .line 20 */
java.lang.System .currentTimeMillis ( );
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/Class; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* .line 21 */
/* const-class v3, Landroidx/versionedparcelable/VersionedParcel; */
/* aput-object v3, v1, v2 */
final String v2 = "write"; // const-string v2, "write"
(( java.lang.Class ) v0 ).getDeclaredMethod ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 22 */
v1 = this.b;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // .end method
public abstract void b ( Integer p0 ) {
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 7 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 8 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->c(I)V
return;
} // .end method
public void b ( android.os.Parcelable p0, Integer p1 ) {
/* .locals 0 */
/* .line 11 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 12 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Landroid/os/Parcelable;)V
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 3 */
/* .line 15 */
try { // :try_start_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/Class;)Ljava/lang/Class;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 16 */
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/String;)V
return;
/* :catch_0 */
/* move-exception v0 */
/* .line 17 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " does not have a Parcelizer"; // const-string p1, " does not have a Parcelizer"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public void b ( Object p0, Integer p1 ) {
/* .locals 0 */
/* .line 13 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 14 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Lc/x/b;)V
return;
} // .end method
public void b ( java.lang.CharSequence p0, Integer p1 ) {
/* .locals 0 */
/* .line 5 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 6 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public abstract void b ( java.lang.String p0 ) {
} // .end method
public void b ( java.lang.String p0, Integer p1 ) {
/* .locals 0 */
/* .line 9 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 10 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/String;)V
return;
} // .end method
public void b ( Boolean p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 2 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Z)V
return;
} // .end method
public void b ( Object[] p0, Integer p1 ) {
/* .locals 0 */
/* .line 3 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/versionedparcelable/VersionedParcel;->b(I)V
/* .line 4 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/versionedparcelable/VersionedParcel;->a([B)V
return;
} // .end method
public abstract void c ( Integer p0 ) {
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Boolean d ( ) {
} // .end method
public abstract e ( ) {
} // .end method
public abstract java.lang.CharSequence f ( ) {
} // .end method
public abstract Integer g ( ) {
} // .end method
public abstract android.os.Parcelable h ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Landroid/os/Parcelable;", */
/* ">()TT;" */
/* } */
} // .end annotation
} // .end method
public abstract java.lang.String i ( ) {
} // .end method
public c.x.b j ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Lc/x/b;", */
/* ">()TT;" */
/* } */
} // .end annotation
/* .line 1 */
(( androidx.versionedparcelable.VersionedParcel ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->i()Ljava/lang/String;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( androidx.versionedparcelable.VersionedParcel ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/versionedparcelable/VersionedParcel;->b()Landroidx/versionedparcelable/VersionedParcel;
(( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/String;Landroidx/versionedparcelable/VersionedParcel;)Lc/x/b;
} // .end method
