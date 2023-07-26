public abstract class c.u.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Long a;
	 public static java.lang.reflect.Method b;
	 /* # direct methods */
	 public static void a ( ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* const/16 v1, 0x12 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 4 */
		 c.u.b .a ( );
	 } // :cond_0
	 return;
} // .end method
public static void a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x12 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 c.u.b .a ( p0 );
} // :cond_0
return;
} // .end method
public static void a ( java.lang.String p0, java.lang.Exception p1 ) {
/* .locals 2 */
/* .line 5 */
/* instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 6 */
	 (( java.lang.Exception ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;
	 /* .line 7 */
	 /* instance-of p1, p0, Ljava/lang/RuntimeException; */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 8 */
		 /* check-cast p0, Ljava/lang/RuntimeException; */
		 /* throw p0 */
		 /* .line 9 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/RuntimeException; */
	 /* invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw p1 */
	 /* .line 10 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unable to call "; // const-string v1, "Unable to call "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " via reflection"; // const-string p0, " via reflection"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "Trace"; // const-string v0, "Trace"
android.util.Log .v ( v0,p0,p1 );
return;
} // .end method
public static Boolean b ( ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "NewApi" */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
v0 = c.u.a.b;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = android.os.Trace .isEnabled ( );
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
/* :catch_0 */
} // :cond_0
v0 = c.u.a .c ( );
} // .end method
public static Boolean c ( ) {
/* .locals 7 */
final String v0 = "isTagEnabled"; // const-string v0, "isTagEnabled"
/* .line 1 */
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x12 */
/* if-lt v1, v3, :cond_1 */
/* .line 2 */
try { // :try_start_0
v1 = c.u.a.b;
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* if-nez v1, :cond_0 */
/* .line 3 */
/* const-class v1, Landroid/os/Trace; */
final String v5 = "TRACE_TAG_APP"; // const-string v5, "TRACE_TAG_APP"
(( java.lang.Class ) v1 ).getField ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 4 */
(( java.lang.reflect.Field ) v1 ).getLong ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J
/* move-result-wide v5 */
/* sput-wide v5, Lc/u/a;->a:J */
/* .line 5 */
/* const-class v1, Landroid/os/Trace; */
/* new-array v5, v3, [Ljava/lang/Class; */
v6 = java.lang.Long.TYPE;
/* aput-object v6, v5, v2 */
/* .line 6 */
(( java.lang.Class ) v1 ).getMethod ( v0, v5 ); // invoke-virtual {v1, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 7 */
} // :cond_0
v1 = c.u.a.b;
/* new-array v3, v3, [Ljava/lang/Object; */
/* sget-wide v5, Lc/u/a;->a:J */
java.lang.Long .valueOf ( v5,v6 );
/* aput-object v5, v3, v2 */
(( java.lang.reflect.Method ) v1 ).invoke ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Boolean; */
v0 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 8 */
c.u.a .a ( v0,v1 );
} // :cond_1
} // .end method
