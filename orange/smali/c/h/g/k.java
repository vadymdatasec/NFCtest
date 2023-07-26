public class c.h.g.k extends c.h.g.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.h.g.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/g/j;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.Typeface a ( java.lang.Object p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.g;
			 int v1 = 1; // const/4 v1, 0x1
			 java.lang.reflect.Array .newInstance ( v0,v1 );
			 int v2 = 0; // const/4 v2, 0x0
			 /* .line 2 */
			 java.lang.reflect.Array .set ( v0,v2,p1 );
			 /* .line 3 */
			 p1 = this.m;
			 int v3 = 0; // const/4 v3, 0x0
			 int v4 = 4; // const/4 v4, 0x4
			 /* new-array v4, v4, [Ljava/lang/Object; */
			 /* aput-object v0, v4, v2 */
			 final String v0 = "sans-serif"; // const-string v0, "sans-serif"
			 /* aput-object v0, v4, v1 */
			 int v0 = 2; // const/4 v0, 0x2
			 int v1 = -1; // const/4 v1, -0x1
			 /* .line 4 */
			 java.lang.Integer .valueOf ( v1 );
			 /* aput-object v2, v4, v0 */
			 int v0 = 3; // const/4 v0, 0x3
			 java.lang.Integer .valueOf ( v1 );
			 /* aput-object v1, v4, v0 */
			 /* .line 5 */
			 (( java.lang.reflect.Method ) p1 ).invoke ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast p1, Landroid/graphics/Typeface; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* :catch_1 */
			 /* move-exception p1 */
			 /* .line 6 */
		 } // :goto_0
		 /* new-instance v0, Ljava/lang/RuntimeException; */
		 /* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v0 */
	 } // .end method
	 public java.lang.reflect.Method d ( java.lang.Class p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/Class<", */
		 /* "*>;)", */
		 /* "Ljava/lang/reflect/Method;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/NoSuchMethodException; */
	 /* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
java.lang.reflect.Array .newInstance ( p1,v0 );
/* .line 2 */
/* const-class v1, Landroid/graphics/Typeface; */
int v2 = 4; // const/4 v2, 0x4
/* new-array v2, v2, [Ljava/lang/Class; */
/* .line 3 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
/* const-class p1, Ljava/lang/String; */
/* aput-object p1, v2, v0 */
p1 = java.lang.Integer.TYPE;
int v3 = 2; // const/4 v3, 0x2
/* aput-object p1, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
/* aput-object p1, v2, v3 */
final String p1 = "createFromFamiliesWithDefault"; // const-string p1, "createFromFamiliesWithDefault"
/* .line 4 */
(( java.lang.Class ) v1 ).getDeclaredMethod ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 5 */
(( java.lang.reflect.Method ) p1 ).setAccessible ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
} // .end method
