public abstract class i.h.c.k {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .line 5 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v0 ).getStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;
		 int v1 = 4; // const/4 v1, 0x4
		 /* .line 6 */
		 /* aget-object v0, v0, v1 */
		 /* .line 7 */
		 (( java.lang.StackTraceElement ) v0 ).getClassName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
		 /* .line 8 */
		 (( java.lang.StackTraceElement ) v0 ).getMethodName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
		 /* .line 9 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "Parameter specified as non-null is null: method "; // const-string v3, "Parameter specified as non-null is null: method "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "."; // const-string v1, "."
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = ", parameter "; // const-string v0, ", parameter "
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0, java.lang.Object p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public static java.lang.Throwable a ( java.lang.Throwable p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Throwable;", */
		 /* ">(TT;)TT;" */
		 /* } */
	 } // .end annotation
	 /* .line 11 */
	 /* const-class v0, Li/h/c/k; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 i.h.c.k .a ( p0,v0 );
} // .end method
public static java.lang.Throwable a ( java.lang.Throwable p0, java.lang.String p1 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Throwable;", */
	 /* ">(TT;", */
	 /* "Ljava/lang/String;", */
	 /* ")TT;" */
	 /* } */
} // .end annotation
/* .line 12 */
(( java.lang.Throwable ) p0 ).getStackTrace ( ); // invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
/* .line 13 */
/* array-length v1, v0 */
int v2 = -1; // const/4 v2, -0x1
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_1 */
/* .line 14 */
/* aget-object v4, v0, v3 */
(( java.lang.StackTraceElement ) v4 ).getClassName ( ); // invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
v4 = (( java.lang.String ) p1 ).equals ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* move v2, v3 */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 15 */
java.util.Arrays .copyOfRange ( v0,v2,v1 );
/* check-cast p1, [Ljava/lang/StackTraceElement; */
/* .line 16 */
(( java.lang.Throwable ) p0 ).setStackTrace ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
} // .end method
public static void a ( ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
i.h.c.k .a ( v0 );
/* check-cast v0, Ljava/lang/NullPointerException; */
/* throw v0 */
} // .end method
public static void a ( java.lang.Object p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 2 */
} // :cond_0
i.h.c.k .a ( );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
public static void a ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 4 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " must not be null"; // const-string p1, " must not be null"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
i.h.c.k .a ( p0 );
/* check-cast p0, Ljava/lang/IllegalStateException; */
/* throw p0 */
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* if-nez p0, :cond_1 */
/* if-nez p1, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 10 */
} // :cond_1
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // :goto_0
} // .end method
public static void b ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lkotlin/KotlinNullPointerException; */
/* invoke-direct {v0}, Lkotlin/KotlinNullPointerException;-><init>()V */
i.h.c.k .a ( v0 );
/* check-cast v0, Lkotlin/KotlinNullPointerException; */
/* throw v0 */
} // .end method
public static void b ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " must not be null"; // const-string p1, " must not be null"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
i.h.c.k .a ( p0 );
/* check-cast p0, Ljava/lang/NullPointerException; */
/* throw p0 */
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
i.h.c.k .a ( p0 );
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
i.h.c.k .a ( v0 );
/* check-cast v0, Ljava/lang/IllegalArgumentException; */
/* throw v0 */
} // .end method
public static void c ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 1 */
} // :cond_0
i.h.c.k .c ( p1 );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
public static void c ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Ljava/lang/NullPointerException; */
i.h.c.k .a ( p0 );
/* invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
i.h.c.k .a ( v0 );
/* check-cast v0, Ljava/lang/NullPointerException; */
/* throw v0 */
} // .end method
public static void d ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 2 */
} // :cond_0
i.h.c.k .b ( p1 );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
public static void d ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lkotlin/UninitializedPropertyAccessException; */
/* invoke-direct {v0, p0}, Lkotlin/UninitializedPropertyAccessException;-><init>(Ljava/lang/String;)V */
i.h.c.k .a ( v0 );
/* check-cast v0, Lkotlin/UninitializedPropertyAccessException; */
/* throw v0 */
} // .end method
public static void e ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "lateinit property "; // const-string v1, "lateinit property "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " has not been initialized"; // const-string p0, " has not been initialized"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
i.h.c.k .d ( p0 );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
